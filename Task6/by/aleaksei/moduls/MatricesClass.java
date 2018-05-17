package by.aleaksei.moduls;

public class MatricesClass {

    public static double findMax(double[][] matrix) {

        if (matrix.length == 0) {
            return 0;
        }

        double max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public static double findMin(double[][] matrix) {

        if (matrix.length == 0) {
            return 0;
        }

        double min = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public static double findArithmeticMean(double[][] matrix) {

        if (matrix.length == 0) {
            return 0;
        }

        double arithmeticMean = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                arithmeticMean += matrix[i][j];
            }
        }

        return arithmeticMean / (matrix.length * matrix[0].length);
    }

    public static double findGeometricMean(double[][] matrix) {

        if (matrix.length == 0) {
            return 0;
        }

        double geometricMean = 1;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                geometricMean *= matrix[i][j];
            }
        }
        return Math.pow(Math.abs(geometricMean), (1. / (matrix.length * matrix[0].length)));
    }

    public static int[] findFirstLocalMin(double[][] matrix) {

        int[] position = new int[]{-1, -1};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        if ((matrix[i][j] < matrix[i][j + 1]) && (matrix[i][j] < matrix[i + 1][j])) {

                            position[0] = i;
                            position[1] = j;
                            return position;
                        }
                    } else if (j == (matrix[i].length - 1)) {
                        if ((matrix[i][j] < matrix[i][j - 1]) && (matrix[i][j] < matrix[i + 1][j])) {

                            position[0] = i;
                            position[1] = j;
                            return position;
                        }
                    } else if ((matrix[i][j] < matrix[i][j + 1]) && (matrix[i][j] < matrix[i][j - 1]) &&
                            (matrix[i][j] < matrix[i + 1][j])) {

                        position[0] = i;
                        position[1] = j;
                        return position;

                    }
                } else if (i == (matrix.length - 1)) {
                    if (j == 0) {
                        if ((matrix[i][j] < matrix[i][j + 1]) && (matrix[i][j] < matrix[i - 1][j])) {

                            position[0] = i;
                            position[1] = j;
                            return position;
                        }
                    } else if (j == (matrix[i].length - 1)) {
                        if ((matrix[i][j] < matrix[i][j - 1]) && (matrix[i][j] < matrix[i - 1][j])) {

                            position[0] = i;
                            position[1] = j;
                            return position;
                        }
                    } else if ((matrix[i][j] < matrix[i][j + 1]) && (matrix[i][j] < matrix[i][j - 1]) &&
                            (matrix[i][j] < matrix[i - 1][j])) {

                        position[0] = i;
                        position[1] = j;
                        return position;
                    }

                } else if ((matrix[i][j] < matrix[i][j + 1]) && (matrix[i][j] < matrix[i][j - 1]) &&
                        (matrix[i][j] < matrix[i + 1][j]) && (matrix[i][j] < matrix[i - 1][j])) {

                    position[0] = i;
                    position[1] = j;
                    return position;
                }
            }
        }

        return position;
    }

    public static int[] findFirstLocalMax(double[][] matrix) {

        int[] position = new int[]{-1, -1};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0) {
                    if (j == 0) {
                        if ((matrix[i][j] > matrix[i][j + 1]) && (matrix[i][j] > matrix[i + 1][j])) {

                            position[0] = i;
                            position[1] = j;
                            return position;
                        }
                    } else if (j == (matrix[i].length - 1)) {
                        if ((matrix[i][j] > matrix[i][j - 1]) && (matrix[i][j] > matrix[i + 1][j])) {

                            position[0] = i;
                            position[1] = j;
                            return position;
                        }
                    } else if ((matrix[i][j] > matrix[i][j + 1]) && (matrix[i][j] > matrix[i][j - 1]) &&
                            (matrix[i][j] > matrix[i + 1][j])) {

                        position[0] = i;
                        position[1] = j;
                        return position;

                    }
                } else if (i == (matrix.length - 1)) {
                    if (j == 0) {
                        if ((matrix[i][j] > matrix[i][j + 1]) && (matrix[i][j] > matrix[i - 1][j])) {

                            position[0] = i;
                            position[1] = j;
                            return position;
                        }
                    } else if (j == (matrix[i].length - 1)) {
                        if ((matrix[i][j] > matrix[i][j - 1]) && (matrix[i][j] > matrix[i - 1][j])) {

                            position[0] = i;
                            position[1] = j;
                            return position;
                        }
                    } else if ((matrix[i][j] > matrix[i][j + 1]) && (matrix[i][j] > matrix[i][j - 1]) &&
                            (matrix[i][j] > matrix[i - 1][j])) {

                        position[0] = i;
                        position[1] = j;
                        return position;
                    }

                } else if ((matrix[i][j] > matrix[i][j + 1]) && (matrix[i][j] > matrix[i][j - 1]) &&
                        (matrix[i][j] > matrix[i + 1][j]) && (matrix[i][j] > matrix[i - 1][j])) {

                    position[0] = i;
                    position[1] = j;
                    return position;
                }
            }
        }

        return position;
    }

    public static double[][] transpose(double[][] matrix) {

        if (matrix.length != 0) {
            if (matrix.length == matrix[0].length) {

                double temp;

                for (int i = 0; i < matrix.length; i++) {
                    for (int j = i; j < matrix.length; j++) {
                        temp = matrix[i][j];
                        matrix[i][j] = matrix[j][i];
                        matrix[j][i] = temp;
                    }
                }

            }
        }

        return matrix;
    }

    public static int findRowPosition(double[][] matrix) {

        int position = -1;
        double[] rowSum = new double[matrix.length];

        mark:
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++){

                if (matrix[i][j]%2 == 0){
                    break mark;
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                rowSum[i] += Math.abs(matrix[i][j]);
            }
        }

        double minSum = 0;


        for (int i = 0; i < rowSum.length; i++){
            if (i == 0) {
                minSum = rowSum[i];
                position = i + 1;
            }
            if (minSum > rowSum[i]){
                minSum = rowSum[i];
                position = i + 1;
            }
        }

        return position;
    }
}
