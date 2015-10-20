package thinking.in.java.chapter3.p7;

import java.util.Random;

/**
 * Created by Administrator on 2015/10/20.
 */
public class Practice7 {
    public static void main(String[] args){
        Random r = new Random();
        int i = r.nextInt(100);
        System.out.println(i % 2);
    }
}
