package thinking.in.java.chapter9.p3;

/**
 * Created by Administrator on 2016/2/24.
 * 结果：参见第八章p15
 * a = 0(构造P3时，先构造A，A中print方法被覆盖，但P3还未构造，a还没有初始化，所以此时a为0)
 * a = 9
 */
public class P3 extends A{
    public int a = 9;
    void print(){
        System.out.println("a = " + a);
    }
    public static void main(String[] args){
        P3 p3 = new P3();
        p3.print();
    }
}

abstract class A{
    abstract void print();
    A(){
        print();
    }
}