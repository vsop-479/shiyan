package thinking.in.patterns.proxy.dynamic.jdk;

import thinking.in.patterns.proxy.dynamic.jdk.ITarget;

/**
 * Created by Administrator on 2016/11/9.
 */
public class Target implements ITarget {

    @Override
    public void f(String s) {
        System.out.println("---------Target process--------" + s);
    }
}
