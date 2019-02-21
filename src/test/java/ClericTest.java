import Player.Knight;
import healers.Cleric;
import healers.Potion;
import interfaces.IHeal;
import interfaces.IWeapon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {


    Cleric cleric;
    Potion potion;
    Knight knight;
    IWeapon weapon;


    @Before

    public void before(){
        potion = new Potion(10);
        cleric = new Cleric("Alex", 30, potion);
        knight = new Knight("Arthur", 5, weapon, "Red Rum" );
    }

    @Test
    public void canHeal(){
        cleric.heal(knight);
        assertEquals(15, knight.getHealthPoints());
    }




}
