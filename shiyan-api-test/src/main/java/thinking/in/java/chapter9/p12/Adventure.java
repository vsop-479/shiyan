package thinking.in.java.chapter9.p12;

/**
 * Created by Administrator on 2016/2/25.
 */
interface CanClimb{
    void climb();
}
interface CanFight{
    void fight();
}

interface CanSwim{
    void swim();
}

interface CanFly{
    void fly();
}

class ActionCharacter{
    public void fight(){};
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly, CanClimb {

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void climb() {

    }
}

public class Adventure {
    public static void t(CanFight x){
        x.fight();
    }
    public static void u(CanSwim x){
        x.swim();
    }
    public static void v(CanFly x){
        x.fly();
    }
    public static void x(CanClimb x){
        x.climb();
    }
    public static void w(ActionCharacter x){
        x.fight();
    }
    public static void main(String[] args){
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
        x(h);
    }
}
