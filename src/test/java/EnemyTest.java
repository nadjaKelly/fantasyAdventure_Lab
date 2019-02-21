import Enemy.Orc;
import org.junit.Before;
import org.junit.Test;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class EnemyTest {

    Sword sword;
    Orc orc;


    @Before
    public void before(){
        sword = new Sword(10);
        orc = new Orc(20);
    }

    @Test
    public void canBeDamaged(){
        orc.takeDamage(sword);
        assertEquals(10, orc.getHealthPoints());
    }
}
