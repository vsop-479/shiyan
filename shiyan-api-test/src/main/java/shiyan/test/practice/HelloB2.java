package shiyan.test.practice;

/**
 * Created by Administrator on 2016/11/8.
 * 1执行static
 * 2执行static main
 * 3构造对象时，执行非static语句块，以及非static 变量的初始化。
 */
public class HelloB2 extends HelloA2{
    public HelloB2() {
        System.out.println("Hello B2");
    }

    { System.out.println("I'm B2 class"); }

    static { System.out.println("static B2"); }

    public static void main(String[] args) {

        System.out.println("-------main start-------");
        new HelloB2();
        new HelloB2();
        System.out.println("-------main end-------");
    }

}

class HelloA2{
    public HelloA2() {
        System.out.println("Hello A2");
    }

    { System.out.println("I'm A2 class"); }

    static { System.out.println("static A2");
    }
}