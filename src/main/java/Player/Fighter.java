package Player;

import Enemy.Enemy;
import interfaces.IWeapon;




public  class Fighter extends Player{

    private IWeapon weapon;


    public Fighter(String name, int healthPoints, IWeapon weapon){
        super(name, healthPoints);
        this.weapon = weapon;
    }



    public IWeapon getWeapon() {
        return weapon;
    }

    public void setWeapon(IWeapon weapon) {
        this.weapon = weapon;
    }

    public void attackA(Enemy enemy){
        weapon.attack(enemy);
    }
}