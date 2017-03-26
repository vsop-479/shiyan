package thinking.in.java.chapter13.p1;

/**
 * Created by Administrator on 2016/10/25.
 * String对象是不可变的。
 * String类中每一个看起来会修改String值得方法，实际上都是创建了一个全新的String对象，以包含修改后的字符串内容。
 * 而最初的String对象则丝毫未动。
 *  white rabbit
    WHITE RABBIT
    white rabbit
 */
public class Immutable {
    public static String upcase(String s){
        return s.toUpperCase();
    }
    public static void main(String[] args){
        String q = "white rabbit";
        System.out.println(q);
        String qq = upcase(q);
        System.out.println(qq);
        System.out.println(q);
    }
}
