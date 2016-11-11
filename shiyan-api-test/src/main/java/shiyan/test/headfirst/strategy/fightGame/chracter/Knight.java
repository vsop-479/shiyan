package shiyan.test.headfirst.strategy.fightGame.chracter;

import shiyan.test.headfirst.strategy.fightGame.weapon.AxeBehavior;

/**
 * Created by Administrator on 2016/11/10.
 */
public class Knight extends Character {

    public Knight(){
//        构造时指定默认的Weapon，可通过setter动态改变weapon
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        weapon.useWeapon();
    }
}
