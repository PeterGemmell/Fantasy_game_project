package Weapons;

import Behaviours.IWeapon;
import Enemy.Enemy;

public class Sword implements IWeapon {



    public void attack(Enemy enemy) {
        enemy.takeDamage(50);
    }
}
