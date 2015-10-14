package shiyan.test;


/**
 * Created by Administrator on 2015/9/17.
 */
public class SomeTest {
    public static void main(String[] args){
        byte b = Byte.valueOf("-128");
        b = (byte)10001 >> 0;
        System.out.print(b);
    }
}
