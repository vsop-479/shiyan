package thinking.in.java.chapter7.p19;

/**
 * Created by Administrator on 2016/1/14.
 */
public class P19 {
//    static final A a;//静态final 必须定义时就初始化
    final A a;//必须在所有的构造方法中初始化，否则variable 'a' might not have been initialized
    public P19(){
        a = new A();
    }
    public P19(String s){
        a = new A();
    }
}

class A{
    //final 方法不可被覆盖（重写）
    public final void f(){}
}

class B extends A{
    //overridden method is final
    //不能重载父类的final 方法
//    public final void f(){}
}