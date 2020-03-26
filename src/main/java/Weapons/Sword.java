package Weapons;

import Behaviours.IWeapon;
import Enemy.Enemy;

public class Sword extends Weapon implements IWeapon {


    public Sword(String name) {
        super(name);
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(50);
    }
}
