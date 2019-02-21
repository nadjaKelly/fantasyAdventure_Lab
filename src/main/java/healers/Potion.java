package healers;

import Player.Player;
import interfaces.IHeal;

public class Potion implements IHeal {

    private int healingValue;

    public Potion (int healingValue){
        this.healingValue = healingValue;
    }

    public void heal(Player player) {
        int currentHealth = player.getHealthPoints();
        player.setHealthPoints(currentHealth += this.healingValue);
    }
}
