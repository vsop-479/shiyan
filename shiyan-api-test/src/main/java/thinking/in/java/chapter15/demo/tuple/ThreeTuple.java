package thinking.in.java.chapter15.demo.tuple;

/**
 * Created by Administrator on 2016/10/27.
 */
public class ThreeTuple<A, B, C> extends TwoTuple<A, B>{
    public final C third;

    public ThreeTuple(A a, B b, C c){
        super(a, b);
        third = c;
    }

    public String toString(){
        return "(" + first + ", " + second + ", " + third + ")";
    }
}
