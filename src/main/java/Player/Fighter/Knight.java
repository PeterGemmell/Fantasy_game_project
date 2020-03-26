package Player.Fighter;

import Behaviours.IWeapon;
import Enemy.Enemy;

import java.util.ArrayList;

public class Knight extends Fighter {

    private ArrayList<Enemy> enemies;

    public Knight(String name, int health, IWeapon weapon) {
        super(name, health, weapon);
        this.enemies = new ArrayList<Enemy>();
    }

    public void attack(Enemy enemy) {

    }

    public void addEnemy(Enemy enemy){
        this.enemies.add(enemy);
    }

    public int countEnemies(){
        return this.enemies.size();
    }
}
