package com.netwebx.hackerrank.string;

import java.util.Scanner;

/**
 * Created by Jason on 2/9/17.
 */
public class Test6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        boolean hasAlphabetic = true;
        int tokenCount = 0;
        StringBuilder tmp = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i);
             if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                 if(i == 0 || (i > 0 && !hasAlphabetic)) {
                     tokenCount++;
                 }
                 hasAlphabetic = true;
                 tmp.append(s.substring(i, i+1));
                 continue;
             }

             if (c == 0x20 || c == 0x21 || c == 0x2C || c == 0x3F || c == 0x2E || c == 0x5F || c == 0x27 || c == 0x40) {
                 if (!hasAlphabetic) {
                    continue;
                 }
                 hasAlphabetic = false;
                 if (i != 0 && i != (s.length() - 1)) {
                     tmp.append("_");
                 }
             }
        }
        scan.close();
        String[] result = tmp.toString().split("_");
        System.out.println("String " + tmp.toString());
        System.out.println(tokenCount);
        System.out.println(result.length);
        for(int i = 0; i < result.length; i++) {
            if (result[i].isEmpty()) {
                continue;
            }
            System.out.println(result[i]);
        }
    }
}
