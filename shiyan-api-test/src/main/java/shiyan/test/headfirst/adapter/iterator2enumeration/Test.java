package shiyan.test.headfirst.adapter.iterator2enumeration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2016/11/17.
 */
public class Test {
    public static void main(String[] args){
        List list = new ArrayList<>();
        list.addAll(Arrays.asList("aa", "bb", "cc"));
        Iterator iterator = list.iterator();
        IteratorEnumeration iteratorEnumeration = new IteratorEnumeration(iterator);
        while (iteratorEnumeration.hasMoreElements()){
            System.out.println(iteratorEnumeration.nextElement());
        }
    }
}
