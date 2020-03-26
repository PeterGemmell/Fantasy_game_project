package Weapons;

import Behaviours.IWeapon;
import Enemy.Enemy;

public class Club extends Weapon implements IWeapon {


    public Club(String name) {
        super(name);
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(10);
    }
}
