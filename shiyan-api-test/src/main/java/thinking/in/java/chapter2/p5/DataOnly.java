package thinking.in.java.chapter2.p5;

/**
 * Created by Administrator on 2015/10/19.
 */
public class DataOnly {
    int i;
    double d;
    boolean b;

    public static void main(String[] args){
        DataOnly data = new DataOnly();
        data.i = 47;
        data.d = 1.1;
        data.b = false;
        System.out.println(data.i);
        System.out.println(data.d);
        System.out.println(data.b);
    }
}
