package by.aleaksei.moduls.entities;

import by.aleaksei.moduls.entities.enums.PassengerShipClass;
import by.aleaksei.moduls.entities.enums.ShipType;

public class PassengerShip extends Ship {

    private PassengerShipClass passengerShipClass;

    public PassengerShip(String name, PassengerShipClass passengerShipClass, int passengerCapacity, int cost) {
        super(name, ShipType.Passenger, passengerCapacity, cost);
        this.passengerShipClass = passengerShipClass;
    }

    public PassengerShip(PassengerShip passengerShip){
        super(passengerShip);
        this.passengerShipClass = passengerShip.getPassengerShipClass();
    }

    public PassengerShipClass getPassengerShipClass() {
        return passengerShipClass;
    }

    public void setPassengerShipClass(PassengerShipClass passengerShipClass) {
        this.passengerShipClass = passengerShipClass;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result +((passengerShipClass == null) ? 0 : passengerShipClass.hashCode()) ;
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
        PassengerShip other = (PassengerShip) obj;
        if (passengerShipClass != other.passengerShipClass) {
            return false;
        } else {
            return super.equals(obj);
        }
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", type: " + getType() + ", passenger ship class: " + passengerShipClass +
                ", passenger capacity: " + getCapacity() + " people, cost: " + getCost() + "$";
    }
}