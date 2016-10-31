package thinking.in.java.chapter17.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Administrator on 2016/10/31.
 */
public class Unsupported {
    static void test(String msg, List<String> list){
        System.out.println("--- " + msg + " ---");
        Collection<String> c = list;
        Collection<String> subList = list.subList(1, 8);
        Collection<String> c2 = new ArrayList<>(subList);
        try{
//            只保留c中c2含有的元素
            c.retainAll(c2);
        }catch (Exception e){
            System.out.println("retainAll： " + e);
        }

        try{
            c.removeAll(c2);
        }catch (Exception e){
            System.out.println("removeAll： " + e);
        }

        try{
            c.clear();
        }catch (Exception e){
            System.out.println("clear： " + e);
        }

        try{
            c.add("X");
        }catch (Exception e){
            System.out.println("add： " + e);
        }

        try{
            c.addAll(c2);
        }catch (Exception e){
            System.out.println("addAll： " + e);
        }

        try{
            c.remove("C");
        }catch (Exception e){
            System.out.println("remove： " + e);
        }

        try{
            list.set(0, "X");
        }catch (Exception e){
            System.out.println("list.set： " + e);
        }
    }

    public static void main(String[] args){
//        返回一个固定长度的list，不支持add, remove
//        retainAll在且只在能保留所有原元素时，可以支持。
        List<String> list = Arrays.asList("A,B,C,D,E,F,G,H,I,J,K,L".split(","));
//        生成新的list，可以修改
        test("Modifiable Copy", new ArrayList<String>(list));
//        不可添加，移除元素
        test("Arrays.asList", list);
    }
}
