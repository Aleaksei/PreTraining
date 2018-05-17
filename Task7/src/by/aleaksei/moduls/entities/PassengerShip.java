package by.aleaksei.moduls.entities;

import by.aleaksei.moduls.entities.enums.PassengerShipClass;
import by.aleaksei.moduls.entities.enums.ShipType;

public class PassengerShip extends Ship {

    private PassengerShipClass passengerShipClass;

    public PassengerShip(String name, PassengerShipClass passengerShipClass, int passengerCapacity, int cost){
        super(name, ShipType.Passenger, passengerCapacity, cost);
        this.passengerShipClass = passengerShipClass;
    }

    public PassengerShipClass getPassengerShipClass() {
        return passengerShipClass;
    }

    public void setPassengerShipClass(PassengerShipClass passengerShipClass) {
        this.passengerShipClass = passengerShipClass;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", type: " + getType() + ", passenger ship class: " + passengerShipClass +
                ", passenger capacity: " + getCapacity() + " people, cost: " + getCost() + "$";
    }
}
