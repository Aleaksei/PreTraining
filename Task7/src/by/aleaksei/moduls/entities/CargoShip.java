package by.aleaksei.moduls.entities;

import by.aleaksei.moduls.entities.enums.CargoShipClass;
import by.aleaksei.moduls.entities.enums.ShipType;

public class CargoShip extends Ship {

//    private String cargoShipClass;
    private CargoShipClass cargoShipClass;

    public CargoShip(String name, CargoShipClass cargoShipClass, int cargoCapacity, int cost){
        super(name, ShipType.Cargo, cargoCapacity, cost);
        this.cargoShipClass = cargoShipClass;
    }

    public CargoShipClass getCargoShipClass() {
        return cargoShipClass;
    }

    public void setCargoShipClass(CargoShipClass cargoShipClass) {
        this.cargoShipClass = cargoShipClass;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", type: " + getType() + ", cargo ship class: " + cargoShipClass +
                ", cargo capacity: " + getCapacity() + "t, cost: " + getCost() + "$";
    }
}
