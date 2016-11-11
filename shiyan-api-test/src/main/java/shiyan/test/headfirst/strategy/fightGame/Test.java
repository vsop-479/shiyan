package shiyan.test.headfirst.strategy.fightGame;

import shiyan.test.headfirst.strategy.fightGame.chracter.*;
import shiyan.test.headfirst.strategy.fightGame.weapon.BowAndArrowBehavior;
import shiyan.test.headfirst.strategy.fightGame.weapon.WeaponBehavior;

/**
 * Created by Administrator on 2016/11/10.
 */
public class Test {
    public static void main(String[] args){
//        构造时指定了默认的weapon
        shiyan.test.headfirst.strategy.fightGame.chracter.Character c = new Queen();
        c.fight();
//        通过set切换weapon
        c.setWeapon(new BowAndArrowBehavior());
        c.fight();
        //        通过set匿名类切换weapon
        c.setWeapon(new WeaponBehavior() {
            @Override
            public void useWeapon() {
                System.out.println("投花生原子弹！");
            }
        });
        c.fight();
    }
}
