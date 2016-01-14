package thinking.in.java.chapter7.P20_p21;

/**
 * Created by Administrator on 2016/1/14.
 */
public class P20 {
}
class A{
    private void f(){}
    private void g(){}
    public final void h(){}
}

class B extends A{
    //因私有，该方法并不会覆盖父类的f方法
    private void f(){}

//    @Override//强行override 则编译出错
    private void g(){}
    //final 不可重写
//    public final void h(){}
}
