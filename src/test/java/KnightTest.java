import Behaviours.IWeapon;
import Enemy.Enemy;
import Enemy.Orc;
import Player.Fighter.Knight;
import Weapons.Axe;
import Weapons.Club;
import Weapons.Sword;
import Weapons.Weapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Orc orc;
    IWeapon sword;
    IWeapon axe;
    IWeapon club;

    @Before
    public void before(){
        knight = new Knight("Peter", 100, sword);
        sword = new Sword("Excalibur");
        axe = new Axe("Tomahawk");
        club = new Club("Chib");
        orc = new Orc(100);
    }

    @Test
    public void getName(){
        assertEquals("Peter", knight.getName());
    }

    @Test
    public void getWeapon(){
        assertEquals("Excalibur", sword.getName());
    }

    @Test
    public void attackEnemy(){
        sword.attack(orc);
        assertEquals(50, orc.getHealth());
    }
}
