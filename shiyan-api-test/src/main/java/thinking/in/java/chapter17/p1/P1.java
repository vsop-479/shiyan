package thinking.in.java.chapter17.p1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by Administrator on 2016/10/31.
 */
public class P1 {
    public static <T> ArrayList<T> getArrayList(T[] ts){
        ArrayList<T> list = new ArrayList<T>();
        for(T t : ts){
            list.add(t);
        }
        return list;
    }

    public static <T> LinkedList<T> getLinkedList(T[] ts){
        LinkedList<T> list = new LinkedList<T>();
        for(T t : ts){
            list.add(t);
        }
        return list;
    }

    public static void main(String[] args){
        String[] ss = "thinking.in.java.chapter17.demo.StringAddress".split("\\.");
        ArrayList<String> arrayList = getArrayList(ss);
        LinkedList<String> linkedList = getLinkedList(ss);
        System.out.println(arrayList);
        System.out.println(linkedList);

        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList);
        System.out.println(arrayList);

        System.out.println("==========================");

        Collections.shuffle(linkedList);
        System.out.println(linkedList);
        Collections.shuffle(linkedList);
        System.out.println(linkedList);
        Collections.shuffle(linkedList);
        System.out.println(linkedList);
    }
}
