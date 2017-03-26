package thinking.in.patterns.proxy.dynamic.jdk;

import org.springframework.cglib.core.DebuggingClassWriter;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/11/9.
 * 动态代理：运行时生成创建代理类的class文件
 * jdk动态代理和cglib动态代理
 * jdk：
 * 代理类Proxy实现Target类实现的接口，
 * 组合InvocationHandler对象，植入代理逻辑，
 * InvocationHandler对象组合target对象，通过反射执行target方法。
 * cglib：
 * 代理类Proxy继承Target类，所以Target类需要有无参构造方法（不用显示的super(args))。
 * 采用MethodInterceptor,植入逻辑，
 * 调用Target类的方法，super.f();
 */
public class ProxyM {
    public static void main(String[] args){
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:/");
        ITarget target = new Target();
//        返回代理对象，并指定代理逻辑，向代理逻辑中传入target，可执行原本逻辑。
        ITarget proxy = (ITarget) Proxy.newProxyInstance(ITarget.class.getClassLoader(),
                Target.class.getInterfaces(), new PInvocation(target));
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