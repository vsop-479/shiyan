package shiyan.test;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2015/9/17.
 */
public class SomeTest {
    public static void main(String[] args){
        Map<String, Long> map = new HashMap<String, Long>();
        map.put("a", null);
        Long a = map.get("a");
        a = 5L;
        System.out.print("dd");
    }
}
