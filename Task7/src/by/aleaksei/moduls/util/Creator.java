package by.aleaksei.util;

import by.aleaksei.moduls.Dock;
import by.aleaksei.moduls.entities.CargoShip;
import by.aleaksei.moduls.entities.PassengerShip;
import by.aleaksei.moduls.entities.Ship;
import by.aleaksei.moduls.entities.enums.CargoShipClass;
import by.aleaksei.moduls.entities.enums.PassengerShipClass;

public class Creator {
    public static Dock create(Dock dock) {
        ;
        Ship ship = new CargoShip("Traust",CargoShipClass.Tanker,50000,250000);
        Ship ship2 = new PassengerShip("Loreal", PassengerShipClass.Liner,20000,200000);
        dock.addShip(ship);
        dock.addShip(ship2);

        return dock;
    }
}
