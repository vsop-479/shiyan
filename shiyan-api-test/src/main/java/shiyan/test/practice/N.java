package shiyan.test.practice;

/**
 * Created by Administrator on 2016/11/8.
 */
public class N {
    public static void f(){
        System.out.println("FFFF");
    }

    public static void main(String[] args){
        N.f();
        new N().f();
        ((N)null).f();
    }
}
