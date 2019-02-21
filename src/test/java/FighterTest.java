import Enemy.Orc;
import Player.Barbarian;
import org.junit.Before;
import org.junit.Test;
import weapons.Club;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Barbarian barbarian;
    Sword sword;
    Orc orc;
    Club club;

    @Before
    public void before(){
        club = new Club(5);
        sword = new Sword(10);
        barbarian = new Barbarian ("Rick", 50, sword, "Atlantean");
        orc = new Orc(20);

    }

    @Test
    public void canAttack(){
        barbarian.attackA(orc);
        assertEquals(10, orc.getHealthPoints());

    }

    @Test
    public void canAttacWithClub(){
        barbarian.setWeapon(club);
        barbarian.attackA(orc);
        assertEquals(15, orc.getHealthPoints());
    }


}
