package thinking.in.java.chapter17.p7;

import java.util.*;

/**
 * Created by Administrator on 2016/11/1.
 */
public class P7 {
    public static void main(String[] args){
        String[] ss = "A,B,C,D,E,F,G".split(",");
//        该list不可add，remove
        List<String> list = Arrays.asList(ss);
//        构造新的list，可以修改
        ArrayList<String> aList = new ArrayList<>(list);
        LinkedList<String> lList = new LinkedList<>(list);
        Iterator<String> aIterator = aList.iterator();
        System.out.print("ArrayList: ");
        while (aIterator.hasNext()){
            System.out.print(aIterator.next());
        }
        System.out.println();
        System.out.print("LinkedList: ");
        Iterator<String> lIterator = lList.iterator();
        while (lIterator.hasNext()){
            System.out.print(lIterator.next());
        }
        System.out.println();
        System.out.print("lListIterator add next: ");
        ListIterator<String> lListIterator = lList.listIterator();
        for(int i = 0; i < aList.size(); i++){
            lListIterator.next();
            lListIterator.add(aList.get(i).toLowerCase());
        }
//        此时，lListIterator游标已经到末尾
        while (lListIterator.hasPrevious()){
            System.out.print(lListIterator.previous());
        }
        aList = new ArrayList<>(list);
        lList = new LinkedList<>(list);
        ListIterator<String> aListIterator = aList.listIterator();
//        为了从后先前遍历aListIterator.previous()，先将游标移到表尾。
        while (aListIterator.hasNext()){
            aListIterator.next();
        }
        System.out.println();
        System.out.print("aListIterator add previous: ");
        for(int i = lList.size() - 1; i >= 0; i--){
            aListIterator.previous();
            aListIterator.add(lList.get(i).toLowerCase());
            aListIterator.previous();
        }
        //        此时，aListIterator游标已经到开头
        while (aListIterator.hasNext()){
            System.out.print(aListIterator.next());
        }
    }
}
