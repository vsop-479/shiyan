package shiyan.test.gc;

import thinking.in.java.chapter21.demo.SynchronizationComparisons;

/**
 * Created by Administrator on 2017/5/23.
 */
public class MyThread extends Thread {
    public MyThread(ThreadGroup threadGroup, String name){
        super(threadGroup, name);
    }
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
