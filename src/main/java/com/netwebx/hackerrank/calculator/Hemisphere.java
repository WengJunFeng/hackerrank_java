package com.netwebx.hackerrank.calculator;

/**
 * Created by Jason on 1/24/17.
 */
public class Hemisphere extends Shape
{
    public Double get_volume(Double r) {
        return 2 * Math.PI * Math.pow(r, 3) / 3;
    }
}
