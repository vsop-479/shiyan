package thinking.in.java.chapter8.p1_p5_p17;

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
        Cycle cu = new Unicycle();
        Cycle cb = new Bicycle();
//        cu.balance();//cu向上转型到Cycle，不能调用，编译出错
//        cb.balance();
        ((Unicycle)cu).balance();//cu向下转型到Unicycle，能调用
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
    public void balance(){}
}
class Bicycle extends Cycle{
    public void run(){
        System.out.println("Bicycle run, wheels " + wheels());
    }
    public int wheels(){
        return 2;
    }
    public void balance(){}
}
class Tricycle extends Cycle{
    public void run(){
        System.out.println("Tricycle run, wheels " + wheels());
    }
    public int wheels(){
        return 3;
    }
}
