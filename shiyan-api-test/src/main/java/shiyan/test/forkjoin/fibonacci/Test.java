package shiyan.test.forkjoin.fibonacci;

import java.util.concurrent.ForkJoinPool;

/**
 * Created by Administrator on 2016/12/13.
 */
public class Test {
    public static void main(String[] args){
        final ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        Integer result = forkJoinPool.invoke(new FibonacciTask(45));
        System.out.println(result);
    }
}
