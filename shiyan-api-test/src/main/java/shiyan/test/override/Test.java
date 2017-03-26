package shiyan.test.override;

/**
 * Created by Administrator on 2016/12/27.
 */
public class Test {
    public static void main(String[] args){
        B b = new B();
        b.g();
    }
}

class A{
    public void f(){
        System.out.println("aaaaaaaaaaaa");
    }
}

class B extends A{
    public void f(){
        System.out.println("bbbbbbbbbbbbb");
    }

    public void g(){
        f();
        super.f();
    }
}