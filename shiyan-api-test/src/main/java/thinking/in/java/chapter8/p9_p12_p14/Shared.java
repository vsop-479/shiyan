package thinking.in.java.chapter8.p9_p12_p14;

/**
 * Created by Administrator on 2016/2/17.
 */
public class Shared {
    private int refCount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared(){
        System.out.println("Creating " + this);
    }
    public void addRef(){refCount++;}
    protected void dispose(){
        if(--refCount == 0){
            System.out.println("Disposing " + this);
        }
    }
    public String toString(){
        return "Shared " + id;
    }
    public int getRefCount(){
        return refCount;
    }
}
