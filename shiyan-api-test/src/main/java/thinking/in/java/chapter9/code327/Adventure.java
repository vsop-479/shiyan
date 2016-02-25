package thinking.in.java.chapter9.code327;

/**
 * Created by Administrator on 2016/2/25.
 */
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
class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly{

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

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
    public static void w(ActionCharacter x){
        x.fight();
    }
    public static void main(String[] args){
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
    }
}
