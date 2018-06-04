package by.aleaksei.util;

import by.aleaksei.moduls.Dock;
import by.aleaksei.moduls.entities.Ship;
import by.aleaksei.moduls.entities.enums.ShipType;

import java.util.Objects;

public class DockFunction implements DockFunctional {

    private Dock workDock;

    public DockFunction(Dock dock) {
        workDock = dock;
    }

    @Override
    public void addShip(Ship ship) {
        workDock.addShip(ship);
    }

    @Override
    public Ship findShipByName(String name) {
        Ship[] workMass = workDock.getMass();
        for (Ship workMas : workMass) {
            if (Objects.equals(workMas.getName(), name)) {
                return workMas;
            }
        }
        return null;
    }

    @Override
    public Ship[] getAllShip() {
        return workDock.getMass();
    }

    @Override
    public Ship getShipBuIndex(int index) {

        Ship[] workMass = workDock.getMass();
        if (index <= workMass.length) {
            return workMass[index - 1];
        }
        return null;
    }

    @Override
    public Ship[] findShipByType(ShipType shipType) {
        int count = 0;
        Ship[] work = workDock.getMass();
        for (int i = 0; i < workDock.getCurrentNumber(); i++) {
            if (work[i].getType() == shipType) {
                count++;
            }
        }
        Ship[] ships = new Ship[count];
        int j = 0;
        for (int i = 0; i < workDock.getCurrentNumber(); i++) {
            if (work[i].getType() == shipType) {
                ships[j] = work[i];
                j++;
            }
        }
        return ships;
    }

    @Override
    public void deletedByName(String name) {
        Ship[] workMass = workDock.getMass();
        for (int i = 0; i < workDock.getCurrentNumber(); i++) {
            if (Objects.equals(workMass[i].getName(), name)) {
                workDock.deleteShip(i);
            }
        }
    }

    @Override
    public void deletedByIndex(int index) {
        workDock.deleteShip(index);
    }

    @Override
    public Ship[] findShipLeastValue() {
        int leastValue = 0;
        int count = 0;
        for (int i = 0; i < workDock.getCurrentNumber(); i++) {
            if (i == 0) {
                leastValue = workDock.getMass()[i].getCost();
            }
            if (workDock.getMass()[i].getCost() < leastValue) {
                leastValue = workDock.getMass()[i].getCost();
            }
        }
        for (int i = 0; i < workDock.getCurrentNumber(); i++) {
            if (workDock.getMass()[i].getCost() == leastValue) {
                count++;
            }
        }
        Ship[] work = new Ship[count];
        int j = 0;
        for (int i = 0; i < workDock.getCurrentNumber(); i++) {
            if (workDock.getMass()[i].getCost() == leastValue){
                work[j] = workDock.getMass()[i];
                j++;
            }
        }
        return work;
    }

    @Override
    public Ship[] findShipGreatestValue() {
        int greatestValue = 0;
        int count = 0;
        for (int i = 0; i < workDock.getCurrentNumber(); i++) {
            if (i == 0) {
                greatestValue = workDock.getMass()[i].getCost();
            }
            if (workDock.getMass()[i].getCost() > greatestValue) {
                greatestValue = workDock.getMass()[i].getCost();
            }
        }
        for (int i = 0; i < workDock.getCurrentNumber(); i++) {
            if (workDock.getMass()[i].getCost() == greatestValue) {
                count++;
            }
        }
        Ship[] work = new Ship[count];
        int j = 0;
        for (int i = 0; i < workDock.getCurrentNumber(); i++) {
            if (workDock.getMass()[i].getCost() == greatestValue){
                work[j] = workDock.getMass()[i];
                j++;
            }
        }
        return work;
    }

    @Override
    public Ship[] findShipLeastCapacity() {
        int leastCapacity = 0;
        int count = 0;
        for (int i = 0; i < workDock.getCurrentNumber(); i++) {
            if (i == 0) {
                leastCapacity = workDock.getMass()[i].getCapacity();
            }
            if (workDock.getMass()[i].getCapacity() < leastCapacity) {
                leastCapacity = workDock.getMass()[i].getCapacity();
            }
        }
        for (int i = 0; i < workDock.getCurrentNumber(); i++) {
            if (workDock.getMass()[i].getCapacity() == leastCapacity) {
                count++;
            }
        }
        Ship[] work = new Ship[count];
        int j = 0;
        for (int i = 0; i < workDock.getCurrentNumber(); i++) {
            if (workDock.getMass()[i].getCapacity() == leastCapacity){
                work[j] = workDock.getMass()[i];
                j++;
            }
        }
        return work;
    }

    @Override
    public Ship[] findShipGreatestCapacity() {
        int greatestCapacity = 0;
        int count = 0;
        for (int i = 0; i < workDock.getCurrentNumber(); i++) {
            if (i == 0) {
                greatestCapacity = workDock.getMass()[i].getCapacity();
            }
            if (workDock.getMass()[i].getCapacity() > greatestCapacity) {
                greatestCapacity = workDock.getMass()[i].getCapacity();
            }
        }
        for (int i = 0; i < workDock.getCurrentNumber(); i++) {
            if (workDock.getMass()[i].getCapacity() == greatestCapacity) {
                count++;
            }
        }
        Ship[] work = new Ship[count];
        int j = 0;
        for (int i = 0; i < workDock.getCurrentNumber(); i++) {
            if (workDock.getMass()[i].getCapacity() == greatestCapacity){
                work[j] = workDock.getMass()[i];
                j++;
            }
        }
        return work;
    }
}