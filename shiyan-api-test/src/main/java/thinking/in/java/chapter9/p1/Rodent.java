package thinking.in.java.chapter9.p1;

import thinking.in.java.chapter8.p9_p12_p14.Shared;

/**
 * Created by Administrator on 2016/2/16.
 * 抽象类不能被实例化。
 */
public abstract class Rodent {
    Rodent(Shared shared){
        shared.addRef();
        System.out.println("Rodent()");
    }

    public abstract void f();
    public static void main(String[] args){
//        new Rodent();
    }
}
