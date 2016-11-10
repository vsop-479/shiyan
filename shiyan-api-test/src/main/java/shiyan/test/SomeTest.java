package shiyan.test;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Administrator on 2015/9/17.
 */
public class SomeTest {
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "he" + new String("llo");
        System.err.println(str1 == str2);
        System.err.println(str1.equals(str2));
        System.err.println(Double.NaN );
        System.err.println((Double.NaN > Double.NaN) || (Double.NaN <= Double.NaN));
    }
}


class A{
    private A(){

    }

    private void A(){

    }
}