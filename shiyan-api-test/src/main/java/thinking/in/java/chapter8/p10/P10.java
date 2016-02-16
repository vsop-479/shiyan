package thinking.in.java.chapter8.p10;

/**
 * Created by Administrator on 2016/2/16.
 * 调用方法，动态绑定
 * EA(private,static,final,域不动态绑定，前期绑定）
 * FB（动态绑定，后期（运行时）绑定）
 * SA(static，前期（编译时）绑定）
 * i = 1; getI() = 2（域，编译绑定；方法（static，private之外），运行绑定）
 */
public class P10 {
    public static void main(String[] args){
        A a = new B();
        a.g();
        System.out.println("i = " + a.i + "; getI() = " + a.getI());
    }
}
class A{
    public int i = 1;
    public int getI(){
        return i;
    }
    private void e(){
        System.out.println("EA");
    }
    public void f(){
        System.out.println("FA");
    }
    public static void s(){
        System.out.println("SA");
    }
    public void g(){
        e();
        f();
        s();
    }
}

class B extends A{
    public int i = 2;
    public int getI(){
        return i;
    }

    public void e(){
        System.out.println("EB");
    }
    public void f(){
        System.out.println("FB");
    }
    public static void s(){
        System.out.println("SB");
    }
}
