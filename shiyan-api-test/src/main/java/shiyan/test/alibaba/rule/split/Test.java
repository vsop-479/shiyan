package shiyan.test.alibaba.rule.split;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/3/14.
 */
public class Test {
    public static void main(String[] args){
        splitTest();
    }

    public static void splitTest(){
        String[] split = "a,b,c,d,,".split(",");
        System.out.println(split);
        System.out.println(Arrays.asList(split));
    }
}
