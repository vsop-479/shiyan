package thinking.in.java.chapter7.p11;

/**
 * Created by Administrator on 2016/1/14.
 * Detergent代理A，但只提供A的f功能
 */
public class Detergent {
    A a = new A();
    public void f(){
        a.f();
    }
}


class A{
    public void f(){}
    public void g(){}
}