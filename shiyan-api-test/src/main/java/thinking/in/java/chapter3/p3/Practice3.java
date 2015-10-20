package thinking.in.java.chapter3.p3;

/**
 * Created by Administrator on 2015/10/20.
 */
public class Practice3 {
    static void f(Tank t){
        t.f = 0.0f;
    }
    public static void main(String[] args){
        Tank t = new Tank();
        t.f = 1.1f;
        System.out.println("t.f: " + t.f);
        f(t);
        System.out.println("t.f: " + t.f);
    }
}

class Tank{
    float f;
}