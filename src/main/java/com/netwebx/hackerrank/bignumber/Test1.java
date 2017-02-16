package com.netwebx.hackerrank.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Jason on 2/16/17.
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger a = scanner.nextBigInteger();
        scanner.nextLine();
        BigInteger b = scanner.nextBigInteger();

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
