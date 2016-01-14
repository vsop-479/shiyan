package thinking.in.java.chapter7.p16_p17;

/**
 * Created by Administrator on 2016/1/14.
 */
public class Frog extends Amphibian{
    public static void f(Amphibian amphibian){
        System.out.println("Frog");
    }
    public static void main(String[] args){
        Frog frog = new Frog();
        Frog.f(frog);
    }
}

class Amphibian{
    public static void f(Amphibian amphibian){
        System.out.println("Amphibian");
    }
}