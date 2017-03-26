package shiyan.test.accessibility.protectedd;

/**
 * Created by Administrator on 2017/1/19.
 */
public class Test {
    public static void main(String[] args){
        A a = new A();
//        Test和A在同一包内，可以访问protected f().
        a.f();
    }
}
