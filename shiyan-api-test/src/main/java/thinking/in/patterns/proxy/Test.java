package thinking.in.patterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/11/9.
 */
public class Test {
    public static void main(String[] args){
        //返回一个指定接口{A.class}的代理类对象，InvocationHandler是方法调用时调用的处理程序
        A a = (A) Proxy.newProxyInstance(A.class.getClassLoader(), new Class[]{A.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                for(int i = 0; i < args.length; i++){
                    System.out.println("\t\t" + args[i]);
                }
                return null;
            }
        });
        a.f("hello");
        a.g(47);
        a.h(47, "hello");
    }
}

interface A{
    void f(String s);
    void g(int i);
    void h(int i, String s);
}