package by.aleaksei.moduls.util;

import by.aleaksei.moduls.entities.Ship;
import by.aleaksei.moduls.entities.enums.CargoShipClass;
import by.aleaksei.moduls.entities.enums.PassengerShipClass;
import by.aleaksei.moduls.entities.enums.ShipType;

public interface DockFunctional {

    public void addShip();

    public Ship findShipByName(String name);

    public Ship[] getAllShip();

    public Ship getShipBuIndex(int index);

    public Ship[] findShipByClass(CargoShipClass cargoShipClass);

    public Ship[] findShipByClass(PassengerShipClass passengerShipClass);

    public Ship[] findShipByType(ShipType shipType);

    public void deletedByName(String name);

    public void deletedByIndex(int index);

    public Ship[] findShipLeastValue();

    public Ship[] findShipGreatestValue();

    public Ship[] findShipLeastCapacity();

    public Ship[] findShipGreatestCapacity();

}
