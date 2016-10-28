package thinking.in.java.chapter15.p14;

import thinking.in.java.chapter15.demo.coffee.Generator;

/**
 * Created by Administrator on 2016/10/28.
 */
public class BasicGeneratorDemo {
    public static void main(String[] args){
        Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
        for(int i = 0; i < 5; i++){
            System.out.println(gen.next());
        }

        Generator<CountedObject> gen2 = new BasicGenerator<>(CountedObject.class);
        for(int i = 0; i < 5; i++){
            System.out.println(gen2.next());
        }
    }
}
