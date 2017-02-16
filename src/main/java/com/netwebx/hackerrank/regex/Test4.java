package com.netwebx.hackerrank.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jason on 2/10/17.
 */
public class Test4 {
    private static boolean hasFound = false;
    public static void main(String[] args){

        //Scanner in = new Scanner(System.in);
        //int testCases = Integer.parseInt(in.nextLine());
        //while(testCases>0){
         //   hasFound = false;
          //  String line = in.nextLine();
           // checkTags(line);
            //if (!hasFound) {
             //   System.out.println("None");
            //}
            //testCases--;
        //}
        solution();
    }

    private static boolean checkTags(String line) {
        String pattern = "<(.+?)>(.+)</\\1>";
        Pattern p = Pattern.compile(pattern);

        Matcher m = p.matcher(line);
        boolean found = false;
        while (m.find()) {
            found = true;
            if (!checkTags(m.group(2))) {
                String pattern1 = "[<>]+";
                Pattern p1 = Pattern.compile(pattern1);
                Matcher m1 = p1.matcher(m.group(2));
                if (!m1.find()) {
                    System.out.println(m.group(2));
                    hasFound = true;
                } else {
                    found = false;
                }
            }
        }

        return found;
    }

    private static void solution() {
        String pattern = "<([^>]+)>([^<>]+)</\\1>";
        Pattern r = Pattern.compile(pattern);

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases > 0){
            String line = in.nextLine();

            Matcher m = r.matcher(line);
            boolean findMatch = false;
            while(m.find( )){
                System.out.println(m.group(2));
                findMatch = true;
            }
            if(!findMatch) {
                System.out.println("None");
            }
            testCases--;
        }
    }
}
