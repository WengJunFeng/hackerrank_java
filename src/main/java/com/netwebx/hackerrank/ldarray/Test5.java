package com.netwebx.hackerrank.ldarray;

import java.util.Scanner;

/**
 * Created by Jason on 2/17/17.
 */
public class Test5 {
    private final static int JUMP = 1;
    private final static int BACK = 0;
    private final static int GAME_WIN = 2;
    private final static int GAME_FAIL = -1;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Integer numberOfTestCase = scan.nextInt();

        for ( int i = 0; i < numberOfTestCase; i++) {
            Integer sizeOfArray = scan.nextInt();
            Integer jumpStep = scan.nextInt();
            if (jumpStep == 0) {
                jumpStep = 1;
            }

            Integer[] game = new Integer[sizeOfArray];
            for (int j = 0; j < sizeOfArray; j++) {
                game[j] = scan.nextInt();
            }

            //System.out.printf("%d, ", i);
            if (play(game, jumpStep)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            if (!scan.hasNext()) {
                scan.close();
                break;
            }
        }
    }

    private static boolean play(Integer[] game, Integer jumpStep) {
        int step = 0;
        int backStep = 0;
        int j = 0;

        if (jumpStep >= game.length) {
            return true;
        }

        while (j < game.length) {
            if ( j >= game.length - 1) {
                return true;
            }

            if (game[j] == 0 && (j + jumpStep) >= game.length) {
                return true;
            }

            if (game[j] == 0 && game[j + jumpStep] == 0) {
                j += jumpStep;
                continue;
            }

            if (game[j+1] > 0) {
                step = jump(game, j, jumpStep);
                if (step == GAME_WIN) {
                    return true;
                }
                if (step == JUMP) {
                    j += jumpStep;
                    continue;
                }
                if (step == BACK) {
                    backStep = moveBack(game, j, jumpStep);
                    if (backStep == GAME_FAIL) {
                        return false;
                    }

                    if (backStep > 0) {
                        j = backStep;
                        continue;
                    }
                }
            }
            j++;
        }
        return true;
    }

    private static int jump(Integer[] game, Integer current, Integer jumpStep) {
        current = current + jumpStep;

        if (current > game.length - 1) {
            return GAME_WIN;
        }

        if (game[current] > 0) {
            return BACK;
        }

        return JUMP;
    }

    private static int moveBack(Integer[] game, Integer current, Integer jumpStep) {
        int step = 0;
        int backStep = 0;
        boolean hasCode = false;

        do {
            current -= 1;
            backStep++;
            step = current + jumpStep;
            if (current <= 0 || backStep >= jumpStep) {
                return GAME_FAIL;
            }
        } while ( !game[step].equals(game[current]) || (game[step] == 1 && game[current] == 1));

        backStep = current - jumpStep;
        if (backStep < 0) {
            for ( int i = 0; i < current; i++) {
                if (game[i] > 0) {
                    hasCode = true;
                }
            }
            if (hasCode) {
                return GAME_FAIL;
            } else {
                return step;
            }
        }

        int count = 0;
        while (backStep > 0) {
            if (count >= jumpStep) {
                return GAME_FAIL;
            }
            if (game[backStep] > 0 || game[current] > 0) {
                backStep -= 1;
                current -= 1;
                count++;
            }
            if (game[backStep] == 0 && game[current] == 0) {
                count = 0;
            }
        }

        return GAME_FAIL;
    }
}
