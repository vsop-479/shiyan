package shiyan.test.headfirst.strategy.fightGame.chracter;

import shiyan.test.headfirst.strategy.fightGame.weapon.WeaponBehavior;

/**
 * Created by Administrator on 2016/11/10.
 */
public abstract class Character {
    protected WeaponBehavior weapon;

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public abstract void fight();
}
