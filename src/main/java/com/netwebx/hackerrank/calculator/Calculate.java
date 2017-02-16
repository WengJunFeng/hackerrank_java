package com.netwebx.hackerrank.calculator;

import java.io.IOException;
import java.util.Scanner;

/**
 * You are given a class Solution and its main method in the editor.
 * In each test cases, it takes an input  which represents a choice of the following:
 * ch=1
 * represents the volume of a cube that has to be calculated where "a" represents the length of the sides of the cube.
 * ch=2
 * represents the volume of a cuboid that has to be calculated where "l","b","h" represent the dimensions of a cuboid.
 * ch=3
 * represents the volume of a hemisphere that has to be calculated where "r" represents the radius of a hemisphere.
 * ch=4
 * represents the volume of a cylinder that has to be calculated where "r","h" represent the radius and height of
 * the cylinder respectively.
 */
public class Calculate
{
    private Scanner scanner;
    public Display output;

    public Calculate() throws IOException {
        scanner = new Scanner(System.in);
        Display output = new Display();
    }

    public Integer get_int_val() {
        int v = scanner.nextInt();
        if (v <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return v;
    }

    public Double get_double_val() {
        double v = scanner.nextDouble();
        if (v <= 0) {
            throw new NumberFormatException("All the values must be positive");
        }
        return v;
    }

    public static Volume do_calc() {
        return new Volume();
    }
}
