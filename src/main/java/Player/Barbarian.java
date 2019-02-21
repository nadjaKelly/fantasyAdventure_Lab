package Player;

import interfaces.IWeapon;




public class Barbarian extends Fighter{

    private String swordName;


    public Barbarian(String name, int healthPoints, IWeapon weapon, String swordName) {
        super(name, healthPoints, weapon);
        this.swordName = swordName;
    }

    public String getSwordName() {
        return swordName;
    }

    public void setSwordName(String swordName) {
        this.swordName = swordName;
    }




}
