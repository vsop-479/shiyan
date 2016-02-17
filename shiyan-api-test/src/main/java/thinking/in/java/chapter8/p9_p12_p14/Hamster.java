package thinking.in.java.chapter8.p9_p12_p14;

/**
 * Created by Administrator on 2016/2/16.
 */
public class Hamster extends Rodent {
    Hamster(Shared shared){
        super(shared);//基类没有默认的构造，需要显示调用
        System.out.println("Hamster()");
    }
    public void f(){
        System.out.println("Hamster");
    }
}
