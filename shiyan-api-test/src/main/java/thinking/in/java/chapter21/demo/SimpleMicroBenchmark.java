package thinking.in.java.chapter21.demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2016/11/3.
 * 危险的“微基准测试”：隔离的，脱离上下文的测试。
 * 1：互斥只有在存在竞争的情况下，才能看到真正的差异。但该示例，互斥都是在单个线程中执行的。
 * 2：编译器会对synchronized特殊优化，甚至有可能注意到程序是单线程的。
 */
public class SimpleMicroBenchmark {
    static long test(Incrementable incr){
        long start = System.nanoTime();
        for(long i = 0; i < 10000000L; i++){
            incr.increment();
        }
        return System.nanoTime() - start;
    }

    public static void main(String[] args){
        long syncTime = test(new SynchronizingTest());
        long lockTime = test(new LockingTest());
        System.out.printf("synchronized: %1$10d\n", syncTime);
        System.out.printf("lock:         %1$10d\n", lockTime);
        System.out.printf("lock/synchronized = %1$.3f\n", (double)lockTime/(double)syncTime);

    }
}

abstract class Incrementable{
    protected long counter = 0;
    public abstract void increment();
}

//synchronized 锁对象，锁类
class SynchronizingTest extends Incrementable{

    @Override
    public synchronized void increment() {
        ++counter;
    }
}

class LockingTest extends Incrementable{
    private Lock lock = new ReentrantLock();

    @Override
    public void increment() {
        lock.lock();
        try{
            ++counter;
        }finally {
            lock.unlock();
        }
    }
}