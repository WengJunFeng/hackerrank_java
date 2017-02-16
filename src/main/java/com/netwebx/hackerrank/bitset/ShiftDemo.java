package com.netwebx.hackerrank.bitset;

/**
 * Created by Jason on 1/26/17.
 */
public class ShiftDemo
{
    public static void main(String[] args) {
        int i = -1;
        System.out.printf("%32s ---- Integer%n", Integer.toBinaryString(i));
        i >>>= 10;
        System.out.printf("%32s ---- Integer, After Shift%n", Integer.toBinaryString(i));

        long l = -1;
        System.out.printf("%64s ---- Long%n", Long.toBinaryString(l));
        l >>>= 10;
        System.out.printf("%64s ---- Long, After Shift%n", Long.toBinaryString(l));

        short s = -1;
        System.out.printf("%32s ---- Short%n", Integer.toBinaryString(s));
        s >>>= 10;
        System.out.printf("%32s ---- Short, After Shift%n", Integer.toBinaryString(s));

        byte b = -1;
        System.out.printf("%32s ---- Byte%n", Integer.toBinaryString(b));
        b >>>= 10;
        System.out.printf("%32s ---- Byte, After Shift%n", Integer.toBinaryString(b));
        b = -1;
        System.out.printf("%32s ---- Byte%n", Integer.toBinaryString(b));
        System.out.printf("%32s ---- Byte, After Shift%n", Integer.toBinaryString(b>>>10));

        long ll = 0xffffffffffffffffL;
        System.out.printf("%64s%n", Long.toBinaryString(ll));
        System.out.printf("%64s%n", Long.toBinaryString( -60 & 0b111111));
        long startMask = ll << 5;
        long endMask = ll >>> -60;
        long mask = startMask & endMask;
        System.out.printf("%64s%n", Long.toBinaryString(startMask));
        System.out.printf("%64s%n", Long.toBinaryString(endMask));
        System.out.printf("%64s%n", Long.toBinaryString(mask));

        int bit_per_word = 1 << 6;
        System.out.printf("%32s%n", Integer.toBinaryString(bit_per_word));
        int bit_index_mask = bit_per_word - 1;
        System.out.printf("%32s%n", Integer.toBinaryString(bit_index_mask));

    }
}
