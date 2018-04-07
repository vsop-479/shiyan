package shiyan.test.concurrent.hashmap;

import sun.misc.Unsafe;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2017/4/6.
 */
public class Test {
    public static void main(String[] args){
        testConcurrentHashMap();
    }

    public static void testConcurrentHashMap(){
        Unsafe u = Unsafe.getUnsafe();

        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("a", "aa");
        concurrentHashMap.put("b", "cc");
        concurrentHashMap.put("b", "bb");
    }
}
