package thinking.in.java.chapter2.p6;

/**
 * Created by Administrator on 2015/10/19.
 */
public class Practice6 {

    int storage(String s){
        s = "abcde";
        return s.length() * 2;
    }

    public static void main(String[] args){
        Practice6 p = new Practice6();
        String s = "abc";
        System.out.println(p.storage(s));
        System.out.println(s);
    }
}
