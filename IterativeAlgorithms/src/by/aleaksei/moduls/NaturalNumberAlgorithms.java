package by.aleaksei.moduls;

/*
class which contains same methods for work with natural numbers;
 */

public class NaturalNumberAlgorithms {

    //method which checks number is divisor or not
    private static boolean isDivisor(int divisor, int number) {
        return number % divisor == 0;
    }

    //method which finds max element of a number
    private static int maxElementSearcher(int number) {

        int maxElement = 0, numberElement;

        while (number > 0) {

            numberElement = number % 10;
            number /= 10;

            if (maxElement < numberElement) {
                maxElement = numberElement;
            }
        }

        return maxElement;
    }

    //
    public static void maxElement(int number) {
        int maxElement = maxElementSearcher(number);
        if (number > 0) {
            System.out.printf("Max element of number %d is digit %d.", number, maxElement);
        } else {
            System.out.print("Number is not valid.");
        }
    }

    //method which checks number is simple or not
    private static boolean isSimple(int number) {

        int divisor = 1, countDivisor = 0;

        while (divisor <= number / 2) {
            if (isDivisor(divisor, number)) {
                countDivisor++;
                if (countDivisor > 1) {
                    break;
                }
            }
            divisor++;
        }

        return countDivisor == 1;
    }

    //
    public static void simpleNumber(int number) {
        if (number > 0) {
            System.out.printf((isSimple(number) ? "Number %d is simple." : "Number %d is not simple."), number);
        } else {
            System.out.print("Number is not valid.");
        }

    }

    //method which checks number is palindrome or not
    private static boolean isPalindrome(int number) {

        int count = 0, workNumber = number;
        boolean isPalindrome = true;

        while (workNumber > 0) {
            workNumber /= 10;
            count++;
        }

        for (; count >= 1; count -= 2) {
            if (number % 10 != number / (int) Math.pow(10, (count - 1))) {
                isPalindrome = false;
                break;
            }

            number -= (number / (int) Math.pow(10, (count - 1))) * (int) Math.pow(10, (count - 1));
            number /= 10;
        }

        return isPalindrome;
    }

    public static void palindromeNumber(int number) {
        if (number > 0) {
            System.out.printf(((isPalindrome(number)) ? "Number %d is palindrome." : "Number %d is not palindrome."), number);
        } else {
            System.out.print("Number is not valid.");
        }
    }

    ////method which finds all simple divisors
    public static void simpleDivisorSearching(int number) {

        int divisor = 1;

        if (number > 0) {
            System.out.printf("Simple divisors of number %d:\n", number);

            while (divisor <= number / 2) {
                if (isDivisor(divisor, number)) {
                    if (isSimple(divisor)) {
                        System.out.println(divisor);
                    }
                }
                divisor++;
            }
            if (isSimple(number)) {
                System.out.println(number);
            }
        } else {
            System.out.print("Number is not valid.");
        }

    }

    //method which calculates NOD of two numbers
    private static int nodCalculator(int number1, int number2) {
        int divisor = 1, nod = 1;

        if (isDivisor(number2, number1)) {
            nod = number2;
        } else if (isDivisor(number1, number2)) {
            nod = number1;
        } else {
            while ((divisor <= number1 / 2) && (divisor <= number2 / 2)) {

                if (isDivisor(divisor, number1) && isDivisor(divisor, number2)) {
                    nod = divisor;
                }
                divisor++;
            }
        }
        return nod;
    }

    //method which calculates NOK of two numbers
    private static int nokCalculator(int number1, int number2) {
        return (number1 * number2) / nodCalculator(number1, number2);
    }

    //
    public static void findNOD_AndNOK(int number1, int number2) {

        if ((number1 > 0) && (number2 > 0)) {
            int nod = nodCalculator(number1, number2), nok = nokCalculator(number1, number2);

            System.out.printf("Numbers (%d; %d).\n NOD -> %d;\n NOK -> %d;\n", number1, number2, nod, nok);
        } else {
            System.out.print("Number is not valid.");
        }
    }

    //method which calculates count of different digits in number
    private static int differentDigitsCalculator(int number) {

        int count = 0, element = 0, workNumber1 = number, workNumber2, countDifferentDigits = 1;

        while (workNumber1 > 0) {
            element = workNumber1 % 10;
            workNumber1 /= 10;
            count++;
            workNumber2 = number;
            for (int i = 1; i < count; i++) {
                if (element == workNumber2 % 10) {
                    break;
                } else {
                    workNumber2 /= 10;
                }
                if (i == count - 1) {
                    countDifferentDigits++;
                }
            }
        }

        return countDifferentDigits;
    }

    //
    public static void countDifferentDigits(int number) {
        int countDifferentDigits = differentDigitsCalculator(number);
        if (number > 0) {
            System.out.printf("Number %d contains %d different digits.", number, countDifferentDigits);
        } else {
            System.out.print("Number is not valid.");
        }
    }

}
