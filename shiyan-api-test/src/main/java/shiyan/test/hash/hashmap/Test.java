package shiyan.test.hash.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhouhui on 2017/3/26.
 */
public class Test {
    public static void main(String[] args){
        testNull();
    }

    /**
     * 测试hashmap的key，value是否可为空
     * 结论：hashmap的key和value都可以为空
     */
    public static void testNull(){
        Map map = new HashMap<>();
        map.put(null, null);
    }
}
