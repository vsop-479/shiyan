package thinking.in.java.chapter3.p11;

/**
 * Created by Administrator on 2015/10/20.
 * 位移运算:
 * 左移<<:低位补0
 * 有符号右移>>:正数（最高位为0）高位补0；负数（最高位为1）高位补1
 * 无符号右移>>>：无论正负，高位都补0
 */
public class Practice11 {
    public static void main(String[] args){
        int i = 0xf0000000;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        while(i != -1){
            i >>= 1;
            System.out.println(i);
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
