package shiyan.test.alibaba.rule.foreach;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/14.
 */
public class Test {
    public static void main(String[] args){
        foreachTest();
    }

    public static void foreachTest(){
        List<String> a = new ArrayList<String>();
        a.add("1");
        a.add("2");
        for (String temp : a) {
            if("2".equals(temp)){
                a.remove(temp);
            }
        }
        System.out.println();
    }
}
