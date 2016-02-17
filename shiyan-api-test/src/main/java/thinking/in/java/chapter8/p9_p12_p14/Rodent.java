package thinking.in.java.chapter8.p9_p12_p14;

/**
 * Created by Administrator on 2016/2/16.
 */
public class Rodent {
    Rodent(Shared shared){
        shared.addRef();
        System.out.println("Rodent()");
    }

    public void f(){}
}
