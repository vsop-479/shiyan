package shiyan.test.examination.integer;

/**
 * Created by Administrator on 2017/1/4.
 * 测试Integer中的方法
 * 在计算机系统中，数值一律用补码来表示和存储。
 * 原码并不存在，只是用来补码和补码表示的数值之间转换时，用来换算的。
 */
public class Test {
    public static final int I = 10;
    public static void main(String[] args){
        System.out.println(bitCount(I));
        System.out.println(byteValue(1000));
        System.out.println(decode("010"));
        System.out.println(decode("0x10"));
        System.out.println(highestOneBit(I));
        System.out.println(lowestOneBit(I));
        System.out.println(numberOfLeadingZeros(I));
        System.out.println(numberOfTrailingZeros(I));
        System.out.println(reverse(2));
        System.out.println(reverse(5));
        System.out.println(reverseBytes(2));
        Double pow = Math.pow(2, 30);
        System.out.println(rotateLeft(pow.intValue(), 1));
        System.out.println(rotateLeft(pow.intValue(), 2));
        System.out.println(rotateRight(1, 1));
        System.out.println(rotateRight(1, 2));
        System.out.println(signum(2));
        System.out.println(signum(-2));
        System.out.println(signum(0));
        System.out.println(toBinaryString(5));
        System.out.println(toBinaryString(-5));

    }

    /**
     * 返回i的二进制形式（补码）中1的位的数量
     * 如10，二进制补码1010，返回2
     * @param i
     * @return
     */
    public static int bitCount(int i){
        return Integer.bitCount(i);
    }

    /**
     * 返回i装换成byte类型后的值，
     * int4个字节，byte1个字节，转换时只取低位1个字节。
     * 如1000，int补码为1111101000，转成byte只取11101000。
     * 11101000的原码是10011000（因负数，符号位之外取反加一）
     * 表示的十进制是-24
     * @param i
     * @return
     */
    public static byte byteValue(int i){
        return new Integer(i).byteValue();
    }

    /**
     * 将十进制，十六进制（0x,0X,#），八进制(0)
     * 转成十进制。
     * ex:010=8
     * 0x10=16
     * @param nm
     * @return
     */
    public static Integer decode(String nm){
        return Integer.decode(nm);
    }

    /**
     * 返回只留最高位1，其他位置都是0的值。
     * ex:10
     * 二进制（补码）1010
     * 只留最高位1：1000
     * 结果为8
     * @param i
     * @return
     */
    public static int highestOneBit(int i){
        return Integer.highestOneBit(i);
    }

    /**
     * 返回只留最低位1，其他位置都是0的值。
     * ex:10
     * 二进制（补码）1010
     * 只留最低位1：10
     * 结果为2
     * @param i
     * @return
     */
    public static int lowestOneBit(int i){
        return Integer.lowestOneBit(i);
    }

    /**
     * 返回二进制（补码）中，最高位1之前0的数量，包括符号位。
     * ex：10
     * 二进制：1010
     * 前面有28个0。
     * @param i
     * @return
     */
    public static int numberOfLeadingZeros(int i){
        return Integer.numberOfLeadingZeros(i);
    }

    /**
     * 返回二进制（补码）中，最低位1之后0的数量。
     * ex：10
     * 二进制：1010
     * 后面有1个0。
     * @param i
     * @return
     */
    public static int numberOfTrailingZeros(int i){
        return Integer.numberOfTrailingZeros(i);
    }

    /**
     * 将i二进制（补码）位顺序反转
     * ex:
     * 2二进制10，反转010000...30个0。
     * 结果2的30次方，1.073741824E9
     * 5二进制101，反转101000...29个0.
     * 代表的数为取反加一求原码：
     * 11100000....(29个0）
     * 结果为-（2^30+2^29),1.610612736E9
     * @param i
     * @return
     */
    public static int reverse(int i){
        return Integer.reverse(i);
    }

    /**
     * 将i二进制（补码）字节顺序反转。
     * ex：
     * 2二进制10，字节反转
     * 00000010 0000....25个0
     * 结果为2的25次方：3.3554432E7
     * @param i
     * @return
     */
    public static int reverseBytes(int i){
        return Integer.reverseBytes(i);
    }

    /**
     * 带着符号，循环左移
     * 如
     * 2的30次方，二进制为
     * 01000....
     * 带着符号循环左移一位
     * 10000....
     * 结果为-2^31
     * 带着符号循环左移二位
     * 000....1
     * 结果为1
     * @param i
     * @param distance
     * @return
     */
    public static int rotateLeft(int i, int distance){
        return Integer.rotateLeft(i, distance);
    }

    /**
     * 带着符号，循环右移
     * ex:
     * 1二进制为0...01
     * 右移一位
     * 1000.....
     * 结果为-2^31
     * 右移二位
     * 01000.....
     * 结果为2^30
     * @param i
     * @param distance
     * @return
     */
    public static int rotateRight(int i, int distance){
        return Integer.rotateRight(i, distance);
    }

    /**
     * 返回i的符号
     * 正：1
     * 负：-1
     * 0：0
     * @param i
     * @return
     */
    public static int signum(int i){
        return Integer.signum(i);
    }

    /**
     * 返回i的二进制（补码）形式
     * ex:
     * 5:00..0101
     * -5:1111...1011
     * @param i
     * @return
     */
    public static String toBinaryString(int i){
        return Integer.toBinaryString(i);
    }

    /**
     * 返回i的16进制
     * @param i
     * @return
     */
    public static String toHexString(int i){
        return Integer.toHexString(i);
    }
}
