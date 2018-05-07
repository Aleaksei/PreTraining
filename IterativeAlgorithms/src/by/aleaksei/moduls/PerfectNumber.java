package by.aleaksei.moduls;

/*
    class that checks the perfect number or not.
 */

public class PerfectNumber {

    //method which calculates the sum of all divisors
    private static int sumDivisor(int number) {

        int divisor = 1, sumDivisor = 0;

        while (divisor <= (number / 2)) {

            if (number % divisor == 0) {
                sumDivisor += divisor;
            }
            divisor++;
        }
        return sumDivisor;
    }

    //method which checks the perfect condition
    private static boolean isPerfect(int number) {

        int sumDivisor = sumDivisor(number);

        return (sumDivisor == number);

    }

    public static void perfectChecking(int number) {

        if (number > 0) {
            System.out.printf((!isPerfect(number) ? "Number %d is not Perfect." : "Number %d is Perfect."), number);
        } else {
            System.out.print("Number is not natural.");
        }

    }

}
