package shiyan.test.examination.threadGroup;

/**
 * Created by Administrator on 2017/1/6.
 */
public class Test {
    public static void main(String[] args){
        activeCount();
    }
    public static void activeCount(){
        ThreadGroup tg = new ThreadGroup("tg");
        Thread t1 = new Thread(tg, new R());
        Thread t2 = new Thread(tg, new R());
        t1.start();
        t2.start();
        System.out.println(tg.activeCount());
        while(!t1.isInterrupted()){
            System.out.println("t1.isInterrupted():" + t1.isInterrupted());
            if(t1.getState().equals(Thread.State.RUNNABLE)){
//                不能正确中断，因为sleep后runnable马上又sleep
                t1.interrupt();
            }
        }

        while(!t2.isInterrupted()){
            System.out.println("t2.isInterrupted():" + t2.isInterrupted());
            if(t2.getState().equals(Thread.State.RUNNABLE)){
                t2.interrupt();
            }
        }
        tg.interrupt();
        tg.destroy();
    }
}

class R implements Runnable{

    @Override
    public void run() {
        while(!Thread.interrupted()){
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}