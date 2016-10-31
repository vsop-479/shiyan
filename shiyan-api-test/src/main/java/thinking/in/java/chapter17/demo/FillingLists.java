package thinking.in.java.chapter17.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2016/10/31.
 * //        fill只能替换list中存在的元素。
 */
public class FillingLists {
    public static void main(String[] args){
//        返回一个指定对象的n个引用的副本的不可变的列表，
        List<StringAddress> list = new ArrayList<StringAddress>(Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(list);
//        将list中的所有元素，都替换为“World”
        Collections.fill(list, new StringAddress("World!"));
        System.out.println(list);
    }
}

class StringAddress{
    private String s;
    public StringAddress(String s){
        this.s = s;
    }


    public String toString(){
//        super.toString打印地址，this打印值
        return super.toString() + " " + s;
    }
}