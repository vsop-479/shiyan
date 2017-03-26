package shiyan.test.effective.item13.unmodifiableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/1/13.
 */
public class Test {

    public static void main(String[] args){
        unmodifiableList();
    }

    /**
     * unmodifiableList中元素的引用不可变。
     * 测试unmodifiableList中元素的值的否可变。
     *  as.get(0).setName("gigi");
     * a.setName("gogo");成功，说明对象值可变
     */
    private static void unmodifiableList(){
        List<A> list = new ArrayList<>();
        list.add(new A("lili"));
        list.add(new A("kiki"));
        list.add(new A("mimi"));
        list.add(new A("nini"));

        List<A> as = Collections.unmodifiableList(list);
//        UnsupportedOperationException
//        unmodifiableList不能增加，移除元素
//        as.add(new A("riri"));

//        UnsupportedOperationException
//        unmodifiableList不能改变元素引用
//        as.set(0, new A("riri"));

//       a为as[0]的引用
        A a = as.get(0);
        as.get(0).setName("gigi");
        a.setName("gogo");
//        a为一个新的引用
        a = new A("riri");
        System.out.println("nothing");
    }
}

class A{
    private String name;

    public A(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}