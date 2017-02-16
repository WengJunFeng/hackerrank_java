package com.netwebx.hackerrank.string;

import java.util.Scanner;

/**
 * Created by Jason on 2/9/17.
 */
public class Test1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int aLength = A.length();
        int bLength = B.length();
        int navLength = (aLength >= bLength) ? bLength : aLength;
        int totalLength = aLength + bLength;
        char aChar, bChar;
        int sameCount = 0;

        System.out.println(totalLength);

        for(int i = 0; i < navLength; i++) {
            aChar = A.charAt(i);
            bChar = B.charAt(i);

            if (aChar > bChar) {
                System.out.println("Yes");
                break;
            }

            if (aChar < bChar) {
                System.out.println("No");
                break;
            }

            if (aChar == bChar) {
                sameCount++;
            }
        }

        if (sameCount == navLength) {
            if (bLength >= aLength) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }

        System.out.printf("%s %s", upperCase(A), upperCase(B));
    }

    private static String upperCase(String str) {
        char[] ch = str.toCharArray();
        if (ch[0] >= 'a' && ch[0] <= 'z') {
            ch[0] = (char) (ch[0] - 32);
        }
        return new String(ch);
    }
}
