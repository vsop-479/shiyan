package thinking.in.java.chapter5.p14;

/**
 * Created by zhouhui on 2015/12/6.
 */
public class P14 {
    private static String s1 = "s1";
    private static String s2;
    static{
        s2 = "s2";
        System.out.println(s1);
        System.out.println(s2);
    }

    static void f(){
        System.out.println(s1);
        System.out.println(s2);
    }

    public static void main(String[] args){
        System.out.println("Inside main()");
        f();
    }
}
