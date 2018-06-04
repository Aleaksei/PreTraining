package by.aleaksei.moduls.Task8;

import by.aleaksei.moduls.entities.Ship;

import java.util.NoSuchElementException;


public class Queue {

    private static final int DEFAULT = 2;
    private int currentNumber = 0;
    private Ship[] mass;

    public Queue(int count) {
        mass = new Ship[count];
    }

    public Queue(Queue queue) {
        this.mass = queue.getMass();
        this.currentNumber = queue.currentNumber;
    }

    public Queue() {
        mass = new Ship[DEFAULT];
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public Ship[] getMass() {
        return mass;
    }


    public void enqueue(Ship ship) {
        if (currentNumber < mass.length)
            mass[currentNumber] = ship;
        currentNumber++;
    }

    public Ship dequeue() {

        if (currentNumber == 0) {
            throw new NoSuchElementException();
        }
        Ship work = mass[0];
        Ship[] workMass = new Ship[mass.length];
        System.arraycopy(mass, 1, workMass, 0, currentNumber);
        currentNumber--;
        mass = workMass;
        return work;
    }

    public Ship peek(int index) {

        if (currentNumber == 0) {
            throw new NoSuchElementException();
        }
        return mass[0];
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
