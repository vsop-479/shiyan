package thinking.in.java.chapter17;

import java.util.Arrays;

/**
 * Created by Administrator on 2016/11/2.
 */
public class Test {
    public static void main(String[] args){
        String[] a = new String[3];
        a[0] = "a";
        a[1] = "b";
        a[2] = "c";
        a = Arrays.copyOf(a, 4);
        a[3] = "d";
        System.out.println(a);
        System.out.println(a.toString());

    }
}
