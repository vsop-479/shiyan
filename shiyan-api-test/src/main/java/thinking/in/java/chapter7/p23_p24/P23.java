package thinking.in.java.chapter7.p23_p24;

/**
 * Created by Administrator on 2016/2/15.
 */
public class P23 {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            System.out.println(A.a);
        }
    }
}

class A{
    static int a = printInit("A.a initialized");
    static int printInit(String s){
        System.out.println(s);
        return 47;
    }
}
