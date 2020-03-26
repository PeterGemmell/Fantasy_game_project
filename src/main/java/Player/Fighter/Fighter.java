package Player.Fighter;

import Behaviours.IWeapon;
import Player.Player;

public abstract class Fighter extends Player implements IWeapon {


    public Fighter(String name, int health) {
        super(name, health);
    }
}
