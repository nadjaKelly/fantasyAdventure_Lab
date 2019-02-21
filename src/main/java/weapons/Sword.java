package weapons;

import interfaces.IWeapon;

public class Sword implements IWeapon {

    private int damageValue;

    public Sword(int damageValue){

    }
    public int attack(enemy){
        return enemy.getHealthPoints - damageValue;

    }

}
