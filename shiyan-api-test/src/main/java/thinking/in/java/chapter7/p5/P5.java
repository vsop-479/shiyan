package thinking.in.java.chapter7.p5;

/**
 * Created by Administrator on 2016/1/13.
 * 先构造AC，在初始成员B
 */
public class P5 extends A{
    public static void main(String[] args){
        new C();
    }
}

class A{
    public A(){
        System.out.println("init A");
    }
}

class B{
    public B(){
        System.out.println("init B");
    }
}

class C extends A{
    private B b = new B();
}