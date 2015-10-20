package thinking.in.java.chapter3.p8;

/**
 * Created by Administrator on 2015/10/20.
 */
public class Practice8 {
    public static void main(String[] args){
        Long l16_1 = 0x479761l;
        long l16_2 = 0x479761l;
        //不会混淆不必加l
        long l8_1 = 0477;
        //默认double,所以必须加f
        float f = 2.2f;
        Float ff = 2.2f;
        int i = 0x2F;
        System.out.println(Long.toBinaryString(l16_1));
        System.out.println(Long.toBinaryString(l16_2));
        System.out.println(Long.toBinaryString(l8_1));
    }
}
