package thinking.in.patterns.singleton;

/**
 * Created by Administrator on 2016/11/4.
 */
public class Test {
    public static void main(String[] args){
        Singleton s = Singleton.getReference();
        System.out.println(s);
    }
}

final class Singleton{
    private static Singleton s = new Singleton(47);
    private int i;
    private Singleton(int x){
        i = x;
    }
    public static Singleton getReference(){
        return s;
    }

    public int getValue(){
        return i;
    }

    public void setValue(int x){
        i = x;
    }

//    单例不应该实现clone
//    public Singleton clone(){a
//        return s;
//    }

}