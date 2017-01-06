package shiyan.test.examination.thread;

import java.util.Map;

/**
 * Created by Administrator on 2017/1/6.
 */
public class Test {
    public static void threadGroup(){
        System.out.println("main thread name:" + Thread.currentThread().getName());
        System.out.println("main thread group name:" + Thread.currentThread().getThreadGroup().getName());
        System.out.println(activeCount());
        Thread t1 = new Thread(new R());
        t1.start();
        t1.getThreadGroup().getName();
        System.out.println("t1 thread name:" + t1.getName());
        System.out.println("t1 thread group name:" + t1.getThreadGroup().getName());
        System.out.println(activeCount());
    }

    public static void main(String[] args){
        Thread t1 = new Thread(new R());
        t1.start();

        activeCount();
//        threadGroup();
        checkAccess();
        dumpStack();
        Thread[] tArray = new Thread[10];
        enumerate(tArray);
        Map<Thread, StackTraceElement[]> allStackTraces = getAllStackTraces();
        System.out.println("t1 priority:" + getPriority(t1));
        System.out.println("main priority:" + getPriority(Thread.currentThread()));
        System.out.println("t1 StackTraceElement[]:" + getStackTrace(t1));
        System.out.println("main StackTraceElement[]:" + getStackTrace(Thread.currentThread()));
        System.out.println("t1 State:" + getState(t1));
        System.out.println("main State:" + getState(Thread.currentThread()));
        System.out.println(holdsLock(Test.class));
        synchronized (Test.class){
            System.out.println(holdsLock(Test.class));
        }
        System.out.println("main isAlive:" + isAlive(Thread.currentThread()));
        System.out.println("t1 isAlive:" + isAlive(t1));

        System.out.println();
    }

    /**
     * 线程是否处于活动状态
     * @param thread
     * @return
     */
    public static boolean isAlive(Thread thread){
        return thread.isAlive();
    }
    /**
     * 当前线程持有指定对象的锁monitor
     * @param obj
     * @return
     */
    private static boolean holdsLock(Object obj){
        return Thread.currentThread().holdsLock(obj);
    }
    private static Thread.State getState(Thread thread){
        return thread.getState();
    }
    private static StackTraceElement[] getStackTrace(Thread thread){
        return thread.getStackTrace();
    }
    private static int getPriority(Thread thread){
        return thread.getPriority();
    }

    private static Map<Thread, StackTraceElement[]> getAllStackTraces(){
        return Thread.getAllStackTraces();
    }

    private static int enumerate(Thread[] tArray){
        return Thread.enumerate(tArray);
    }

    /**
     * 打印当前线程的堆栈跟踪。
     */
    private static void dumpStack(){
        Thread.dumpStack();
    }
    /**
     * 判断当前执行线程，是否有权修改该线程t1.
     */
    private static void checkAccess(){
        Thread t1 = new Thread(new R());
        t1.checkAccess();
    }

    /**
     * 当前线程所在线程组中活动线程数
     * @return
     */
    private static int activeCount(){
        return Thread.activeCount();
    }
}

class R implements Runnable{
    @Override
    public void run() {
        while(!Thread.interrupted()){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}