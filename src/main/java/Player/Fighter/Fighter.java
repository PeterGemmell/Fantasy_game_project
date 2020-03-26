package Player.Fighter;

import Behaviours.IWeapon;
import Enemy.Enemy;
import Player.Player;

import java.util.ArrayList;

public abstract class Fighter extends Player implements IWeapon {

    private IWeapon weapon;


    public Fighter(String name, int health) {
        super(name, health);
        this.weapon = weapon;

    }
}
