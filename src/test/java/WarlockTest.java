import Enemy.Orc;
import defenders.Dragon;
import mage.Warlock;
import magicSpells.FireBall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    FireBall fireBall;
    Dragon dragon;
    Warlock warlock;
    Orc orc;





    @Before

    public void before(){
        fireBall = new FireBall(5);
        dragon = new Dragon(10);
        warlock = new Warlock("Dell", 1000, dragon, fireBall);
        orc = new Orc(50);

    }

    @Test
    public void canRepelOrc(){
        warlock.repelEnemy(orc);
        assertEquals(35, orc.getHealthPoints());
    }
}
