package thinking.in.java.chapter17.p8;


/**
 * Created by Administrator on 2016/11/2.
 */
public class P8<T> {
    transient int size = 0;
//    链表必须有first或者last，用来遍历
//    当链表只能next时，用first
//    当链表只能prev时，用last
//    双向链表，可以由头和尾向index获取。具体用哪个，取决于index距离哪个近。
    transient Node first;
    class Node{
        Node next;
        T item;
        Node(Node next, T t){
            this.item = t;
            this.next = next;
        }
    }

    public void add(T t){
        Node node = new Node(null, t);
        if(first == null)
            first = node;
        else
            node(size - 1).next = node;
    }

    public T get(int index){
        return node(index).item;
    }

    /**
     * 因是链表，必须遍历到index，取出node
     * 双向链表（即可next，又可prev)才可用一次二分，（size大时递归二分）
     * @param index
     * @return
     */
    Node node(int index){
        int mid = size >> 1;
        //        index在前段
        Node node = first;
        for(int i = 0; i < index; i++){
            node = first.next;
        }
        return node;
    }
}
