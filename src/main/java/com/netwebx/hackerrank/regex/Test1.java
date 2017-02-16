package com.netwebx.hackerrank.regex;

import java.util.Scanner;

/**
 * Created by Jason on 2/10/17.
 */
public class Test1 {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }
}
