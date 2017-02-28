package com.netwebx.hackerrank.generics;

/**
 * Created by apple on 2017/2/27.
 */
public class SixTuple <A, B, C, D, E, F> extends FiveTuple<A, B, C, D, E>{
    public final F sixth;

    public SixTuple(A a, B b, C c, D d, E e, F f) {
        super(a, b, c, d, e);
        this.sixth = f;
    }

    public String toString() {
        return "(" + this.first + ", " + this.second + ", " + this.third + ", " + this.fourth + ", " +
                this.fifth + ", " + this.sixth + ")";
    }
}
