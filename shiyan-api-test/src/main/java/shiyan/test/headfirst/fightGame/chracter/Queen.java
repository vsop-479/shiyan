package shiyan.test.headfirst.fightGame.chracter;

import shiyan.test.headfirst.fightGame.weapon.KnifeBehavior;

/**
 * Created by Administrator on 2016/11/10.
 */
public class Queen extends Character {

    public Queen(){
//        构造时指定默认的Weapon，可通过setter动态改变weapon
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
