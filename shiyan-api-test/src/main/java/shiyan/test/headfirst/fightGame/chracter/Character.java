package shiyan.test.headfirst.fightGame.chracter;

import shiyan.test.headfirst.fightGame.weapon.WeaponBehavior;

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
