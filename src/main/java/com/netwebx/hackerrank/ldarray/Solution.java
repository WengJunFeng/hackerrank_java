package com.netwebx.hackerrank.ldarray;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseCnt = getCaseCount(scanner);
        int jumpStep, arrayLength;

        for(int i = 0; i < caseCnt; i++) {
            System.out.print(i);
            arrayLength = getArrayLength(scanner);
            jumpStep = getJumpStep(scanner);
            scanner.nextLine();

            if (jumpStep > arrayLength) {
                System.out.println("YES");
                continue;
            }

            if (play(arrayLength, jumpStep, scanner)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            if (!scanner.hasNext()) {
                break;
            }
        }
        scanner.close();


    }

    private static boolean play(int arrayLength, int jumpStep, Scanner scanner) {
        BitSet oneDArray;
        BitSet stepMask;
        oneDArray = new BitSet(arrayLength);
        stepMask = new BitSet(jumpStep);
        stepMask.set(0, jumpStep, true);

        for(int j = 0; j < arrayLength; j++) {
            if (Integer.parseInt(scanner.next()) > 0) {
                oneDArray.set(j, true);
            } else {
                oneDArray.set(j, false);
            }
        }

        int j = 1;
        while ( j < arrayLength ) {
            int toIndex = j + jumpStep;
            BitSet part = oneDArray.get(j, toIndex);
            BitSet temp = oneDArray.get(j, toIndex);
            part.xor(stepMask);

            if (part.isEmpty()) {
                return false;
            }

            if (part.get(jumpStep -1)) {
                j = toIndex;
                continue;
            }
            if (part.get(0) && !part.get(jumpStep - 1)) {
                j++;
                continue;
            }

            if (!part.get(0) && !part.get(jumpStep - 1)) {
                for(int n = temp.length() - 1; n >= 0; n--) {
                    if (!temp.get(n)) {
                        int backStep = jumpStep - 1 - n;
                        int from = j - backStep - 1;
                        if (from < 2) {
                            return false;
                        }
                        if (backStep > 1) {
                            BitSet tmp = oneDArray.get(from, j);
                            if (tmp.isEmpty()) {
                                j = from;
                            } else {
                                return false;
                            }
                        } else {
                            if (!oneDArray.get(from)) {
                                j = from;
                            } else {
                                return false;
                            }
                        }
                        break;
                    }
                }
                continue;
            }
            j++;
        }
        return true;
    }

    private static int getJumpStep(Scanner scanner) {
        int jumpStep = 0;
        if (scanner.hasNext()) {
            jumpStep = Integer.parseInt(scanner.next());
        }
        return jumpStep;
    }

    private static int getArrayLength(Scanner scanner) {
        int arrayLength = 0;
        if (scanner.hasNext()) {
            arrayLength = Integer.parseInt(scanner.next());
        }
        return arrayLength;
    }

    private static int getCaseCount(Scanner scanner) {
        int caseNum = 0;
        if (scanner.hasNext()) {
            caseNum = scanner.nextInt();
            scanner.nextLine();
        }
        return caseNum;
    }
}