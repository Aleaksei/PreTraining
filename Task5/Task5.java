package by.aleaksei.controller;

import by.aleaksei.moduls.ArrayClass;

import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {

        double array[] = {1, 2, 3, 4, 5, 6};
        System.out.println(ArrayClass.findMinElement(array));
        System.out.println(ArrayClass.findMaxElement(array));
        System.out.println(ArrayClass.findArithmeticMean(array));
        System.out.println(ArrayClass.findGeometricMean(array));
        System.out.println(ArrayClass.isOrdered(array));
        System.out.println(ArrayClass.findLocalMin(array));
        System.out.println(ArrayClass.findLocalMax(array));
        System.out.println(Arrays.toString(ArrayClass.reverse(array)));

    }
}
