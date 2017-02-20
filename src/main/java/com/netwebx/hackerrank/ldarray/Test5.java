package com.netwebx.hackerrank.ldarray;

import java.util.Scanner;

/**
 * Created by Jason on 2/17/17.
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer numberOfTestCase = scan.nextInt();

        for ( int i = 0; i < numberOfTestCase; i++) {
            Integer sizeOfArray = scan.nextInt();
            Integer jumpStep = scan.nextInt();

            Integer[] game = new Integer[sizeOfArray];
            for (int j = 0; j < sizeOfArray; j++) {
                game[j] = scan.nextInt();
            }

            if (play(game, jumpStep)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean play(Integer[] game, Integer jumpStep) {
        int step = 0;
        for (int j = 1; j < game.length; j++) {
            if (game[j] > 0) {
                step = j + jumpStep;
                if (step > game.length - 1) {
                    return true;
                }

                if (game[step] == 0) {
                    j = step - 1;
                    continue;
                } else {
                    j = j - 1;
                    if (j <= 0) {
                        return false;
                    }
                    continue;
                }
            }
        }
        return false;
    }
}
