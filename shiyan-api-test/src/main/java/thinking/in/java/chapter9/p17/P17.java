package thinking.in.java.chapter9.p17;

/**
 * Created by Administrator on 2016/2/26.
 * 接口中的域（变量）默认是public, static ,final的。
 */
public class P17 {
}
interface A{
    int a = 5;
}
class B implements A{
    void f(){
//        A.a = 6;//cant assign a value to final available 'a'
    }
}