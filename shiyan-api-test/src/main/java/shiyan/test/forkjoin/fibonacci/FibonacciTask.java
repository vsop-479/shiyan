package shiyan.test.forkjoin.fibonacci;

import java.util.concurrent.RecursiveTask;

/**
 * Created by Administrator on 2016/12/13.
 */
public class FibonacciTask extends RecursiveTask<Integer> {
    private int i;
    public FibonacciTask(int i){
        this.i = i;
    }

//    小的不计算，枚举出
    private int compute(int i){
        int[] result = {1, 1, 2, 3, 5, 8};
        return result[i - 1];
    }
    /**
     * The main computation performed by this task.
     *
     * @return the result of the computation
     */
    @Override
    protected Integer compute() {
        if(i <= 6){
            return compute(i);
        }
        FibonacciTask task1 = (FibonacciTask) new FibonacciTask(i - 1).fork();
        FibonacciTask task2 = (FibonacciTask) new FibonacciTask(i - 2).fork();
        return task1.join() + task2.join();
    }
}