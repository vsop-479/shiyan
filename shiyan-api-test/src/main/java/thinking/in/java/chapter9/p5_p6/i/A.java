package thinking.in.java.chapter9.p5_p6.i;

/**
 * Created by Administrator on 2016/2/24.
 * 接口中不允许定义private, protected的方法
 * 默认的方法d, 可以被包外的类继承，所以接口内默认方法是public。
 */
public interface A {
    int i=0;
    public void a();
    public void b();
    public void c();
    void d();
}
