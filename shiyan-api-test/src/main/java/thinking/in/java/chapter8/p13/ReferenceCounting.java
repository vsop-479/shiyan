package thinking.in.java.chapter8.p13;

/**
 * Created by Administrator on 2016/2/17.
 * 结果：
 * Creating Shared 0（id = counter++：id = counter, counter = counter + 1)
 * Creating Composing 0
 * Creating Composing 1
 * Creating Composing 2
 * Creating Composing 3
 * Creating Composing 4
 * Disposing Composing 0
 * Disposing Composing 1
 * Disposing Composing 2
 * Disposing Composing 3
 * Disposing Composing 4
 * Disposing Shared 0
 */
class Shared{
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

}
class Composing{
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared){
        System.out.println("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose(){
        System.out.println("Disposing " + this);
        shared.dispose();
    }
    public String toString(){
        return "Composing " + id;
    }
    protected void finalize(){
        //做一些清理工作，或检查
    }
}
public class ReferenceCounting {
    public static void main(String[] args){
        Shared shared = new Shared();
        Composing[] composing = {
                new Composing(shared), new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared)
        };
        for(Composing c :composing){
            c.dispose();
        }
        System.gc();
    }
}