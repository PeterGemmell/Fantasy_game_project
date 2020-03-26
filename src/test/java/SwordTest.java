import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {

    Sword sword;

    @Before
    public void before(){
        sword = new Sword("Blue Steel");
    }

    @Test
    public void getName(){
        assertEquals("Blue Steel", sword.getName());
    }

    @Test
    public void getChangedName(){
        sword.setName("Red Steel");
        assertEquals("Red Steel", sword.getName());
    }
}
