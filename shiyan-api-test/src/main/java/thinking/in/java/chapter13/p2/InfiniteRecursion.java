package thinking.in.java.chapter13.p2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/25.
 */
public class InfiniteRecursion {
    public static void main(String[] args){
        List<InfiniteRecursion> v = new ArrayList<InfiniteRecursion>();
        for(int i = 0; i < 10; i++){
            v.add(new InfiniteRecursion());
        }
//        调用ArrayList.toString, 它会遍历ArrayList中包含的所有对象，调用每个元素上的toString()方法。
        System.out.println(v);
    }

//    编译器看到一个String对象（" InfiniteRecursion address:" ）后面跟着一个"+"，而后面的对象（this)不是String，
//    于是编译器试着将this转换成一个String。它怎么转换呢，正是通过调用this上的toString()方法，于是就放生了递归。
//    public String toString(){
//        return " InfiniteRecursion address:" + this;
//    }

//    真想要打印对象的内存地址，应该调用Object.toString()方法，这才是负责此任务的方法。所以，你不该使用this，
//    而是应该调用super.toString()方法。
    public String toString(){
        return " InfiniteRecursion address:" + super.toString();
    }
}
