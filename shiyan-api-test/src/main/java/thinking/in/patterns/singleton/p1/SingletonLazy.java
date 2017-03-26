package thinking.in.patterns.singleton.p1;

/**
 * Created by Administrator on 2016/11/7.
 */
public class SingletonLazy {
    private SingletonLazy(){}
    private static class Holder{
        private static SingletonLazy instance = new SingletonLazy();
    }

    public static SingletonLazy getInstance(){
        return Holder.instance;
    }
}
