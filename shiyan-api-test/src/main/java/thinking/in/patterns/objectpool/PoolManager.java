package thinking.in.patterns.objectpool;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/7.
 */
public class PoolManager {
    private static class PoolItem{
        boolean inUse = false;
        Object item;
        PoolItem(Object item){
            this.item = item;
        }
    }
//    可用信号量semaphore实现
    private ArrayList items = new ArrayList();
    public void add(Object item){
        items.add(new PoolItem(item));
    }

    static class EmptyPoolException extends Exception {}

    public Object get() throws EmptyPoolException {
        for(int i = 0; i < items.size(); i++) {
            PoolItem pitem = (PoolItem)items.get(i);
            if(!pitem.inUse) {
                pitem.inUse = true;
                return pitem.item;
            }
        }
        throw new EmptyPoolException();
    }

//    将item inUse设置成false
    public void release(Object item) {
        for(int i = 0; i < items.size(); i++) {
            PoolItem pitem = (PoolItem)items.get(i);
            if(item == pitem.item) {
                pitem.inUse = false;
                return;
            }
        }
        throw new RuntimeException(item + " not found");
    }
}
