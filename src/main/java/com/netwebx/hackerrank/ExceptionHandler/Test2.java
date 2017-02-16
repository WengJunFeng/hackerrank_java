package com.netwebx.hackerrank.ExceptionHandler;

import java.util.Scanner;

/**
 * Created by Jason on 2/16/17.
 */
public class Test2 {
    static class MyCalculator {
        public MyCalculator() {
        }
        public long power(int n, int p) throws Exception{
            if (n < 0 || p < 0) {
                throw new Exception("n and p should be non-negative");
            }

            long result = (long) Math.pow(n, p);
            return  result;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while ( in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            MyCalculator my_calculator = new MyCalculator();
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
