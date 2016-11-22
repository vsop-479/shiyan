package thinking.in.patterns.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Objects;

/**
 * Created by Administrator on 2016/11/9.
 */
public class ProxyM {
    public static void main(String[] args){
        ITarget target = new Target();
//        返回代理对象，并指定代理逻辑，向代理逻辑中传入target，可执行原本逻辑。
        ITarget proxy = (ITarget) Proxy.newProxyInstance(ITarget.class.getClassLoader(),
                new Class[]{ITarget.class}, new PInvocation(target));
        proxy.f("harden");
    }
}

//代理逻辑
class PInvocation implements InvocationHandler{
    private Object target;

    public PInvocation(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("---------before--------");
        Object o = method.invoke(target, args);
        System.out.println("---------after--------");
        return o;
    }
}