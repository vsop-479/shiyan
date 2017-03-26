package thinking.in.java.chapter17.p6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/11/1.
 * List的自身的可选操作:
 * set(index,e), add(index,e), remove(index)抛出UnsupportedOperationException.
 * add,addAll,remove,removeAll,retainAll,clear是从Collection继承过来的可选操作.
 */
public class Unsupported<T> extends ArrayList<T>{
    public T set(int index, T element){
        throw new UnsupportedOperationException();
    }

    public void add(int index, T element) {
        throw new UnsupportedOperationException();
    }

    public T remove(int index) {
        throw new UnsupportedOperationException();
    }
}
