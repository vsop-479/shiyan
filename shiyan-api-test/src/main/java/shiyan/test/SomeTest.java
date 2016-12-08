package shiyan.test;


import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Administrator on 2015/9/17.
 */
public class SomeTest {
    public static void main(String[] args){
        sqrt();




    }

//    因数都是成对出现，a*a > (a+n)*(a-n) 所以判断N是否是质数，除到N的平方根即可。
    static void sqrt(){
        System.out.println(Math.sqrt(15));
    }


    static void cantInitialAbstractClass(){
        //        不能实例化抽象类
//        new A();
    }
    static void NaNFalse(){
        System.err.println((Double.NaN > Double.NaN) || (Double.NaN <= Double.NaN));
    }

    static void charAtLittleFasterThanStartWith(){
        String s = "abc";
        long l = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            System.out.print(s.startsWith("a"));
        }
        System.out.println();
        System.out.println(System.currentTimeMillis() - l);

        long l2 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            System.out.print((s.charAt(0) == 'a'));
        }
        System.out.println();
        System.out.println(System.currentTimeMillis() - l2);
    }
}

/**
 * abstract class 不能实例化。
 */
abstract class A{
    private A(){

    }

    private void A(){

    }
}