package thinking.in.java.chapter5.p10_p11;

/**
 * Created by zhouhui on 2015/12/6.
 */
public class P10 {
    //对象被垃圾回收之前，调用此方法
    public void finalize(){
        System.out.println("do something before gc");
    }

    public static void main(String[] args){
        new P10();
        System.gc();
    }
}
