package Player.Fighter;

import Behaviours.IWeapon;
import Enemy.Enemy;

public class Barbarian extends Fighter {

  public String hairColour;

    public Barbarian(String name, int health, IWeapon weapon, String hairColour) {
        super(name, health, weapon);
        this.hairColour = hairColour;
    }

    public void attack(Enemy enemy) {

    }
}
