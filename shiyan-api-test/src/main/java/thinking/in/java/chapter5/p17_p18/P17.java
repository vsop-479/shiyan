package thinking.in.java.chapter5.p17_p18;

/**
 * Created by Administrator on 2015/12/7.
 */
public class P17 {
    private static S[] ses = new S[2];
    public static void main(String[] args){
        ses[0] = new S("msg1");
        ses[1] = new S("msg2");
    }
}

class S{
    public S(String msg){
        System.out.println(msg);
    }
}