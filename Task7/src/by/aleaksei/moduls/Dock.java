package by.aleaksei.moduls;

import by.aleaksei.moduls.entities.Ship;

public class Dock {

    private static final int DEFAULT = 2;

    private int currentNumber = 0;
    private Ship[] mass;

    public Dock(int count) {
        mass = new Ship[count];
    }

    public Dock(Dock dock) {
        this.mass = dock.getMass();
        this.currentNumber = dock.currentNumber;
    }

    public Dock() {
        mass = new Ship[DEFAULT];
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setMass(Ship[] mass) {
        this.mass = mass;
    }

    public Ship[] getMass() {
        return mass;
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        for (Ship mas : mass) {
            result = prime * result + mas.hashCode();
        }

        return result;

        //return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dock other = (Dock) obj;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != other.getMass()[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Ship mas : mass) {
            if (mas == null) {
                break;
            }
            builder.append(mas.toString());
            builder.append("\n");
        }
        return builder.toString();
    }

    public void addShip(Ship ship) {
        int numberOfElements = mass.length;
        if (currentNumber == numberOfElements) {
            Ship[] ships = new Ship[numberOfElements];
            System.arraycopy(mass, 0, ships, 0, numberOfElements);
            mass = new Ship[numberOfElements * 2 + 1];
            System.arraycopy(ships, 0, mass, 0, numberOfElements);
        }
        mass[currentNumber] = ship;
        currentNumber++;
    }

    public void deleteShip(int index) {
        if ((index > 0) && (index < mass.length))
            if (index == mass.length - 1) {
                mass[index] = null;
            } else {
                mass[index] = null;
                for ( int i = index + 1; i < mass.length; i++){
                    mass[i - 1] = mass[i];
                }
            }
        currentNumber--;
    }


}