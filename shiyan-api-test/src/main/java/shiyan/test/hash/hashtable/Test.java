package shiyan.test.hash.hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by zhouhui on 2017/3/26.
 */
public class Test {
    public static void main(String[] args){
        testNull();
    }

    /**
     * 测试hashtable的key，value是否可为空
     * 结论：hashtable的key和value都不能为空
     */
    public static void testNull(){
        Map map = new Hashtable<>();
        map.put(null, null);
    }
}
