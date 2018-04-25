package by.aleaksei;

// A class that outputs the results of algorithms.

public class Algorithms {

    public static void massDinosaur(int mass){

        long[] massType = AlgorithmsHelper.massCalculator(mass);
        System.out.printf("\ndinosaur weight in kilograms: %d, in tons: %d, in grams: %d, in milligrams: %d.\n",mass, massType[0], massType[1], massType[2]);
    }

    public static void areaRing(int radius1, int radius2) {
        if (radius1 > radius2) {
            System.out.println("Ring area: " + AlgorithmsHelper.areaCalculator(radius1, radius2));
        }   else {
            System.out.println("External radius should be greater then inner radius.");
        }
    }

    public static void swapA_B(int a, int b){
        System.out.printf("%d and %d --> ", a, b);

        a -= b;
        b += a;
        a = b - a;
        System.out.printf("%d and %d.\n", a, b);
    }

    public static void numberSequence(int number){
        if (AlgorithmsHelper.numberSequenceCondition(number)) {
            System.out.printf("The number %d satisfies the condition of increasing (decreasing) sequence of its numbers", number);
        }
        else{
            System.out.printf("The number %d does not satisfy the condition of increasing (decreasing) sequence of its numbers", number);
        }

    }

    public static void numberSumAndMultiplier(int number){
        int[] mass = AlgorithmsHelper.numberSumAndMultiplierCalculator(number);
        System.out.printf("The number %d: sum: %d, multiplier: %d.", number, mass[0], mass[1] );
    }

    public static void numberMean(int number){
        double[] mass = AlgorithmsHelper.numberMeanCalculator(number);
        System.out.printf("The number %d: arithmetic mean: %f, geometric mean: %f.", number, mass[0], mass[1] );
    }

    public static void numberRevolt(int number){

        System.out.printf("The number: %d revolt -->  %d.", number,AlgorithmsHelper.numberRevolt(number));
    }
}

//A class that implements the algorithms themselves
class AlgorithmsHelper {

    static long[] massCalculator(int mass){
        long[] massType = new long[3];

        massType[0] = mass/1000 ;
        massType[1] = mass*1000;
        massType[2] = (long)mass*1000000;

        return massType;
    }

    static double areaCalculator(int r1, int r2){
        double area = 0.;
        area = Math.PI*r1*r1 - Math.PI*r2*r2;
        return area;
    }

    static boolean numberSequenceCondition(int number){
        boolean bool = false;
        int[] massNumbers = new int[4];

        massNumbers[0] = number / 1000;
        massNumbers[1] = number / 100 - massNumbers[0] * 10;
        massNumbers[2] = number / 10 - massNumbers[0] * 100 - massNumbers[1]*10;
        massNumbers[3] = number - massNumbers[0] * 1000 - massNumbers[1]*100 - massNumbers[2]*10;
        if ((massNumbers[0]>massNumbers[1])&&(massNumbers[1]>massNumbers[2])&&massNumbers[2]>massNumbers[3]){
            bool = true;
        } else if ((massNumbers[0]<massNumbers[1])&&(massNumbers[1]<massNumbers[2])&&massNumbers[2]<massNumbers[3]) {
            bool = true;
        }

        return bool;
    }

    static int[] numberSumAndMultiplierCalculator(int number){
        int[] mass = new int[2];
        int[] massNumbers = new int[5];

        massNumbers[0] = number / 10000;
        massNumbers[1] = number / 1000 - massNumbers[0] * 10;
        massNumbers[2] = number / 100 - massNumbers[0] * 100 - massNumbers[1]*10;
        massNumbers[3] = number / 10 - massNumbers[0] * 1000 - massNumbers[1]*100 - massNumbers[2]*10;
        massNumbers[4] = number - massNumbers[0] * 10000 - massNumbers[1]*1000 - massNumbers[2]*100 - massNumbers[3]*10;
        mass[0] = massNumbers[0] + massNumbers[1] + massNumbers[2] + massNumbers[3] + massNumbers[4];
        mass[1] = massNumbers[0] * massNumbers[1] * massNumbers[2] * massNumbers[3] * massNumbers[4];

        return  mass;
    }

    static double[] numberMeanCalculator(int number){
        double[] mass = new double[2];
        int[] massNumbers = new int[6];

        massNumbers[0] = number / 100000;
        massNumbers[1] = number / 10000 - massNumbers[0] * 10;
        massNumbers[2] = number / 1000 - massNumbers[0] * 100 - massNumbers[1]*10;
        massNumbers[3] = number / 100 - massNumbers[0] * 1000 - massNumbers[1]*100 - massNumbers[2]*10;
        massNumbers[4] = number / 10 - massNumbers[0] * 10000 - massNumbers[1]*1000 - massNumbers[2]*100 - massNumbers[3]*10;
        massNumbers[5] = number  - massNumbers[0] * 100000 - massNumbers[1]*10000 - massNumbers[2]*1000 - massNumbers[3]*100 - massNumbers[4]*10;

        mass[0] = (double)(massNumbers[0] + massNumbers[1] + massNumbers[2] + massNumbers[3] + massNumbers[4] + massNumbers[5]) / 6.;
        mass[1] = Math.pow((double)(massNumbers[0] * massNumbers[1] * massNumbers[2] * massNumbers[3] * massNumbers[4] * massNumbers[5]),(1.0/6) );
        return mass;
    }

    static int numberRevolt(int number){

        int[] massNumbers = new int[7];

        massNumbers[0] = number / 1000000;
        massNumbers[1] = number / 100000 - massNumbers[0] * 10;
        massNumbers[2] = number / 10000 - massNumbers[0] * 100 - massNumbers[1]*10;
        massNumbers[3] = number / 1000 - massNumbers[0] * 1000 - massNumbers[1]*100 - massNumbers[2]*10;
        massNumbers[4] = number / 100 - massNumbers[0] * 10000 - massNumbers[1]*1000 - massNumbers[2]*100 - massNumbers[3]*10;
        massNumbers[5] = number / 10 - massNumbers[0] * 100000 - massNumbers[1]*10000 - massNumbers[2]*1000 - massNumbers[3]*100 - massNumbers[4]*10;
        massNumbers[6] = number - massNumbers[0] * 1000000 - massNumbers[1]*100000 - massNumbers[2]*10000 - massNumbers[3]*1000 - massNumbers[4]*100 - massNumbers[5]*10;

        number =(int) (massNumbers[6]*1000000 + massNumbers[5]*100000 + massNumbers[4]*10000 + massNumbers[3]*1000 + massNumbers[2]*100 + massNumbers[1]*10 + massNumbers[0]);
        return number;
    }

}
