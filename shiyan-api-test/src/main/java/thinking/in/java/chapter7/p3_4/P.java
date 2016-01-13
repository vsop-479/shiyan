package thinking.in.java.chapter7.p3_4;

/**
 * Created by Administrator on 2016/1/13.
 * 证明初始化会先调用父类构造方法。
 */
public class P extends B{
    public P(){
        System.out.println("init P");
    }
    public static void main(String[] args){
        new P();
    }
}

class A{
    public A(){
        System.out.println("init A");
    }
}

class B extends A{
    public B(){
        System.out.println("init B");
    }
}