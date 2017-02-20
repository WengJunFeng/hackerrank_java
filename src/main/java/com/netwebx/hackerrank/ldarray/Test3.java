package com.netwebx.hackerrank.ldarray;

import java.util.Scanner;

/**
 * Created by Jason on 2/17/17.
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        int negative_count = 0;
        while (count < n) {
            for (int i = count; i < n; i++) {
                int tmp = 0;
                for (int j = count; j < i + 1; j++) {
                    tmp += arr[j];
                }
                if (tmp < 0) {
                    negative_count++;
                }
            }
            count++;
        }

        System.out.println(negative_count);
    }

    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for(int i = 0;i < n;i++){
            a[i] = scan.nextInt();
        }
        scan.close();

        int numNegativeSubarrays = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {

                int sum = 0;

                for(int k = i; k <= j; k++) {
                    sum = sum + a[k];
                }

                if(sum < 0) {
                    numNegativeSubarrays++;
                }
            }
        }

        System.out.println(numNegativeSubarrays);
    }
}
