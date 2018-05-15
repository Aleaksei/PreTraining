package by.aleaksei.controller;

import by.aleaksei.moduls.MatricesClass;

import java.util.Arrays;
import java.util.Random;

public class Task6 {

    public static void main(String[] args) {

//        double[][] matrix = {{1, 2}, {3, 4}};
//        double[][] zeroMatrix = new double[0][0];
//
//        System.out.println(MatricesClass.findMin(matrix));
//
//        double[][] matrixIndi = {{3,6,1},{5,5,3},{7,9,5}};
//
//        System.out.println(MatricesClass.findRowPosition(matrixIndi));

        int n = 2, m = 2;

        double[][] matrix = new double[n][m];
        matrix = initMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(MatricesClass.findMax(matrix));
        System.out.println(MatricesClass.findMin(matrix));
        System.out.println(MatricesClass.findArithmeticMean(matrix));
        System.out.println(MatricesClass.findGeometricMean(matrix));
        System.out.println(Arrays.toString(MatricesClass.findFirstLocalMax(matrix)));
        System.out.println(Arrays.toString(MatricesClass.findFirstLocalMin(matrix)));
        System.out.println(Arrays.deepToString(MatricesClass.transpose(matrix)));
        System.out.println(MatricesClass.findRowPosition(matrix));

    }

    public static double[][] initMatrix(double[][] matrix){

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = random.nextDouble()*10;
            }
        }

        return matrix;
    }
}
