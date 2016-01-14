package thinking.in.java.chapter7.p5_p7;

/**
 * Created by Administrator on 2016/1/13.
 * 先构造A，构造C时先初始成员B
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
    public C(){
        //因A有无参构造，所以默认调用super()，且不能显示调用
//        b = new B();
        System.out.println("init C");
    }
}