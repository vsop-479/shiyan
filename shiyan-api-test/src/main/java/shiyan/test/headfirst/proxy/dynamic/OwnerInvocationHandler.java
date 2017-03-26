package shiyan.test.headfirst.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2016/11/22.
 */
public class OwnerInvocationHandler implements InvocationHandler {
    private PersonBean personBean;

    public OwnerInvocationHandler(PersonBean personBean){
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object o = null;
//        不能给自己打分
        if(method.getName().equals("setHotOrNotRating")){
            System.out.println("you cant your setHotOrNotRating");
        }else{
            o =  method.invoke(personBean, args);
        }
        return o;
    }
}
