package thinking.in.java.chapter4.p5bad;

/**
 * Created by Administrator on 2015/10/21.
 * 按位操作符：
 * &，|，~，^。分别为：与，或，非，异或。
 * 位移操作符：
 * <<，>>，>>>。分别为：左移，右移，无符号右移。
 */
public class Practice5 {
    public static void main(String[] args){
        int i1 = 0x55555555;
        System.out.println(Integer.toBinaryString(i1));
        char[] chars = new char[32];
        int k = 0;
        while(k < 32){
//            chars[k] = (char) (i1 & 1);
            chars[k] = digits[i1 & 1];
            i1 >>>= 1;
            k++;
        }
        System.out.println(new String(chars, 1, 31));
        System.out.println(new String(chars));
        int i = 0x55555555;
        int shift = 1;
        char[] buf = new char[32];
        int charPos = 32;
        int radix = 1 << shift;
        int mask = radix - 1;
        do {
            buf[--charPos] = digits[i & mask];
            i >>>= shift;
        } while (i != 0);

        String ss =  new String(buf, charPos, (32 - charPos));
    }

    static char[] digits = {
            '0' , '1' , '2' , '3' , '4' , '5' ,
            '6' , '7' , '8' , '9' , 'a' , 'b' ,
            'c' , 'd' , 'e' , 'f' , 'g' , 'h' ,
            'i' , 'j' , 'k' , 'l' , 'm' , 'n' ,
            'o' , 'p' , 'q' , 'r' , 's' , 't' ,
            'u' , 'v' , 'w' , 'x' , 'y' , 'z'
    };
}
