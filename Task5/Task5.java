package by.aleaksei.controller;

import by.aleaksei.moduls.ArrayClass;

import java.util.Random;

public class Task5 {

    public static void main(String[] args) {

        double array[] = {6, 7, 8, 4, 5, 6};
//        System.out.println(ArrayClass.findMinElement(array));
//        System.out.println(ArrayClass.findMaxElement(array));
//        System.out.println(ArrayClass.findArithmeticMean(array));
//        System.out.println(ArrayClass.findGeometricMean(array));
//        System.out.println(ArrayClass.isOrdered(array));
//        System.out.println(ArrayClass.findLocalMin(array));
//        System.out.println(ArrayClass.findLocalMax(array));
//        System.out.println(Arrays.toString(ArrayClass.reverse(array)));

        task12(array);

    }

    /*
    В одномерном массиве, состоящим из n вещественных элементов, вычислить:
     произведение положительных элементов массива и сумму элементов массива,
     расположнных до минимального элемента.
     */
    public static void task12(double[] array){

//        Random random = new Random();
//        double[] array = new double[n];
//
//        for (int i = 0; i < array.length; i++){
//            array[i] = random.nextDouble()*10;
//        }

        double composition = ArrayClass.positiveNumberMultiplierCalculator(array);
        double sum = ArrayClass.sumElements(array);

        System.out.println(composition);
        System.out.println(sum);

    }
}