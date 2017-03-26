package thinking.in.patterns.proxy.dynamic.cglib;

/**
 * Created by Administrator on 2017/1/19.
 * Target 必须有无参的构造方法才能被cglib代理。
 */
public class Target {
//    public Target(String s){
//
//    }
    public void f(String s) {
        System.out.println("---------Target process--------" + s);
    }
}
