package thinking.in.java.chapter5.p3_p4;

/**
 * Created by zhouhui on 2015/11/8.
 */
public class P3 {
    public static void main(String[] args){
        new A();
        new A("fdfdf");
    }
}

class A{
    public A(){
        System.out.println("create a with no params constructor");
    }
    public A(String d){
        System.out.println("param: " + d);
    }
}