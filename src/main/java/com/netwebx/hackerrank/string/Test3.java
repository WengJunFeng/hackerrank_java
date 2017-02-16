package com.netwebx.hackerrank.string;

import java.util.Scanner;

/**
 * Created by Jason on 2/9/17.
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int k = scanner.nextInt();
        int stringArraySize = S.length() - k + 1;
        String[] seperatedString = new String[stringArraySize];
        int counter = 0;
        int endIndex = 0;
        String maxS, minS;

        for ( int i = 0; i < stringArraySize; i++) {
            endIndex = i + k;
            if (endIndex > S.length()) {
                endIndex = S.length();
            }
            String tmp = S.substring(i, endIndex);
            seperatedString[counter++] = tmp;
        }

        maxS = seperatedString[0];
        minS = seperatedString[0];
        for (int i = 1; i < seperatedString.length; i++ ) {
            if ( compareString(maxS, seperatedString[i]) < 0) {
                maxS = seperatedString[i];
            }

            if ( compareString(minS, seperatedString[i]) > 0) {
                minS = seperatedString[i];
            }
        }

        System.out.println(minS);
        System.out.println(maxS);
    }

    private static int compareString(String needle, String compareTo) {
        int needleLength = needle.length();
        int compareToLength = compareTo.length();
        int navLength = (needleLength >= compareToLength) ? compareToLength : needleLength;
        char needleChar, compareToChar;

        for( int i = 0; i < navLength; i++) {
            needleChar = needle.charAt(i);
            compareToChar = compareTo.charAt(i);

            if (needleChar > compareToChar) {
                return 1;
            }

            if (needleChar < compareToChar) {
                return -1;
            }
        }

        if (needleLength > compareToLength) {
            return 1;
        }
        if (needleLength < compareToLength) {
            return -1;
        }
        return 0;
    }
}
