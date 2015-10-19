package thinking.in.java.chapter2.p7;

import org.apache.kafka.common.metrics.Stat;

/**
 * Created by Administrator on 2015/10/19.
 */
public class Incrementable {
    static void increment(){
        StaticTest.i++;
    }

    public static void main(String[] args){
        Incrementable.increment();
        System.out.println(StaticTest.i);
    }
}
