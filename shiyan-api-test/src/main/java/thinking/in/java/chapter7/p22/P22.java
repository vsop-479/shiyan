package thinking.in.java.chapter7.p22;

/**
 * Created by Administrator on 2016/1/14.
 */
public class P22 {
}

final class A{

}

//不可继承final类
//class B extends A{}

class B{
    public static void f(){}
}
class C extends B{
//    @Override//静态方法不可被重写
    public static void f(){}
}