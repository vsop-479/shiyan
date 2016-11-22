package shiyan.test.headfirst.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/11/22.
 */
public class NonOwnerInvocationHandler implements InvocationHandler {
    private PersonBean personBean;

    public NonOwnerInvocationHandler(PersonBean personBean){
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object o = null;
        //不能设置别人的个人信息
        if(method.getName().equals("setName") || method.getName().equals("setGender") || method.getName().equals("setInterests")){
            System.out.println("you cant set others information");
        }else{
            o = method.invoke(personBean, args);
        }
        return o;
    }
}
