package thinking.in.java.chapter10.p2_p4;

import thinking.in.java.chapter10.p1_p3.Outer;

/**
 * Created by Administrator on 2016/2/29.
 */
interface Selector{
    boolean end();
    Object current();
    void next();
}
public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size){
        items = new Object[size];
    }
    public void add(Object x){
        if(next < items.length)
            items[next++] = x;
    }
    private class SequenceSelector implements Selector{
        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(i < items.length)
                i++;
        }
    }
    public Selector selector(){
        return new SequenceSelector();
    }
    public static void main(String[] args){
        Sequence sequence = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence.add(Integer.toString(i));
        Selector selector = sequence.selector();
        while(!selector.end()){
            System.out.print(selector.current() + " ");
            selector.next();
        }
        System.out.println();
        Sequence sequence2 = new Sequence(10);
        for(int i = 0; i < 10; i++)
            sequence2.add(new A("a" + i));
        Selector selector2 = sequence2.selector();
        while(!selector2.end()){
            System.out.print(selector2.current() + " ");
            selector2.next();
        }
    }
}

class A{
    private String s;
    public String toString(){
        return s;
    }
    public A(String s){
        Outer outer = new Outer("d");
        Outer.Inner inner = outer.new Inner();
        this.s = s;
    }
}