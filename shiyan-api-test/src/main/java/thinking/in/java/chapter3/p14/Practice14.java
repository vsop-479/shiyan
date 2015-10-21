package thinking.in.java.chapter3.p14;

/**
 * Created by Administrator on 2015/10/21.
 * 字符串比较
 */
public class Practice14 {
    static void f(String s1, String s2){
        System.out.println("==: " + (s1 == s2));
        System.out.println("!=: " + (s1 != s2));
        System.out.println("equals: " + (s1.equals(s2)));
    }
    public static void main(String[] args){
//        byte b1 = 11;
//        byte b2 = 22;
//        System.out.println(b1 * b2);
        String s1 = "aaa";
        String s2 = "aaa";
        f(s1, s2);
        f("aaa", "aaa");
    }
}
