package by.aleaksei.controller;

import by.aleaksei.moduls.entities.CargoShip;
import by.aleaksei.moduls.entities.PassengerShip;
import by.aleaksei.moduls.entities.Ship;
import by.aleaksei.moduls.entities.enums.CargoShipClass;
import by.aleaksei.moduls.entities.enums.PassengerShipClass;

public class Task7 {

    public static void main(String[] args) {

        Ship[] mass = new Ship[2];
        mass[0] = new CargoShip("Des", CargoShipClass.Tanker, 1000, 500);
        mass[1] = new PassengerShip("Des", PassengerShipClass.Liner, 1000, 500);

        System.out.println(mass[0]);
        System.out.println(mass[1]);

    }
}
