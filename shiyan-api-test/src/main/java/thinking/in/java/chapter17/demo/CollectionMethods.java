package thinking.in.java.chapter17.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2016/10/31.
 */
public class CollectionMethods {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("Algeria");
        list.add("Angola");
        list.add("Benin");
        list.add("Botswana");
        list.add("Bulgaria");
        list.add("Burkina Faso");
        Collection<String> c = new ArrayList<String>();
        c.addAll(list);
        c.add("ten");
        c.add("eleven");
        System.out.println(c);
//        无参
        Object[] array = c.toArray();
//        通过泛型参数指定类型
        String[] str = c.toArray(new String[0]);
//返回自然顺序中最大的元素，也可以指定比较器
        System.out.println("Collections.max(c)= " + Collections.max(c));
        //返回自然顺序中最小的元素，也可以指定比较器
        System.out.println("Collections.min(c)= " + Collections.min(c));

        Collection<String> c2 = new ArrayList<String>();
        c2.addAll(list);
        c.addAll(c2);
        System.out.println(c);
//        移除c中第一个"Benin"
        c.remove("Benin");
//        移除c中第一个"Bulgaria"
        c.remove("Bulgaria");
        System.out.println(c);
//      移除c中所有的list中包含的元素
        c.removeAll(list);
        System.out.println(c);
        c.addAll(list);
        System.out.println(c);
        String val = "Bulgaria";
        System.out.println("c.contains(" + val + ") = " + c.contains(val));
//        c中是否包含list中的所有元素
        System.out.println("c.containsAll(" + list + ") = " + c.containsAll(list));
//c(3),c(4)
        List<String> c3 = ((List<String>) c).subList(3, 5);
        System.out.println(c3);
//        仅保留c2中和c3中含有的元素
        c2.retainAll(c3);
        System.out.println(c2);
        c2.removeAll(c3);
        System.out.println("c2.isEmpty() = " + c2.isEmpty());
        c = new ArrayList<String>();
        ((List<String>) c).addAll(list);
        System.out.println(c);
        c.clear();
        System.out.println("after c.clear():" + c);
    }
}
