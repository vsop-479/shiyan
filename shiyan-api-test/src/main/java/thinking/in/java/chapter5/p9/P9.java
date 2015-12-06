package thinking.in.java.chapter5.p9;

/**
 * Created by zhouhui on 2015/12/6.
 */
public class P9 {
    public P9(){
        this("sa");
//        this(3);//只能在第一行通过this调用构造器
    }

    public P9(String a){
        this(9);
        System.out.println(a);
    }

    public P9(int i){
        System.out.println(i);
    }

    public static void main(String[] args){
        System.out.println(args);
        new P9();
    }
}
