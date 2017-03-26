package thinking.in.java.chapter15.p6;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Administrator on 2016/10/27.
 */
public class RandomList<T, A, G> {
    private ArrayList<T> storage = new ArrayList<T>();
    private ArrayList<A> storage2 = new ArrayList<A>();
    private ArrayList<G> storage3 = new ArrayList<G>();
    private Random random = new Random(47);
    public void add(T item){
        storage.add(item);
    }
    public T select(){
        return storage.get(random.nextInt(storage.size()));
    }

    public void add2(A item){
        storage2.add(item);
    }
    public A select2(){
        return storage2.get(random.nextInt(storage2.size()));
    }

    public void add3(G item){
        storage3.add(item);
    }
    public G select3(){
        return storage3.get(random.nextInt(storage3.size()));
    }

    public static void main(String[] args){
        RandomList<String, Integer, Boolean> rs = new RandomList<String, Integer, Boolean>();
        for(String s : ("The quick brown fox jumped over the lazy brown dog").split(" ")){
            rs.add(s);
            rs.add2(3);
            rs.add3(false);
        }
        for(int i = 0; i < 11; i++){
            System.out.println(rs.select() + " ");
        }
    }
}
