package thinking.in.java.chapter15.demo.coffee;

import java.util.Iterator;
import java.util.Random;

/**
 * Created by Administrator on 2016/10/27.
 */
public class CoffeeGenerator implements Generator<Coffee>, Iterable<Coffee> {
    private Class[] types = {Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class};
    private static Random random = new Random(47);

    public CoffeeGenerator(){}
    private int size = 0;
    public CoffeeGenerator(int sz){
        size = sz;
    }

    @Override
    public Coffee next(){
        try {
            return (Coffee) types[random.nextInt(types.length)].newInstance();
        } catch (Exception e) {
            e.printStackTrace();
//          RuntimeException 不必throws,或者catch
//          其他Exception必须throws或者catch等处理。
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    class CoffeeIterator implements Iterator<Coffee>{
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return CoffeeGenerator.this.next();
        }

        public void remove(){
            throw new UnsupportedOperationException();
        }
    }

    public static void main(String[] args){
        CoffeeGenerator gen = new CoffeeGenerator();
        for(int i = 0; i < 5; i++)
            System.out.println(gen.next());
        for(Coffee c : new CoffeeGenerator(5))
            System.out.println(c);
    }
}
