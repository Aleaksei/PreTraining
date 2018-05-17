package by.aleaksei.moduls.util;

import by.aleaksei.moduls.entities.Ship;
import by.aleaksei.moduls.entities.enums.CargoShipClass;
import by.aleaksei.moduls.entities.enums.PassengerShipClass;
import by.aleaksei.moduls.entities.enums.ShipType;

public class DockFunction implements DockFunctional {


    @Override
    public void addShip() {

    }

    @Override
    public Ship findShipByName(String name) {
        return null;
    }

    @Override
    public Ship[] getAllShip() {
        return new Ship[0];
    }

    @Override
    public Ship getShipBuIndex(int index) {
        return null;
    }

    @Override
    public Ship[] findShipByClass(CargoShipClass cargoShipClass) {
        return new Ship[0];
    }

    @Override
    public Ship[] findShipByClass(PassengerShipClass passengerShipClass) {
        return new Ship[0];
    }

    @Override
    public Ship[] findShipByType(ShipType shipType) {
        return new Ship[0];
    }

    @Override
    public void deletedByName(String name) {

    }

    @Override
    public void deletedByIndex(int index) {

    }

    @Override
    public Ship[] findShipLeastValue() {
        return new Ship[0];
    }

    @Override
    public Ship[] findShipGreatestValue() {
        return new Ship[0];
    }

    @Override
    public Ship[] findShipLeastCapacity() {
        return new Ship[0];
    }

    @Override
    public Ship[] findShipGreatestCapacity() {
        return new Ship[0];
    }
}
