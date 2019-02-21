package Player;

import interfaces.IWeapon;

public class Knight extends Fighter {

    private String horse;

    public Knight(String name, int healthPoints, IWeapon weapon, String horse) {
        super(name, healthPoints, weapon);
        this.horse = horse;
    }

    public String getHorse() {
        return horse;
    }

    public void setHorse(String horse) {
        this.horse = horse;
    }
}
