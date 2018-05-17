package by.aleaksei.moduls.entities;

public class Dock {

    Ship[] mass;

    public Dock(int count){
        mass = new Ship[count];
    }

    public void setMass(Ship[] mass) {
        this.mass = mass;
    }

    public Ship[] getMass() {
        return mass;
    }
}
