package thinking.in.java.chapter15.p7;

import thinking.in.java.chapter15.demo.fibonacci.Fibonacci;

import java.util.Iterator;

/**
 * Created by Administrator on 2016/10/28.
 */
public class IterableFibonacciByComponent implements Iterable<Integer>{
    private int n;
    public IterableFibonacciByComponent(int count){
        n = count;
    }

    private Fibonacci fibonacci = new Fibonacci();

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n--;
                return fibonacci.next();
            }
        };
    }

    public static void main(String[] args){
//        遍历迭代器
        for(int i : new IterableFibonacciByComponent(18))
            System.out.print(i + " ");
    }
}
