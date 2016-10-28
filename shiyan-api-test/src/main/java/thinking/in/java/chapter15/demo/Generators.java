package thinking.in.java.chapter15.demo;

import thinking.in.java.chapter15.demo.coffee.Coffee;
import thinking.in.java.chapter15.demo.coffee.CoffeeGenerator;
import thinking.in.java.chapter15.demo.coffee.Generator;
import thinking.in.java.chapter15.demo.fibonacci.Fibonacci;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by Administrator on 2016/10/28.
 */
public class Generators {
    public static <T> Collection<T> fill(Collection<T> coll, Generator<T> gen, int n){
        for(int i = 0; i < n; i++){
            coll.add(gen.next());
        }
        return coll;
    }

    public static void main(String[] args){
        Collection<Coffee> coll = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 7);
        for(Coffee coffee : coll){
            System.out.println(coffee);
        }

        Collection<Integer> coll2 = fill(new ArrayList<Integer>(), new Fibonacci(), 7);
        for(Integer i : coll2){
            System.out.print(i);
        }
    }
}
