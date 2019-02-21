package magicSpells;

import Enemy.Enemy;
import interfaces.ISpell;


public class LightningStrike implements ISpell {

        private int damageValue;

        public LightningStrike(int damageValue){
            this.damageValue = damageValue;
        }

        public int getDamageValue() {
            return damageValue;
        }

        public void spell(Enemy enemy){
            int enemyHealthPoints = enemy.getHealthPoints();
            enemy.setHealthPoints(enemyHealthPoints -= this.damageValue);

        }

    }
