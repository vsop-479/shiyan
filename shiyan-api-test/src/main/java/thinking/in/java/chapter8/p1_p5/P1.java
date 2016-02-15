package thinking.in.java.chapter8.p1_p5;

/**
 * Created by Administrator on 2016/2/15.
 */
public class P1 {
    public static void ride(Cycle c){
       c.run();
    }
    public static void main(String[] args){
        Cycle c = new Cycle();
        Unicycle uc = new Unicycle();
        Bicycle bc = new Bicycle();
        Tricycle tc = new Tricycle();
        Cycle ctc = new Tricycle();
        ride(c);
        ride(uc);
        ride(bc);
        ride(tc);
        ride(ctc);
    }
}

class Cycle{
    public void run(){
        System.out.println("Cycle run, wheels " + wheels());
    }

    public int wheels(){
        return 0;
    }
}

class Unicycle extends Cycle{
    public void run(){
        System.out.println("Unicycle run, wheels " + wheels());
    }
    public int wheels(){
        return 1;
    }
}
class Bicycle extends Cycle{
    public void run(){
        System.out.println("Bicycle run, wheels " + wheels());
    }
    public int wheels(){
        return 2;
    }
}
class Tricycle extends Cycle{
    public void run(){
        System.out.println("Tricycle run, wheels " + wheels());
    }
    public int wheels(){
        return 3;
    }
}
