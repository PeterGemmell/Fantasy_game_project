package Behaviours;

import Enemy.Enemy;

public interface IWeapon {

    public void attack(Enemy enemy);

    String getName();
}
