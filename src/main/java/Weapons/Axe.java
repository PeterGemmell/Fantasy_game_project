package Weapons;

import Behaviours.IWeapon;
import Enemy.Enemy;

public class Axe implements IWeapon {


    public void attack(Enemy enemy) {
        enemy.takeDamage(20);
    }
}
