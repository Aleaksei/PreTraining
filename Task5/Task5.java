package by.aleaksei.controller;

import by.aleaksei.moduls.ArrayClass;

import java.util.Arrays;
import java.util.Random;

public class Task5 {

    public static void main(String[] args) {

        double array[] = {1, 2, 3, 4, 5, 6};
//        System.out.println(ArrayClass.findMinElement(array));
//        System.out.println(ArrayClass.findMaxElement(array));
//        System.out.println(ArrayClass.findArithmeticMean(array));
//        System.out.println(ArrayClass.findGeometricMean(array));
//        System.out.println(ArrayClass.isOrdered(array));
//        System.out.println(ArrayClass.findLocalMin(array));
//        System.out.println(ArrayClass.findLocalMax(array));
//        System.out.println(Arrays.toString(ArrayClass.reverse(array)));

        task12(6);

    }

    public static void task12(int n){

        Random random = new Random();
        double[] array = new double[n];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextDouble();
        }

        double sum = ArrayClass.positiveNumberMultiplierCalculator(array);


    }
}
