package thinking.in.java.chapter10.p5;

/**
 * Created by Administrator on 2016/4/13.
 */
public class P5 {
    public static void main(String[] args){
        A a = new A();
        A.SubA subA = a.new SubA();
    }
}

class A{
    class SubA{
    }
}