package by.aleaksei.moduls;

public class Algorithms {
    public static final String FUNNY = ":)";
    public static final String EMBARRASSMENT = "(*^.^*)";
    public static final String VERY_TIRED = "(G_G)";
    public static final String DISCONTENT = "(-_-)";
    public static final String SAD = ":(";
    public static final String FEAR = "{{ (>_<) }}";
    public static final String CONFUSION = "(@_@;)";
    public static final String SURPRISE = "(o_O)!";
    public static final String IN_LOVE = "(─‿‿─)♡";
    public static final String SLEEPY = "(=^ ◡ ^=)";
    public static final int CALENDAR_PARAMETER_1 = 1;
    public static final int CALENDAR_PARAMETER_2 = 2;
    public static final int CALENDAR_PARAMETER_3 = 3;

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

        letter = (letter + "").toLowerCase().charAt(0);

        if (AlgorithmsHelper.vowelsAlgorithmMethod4(letter)) {
//        if (AlgorithmsHelper.vowelsAlgorithmMethod3(letter)) {
//        if (AlgorithmsHelper.vowelsAlgorithmMethod2(letter)) {
//        if (AlgorithmsHelper.vowelsAlgorithmMethod1(letter)) {
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
        String mood = SLEEPY;

        switch (moodNumber) {
            case 1:
                mood = FUNNY;
                break;
            case 2:
                mood = EMBARRASSMENT;
                break;
            case 3:
                mood = VERY_TIRED;
                break;
            case 4:
                mood = DISCONTENT;
                break;
            case 5:
                mood = SAD;
                break;
            case 6:
                mood = FEAR;
                break;
            case 7:
                mood = CONFUSION;
                break;
            case 8:
                mood = SURPRISE;
                break;
            case 9:
                mood = IN_LOVE;
                break;
        }
        System.out.print(mood);
    }

    /*
    the method takes today's date and calculates the next day
     */
    public static void gregorianCalendar(int day, int month, int year) {

        if (AlgorithmsHelper.gregorianCalendarValidDate(day, month, year)) {
            System.out.printf("Today %d.%d.%d the next day: %d.%d.%d", day, month, year,
                    AlgorithmsHelper.gregorianCalendarNextDay(day, month, year, CALENDAR_PARAMETER_1),
                    AlgorithmsHelper.gregorianCalendarNextDay(day, month, year, CALENDAR_PARAMETER_2),
                    AlgorithmsHelper.gregorianCalendarNextDay(day, month, year, CALENDAR_PARAMETER_3));
        } else {
            System.out.println("Date is not valid");
        }
    }

}

class AlgorithmsHelper {
    public static final int DRAGON_YANG_PERIOD = 200;
    public static final int DRAGON_MID_PERIOD = 300;
    public static final int HEAD_GROWS_YANG_PERIOD = 3;
    public static final int HEAD_GROWS_MID_PERIOD = 1;
    public static final int EYES_ON_HEAD = 2;
    public static final String PATTERN = "aeyuoi";
    public static final int JANUARY = 1;
    public static final int FEBRUARY = 2;
    public static final int MARCH = 3;
    public static final int MAY = 5;
    public static final int JULY = 7;
    public static final int AUGUST = 8;
    public static final int OCTOBER = 10;
    public static final int DECEMBER = 12;
    public static final int LEAP_YEAR_CONST_4 = 4;
    public static final int LEAP_YEAR_CONST_400 = 400;
    public static final int LEAP_YEAR_CONST_100 = 100;
    public static final int LAST_DAY_31 = 31;
    public static final int LAST_DAY_30 = 30;
    public static final int LAST_DAY_28 = 28;
    public static final int LAST_DAY_29 = 29;
    public static final int FIRST_DAY_OR_MONTH = 1;

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

