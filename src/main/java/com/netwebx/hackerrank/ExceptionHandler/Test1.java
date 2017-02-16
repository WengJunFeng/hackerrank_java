package com.netwebx.hackerrank.ExceptionHandler;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Jason on 2/16/17.
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            Integer a = scanner.nextInt();
            Integer b = scanner.nextInt();

            System.out.printf("%d%n", a / b);

        } catch (InputMismatchException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e ) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}
