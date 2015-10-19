package thinking.in.java.chapter2.p8;

import thinking.in.java.chapter2.p7.Incrementable;
import thinking.in.java.chapter2.p7.StaticTest;

/**
 * Created by Administrator on 2015/10/19.
 */
public class Practice8 {
    public static void main(String[] args){
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        StaticTest st3 = new StaticTest();
        StaticTest st4 = new StaticTest();
        System.out.println(st1.i++);
        System.out.println(st2.i++);
        System.out.println(st3.i++);
        System.out.println(st4.i++);
    }
}
