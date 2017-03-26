package shiyan.test.headfirst.adapter.iterator2enumeration;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by Administrator on 2016/11/17.
 * 将迭代器适配成枚举器
 */
public class IteratorEnumeration implements Enumeration{
    private Iterator iterator;
    public IteratorEnumeration(Iterator iterator){
        this.iterator = iterator;
    }
    @Override
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return iterator.next();
    }
}
