package spark;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaPairRDD;
import org.apache.spark.api.java.JavaRDD;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.api.java.function.FlatMapFunction;
import org.apache.spark.api.java.function.Function2;
import org.apache.spark.api.java.function.PairFunction;
import scala.Tuple2;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by zhouhui on 2018/4/6.
 * wordCount三步骤:
 * 1:读文件生成行rdd.
 * 2:对每行数据分词成单词rdd.
 * 3:map:对单词rdd处理，形成key为单词，value为数量1的元组集pairRDD.
 * 4:reduce:对元组集pairRDD按照key做reduce, 相同的key合并, value为和.
 */
public class WordCount {
    public static void main(String[] args){
        System.setProperty("hadoop.home.dir","D:\\hadoop" );
        SparkConf sparkConf = new SparkConf().setMaster("local").setAppName("wordCount");
        JavaSparkContext sparkContext = new JavaSparkContext(sparkConf);
//        数据集，划分成行集合lines
        JavaRDD<String> rdd = sparkContext.textFile("D:\\escluster.txt");
        long count = rdd.count();
        String first = rdd.first();
//        分成单词集合
        JavaRDD<String> words =
                rdd.flatMap(line -> Arrays.asList(line.split(" ")).iterator());
        JavaPairRDD<String, Integer> counts2 = words.mapToPair((s) -> new Tuple2<String, Integer>(s, 1))
                .reduceByKey((c1, c2) -> c1 + c2);
//        JavaPairRDD<String, Integer> counts = words.mapToPair(new PairFunction<String, String, Integer>() {
//
//            @Override
//            public Tuple2<String, Integer> call(String s) throws Exception {
////                对每个单词定义一个元组，key是单词，数量为1
//                return new Tuple2<String, Integer>(s, 1);
//            }
//        }).reduceByKey(new Function2<Integer, Integer, Integer>() {
//            @Override
//            public Integer call(Integer integer, Integer integer2) throws Exception {
////                对相同的key做reduce, 返回value之和.
//                return integer + integer2;
//            }
//        });
        JavaPairRDD<String, Integer> counts = words.mapToPair((w) -> new Tuple2<String, Integer>(w, 1))
                .reduceByKey((c1, c2) -> c1 + c2);
        counts.saveAsTextFile("D:\\count.txt");

    }
}
