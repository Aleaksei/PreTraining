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
    public CargoShip(CargoShip cargoShip){
        super(cargoShip);
        this.cargoShipClass = cargoShip.getCargoShipClass();
    }

    public CargoShipClass getCargoShipClass() {
        return cargoShipClass;
    }

    public void setCargoShipClass(CargoShipClass cargoShipClass) {
        this.cargoShipClass = cargoShipClass;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result +((cargoShipClass == null) ? 0 : cargoShipClass.hashCode()) ;
        return result;
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
        CargoShip other = (CargoShip) obj;
        if (cargoShipClass != other.cargoShipClass) {
            return false;
        } else {
            return super.equals(obj);
        }
    }
    @Override
    public String toString() {
        return "Name: " + getName() + ", type: " + getType() + ", cargo ship class: " + cargoShipClass +
                ", cargo capacity: " + getCapacity() + "t, cost: " + getCost() + "$";
    }
}