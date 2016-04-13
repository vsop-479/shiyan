package thinking.in.java.chapter10.p11;

/**
 * Created by Administrator on 2016/4/13.
 */
public class P11 {
    public A s(){
        return this.new InnerP11();
    }
    private class InnerP11 implements A{

        @Override
        public void f() {
            System.out.println("dsf");
        }
    }
}


interface A{
    public void f();
}