package by.aleaksei.controller;

import by.aleaksei.moduls.Dock;
import by.aleaksei.moduls.entities.CargoShip;
import by.aleaksei.moduls.entities.Ship;
import by.aleaksei.moduls.entities.enums.CargoShipClass;
import by.aleaksei.util.Creator;
import by.aleaksei.util.DockFunction;
import by.aleaksei.view.ViewDock;

import java.util.Arrays;

public class Task7 {

    public static void main(String[] args) {

        Dock dock = new Dock();
        dock = Creator.create(dock);
        Ship ship = new CargoShip("Frei",CargoShipClass.ContainerTrucks,3000, 50000);
        DockFunction dockFunction = new DockFunction(dock);
        dockFunction.addShip(ship);
        ViewDock.view(dock);
        dockFunction.deletedByName("Loreal");
        ViewDock.view(dock);
        //ViewDock.view(Arrays.toString(dockFunction.findShipByType(ShipType.Cargo)));
        //ViewDock.view(Arrays.toString(dockFunction.findShipLeastCapacity()));




    }
}