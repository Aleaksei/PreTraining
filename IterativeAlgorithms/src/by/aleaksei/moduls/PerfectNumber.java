package by.aleaksei.moduls;

/*
    class that checks the perfect number or not.
 */

public class PerfectNumber {

    //method which calculates the sum of all divisors
    private static int sumDivisorCalculator(int number) {

        int sumDivisor = 1;

        for(int divisor = 2; divisor <= (number / 2); divisor++) {
            if (number % divisor == 0) {
                sumDivisor += divisor;
            }
        }
        return sumDivisor;
    }

    //method which checks the perfect condition
    private static boolean isPerfect(int number) {
        
        int sumDivisor = sumDivisorCalculator(number);
        
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
