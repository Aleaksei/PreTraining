package by.aleaksei.moduls;

public class ArrayClass {

    public static double findMaxElement(double[] array) {
        if (array.length == 0) {
            return Double.NaN;
        }

        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        return max;
    }

    public static double findMinElement(double[] array) {
        if (array.length == 0) {
            return Double.NaN;
        }

        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return min;
    }

    public static double findArithmeticMean(double[] array) {
        double arithmeticMean = 0;

        for (int i = 0; i < array.length; i++) {
            arithmeticMean += array[i];
        }

        return arithmeticMean / array.length;
    }

    public static double findGeometricMean(double[] array) {
        double geometricMean = 1;

        for (int i = 0; i < array.length; i++) {
            geometricMean *= array[i];
        }


        return Math.pow(Math.abs(geometricMean), (1.0 / array.length)); // Вопрос?
    }

    public static boolean isOrdered(double[] array) {

        boolean isOrdered = false;

        if (array.length < 2) {
            return true;
        }

        for (int i = 0; i < (array.length - 1); i++) {
            if (!(array[i] <= array[i + 1])) {
                break;
            }
            if (i == (array.length - 2)) {
                isOrdered = true;
            }
        }

        for (int i = 0; i < (array.length - 1); i++) {
            if (!(array[i] >= array[i + 1])) {
                break;
            }
            if (i == (array.length - 2)) {
                isOrdered = true;
            }
        }

        return isOrdered;
    }

    public static int findLocalMin(double[] array) {

        int position = -1;

        if (array.length < 2) {
            if (array.length == 1) {
                return 0;
            } else {
                return position;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (array[i] < array[i + 1]) {
                    position = i;
                    break;
                }
            } else if (i == array.length - 1) {
                if (array[i - 1] > array[i]) {
                    position = i;
                    break;
                }
            } else if ((array[i - 1] > array[i]) && (array[i] < array[i + 1])) {
                position = i;
                break;
            }
        }

        return position;
    }

    public static int findLocalMax(double[] array) {

        int position = -1;

        if (array.length < 2) {
            if (array.length == 1) {
                return 0;
            } else {
                return position;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                if (array[i] > array[i + 1]) {
                    position = i;
                    break;
                }
            } else if (i == array.length - 1) {
                if (array[i - 1] < array[i]) {
                    position = i;
                    break;
                }
            } else if ((array[i - 1] < array[i]) && (array[i] > array[i + 1])) {
                position = i;
                break;
            }
        }

        return position;
    }

    public static double[] reverse(double[] array){

        for (int i = 0; i < array.length / 2; i++){

            double tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }

        return array;
    }

}
