package thinking.in.java.chapter10.p6.pa3;

import thinking.in.java.chapter10.p6.pa1.I;
import thinking.in.java.chapter10.p6.pa2.A;

/**
 * Created by Administrator on 2016/4/13.
 */
public class B extends A {
    public I c(){
//        无法访问protected
//        return this.new SubA();
        return null;
    }
}
