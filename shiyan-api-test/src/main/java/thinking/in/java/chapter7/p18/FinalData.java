package thinking.in.java.chapter7.p18;

import java.util.Random;

class Value{
    int i;//package access
    public Value(int i){
        this.i = i;
    }
}

/**
 * Created by Administrator on 2016/1/14.
 * final必须在定义处或者构造方法中进行赋值。
 * 无论什么情况，编译器都确保空白final在使用前必须被初始化。
 * 意味着并发访问同一对象的时，final域可以保证完整可见。
 *
 * final和static final的区别：
 * final：每个对象会有一个独立的值，可能不一样
 * static final：所有对象共享一个值
 */
public class FinalData {
    private static Random rand = new Random(47);
    private String id;
    public FinalData(String id){
        this.id = id;
    }
    private final int value1 = 9;
    private static final int VALUE_2 = 99;
    public static final int VALUE_3 = 39;
    private final int i4 = rand.nextInt(20);//每个对象会有一个独立的值，可能不一样
    static final int INT_5 = rand.nextInt(20);//所有对象共享一个值
    private Value v1 = new Value(11);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    private final int[] a ={1, 2, 3, 4, 5, 6};
    public String toString(){
        return id + ":" + "i4 = " + i4 + ", INT_5 = " + INT_5;
    }

    public static void main(String[] args){
        FinalData fd1 = new FinalData("fd1");
//        fd1.value1++;//can't assign a value to a final variable 'value1'
        fd1.v2.i++;//引用指向的值可以变，引用不能在变，及不能再new


        for(int i = 0; i < fd1.a.length; i++){
            fd1.a[i]++;//引用指向的值可以变
        }
        fd1.v1 = new Value(9);//不是final，可改变引用
        //        fd1.v2 = new Value(9);//不能指向新的引用
//        fd1.VAL_3 = new Value(1);//不能指向新的引用
//        fd1.a = new int[3];//不能指向新的引用
        System.out.println(fd1);
        System.out.println("creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
}
