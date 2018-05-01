package by.aleaksei.moduls;

public class Algorithms {

    /* Method that takes three points and looks at whether they are vertices of a triangle and,
    if so, whether it is rectangular triangle.
    */
    public static void triangleAlgorithm(int firstPointX, int firstPointY, int secondPointsX, int secondPointsY,
                                         int thirdPointX, int thirdPointY) {
        if (AlgorithmsHelper.triangleAlgorithmsIsValid(firstPointX, firstPointY, secondPointsX, secondPointsY,
                thirdPointX, thirdPointY)) {

            int distance_1 = (int) Math.sqrt((firstPointX - secondPointsX) * (firstPointX - secondPointsX) +
                    (firstPointY - secondPointsY) * (firstPointY - secondPointsY)),
                    distance_2 = (int) Math.sqrt((secondPointsX - thirdPointX) * (secondPointsX - thirdPointX) +
                            (secondPointsY - thirdPointY) * (secondPointsY - thirdPointY)),
                    distance_3 = (int) Math.sqrt((firstPointX - thirdPointX) * (firstPointX - thirdPointX) +
                            (firstPointY - thirdPointY) * (firstPointY - thirdPointY));

            if (AlgorithmsHelper.triangleAlgorithmsIsTriangle(distance_1, distance_2, distance_3)) {
                if (AlgorithmsHelper.triangleAlgorithmsIsRectangular(distance_1, distance_2, distance_3)) {
                    System.out.println("This points are a vertices of rectangular triangle.");
                } else {
                    System.out.println("This points are a vertices of triangle.");
                }
            } else {
                System.out.println("This points are not a vertices of triangle.");
            }
        } else {
            System.out.println("This points are not a vertices of triangle.");
        }
    }

    /*the method takes the age of the dragon and expects the number of its heads and eyes.
    */
    public static void dragonAlgorithm(int dragonAge) {
        int numberOfHead = AlgorithmsHelper.dragonAlgorithmHead(dragonAge); //calculation number of heads
        int numberOfEyes = AlgorithmsHelper.dragonAlgorithmEyes(numberOfHead);  //calculation number of eyes

        System.out.println("Dragon in age " + dragonAge + " has " + numberOfHead + " heads and " +
                numberOfEyes + " eye.");
    }

   /*
   the method takes a character and checks whether it is vowel or not?
    */

    public static void vowelsAlgorithm(char letter) {

//        if (AlgorithmsHelper.vowelsAlgorithmMethod4(letter)) {
//        if (AlgorithmsHelper.vowelsAlgorithmMethod3(letter)) {
//        if (AlgorithmsHelper.vowelsAlgorithmMethod2(letter)) {
        if (AlgorithmsHelper.vowelsAlgorithmMethod1(letter)) {
            System.out.println(letter + " is vowels.");
        } else {
            System.out.println(letter + " is not vowels.");
        }


    }

    /*
    the method displays pseudo mood of the user depending on the generated number
    */

    public static void MoodSensor() {

        int moodNumber = (int) (Math.random() * 10);

        switch (moodNumber) {
            case 1:
                System.out.print(":)"); // funny
                break;
            case 2:
                System.out.print("(*^.^*)"); //embarrassment
                break;
            case 3:
                System.out.print("(G_G)"); //very tired
                break;
            case 4:
                System.out.print("(-_-)"); //discontent
                break;
            case 5:
                System.out.print(":("); //sad
                break;
            case 6:
                System.out.print("{{ (>_<) }}"); //fear
                break;
            case 7:
                System.out.print("(@_@;)"); //confusion
                break;
            case 8:
                System.out.print("(o_O)!");//Surprise
                break;
            case 9:
                System.out.print("(─‿‿─)♡"); // in love
                break;
            default:
                System.out.print("(=^ ◡ ^=)"); //sleepy
                break;
        }
    }

    /*
    the method takes today's date and calculates the next day
     */
    public static void gregorianCalendar(int day, int month, int year) {

        if (AlgorithmsHelper.gregorianCalendarValidDate(day, month, year)) {
            System.out.printf("Today %d.%d.%d the next day: %d.%d.%d", day, month, year,
                    AlgorithmsHelper.gregorianCalendarNextDay(day, month, year, 1),
                    AlgorithmsHelper.gregorianCalendarNextDay(day, month, year, 2),
                    AlgorithmsHelper.gregorianCalendarNextDay(day, month, year, 3));
        } else {
            System.out.println("Date is not valid");
        }
    }

}

class AlgorithmsHelper {
    //the method checks if there are no matching points
    static boolean triangleAlgorithmsIsValid(int firstPointX, int firstPointY, int secondPointsX, int secondPointsY,
                                             int thirdPointX, int thirdPointY) {

        return (((firstPointX != secondPointsX) && (firstPointY != secondPointsY)) &&
                ((thirdPointX != secondPointsX) && (thirdPointY != secondPointsY)) &&
                ((firstPointX != thirdPointX) && (firstPointY != thirdPointY)));
    }

    //the method checks whether three points are vertices of a triangle
    static boolean triangleAlgorithmsIsTriangle(int distance_1, int distance_2, int distance_3) {
        return ((distance_1 <= distance_2 + distance_3) && (distance_2 <= distance_1 + distance_3) &&
                (distance_3 <= distance_1 + distance_2));
    }

    //the method checks whether the triangle is rectangular
    static boolean triangleAlgorithmsIsRectangular(int distance_1, int distance_2, int distance_3) {
        return ((distance_1 * distance_1 == distance_2 * distance_2 + distance_3 * distance_3) ||
                (distance_2 * distance_2 == distance_1 * distance_1 + distance_3 * distance_3) ||
                (distance_3 * distance_3 == distance_1 * distance_1 + distance_2 * distance_2));
    }

