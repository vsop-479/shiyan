package thinking.in.java;

/**
 * Created by Administrator on 2015/10/19.
 */
public class Come {

    public static void main(String[] args){
        String cc = A.source;
        cc += "fff";
        System.out.println(A.source);
        System.out.println(cc);
    }
    class B{

    }
}

class A{
    protected static String source = "aaa";
}