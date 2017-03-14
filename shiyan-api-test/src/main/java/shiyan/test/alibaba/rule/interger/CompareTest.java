package shiyan.test.alibaba.rule.interger;

/**
 * Created by Administrator on 2017/3/14.
 * Integer var=?在-128至127之间的赋值，
 * Integer对象是在IntegerCache.cache产生，会复用已有对象，
 * 这个区间内的Integer值可以直接使用==进行判断，
 * 但是这个区间之外的所有数据，都会在堆上产生，
 * 并不会复用已有对象，这是一个大坑，推荐使用equals方法进行判断
 */
public class CompareTest {
    public static void main(String[] args){
        compareInteger();
    }

    public static void compareInteger(){
        Integer a1 = 300;
        Integer a2 = 300;
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));

        Integer b1 = 100;
        Integer b2 = 100;
        System.out.println(b1 == b2);
        System.out.println(b1.equals(b2));
    }
}
