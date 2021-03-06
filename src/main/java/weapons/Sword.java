package weapons;

import Enemy.Enemy;
import interfaces.IWeapon;

public class Sword implements IWeapon {

    private int damageValue;

    public Sword(int damageValue){
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
