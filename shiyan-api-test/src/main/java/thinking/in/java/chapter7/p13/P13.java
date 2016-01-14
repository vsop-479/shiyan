package thinking.in.java.chapter7.p13;

/**
 * Created by Administrator on 2016/1/14.
 *  P13
    P13
    P13
    P13
 */
public class P13 extends C{
    public void f(){
        super.f();
        System.out.println(getClass().getSimpleName());
    }
    public static void main(String[] args){
        P13 p13 = new P13();
        p13.f();
    }
}

class A{
    public void f(){
        System.out.println(getClass().getSimpleName());
    }
}

class B extends A{
    public void f(){
        super.f();
        System.out.println(getClass().getSimpleName());
    }
}

class C extends B{
    public void f(){
        super.f();
        System.out.println(getClass().getSimpleName());
    }
}