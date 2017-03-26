package shiyan.test.concurrent.thread;

import org.omg.SendingContext.RunTime;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2016/12/29.
 */
public class Test {
    public static void main(String[] args){
    }



    public static void threadMethod() throws InterruptedException, ExecutionException {
        Thread thread = new Thread();
        ExecutorService exec = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//        提交Runnable任务
        exec.submit(new A());
        ExecutorCompletionService<Result> execCompletion = new ExecutorCompletionService<Result>(exec);
        Map map = new HashMap();
//        提交Callable任务
        execCompletion.submit(new B(map));
//        获取已经完成的结果
        Result result = execCompletion.take().get();
    }

    public static void lock() throws InterruptedException {
        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();
        condition.await();
    }
}
class B implements Callable<Result>{
    private Map map;
    public B(Map map){
        this.map = map;
    }
    @Override
    public Result call() throws Exception {
//        map to result
        return null;
    }
}
class A implements Runnable{
    @Override
    public void run() {

    }
}

class Result{}