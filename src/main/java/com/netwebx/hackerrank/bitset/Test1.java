package com.netwebx.hackerrank.bitset;

import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by Jason on 2/16/17.
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = Integer.parseInt(scanner.next());
        Integer m = Integer.parseInt(scanner.next());

        BitSet B1 = new BitSet(n);
        BitSet B2 = new BitSet(n);

        String operation;
        Integer a, b;
        while(scanner.hasNext()) {
            operation = scanner.next();
            a = Integer.parseInt(scanner.next());
            b = Integer.parseInt(scanner.next());

            if (operation.equals("AND")) {
                if (a.equals(1)) {
                    B1.and(B2);
                } else {
                    B2.and(B1);
                }
            }

            if (operation.equals("SET")) {
                if (a.equals(1)) {
                    B1.set(b);
                } else {
                    B2.set(b);
                }
            }

            if (operation.equals("FLIP")) {
                if (a.equals(1)) {
                    B1.flip(b);
                } else {
                    B2.flip(b);
                }
            }

            if (operation.equals("OR")) {
                if (a.equals(1)) {
                    B1.or(B2);
                } else {
                    B2.or(B1);
                }
            }

            if (operation.equals("XOR")) {
                if (a.equals(1)) {
                    B1.xor(B2);
                } else {
                    B2.xor(B1);
                }
            }

            System.out.printf("%d %d%n", howmanySet(B1), howmanySet(B2));
        }
    }

    private static BitSet convert(long value) {
        BitSet bits = new BitSet();
        int index = 0;
        while (value != 0L) {
            if (value % 2L != 0) {
                bits.set(index);
            }
            ++index;
            value = value >>> 1;
        }
        return bits;
    }

    private static long convert(BitSet bits) {
        long value = 0L;
        int count = 0;
        for (int i = bits.length() - 1; i >= 0; i--) {
            value += bits.get(i) ? (1L << count) : 0L;
            count++;
        }
        return value;
    }

    private static int howmanySet(BitSet bits) {
        int count = 0;
        for (int i = 0; i < bits.length(); i++) {
            if (bits.get(i)) {
                count++;
            }
        }

        return count;
    }
}
