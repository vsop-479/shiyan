package thinking.in.java.chapter17.demo.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Administrator on 2016/11/2.
 * HashSet，HashLinkedSet:查找快，所以contains(o)和remove(o)快
 */
public class TypesForSets {
    static <T> Set<T> fill(Set<T> set, Class<T> type){
        try{
            for(int i = 0; i < 10; i++){
//                type.getConstructor(int.class)获取type中，参数列表为int.class的构造方法
                set.add(type.getConstructor(int.class).newInstance(i));
            }
        }catch (Exception e){
            throw new RuntimeException(e);
        }
        return set;
    }

    static <T> void test(Set<T> set, Class<T> type){
        fill(set, type);
//        多次add，相等元素覆盖
        fill(set, type);
        fill(set, type);
        System.out.println(set);
    }

    public static void main(String[] args){
        test(new HashSet<HashType>(), HashType.class);
        test(new LinkedHashSet<HashType>(), HashType.class);
        test(new TreeSet<TreeType>(), TreeType.class);
//SetType没有实现hashCode(),导致相等的对象调用Object的hashCode不等，不必判断equals。
        test(new HashSet<SetType>(), SetType.class);
//        同上，不保证插入顺序，相等不覆盖
        test(new HashSet<TreeType>(), TreeType.class);
//        同上，保证插入顺序，相等不覆盖
        test(new LinkedHashSet<SetType>(), SetType.class);
//        同上，保证插入顺序，相等不覆盖
        test(new LinkedHashSet<TreeType>(), TreeType.class);

//        因SetType没有实现Comparable而抛出异常
//        运行时异常，ClassCastException： cannot be cast to java.lang.Comparable
        try{
            test(new TreeSet<SetType>(), SetType.class);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

//        同上
        try{
            test(new TreeSet<HashType>(), HashType.class);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

//set都需要实现equals，因相等元素要覆盖
class SetType{
    int i;
    public SetType(int n){
        i = n;
    }

    public boolean equals(Object o){
        return o instanceof SetType && (i == ((SetType)o).i);
    }

    public String toString(){
        return Integer.toString(i);
    }
}

//散列存储的元素要实现hashCode。
class HashType extends SetType{
    public HashType(int n){
        super(n);
    }
    public int hashCode(){
        return i;
    }
}

//TreeType中的元素，有比较顺序，实现比较器（注意区别于LinkedHashSet,是插入时的顺序）
class TreeType extends SetType implements Comparable<TreeType>{
    public TreeType(int n){
        super(n);
    }

    @Override
    public int compareTo(TreeType o) {
        return (i > o.i ? 1 : ( i == o.i ? 0 : -1));
    }
}