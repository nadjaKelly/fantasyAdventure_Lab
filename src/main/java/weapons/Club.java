package weapons;

import Enemy.Enemy;
import interfaces.IWeapon;

public class Club implements IWeapon {

    private int damageValue;

    public Club(int damageValue){
        this.damageValue = damageValue;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void attack(Enemy enemy){
        int enemyHealthPoints = enemy.getHealthPoints();
        enemy.setHealthPoints(enemyHealthPoints -= this.damageValue);

    }

}
