package shiyan.test.inherit;

/**
 * Created by Administrator on 2017/1/19.
 * 继承并不只是复制基类的接口。
 * 当创建一个导出类的对象时，该对象包含了一个基类的子对象。
 * 这个子对象与你用基类直接创建的对象是一样的。
 * 二者的区别在于，后者来自于外部，而基类的子对象被包装在导出类对象内部。
 */
public class Test {
    public static void main(String[] args){
        S s = new S("");
        System.out.println(s.toString());
        System.out.println(s.toSuperString());
        System.out.println(s.hashCode());
        System.out.println(s.superHashCode());
        S s2 = new S("");
    }
}
