package com.netwebx.hackerrank.generics;

/**
 * Created by apple on 2017/2/26.
 */
public class Test2<T> {
    private T a, b, c;
    public Test2(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(T a) {
        this.a = a;
    }

    public void setB(T b) {
        this.b = b;
    }

    public void setC(T c) {
        this.c = c;
    }

    public T getA() {
        return this.a;
    }

    public T getB() {
        return this.b;
    }

    public T getC() {
        return this.c;
    }

    public static void main(String[] args) {
        Test2<String> t = new Test2<>("This", "is", "Test2");
        System.out.println(t.getA());
        System.out.println(t.getB());
        System.out.println(t.getC());
    }
}