    //the method counts the number of dragon heads
    static int dragonAlgorithmHead(int dragonAge) {
        int numberHeads = 0;

        if (dragonAge < 200) {                                      //until 200 years is growing 3 heads
            numberHeads = 3 * dragonAge + 3;
        } else if (dragonAge < 300) {                               // from 200 until 300 years is growing 2 heads
            numberHeads = 3 * 201 + 2 * (dragonAge - 200);
        } else {                                                    // from 300 years is growing 1 head
            numberHeads = 3 * 201 + 2 * 100 + (dragonAge - 300);
        }
        return numberHeads;
    }

    //the method counts the number of dragon eyes
    static int dragonAlgorithmEyes(int numberHeads) {
        return numberHeads * 2;
    }

    //the method checks the character on the vowel.
    static boolean vowelsAlgorithmMethod1(char letter) {
        switch (letter) {
            case 'A':
            case 'a':
            case 'Q':
            case 'q':
            case 'E':
            case 'e':
            case 'Y':
            case 'y':
            case 'U':
            case 'u':
            case 'O':
            case 'o':
            case 'I':
            case 'i':
                return true;
            default:
                return false;
        }
    }

    //the method checks the character on the vowel.
    static boolean vowelsAlgorithmMethod2(char letter) {
        switch (letter) {
            case 65:
            case 97:
            case 81:
            case 113:
            case 69:
            case 101:
            case 89:
            case 121:
            case 85:
            case 117:
            case 79:
            case 111:
            case 73:
            case 105:
                return true;
            default:
                return false;
        }
    }

    //the method checks the character on the vowel.
    static boolean vowelsAlgorithmMethod3(char letter) {
        boolean bool = false;
        if (letter == 'A') {
            bool = true;
        } else if (letter == 'a') {
            bool = true;
        } else if (letter == 'E') {
            bool = true;
        } else if (letter == 'e') {
            bool = true;
        } else if (letter == 'Y') {
            bool = true;
        } else if (letter == 'y') {
            bool = true;
        } else if (letter == 'U') {
            bool = true;
        } else if (letter == 'u') {
            bool = true;
        } else if (letter == 'I') {
            bool = true;
        } else if (letter == 'i') {
            bool = true;
        } else if (letter == 'O') {
            bool = true;
        } else if (letter == 'o') {
            bool = true;
        } else if (letter == 'Q') {
            bool = true;
        } else if (letter == 'q') {
            bool = true;
        }
        return bool;
    }

    //the method checks the character on the vowel.
    static boolean vowelsAlgorithmMethod4(char letter) {
        boolean bool = false;
        if (letter == 65) {
            bool = true;
        } else if (letter == 97) {
            bool = true;
        } else if (letter == 81) {
            bool = true;
        } else if (letter == 113) {
            bool = true;
        } else if (letter == 69) {
            bool = true;
        } else if (letter == 101) {
            bool = true;
        } else if (letter == 89) {
            bool = true;
        } else if (letter == 121) {
            bool = true;
        } else if (letter == 85) {
            bool = true;
        } else if (letter == 117) {
            bool = true;
        } else if (letter == 79) {
            bool = true;
        } else if (letter == 111) {
            bool = true;
        } else if (letter == 73) {
            bool = true;
        } else if (letter == 105) {
            bool = true;
        }
        return bool;
    }

    //the method calculates the following date
    static int gregorianCalendarNextDay(int day, int month, int year, int choose) {

        day++;
        boolean leapYear = false;
        //condition of leap year
        if (year % 4 == 0) {
            leapYear = year % 400 == 0 || year % 100 != 0;
        }

// days in month:
//            2 --> 29 days
//            1, 3, 5, 7, 8, 10, 12  - 31 days
//            4, 6, 9, 11 - 30 days
        switch (month) {
            case 2:
                if (leapYear) {
                    if (day > 29) {
                        day = 1;
                        month++;
                    }
                } else {
                    if (day > 28) {
                        day = 1;
                        month++;
                    }
                }
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day > 31) {
                    day = 1;
                    month++;
                }
                break;
            default:
                if (day > 30) {
                    day = 1;
                    month++;
                }
                break;
        }

        if (month > 12) {
            month = 1;
            year++;
        }

        switch (choose) {
            case 1:
                return day;
            case 2:
                return month;
            case 3:
                return year;
            default:
                return 0;
        }
    }

    //the method checks the correctness of the date
    static boolean gregorianCalendarValidDate(int day, int month, int year) {

        boolean leapYear = false;
        //condition of leap year
        if (year % 4 == 0) {
            leapYear = year % 400 == 0 || year % 100 != 0;
        }
        if (year > 0) {
            if ((month > 0) && (month <= 12)) {
//                 days in month:
//                  2 --> 29 days
//                  1, 3, 5, 7, 8, 10, 12  - 31 days
//                  4, 6, 9, 11 - 30 days
                switch (month) {
                    case 2:
                        if (leapYear) {
                            if ((day > 0) && (day <= 29)) {
                                return true;
                            }
                        } else {
                            if ((day > 0) && (day <= 28)) {
                                return true;
                            }
                        }
                        break;
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        if ((day > 0) && (day <= 31)) {
                            return true;
                        }
                        break;
                    default:
                        if ((day > 0) && (day <= 30)) {
                            return true;
                        }
                        break;
                }
            }
        }

        return false;
    }
}
