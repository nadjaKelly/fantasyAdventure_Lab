package mage;

import Enemy.Enemy;
import Player.Player;
import interfaces.IDefend;
import interfaces.ISpell;

public abstract class Mage extends Player {

 private IDefend defender;
 private ISpell spell;

 public Mage(String name, int healthPoints, IDefend defender, ISpell spell){
     super(name, healthPoints);
     this.defender = defender;
     this.spell = spell;
 }

    public IDefend getDefender() {
        return defender;
    }

    public void setDefender(IDefend defender) {
        this.defender = defender;
    }

    public ISpell getSpell() {
        return spell;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public void repelEnemy(Enemy enemy){
     defender.defend(enemy);
     spell.spell(enemy);
    }


}
