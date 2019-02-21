package mage;

import interfaces.IDefend;
import interfaces.ISpell;

public class Warlock extends Mage {


    public Warlock(String name, int healthPoints, IDefend defender, ISpell spell) {
        super(name, healthPoints, defender, spell);

    }

}
