package com.netwebx.hackerrank.calculator;

/**
 * Created by Jason on 1/24/17.
 */
public class Cylinder extends Shape
{
    public Double get_volume(Double r, Double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }
}
