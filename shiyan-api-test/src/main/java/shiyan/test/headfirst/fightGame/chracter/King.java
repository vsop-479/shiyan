package shiyan.test.headfirst.fightGame.chracter;

import shiyan.test.headfirst.fightGame.weapon.BowAndArrowBehavior;
import shiyan.test.headfirst.fightGame.weapon.SwordBehavior;

/**
 * Created by Administrator on 2016/11/10.
 */
public class King extends Character {

    public King(){
//        构造时指定默认的Weapon，可通过setter动态改变weapon
        weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
