package by.aleaksei.moduls.entities;

import by.aleaksei.moduls.entities.enums.ShipType;

import java.util.Objects;

public class Ship {

    private String name;
    private ShipType shipType;
    private int capacity;
    private int cost;

    public Ship(String name, ShipType type, int capacity, int cost) {
        this.name = name;
        this.shipType = type;
        this.capacity = capacity;
        this.cost = cost;
    }

    public Ship(Ship ship){
        this.name = ship.getName();
        this.shipType =  ship.getType();
        this.capacity =  ship.getCapacity();
        this.cost =  ship.getCost();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public ShipType getType() {
        return shipType;
    }

    public void setType(ShipType type) {
        this.shipType = type;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) {
            return false;
        }
        Ship other = (Ship) obj;
        if (!Objects.equals(name, other.name)) {
            return false;
        } else if (shipType != other.shipType) {
            return false;
        } else if (capacity != other.capacity) {
            return false;
        } else if (cost != other.cost) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (name == null ? 0 : name.hashCode());
        result = prime * result + ((shipType == null) ? 0 : shipType.hashCode());
        result = prime * result + capacity;
        result = prime * result + cost;


        return result;
    }

    @Override
    public String toString() {
        return (name + " " + shipType + " " + capacity + " " + cost + ";");
    }
}