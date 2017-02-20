package com.netwebx.hackerrank.ldarray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Jason on 2/17/17.
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer numberOfArray = scanner.nextInt();

        ArrayList<Integer[]> containerArray = new ArrayList<>();

        for (int i = 0; i < numberOfArray; i++) {
            Integer n = scanner.nextInt();
            Integer[] arrInteger = new Integer[n];
            for (int j = 0; j < n; j++) {
                arrInteger[j] = scanner.nextInt();
            }
            containerArray.add(arrInteger);
        }

        Integer numberOfCheck = scanner.nextInt();
        for (int i = 0; i < numberOfCheck; i++) {
            Integer k = scanner.nextInt() - 1;
            Integer m = scanner.nextInt() - 1;
            try {
                Integer[] tmp = containerArray.get(k);
                System.out.println(tmp[m]);

            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }

    public static void main1(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList[] list = new ArrayList[20002];
        int n;
        n = scan.nextInt();
        for (int i = 1; i <= n; i++) {

            list[i] = new ArrayList();
            int x = scan.nextInt();

            for (int j = 1; j <= x; j++) {
                int val = scan.nextInt();
                list[i].add(val);

            }
        }
        int q = scan.nextInt();

        for (int i = 1; i <= q; i++) {
            int x, y;
            x = scan.nextInt();
            y = scan.nextInt();
            try {
                System.out.println(list[x].get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}
