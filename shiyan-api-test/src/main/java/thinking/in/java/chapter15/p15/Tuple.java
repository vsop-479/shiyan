package thinking.in.java.chapter15.p15;

import thinking.in.java.chapter15.demo.tuple.ThreeTuple;
import thinking.in.java.chapter15.demo.tuple.TwoTuple;

/**
 * Created by Administrator on 2016/10/28.
 */
public class Tuple {
    public static <A,B> TwoTuple<A,B> tuple(A a, B b){
        return new TwoTuple<A, B>(a, b);
    }

    public static <A,B,C> ThreeTuple<A,B,C> tuple(A a, B b, C c){
        return new ThreeTuple<A,B,C>(a, b, c);
    }
}
