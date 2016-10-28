package thinking.in.java.chapter15.demo.tuple;

/**
 * Created by Administrator on 2016/10/27.
 */
public class TupleTest {
    static TwoTuple<String, Integer>f(){
        return new TwoTuple<String, Integer>("hi", 47);
    }

    static ThreeTuple<Boolean, String, Integer>g(){
        return new ThreeTuple<Boolean, String, Integer>(false, "hi", 47);
    }

    public static void main(String... args){
        TwoTuple<String, Integer> f = f();
        System.out.println(f);
        System.out.println(f());
        System.out.println(g());

    }
}
