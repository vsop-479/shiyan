package shiyan.test.examination.beam;

import org.apache.beam.runners.direct.DirectRunner;
import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.*;
import org.apache.beam.sdk.values.KV;
import org.apache.beam.sdk.values.PCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/2/28.
 * WordCountExample（未优化）与TraditionalTest比较
 * 读取16m的数据文件，统计单词个数
 * WordCountExample执行时间：330240
 * TraditionalTest执行时间：1823
 */
public class WordCountExample implements Serializable{
    private static final long serialVersionUID = 555537894118059998L;
//    private static final Logger logger = LoggerFactory.getLogger(WordCountExample.class);
    private transient Pipeline pipeline = null;

    public WordCountExample(){
        PipelineOptions options = PipelineOptionsFactory.create();
        options.setJobName("wordcount");
        options.setRunner(DirectRunner.class);

        pipeline = Pipeline.create(options);
    }

    public void transform(){
        PCollection<String> collection = pipeline.apply(TextIO.Read.from("E:\\user_tag_001.sql"));
//        PCollection<String> collection = pipeline.apply(TextIO.Read.from("E:\\ee.sql"));

        PCollection<String> extractWords = collection.apply("ExtractWords", ParDo.of(new DoFn<String, String>() {
            @ProcessElement
            public void processElement(ProcessContext c) {
//                每行执行一次，c.element()即一行数据
                String[] words = c.element().split(",");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        c.output(word);
                    }
                }
            }
        }));

        PCollection<KV<String, Long>> pCollection = extractWords.apply(Count.<String>perElement());

        PCollection<String> formatResults = pCollection.apply("FormatResults", MapElements.via(new SimpleFunction<KV<String, Long>, String>() {
            @Override
            public String apply(KV<String, Long> inputT) {
                System.out.println("统计结果为：" + inputT.getKey() + " -- " + inputT.getValue());
                return inputT.getKey() + ":" + inputT.getValue();
            }
        }));

        formatResults.apply(TextIO.Write.to("E:\\result.txt"));
    }

    public void run(){
        pipeline.run().waitUntilFinish();
    }

    public static void main(String[] args){
        long t1 = System.currentTimeMillis();
        WordCountExample wordCountExample = new WordCountExample();
        wordCountExample.transform();
        wordCountExample.run();
        long t2 = System.currentTimeMillis();
        System.out.println("执行时间：" + (t2 - t1));
    }
}
