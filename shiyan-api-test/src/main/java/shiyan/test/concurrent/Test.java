package shiyan.test.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2015/12/9.
 */
public class Test {
    public static void main(String[] args){
//        Executor exec = Executors.newCachedThreadPool();
        for(int i = 0; i < 10000; i++){
//            exec.execute(new R());
            new Thread(new R()).start();
        }
    }
}

class R implements Runnable{

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p/>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    public void run() {
        SingletonService.getService().f(Thread.currentThread().getName());
    }
}