package by.aleaksei.moduls.entities;

import by.aleaksei.moduls.entities.enums.ShipType;

public class Ship {

    private String  name;
    private ShipType shipType;
    private int capacity;
    private int cost;

    public Ship(String name, ShipType type, int capacity, int cost){
        this.name = name;
        this.shipType = type;
        this.capacity = capacity;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
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
    public String toString() {
        return (name + " " + shipType + " " + capacity + " " + cost + ";");
    }
}
