package by.aleaksei.moduls;

/*
Class which throw a coin n times and count how many times the Heads fell, and how many Tails.
 */

import java.util.Random;

public class HeadsOrTails {

    public static void throwCoin(int numberShots) {

        int countHeads = 0, countTails = 0;
        Random random = new Random();

        for (int i = 0; i < numberShots; i++) {
            if (random.nextInt() % 2 == 0) {
                countHeads++;
            } else {
                countTails++;
            }
        }

        System.out.printf("The coin was thrown %d times.\n Heads: %d.\n Tails: %d.", numberShots, countHeads, countTails);
    }

}
