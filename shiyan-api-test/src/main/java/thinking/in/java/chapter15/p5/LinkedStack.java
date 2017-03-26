package thinking.in.java.chapter15.p5;

/**
 * Created by Administrator on 2016/10/27.
 */
public class LinkedStack<T> {
    private static class Node<T>{
        T item;
        Node<T> next;
        Node(){
            item = null;
            next = null;
        }
        Node(T item, Node<T> next){
            this.item = item;
            this.next = next;
        }
        boolean end(){
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<T>();

    public void push(T item){
        top = new Node<T>(item, top);
    }

    public T pop(){
        T result = top.item;
        if(!top.end()){
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args){
        LinkedStack<String> lss = new LinkedStack<String>();
        for(String s : "Phasers or stun!".split(" "))
            lss.push(s);
        String s;
        while ((s = lss.pop()) != null){
            System.out.println(s);
        }
    }
}
