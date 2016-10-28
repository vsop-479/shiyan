package thinking.in.java.chapter15.p15;

import thinking.in.java.chapter15.demo.tuple.ThreeTuple;
import thinking.in.java.chapter15.demo.tuple.TwoTuple;
import static thinking.in.java.chapter15.p15.Tuple.*;

/**
 * Created by Administrator on 2016/10/28.
 */
public class TupleTest2 {
    static TwoTuple<String, Integer> f(){
        return tuple("hi", 47);
    }

    static TwoTuple f2(){
        return tuple("hi", 47);
    }

    static ThreeTuple<String, Integer, Character> h(){
        return tuple("hi", 47, 'd');
    }

    static ThreeTuple h2(){
        return tuple("hi", 47, 'd');
    }

    public static void main(String[] args){
        TwoTuple<String, Integer> f = f();
        TwoTuple<String, Integer> twoTuple = f2();
        System.out.println(f);
        System.out.println(f2());
        System.out.println(h());
        System.out.println(h2());
        System.out.println(twoTuple);
    }
}
