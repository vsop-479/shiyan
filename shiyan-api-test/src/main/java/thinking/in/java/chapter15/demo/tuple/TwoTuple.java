package thinking.in.java.chapter15.demo.tuple;

/**
 * Created by Administrator on 2016/10/27.
 */
public class TwoTuple<A, B> {
    public final A first;
    public final B second;

    public TwoTuple(A a, B b){
        first = a;
        second = b;
    }

    public String toString(){
        return "(" + first + "," + second + ")";
    }

}
