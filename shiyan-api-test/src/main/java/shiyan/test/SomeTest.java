package shiyan.test;



import java.util.*;

/**
 * Created by Administrator on 2015/9/17.
 */
public class SomeTest {
    private static int counter = 0;
    private byte[] b = new byte[2048];
    public static void main(String[] args){
        concurrentModify();
    }

    public static void concurrentModify(){
        List<SomeTest> list =  new ArrayList<>();
        for(int i = 0; i < 10000; i++){
            System.out.println(i);
            list.add(new SomeTest());
        }
//不遍历迭代器，不会concurrentModifyException
//        for(int i = 0; i < 10000; i++){
//            SomeTest someTest = list.get(i);
//            someTest = null;
//            list.add(new SomeTest());
//        }
        System.out.println(list.size());

//遍历迭代器，ConcurrentModificationException
        Iterator<SomeTest> iterator = list.iterator();
        while (iterator.hasNext()){
            SomeTest someTest = iterator.next();
            someTest = null;
//            ConcurrentModificationException
            list.add(new SomeTest());
        }
    }

    public static void outOfMemory(){
        List<SomeTest> list =  new ArrayList<>();
        for(int i = 0; i < Math.pow(2, 31); i++){
            System.out.println(i);
            list.add(new SomeTest());
        }
    }

    public static void stackOverFlow(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter++);
        stackOverFlow();
    }
    public static void throwfinally(){
        try{
            throw new RuntimeException("RuntimeException");
        }catch(Exception e){
            throw e;
        }finally{
            System.out.println("dsfsd");
        }
    }

    public static void fort(){
        hh:
        for(;;){
            System.out.println("dsf");
            break hh;
        }
    }

    public static void testClone() throws CloneNotSupportedException {
        B b = new B();
//        一个新的对象，clone b的值
        B clone = b.clone();
        System.out.println(b == clone);
    }

//    clone contract:
//    x.clone() != x
//    x.clone().getClass() == x.getClass()
//    x.clone().equals(x)
    public static void classLoaderPractice(){
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        ClassLoader classLoader = SomeTest.class.getClassLoader();
        ClassLoader parentClassLoader = classLoader.getParent();
    }

    public static void FloatDouble2Int(){
        Float f = 33.33f;
        System.out.println(f.intValue());
        System.out.println(Float.floatToIntBits(f));
    }
    /**
     * 任何对象与null都不等
     */
    public static void nullEquals(){
        System.out.println(null instanceof SomeTest);
        System.out.println(null == null);
        System.out.println("" == null);
        System.out.println("".equals(null));
    }
//    因数都是成对出现，a*a > (a+n)*(a-n) 所以判断N是否是质数，除到N的平方根即可。
    static void sqrt(){
        System.out.println(Math.sqrt(15));
    }


    static void cantInitialAbstractClass(){
        //        不能实例化抽象类
//        new A();
    }
    static void NaNFalse(){
        System.err.println((Double.NaN > Double.NaN) || (Double.NaN <= Double.NaN));
    }

    static void charAtLittleFasterThanStartWith(){
        String s = "abc";
        long l = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            System.out.print(s.startsWith("a"));
        }
        System.out.println();
        System.out.println(System.currentTimeMillis() - l);

        long l2 = System.currentTimeMillis();
        for(int i = 0; i < 10000; i++){
            System.out.print((s.charAt(0) == 'a'));
        }
        System.out.println();
        System.out.println(System.currentTimeMillis() - l2);
    }
}

/**
 * abstract class 不能实例化。
 */
abstract class A{
    private A(){

    }

    private void A(){

    }
}

class B implements Cloneable{
    private final String s = "dss";
    private final Integer i = 33;
    public B(){
    }

    public B clone() throws CloneNotSupportedException {
        return (B) super.clone();
    }
}