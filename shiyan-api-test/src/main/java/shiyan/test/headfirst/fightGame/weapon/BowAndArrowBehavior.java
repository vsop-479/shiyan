package shiyan.test.headfirst.fightGame.weapon;

/**
 * Created by Administrator on 2016/11/10.
 */
public class BowAndArrowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("射箭！");
    }
}
