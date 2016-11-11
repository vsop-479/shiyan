package shiyan.test.headfirst.strategy.fightGame.weapon;

/**
 * Created by Administrator on 2016/11/10.
 */
public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("刀刀刀！");
    }
}
