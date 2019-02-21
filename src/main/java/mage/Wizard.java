package mage;

import interfaces.IDefend;
import interfaces.ISpell;

public class Wizard extends Mage {



    public Wizard(String name, int healthPoints, IDefend defender, ISpell spell) {
        super(name, healthPoints, defender, spell);

    }

}
