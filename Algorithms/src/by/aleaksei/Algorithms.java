package by.aleaksei;

/*A class that outputs the results of algorithms.

 */

public class Algorithms {

    public static final int MASS_CALCULATOR_PARAMETER_1 = 1;
    public static final int MASS_CALCULATOR_PARAMETER_2 = 2;
    public static final int MASS_CALCULATOR_PARAMETER_3 = 3;
    public static final int MEAN_PARAMETER_1 = 1;
    public static final int MEAN_PARAMETER_2 = 2;
    public static final int SUM_PARAMETER_1 = 1;
    public static final int MULTIPLIER_PARAMETER_2 = 2;

    public static void massDinosaur(int mass) {

        long massTons = AlgorithmsHelper.massCalculator(mass, MASS_CALCULATOR_PARAMETER_1),
                massGrams = AlgorithmsHelper.massCalculator(mass, MASS_CALCULATOR_PARAMETER_2),
                massMilligrams = AlgorithmsHelper.massCalculator(mass, MASS_CALCULATOR_PARAMETER_3);
        System.out.printf("\ndinosaur weight in kilograms: %d, in tons: %d, in grams: %d, in milligrams: %d.\n",
                mass, massTons, massGrams, massMilligrams);
    }

    public static void areaRing(int radius1, int radius2) {

        System.out.println((radius1 > radius2) ? "Ring area: " + AlgorithmsHelper.areaCalculator(radius1, radius2) :
                "External radius should be greater then inner radius.");

    }

    public static void swapA_B(int a, int b) {
        System.out.printf("%d and %d --> ", a, b);
//        a -= b;
//        b += a;
        a = (b += (a -= b)) - a;
        System.out.printf("%d and %d.\n", a, b);
    }

    public static void numberSequence(int number) {
        System.out.printf(!(AlgorithmsHelper.numberSequenceCondition(number)) ?
                "The number %d does not satisfy the condition of increasing (decreasing) sequence of its numbers\n" :
                "The number %d satisfies the condition of increasing (decreasing) sequence of its numbers\n", number);
    }

    public static void numberSumAndMultiplier(int number) {
        int numberSum = AlgorithmsHelper.numberSumAndMultiplierCalculator(number, SUM_PARAMETER_1),
                numberMultiplier = AlgorithmsHelper.numberSumAndMultiplierCalculator(number, MULTIPLIER_PARAMETER_2);
        System.out.printf("The number %d: sum: %d, multiplier: %d.\n", number, numberSum, numberMultiplier);
    }

    public static void numberMean(int number) {
        double meanArithmetic = AlgorithmsHelper.numberMeanCalculator(number, MEAN_PARAMETER_1),
                meanGeometric = AlgorithmsHelper.numberMeanCalculator(number, MEAN_PARAMETER_2);
        System.out.printf("The number %d: arithmetic mean: %f, geometric mean: %f.\n",
                number, meanArithmetic, meanGeometric);
    }

    public static void numberRevolt(int number) {

        System.out.printf("The number: %d revolt -->  %d.\n", number, AlgorithmsHelper.numberRevolt(number));
    }
}

//A class that implements the algorithms themselves
class AlgorithmsHelper {

    public static final int CONVECTOR_PARAMETER = 1000;

    static long massCalculator(int mass, int chooseType) {
        return (chooseType == 1) ? mass / CONVECTOR_PARAMETER : (chooseType == 2) ? mass * CONVECTOR_PARAMETER : (long) mass * CONVECTOR_PARAMETER * CONVECTOR_PARAMETER;
    }

    static double areaCalculator(int r1, int r2) {
        double area;
        area = Math.PI * r1 * r1 - Math.PI * r2 * r2;
        return area;
    }

    static boolean numberSequenceCondition(int number) {
        int element_1 = number / 1000,
                element_2 = number / 100 - element_1 * 10,
                element_3 = number / 10 - element_1 * 100 - element_2 * 10,
                element_4 = number - element_1 * 1000 - element_2 * 100 - element_3 * 10;

        return (((element_1 > element_2) && (element_2 > element_3) && (element_3 > element_4)) ||
                ((element_1 < element_2) && (element_2 < element_3) && (element_3 < element_4)));
    }

    static int numberSumAndMultiplierCalculator(int number, int choose) {
        int element_1 = number / 10000,
                element_2 = number / 1000 - element_1 * 10,
                element_3 = number / 100 - element_1 * 100 - element_2 * 10,
                element_4 = number / 10 - element_1 * 1000 - element_2 * 100 - element_3 * 10,
                element_5 = number - element_1 * 10000 - element_2 * 1000 - element_3 * 100 - element_4 * 10;

        return (choose == 1) ? element_1 + element_2 + element_3 + element_4 + element_5 :
                element_1 * element_2 * element_3 * element_4 * element_5;
    }

    static double numberMeanCalculator(int number, int choose) {
        int element_1 = number / 100000,
                element_2 = number / 10000 - element_1 * 10,
                element_3 = number / 1000 - element_1 * 100 - element_2 * 10,
                element_4 = number / 100 - element_1 * 1000 - element_2 * 100 - element_3 * 10,
                element_5 = number / 10 - element_1 * 10000 - element_2 * 1000 - element_3 * 100 - element_4 * 10,
                element_6 = number - element_1 * 100000 - element_2 * 10000 - element_3 * 1000 - element_4 * 100 -
                        element_5 * 10;

        return (choose == 1) ?
                (double) (element_1 + element_2 + element_3 + element_4 + element_5 + element_6) / 6 :
                Math.pow((double) (element_1 * element_2 * element_3 * element_4 * element_5 * element_6), (1.0 / 6));
    }

    static int numberRevolt(int number) {

        int element_1 = number / 1000000,
                element_2 = number / 100000 - element_1 * 10,
                element_3 = number / 10000 - element_1 * 100 - element_2 * 10,
                element_4 = number / 1000 - element_1 * 1000 - element_2 * 100 - element_3 * 10,
                element_5 = number / 100 - element_1 * 10000 - element_2 * 1000 - element_3 * 100 - element_4 * 10,
                element_6 = number / 10 - element_1 * 100000 - element_2 * 10000 - element_3 * 1000 - element_4 * 100 -
                        element_5 * 10,
                element_7 = number - element_1 * 1000000 - element_2 * 100000 - element_3 * 10000 - element_4 * 1000 -
                        element_5 * 100 - element_6 * 10;

        return (element_7 * 1000000 + element_6 * 100000 + element_5 * 10000 +
                element_4 * 1000 + element_3 * 100 + element_2 * 10 + element_1);
    }
}
