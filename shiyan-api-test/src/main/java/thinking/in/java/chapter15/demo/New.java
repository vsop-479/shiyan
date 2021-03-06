package thinking.in.java.chapter15.demo;

import java.util.*;

/**
 * Created by Administrator on 2016/10/28.
 */
public class New {
//    定义 <K,V>，使用Map<K,V>
    public static <K,V> Map<K,V> map(){
        return new HashMap<K, V>();
    }

    public static <T> List<T> list(){
        return new ArrayList<T>();
    }

    public static <T> LinkedList<T> lList(){
        return new LinkedList<T>();
    }

    public static <T> Set<T> set(){
        return new HashSet<T>();
    }

    public static <T> Queue<T> queue(){
        return new LinkedList<T>();
    }

    public static void main(String[] args){
        Map<String, List<String>> sls = New.map();
//
        List<String> ls = New.<String>list();
    }
}
