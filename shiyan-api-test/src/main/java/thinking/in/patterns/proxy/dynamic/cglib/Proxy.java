package thinking.in.patterns.proxy.dynamic.cglib;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/1/19.
 */
public class Proxy implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("---------before--------");
        Object o1 = methodProxy.invokeSuper(o, objects);
        System.out.println("---------after--------");
        return o1;
    }
}
