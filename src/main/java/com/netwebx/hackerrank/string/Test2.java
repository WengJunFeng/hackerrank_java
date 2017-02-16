package com.netwebx.hackerrank.string;

import java.util.Scanner;

/**
 * Created by Jason on 2/9/17.
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        int charSize = end - start + 1;
        char[] ch = new char[charSize];
        int charIndex = 0;

        for(int i = start; i < end; i++) {
            ch[charIndex++] = S.charAt(i);
        }

        String output = new String(ch);

        System.out.println(output);
    }
}
