package healers;

import Player.Player;
import interfaces.IHeal;

public class Cleric extends Player {

    private IHeal heal;

    public Cleric (String name, int healthPoints, IHeal heal) {
        super(name, healthPoints);
        this.heal = heal;
    }

    public void heal(Player player){
        heal.heal(player);
    }

    public IHeal getHeal() {
        return heal;
    }

    public void setHeal(IHeal heal) {
        this.heal = heal;
    }
}

