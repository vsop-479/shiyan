package thinking.in.java.chapter3.p10;

/**
 * Created by Administrator on 2015/10/20.
 * 位运算：与，或，非，异或
 */
public class Practice10 {
    public static void main(String[] args){
        int i1 = 0x55555555;
        int i2 = 0xaaaaaaaa;
        System.out.println(Integer.toBinaryString(i1));
        System.out.println(Integer.toBinaryString(i2));
        //非
        System.out.println(Integer.toBinaryString(~i1));
        System.out.println(Integer.toBinaryString(~i2));
        //与
        System.out.println(Integer.toBinaryString(i1 & i2));
        //或
        System.out.println(Integer.toBinaryString(i1 | i2));
        //异或:1^0,0^1结果为1
        //同或:1 1,0 0j结果为1
        System.out.println(Integer.toBinaryString(i1 ^ i2));
    }
}
