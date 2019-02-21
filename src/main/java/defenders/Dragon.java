package defenders;

import Enemy.Enemy;
import interfaces.IDefend;

public class Dragon implements IDefend {

    Dragon dragon;
    int defendsPower;

    public Dragon(int defendsPower) {
        this.defendsPower = defendsPower;


    }

    public void defend(Enemy enemy){
        int enemyHealthPoints = enemy.getHealthPoints();
        enemy.setHealthPoints(enemyHealthPoints -= this.defendsPower);

    }
}
