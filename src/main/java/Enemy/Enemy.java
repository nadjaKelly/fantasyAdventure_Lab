package Enemy;

import interfaces.IWeapon;
import weapons.Sword;

public abstract class Enemy {


    private int healthPoints;



    public Enemy(int healthPoints){
        this.healthPoints = healthPoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void takeDamage(Sword sword){
        this.healthPoints -= sword.getDamageValue();
    }


}
