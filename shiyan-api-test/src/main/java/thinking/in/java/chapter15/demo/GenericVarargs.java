package thinking.in.java.chapter15.demo;

import org.apache.velocity.util.ArrayListWrapper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/28.
 */
public class GenericVarargs {
    public static <T> List<T> f(T... args){
        List<T> list = new ArrayList<T>();
        for(T t : args){
            list.add(t);
        }
        return list;
    }

    public static void main(String[] args){
        List<String> ls = f("A");
        System.out.println(ls);
        List<String> ls2 = f("A", "B", "C");
        System.out.println(ls2);
        List<String> ls3 = f("ABCDEFG".split(""));
        System.out.println(ls3);
    }
}
