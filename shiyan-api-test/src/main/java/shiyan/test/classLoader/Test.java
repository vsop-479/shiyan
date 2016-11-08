package shiyan.test.classLoader;

import java.net.URLClassLoader;

/**
 * Created by Administrator on 2016/3/28.
 */
public class Test {
    public static void main(String[] args){
        String s = "abcd";
        Integer i = 1234;
        System.out.println(s.hashCode());
        System.out.println(i.hashCode());
//        System.out.printf();
//        System.out.format();
        System.out.println(d());
    }

    public static String d(){
        try{
            throw new RuntimeException();

        }catch(Exception e){
            return "aaa";
        }finally {
            return "bbb";
        }

    }

}
