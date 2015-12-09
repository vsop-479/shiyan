package shiyan.test.concurrent;

/**
 * Created by Administrator on 2015/12/9.
 */
public class SingletonService {
    public A a;
    private SingletonService(){}
    private static class Holder{
        private static SingletonService singleton = new SingletonService();
    }
    public static SingletonService getService(){
        return Holder.singleton;
    }

    public void f(String s){
       A a = new A();
        a.b = s;
        String msg = a.getMsg(s);
        if(!s.equals(msg)){
            System.out.println(s + ":" + msg);
        }
    };
}


class A{
    public String b;
    public String getMsg(String s){
//        return s;
        return b;
    }
}