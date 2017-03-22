package shiyan.test.beam;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Administrator on 2017/2/28.
 * WordCountExample（未优化）与TraditionalTest比较
 * 读取16m的数据文件，统计单词个数
 * WordCountExample执行时间：330240
 * TraditionalTest执行时间：1823
 *
 */
public class TraditionalTest {
    public static Map<String, Integer> map = new HashMap<>();
    public static void put(String[] words){
        for(String word : words){
            word = word.trim();
            if(map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }else{
                map.put(word, 1);
            }
        }
    }

    public static void get()throws IOException{
        FileReader fileReader = new FileReader(new File("E:\\user_tag_001.sql"));
//        FileReader fileReader = new FileReader(new File("E:\\ee.sql"));
        BufferedReader br = new BufferedReader(fileReader);
        String s = br.readLine();
        while (s != null){
            String[] words = s.split(",");
            put(words);
            s = br.readLine();
        }
        fileReader.close();
        br.close();
    }

    public static void print() throws IOException {
        FileWriter fileWriter = new FileWriter("E:\\result.txt");
        BufferedWriter bw = new BufferedWriter(fileWriter);
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Integer count = map.get(key);
            System.out.println("统计结果为：" + key + " -- " + count);
            bw.write(key + " : " + count);
            bw.newLine();
        }
        bw.flush();
        fileWriter.close();
        bw.close();
    }

    public static void main(String[] args) throws IOException {
        long t1 = System.currentTimeMillis();
        get();
        print();
        long t2 = System.currentTimeMillis();
        System.out.println("执行时间：" + (t2 - t1));
    }
}
