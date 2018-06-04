package by.aleaksei.moduls.Task8;

import by.aleaksei.moduls.entities.Ship;

import java.util.NoSuchElementException;

public class Stack {


    private static final int DEFAULT = 2;
    private int currentNumber = 0;
    private Ship[] mass;

    public Stack(int count) {
        mass = new Ship[count];
    }

    public Stack(Stack stack) {
        this.mass = stack.getMass();
        this.currentNumber = stack.currentNumber;
    }

    public Stack() {
        mass = new Ship[DEFAULT];
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public Ship[] getMass() {
        return mass;
    }


    public void push(Ship ship) {
        if (currentNumber < mass.length)
            mass[currentNumber] = ship;
        currentNumber++;
    }

    public Ship pop() {

        if (currentNumber == 0) {
            throw new NoSuchElementException();
        }
        Ship work = mass[currentNumber];
        mass[currentNumber] = null;
        currentNumber--;
        return work;
    }

    public Ship peek(int index) {

        if (currentNumber == 0) {
            throw new NoSuchElementException();
        }
        return mass[currentNumber];
    }


    public int size() {
        return currentNumber;
    }

    public boolean isEmpty() {
        return currentNumber == 0;
    }

    public boolean isFull() {
        return currentNumber == mass.length;
    }
}
