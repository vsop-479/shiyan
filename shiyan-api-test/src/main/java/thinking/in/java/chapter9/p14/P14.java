package thinking.in.java.chapter9.p14;

/**
 * Created by Administrator on 2016/2/26.
 */
public class P14 {
    public static void a(A a){

    }
    public static void b(B b){

    }
    public static void c(C c){

    }
    public static void d(D d){

    }
    public static void main(String[] args){
        E e = new E();
        a(e);
        b(e);
        c(e);
        d(e);
    }
}
interface A{
    void a1();
    void a2();
}
interface B{
    void b1();
    void b2();
}
interface C{
    void c1();
    void c2();
}
interface D extends A, B, C{
    void d();
}
class E extends F implements D{
    //不能省略public，因d()在接口中默认是public
    //而在类中默认是只有包内权限，不能窄化接口中权限
    public void d(){}
}
class F implements A, B, C{

    @Override
    public void a1() {

    }

    @Override
    public void a2() {

    }

    @Override
    public void b1() {

    }

    @Override
    public void b2() {

    }

    @Override
    public void c1() {

    }

    @Override
    public void c2() {

    }
}