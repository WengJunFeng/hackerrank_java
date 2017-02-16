package com.netwebx.hackerrank.calculator;

/**
 * Created by Jason on 1/24/17.
 */
public class Volume
{
    public int get_volume(int a) {
        return a * a * a;
    }

    public int get_volume(int l, int b, int h) {
        return l * b * h;
    }

    public Double get_volume(Double r) {
        return 2 * Math.PI * Math.pow(r, 3) / 3;
    }

    public Double get_volume(Double r, Double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }
}
