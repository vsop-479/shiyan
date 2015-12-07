package thinking.in.java.chapter5.p19;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/12/7.
 */
public class Practice19 {
    public static void f(String... a){
        for(String s : a){
            System.out.println(s);
        }
    }

    public static void main(String[] args){
        f("a", "b", "c");
        f(new String[]{"d", "e", "f"});
    }
}
