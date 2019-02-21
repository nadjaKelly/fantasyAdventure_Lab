package Player;

import interfaces.IWeapon;

public class Dwarf extends Fighter{

    private double height;

    public Dwarf(String name, int healthPoints, IWeapon weapon, double height) {
        super(name, healthPoints, weapon);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
