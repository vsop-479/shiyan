package thinking.in.java.chapter5.p2;

/**
 * Created by zhouhui on 2015/11/8.
 */
public class P2 {
    private String s1 = "s1";
    private String s2;
    public P2(String s){
        this.s2 = s;
    }

    public static void main(String[] args){
        P2 p2 = new P2("s2");
        P2 p3 = new P2("s3");
        System.out.println(p2.s1);
        System.out.println(p2.s2);
        System.out.println(p3.s1);
        System.out.println(p3.s2);
    }
}
