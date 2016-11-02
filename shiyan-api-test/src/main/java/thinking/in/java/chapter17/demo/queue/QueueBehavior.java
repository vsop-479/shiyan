package thinking.in.java.chapter17.demo.queue;

import thinking.in.java.chapter15.demo.coffee.Generator;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by Administrator on 2016/11/2.
 * Queue：队列，先进先出。
 * 优先级队列除外，会排序。
 * PriorityQueue，PriorityBlockingQueue
 */
public class QueueBehavior {
    private static int count = 10;
    static <T> void test(Queue<T> queue, Generator<T> gen){
        for(int i = 0; i < count; i++){
            queue.offer(gen.next());
        }
//peek+remove == poll
        while(queue.peek() != null){
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    static class Gen implements Generator<String>{
        int i;
        String[] a = "one two three four five six seven eight nine ten".split(" ");

        @Override
        public String next() {
            return a[i++];
        }
    }

    public static void main(String[] args){
        test(new LinkedList<String>(), new Gen());
//        offer进元素后，排序
        test(new PriorityQueue<String>(), new Gen());
//      有界，满时添加（add，offer）阻塞，空时移除（peek，remove，poll）阻塞。
        test(new ArrayBlockingQueue<String>(count), new Gen());
        test(new ConcurrentLinkedQueue<String>(), new Gen());
//        如果未指定容量，则它等于 Integer.MAX_VALUE
        test(new LinkedBlockingQueue<String>(), new Gen());
        test(new PriorityBlockingQueue<String>(), new Gen());

    }
}
