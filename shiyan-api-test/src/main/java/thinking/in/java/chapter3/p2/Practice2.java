package thinking.in.java.chapter3.p2;

/**
 * Created by Administrator on 2015/10/20.
 */
public class Practice2 {
    public static void main(String[] args){
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.f = 1.1f;
        t2.f = 2.2f;
        System.out.println("t1.f: " + t1.f);
        System.out.println("t2.f: " + t2.f);
        t1 = t2;
        System.out.println("t1.f: " + t1.f);
        System.out.println("t2.f: " + t2.f);
        t1.f = 3.3f;
        System.out.println("t1.f: " + t1.f);
        System.out.println("t2.f: " + t2.f);
    }
}

class Tank{
    float f;
}