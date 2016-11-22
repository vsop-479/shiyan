package shiyan.test.headfirst.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2016/11/22.
 */
public class Test {
    public static void main(String[] args){
        PersonBean a = new PersonBeanImpl();
        PersonBean b = new PersonBeanImpl();

        PersonBean pa1 = (PersonBean) Proxy.newProxyInstance(
                PersonBean.class.getClassLoader(), PersonBean.class.getInterfaces(), new OwnerInvocationHandler(a));
        pa1.setGender("male");
        System.out.println(pa1.getGender());
        pa1.setHotOrNotRating(10);

        PersonBean pa2 = (PersonBean) Proxy.newProxyInstance(PersonBean.class.getClassLoader(), PersonBean.class.getInterfaces(), new NonOwnerInvocationHandler(b));
    }
}
