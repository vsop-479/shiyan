package thinking.in.java.chapter9.p11;

/**
 * Created by Administrator on 2016/2/25.
 */
public class P11 {
}

class A{
    public void f(String s){
        System.out.println(s);
    }
}

class AAdapter implements Processor{
    A a;
    public AAdapter(A a){
        this.a = a;
    }
    @Override
    public String name() {
        return null;
    }

    @Override
    public Object process(Object input) {
        return null;
    }
}