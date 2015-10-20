package thinking.in.java.chapter3.p12;

/**
 * Created by Administrator on 2015/10/20.
 */
public class Practice12 {
    public static void main(String[] args){
        int i = 0xffffffff;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        i <<= 1;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        while(i != 0){
            i >>>= 1;
            System.out.println(i);
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
