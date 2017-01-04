package shiyan.test.examination.xor;

/**
 * Created by Administrator on 2017/1/3.
 * 将一个数（int)，1换成0，0换成1
 * 通过与01111...（31个1）进行异或运算实现。
 * 扩展：
 * int的范围[-2^31, 2^31 - 1]
 * 2^31 - 1：011111...31个1，最高位0表示正数
 * -2^31 - 1:1111111...32个1，最高位1表示负数
 * -2^31:1000000....31个0
 */
public class Test {
    public static void main(String[] args){
//        测试0，00000....，预测结果为011111....2^31-1
        System.out.println(xor(0));
    }

    public static int xor(int i){
//        乘方运算
//        i = (int) Math.pow(i, 31);
        int result = Integer.MAX_VALUE ^ i;
        return result;
    }
}
