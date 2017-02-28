package com.netwebx.hackerrank.generics;

/**
 * Created by apple on 2017/2/27.
 */
public class FiveTuple <A, B, C, D, E> extends FourTuple<A, B, C, D>{
    public final E fifth;

    public FiveTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        this.fifth = e;
    }

    public String toString() {
        return "(" + this.first + ", " + this.second + ", " + this.third + ", " + this.fourth + ", " + this.fifth + ")";
    }
}
