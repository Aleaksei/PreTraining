package by.aleaksei.moduls;

/*
Class which throw a coin n times and count how many times the Heads fell, and how many Tails.
 */

import java.util.Random;

public class HeadsOrTails {

    public static int throwCoin(int numberShots) {

        int countHeads = 0;
        Random random = new Random();

        for (int i = 0; i < numberShots; i++) {
            if (random.nextBoolean()) {
                countHeads++;
            }
        }
        return countHeads;
    }

    public static void coinResulter(int numberShots) {

        int countHeads = throwCoin(numberShots);
        System.out.printf("The coin was thrown %d times.\n Heads: %d.\n Tails: %d.", numberShots,
                countHeads, numberShots - countHeads);
    }
}