package defenders;

import Enemy.Enemy;

public class Ogre {



    Ogre ogre;
    int defendsPower;

    public Ogre(int defendsPower) {
        this.defendsPower = defendsPower;
    }

    public void defend(Enemy enemy){
        int enemyHealthPoints = enemy.getHealthPoints();
        enemy.setHealthPoints(enemyHealthPoints -= this.defendsPower);

    }
}