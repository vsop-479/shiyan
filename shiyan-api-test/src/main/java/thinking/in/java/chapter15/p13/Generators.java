package thinking.in.java.chapter15.p13;

import thinking.in.java.chapter15.demo.coffee.Coffee;
import thinking.in.java.chapter15.demo.coffee.CoffeeGenerator;
import thinking.in.java.chapter15.demo.coffee.Generator;
import thinking.in.java.chapter15.demo.fibonacci.Fibonacci;

import java.util.*;

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

    public static <T> List<T> fill(List<T> coll, Generator<T> gen, int n){
        for(int i = 0; i < n; i++){
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> Set<T> fill(Set<T> coll, Generator<T> gen, int n){
        for(int i = 0; i < n; i++){
            coll.add(gen.next());
        }
        return coll;
    }

//  如果注释掉该方法
//      LinkedList<Coffee> coll3 = fill(new LinkedList<Coffee>(), new CoffeeGenerator(), 7); 出错
//    ArrayList<Coffee> coll4 = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 7); 正确
//    因为LinkedList同时实现了List和Queue，导致编译器不知道调用哪一个fill（List和Queue)
    public static <T> LinkedList<T> fill(LinkedList<T> coll, Generator<T> gen, int n){
        for(int i = 0; i < n; i++){
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> ArrayList<T> fill(ArrayList<T> coll, Generator<T> gen, int n){
        for(int i = 0; i < n; i++){
            coll.add(gen.next());
        }
        return coll;
    }

    public static <T> Queue<T> fill(Queue<T> coll, Generator<T> gen, int n){
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

        LinkedList<Coffee> coll3 = fill(new LinkedList<Coffee>(), new CoffeeGenerator(), 7);
        ArrayList<Coffee> coll4 = fill(new ArrayList<Coffee>(), new CoffeeGenerator(), 7);
    }
}
