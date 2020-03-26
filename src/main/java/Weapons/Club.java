package Weapons;

import Behaviours.IWeapon;
import Enemy.Enemy;

public class Club implements IWeapon {


    public void attack(Enemy enemy) {
        enemy.takeDamage(10);
    }
}
