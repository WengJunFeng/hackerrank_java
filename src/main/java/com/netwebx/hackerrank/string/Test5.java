package com.netwebx.hackerrank.string;

import java.util.Scanner;

/**
 * Created by Jason on 2/9/17.
 */
public class Test5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    private static boolean isAnagram(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();

        if (aLength != bLength) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] aChars = sort(a.toCharArray());
        char[] bChars = sort(b.toCharArray());

        for ( int i = 0; i < aLength; i++ ) {
            if (aChars[i] != bChars[i]) {
                return false;
            }
        }
        return true;
    }

    private static char[] sort(char[] chars) {
        for(int i = 0; i < chars.length - 1; i++) {
            for(int j = 0; j < chars.length - i - 1; j++) {
                if (chars[j] > chars[j+1]) {
                    char tmp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = tmp;
                }
            }

            //System.out.print("第" + (i + 1) + "次排序结果：");
            //for(int a = 0; a < chars.length; a++) {
                //System.out.print(chars[a] + "\t");
            //}
            //System.out.println("");
        }
        return chars;
    }
}
