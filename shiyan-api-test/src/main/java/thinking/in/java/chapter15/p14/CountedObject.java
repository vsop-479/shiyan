package thinking.in.java.chapter15.p14;

/**
 * Created by Administrator on 2016/10/28.
 */
public class CountedObject {
    private static long counter = 0;
    private final long id = counter++;
    public long id(){
        return id;
    }
    public String toString(){
        return "CountedObject " + id;
    }
}
