package shiyan.test.headfirst.strategy.fightGame.chracter;

import shiyan.test.headfirst.strategy.fightGame.weapon.BowAndArrowBehavior;

/**
 * Created by Administrator on 2016/11/10.
 */
public class Troll extends Character {

    public Troll(){
//        构造时指定默认的Weapon，可通过setter动态改变weapon
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
