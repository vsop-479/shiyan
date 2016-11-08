package shiyan.test.practice;

/**
 * Created by Administrator on 2016/11/8.
 */
public class Foo {
    public static void main(String[] args){
//        未初始化，编译出错
//        String s;
//        System.out.println("s=" + s);
        String s = null;
        System.out.println("s=" + s);
    }
}
