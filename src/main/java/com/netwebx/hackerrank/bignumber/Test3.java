package com.netwebx.hackerrank.bignumber;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Jason on 2/16/17.
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        // Write your code here.

        if (!n.isProbablePrime(10)) {
            System.out.println("not prime");
        } else {
            System.out.println("prime");
        }
    }
}
