package thinking.in.java.chapter17.p6;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Administrator on 2016/11/1.
 * ArrayList 支持随机快速访问RandomAccess
 * 如果 list instanceOf RandomAccess
 * 则:
 * for (int i=0, n=list.size(); i < n; i++)
 * 否则;
 * for (Iterator i=list.iterator(); i.hasNext(); )
 * RandomAccess: 2
 SequenceAccess: 6
 */
public class RandomAccessVSSequenceAccess {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        for(int i = 0; i < 100000; i++){
            list.add("e" + i);
        }

        long t1 = System.currentTimeMillis();
        for(int i = 0; i < 100000; i++){
            list.get(i);
        }
        long t2 = System.currentTimeMillis();
        for(Iterator<String> i = list.iterator(); i.hasNext();){
            i.next();
        }
        long t3 = System.currentTimeMillis();
        System.out.println("RandomAccess: " + (t2 - t1));
        System.out.println("SequenceAccess: " + (t3 - t2));
    }
}
