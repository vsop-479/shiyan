package thinking.in.java.chapter17.p9;

import java.util.TreeSet;

/**
 * Created by Administrator on 2016/11/2.
 */
public class P9 {
    public static void main(String[] args){
        TreeSet<String> treeSet = new TreeSet<String>();
        for(String s : "java.lang.ClassCastException.thinking.in.java.chapter17.demo.set.SetType".split("\\.")){
            treeSet.add(s);
        }
        System.out.println(treeSet);
    }

}
