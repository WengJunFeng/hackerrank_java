package com.netwebx.hackerrank.generics;

/**
 * Created by apple on 2017/2/26.
 */
public class Holder3<T extends Pet> {
    private T a;
    public  Holder3(T a) {
        this.a = a;
    }

    public void set(T a) {
        this.a = a;
    }

    public T get() {
        return this.a;
    }
}
