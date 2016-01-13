package thinking.in.java.chapter7.p1;

/**
 * Created by Administrator on 2016/1/13.
 * 对a惰性初始化：使用时才初始化
 */
public class P1 {
    private A a;
    public void f(){
        if(a == null){
            a = new A();
        }
    }
}


class A{
}