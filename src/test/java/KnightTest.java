import Enemy.Enemy;
import Enemy.Orc;
import Player.Fighter.Knight;
import Weapons.Weapon;
import org.junit.Before;

public class KnightTest {

    Knight knight;
    Weapon weapon;
    Orc orc;

    @Before
    public void before(){
        knight = new Knight("Peter", 100);
    }
}