        if (dragonAge > 0) {
            if (dragonAge < DRAGON_YANG_PERIOD) {                                      //until 200 years is growing 3 heads
                numberHeads = HEAD_GROWS_YANG_PERIOD * dragonAge + HEAD_GROWS_YANG_PERIOD;
            } else if (dragonAge < DRAGON_MID_PERIOD) {                               // from 200 until 300 years is growing 2 heads
                numberHeads = HEAD_GROWS_YANG_PERIOD * (DRAGON_YANG_PERIOD + 1) -
                        HEAD_GROWS_MID_PERIOD * DRAGON_YANG_PERIOD + HEAD_GROWS_MID_PERIOD * dragonAge;
            } else {                                                    // from 300 years is growing 1 head
                numberHeads = HEAD_GROWS_YANG_PERIOD * (DRAGON_YANG_PERIOD + 1) + HEAD_GROWS_MID_PERIOD *
                        (DRAGON_MID_PERIOD - DRAGON_YANG_PERIOD) - DRAGON_MID_PERIOD + dragonAge;
            }
        }
        return numberHeads;

    }

    //the method counts the number of dragon eyes
    static int dragonAlgorithmEyes(int numberHeads) {
        return numberHeads * EYES_ON_HEAD;
    }

    //the method checks the character on the vowel.
    static boolean vowelsAlgorithmMethod1(char letter) {

        switch (letter) {
            case 'a':
            case 'e':
            case 'y':
            case 'u':
            case 'o':
            case 'i':
                return true;
            default:
                return false;
        }
    }

    //the method checks the character on the vowel.
    static boolean vowelsAlgorithmMethod2(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'y' || letter == 'u' || letter == 'o' || letter == 'i';
    }

    //the method checks the character on the vowel.
    static boolean vowelsAlgorithmMethod3(char letter) {
        return PATTERN.contains(letter + "");
    }

    //the method checks the character on the vowel.
    static boolean vowelsAlgorithmMethod4(char letter) {
        return (letter + "").equals("a") || (letter + "").equals("e") ||
                (letter + "").equals("y") || (letter + "").equals("u") ||
                (letter + "").equals("o") || (letter + "").equals("i");
    }

    //the method calculates the following date
    static int gregorianCalendarNextDay(int day, int month, int year, int choose) {

        day++;
        boolean leapYear = isLeapYear(year);

// days in month:
//            2 --> 29 days
//            1, 3, 5, 7, 8, 10, 12  - 31 days
//            4, 6, 9, 11 - 30 days
        switch (month) {
            case FEBRUARY:
                if (leapYear) {
                    if (day > LAST_DAY_29) {
                        day = FIRST_DAY_OR_MONTH;
                        month++;
                    }
                } else {
                    if (day > LAST_DAY_28) {
                        day = FIRST_DAY_OR_MONTH;
                        month++;
                    }
                }
                break;
            case JANUARY:
            case MARCH:
            case MAY:
            case JULY:
            case AUGUST:
            case OCTOBER:
            case DECEMBER:
                if (day > LAST_DAY_31) {
                    day = FIRST_DAY_OR_MONTH;
                    month++;
                }
                break;
            default:
                if (day > LAST_DAY_30) {
                    day = FIRST_DAY_OR_MONTH;
                    month++;
                }
                break;
        }

        if (month > DECEMBER) {
            month = FIRST_DAY_OR_MONTH;
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

        boolean leapYear = isLeapYear(year);
        if (year > 0) {
            if ((month >= JANUARY) && (month <= DECEMBER)) {
//                 days in month:
//                  2 --> 29 days
//                  1, 3, 5, 7, 8, 10, 12  - 31 days
//                  4, 6, 9, 11 - 30 days
                switch (month) {
                    case FEBRUARY:
                        if (leapYear) {
                            if ((day >= FIRST_DAY_OR_MONTH) && (day <= LAST_DAY_29)) {
                                return true;
                            }
                        } else {
                            if ((day >= FIRST_DAY_OR_MONTH) && (day <= LAST_DAY_28)) {
                                return true;
                            }
                        }
                        break;
                    case JANUARY:
                    case MARCH:
                    case MAY:
                    case JULY:
                    case AUGUST:
                    case OCTOBER:
                    case DECEMBER:
                        if ((day >= FIRST_DAY_OR_MONTH) && (day <= LAST_DAY_31)) {
                            return true;
                        }
                        break;
                    default:
                        if ((day >= FIRST_DAY_OR_MONTH) && (day <= LAST_DAY_30)) {
                            return true;
                        }
                        break;
                }
            }
        }
        return false;
    }

    //condition of leap year
    private static boolean isLeapYear(int year) {
        return (year % LEAP_YEAR_CONST_4 == 0) && (year % LEAP_YEAR_CONST_400 == 0 || year % LEAP_YEAR_CONST_100 != 0);
    }
}
