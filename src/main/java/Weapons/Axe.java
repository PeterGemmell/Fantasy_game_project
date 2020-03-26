package Weapons;

import Behaviours.IWeapon;
import Enemy.Enemy;

public class Axe extends Weapon implements IWeapon {


    public Axe(String name) {
        super(name);
    }

    public void attack(Enemy enemy) {
        enemy.takeDamage(20);
    }
}
