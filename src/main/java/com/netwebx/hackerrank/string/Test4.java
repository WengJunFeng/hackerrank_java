package com.netwebx.hackerrank.string;

import java.util.Scanner;

/**
 * Created by Jason on 2/9/17.
 */
public class Test4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        int forwardPoint = 0;
        int backwardPoint = A.length() - 1;
        int moveStep = 0;
        char forwardChar, backwardChar;

        while (moveStep < A.length()) {
            forwardChar = A.charAt(forwardPoint++);
            backwardChar = A.charAt(backwardPoint--);

            if (forwardChar != backwardChar) {
                System.out.print("No");
                return;
            }
            moveStep++;
        }

        System.out.print("Yes");

    }
}
