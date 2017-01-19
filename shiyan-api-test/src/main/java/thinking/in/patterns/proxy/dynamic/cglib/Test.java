package thinking.in.patterns.proxy.dynamic.cglib;

import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.cglib.proxy.Enhancer;

/**
 * Created by Administrator on 2017/1/19.
 *
 */
public class Test {
    public static void main(String[] args){
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:/");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Target.class);
        enhancer.setCallback(new Proxy());
        Target o = (Target) enhancer.create();

        o.f("ds");
    }
}
