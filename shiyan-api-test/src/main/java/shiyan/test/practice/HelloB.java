package shiyan.test.practice;

/**
 * Created by Administrator on 2016/11/8.
 */
public class HelloB extends HelloA{
//   非static 语句块，以及变量的初始化调用构造对象时，才调用。
    {
        System.out.println("I'm B class");
    }
    static{
        System.out.println("static B");
    }

    public HelloB(){
        System.out.println("Hello B");
    }

    public static void main(String[] args){
        new HelloB();
    }
}

class HelloA{
    {
        System.out.println("I'm A class");
    }
    static{
        System.out.println("static A");
    }

    public HelloA(){
        System.out.println("Hello A");
    }
}