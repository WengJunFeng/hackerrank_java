package com.netwebx.hackerrank.bignumber;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Jason on 2/16/17.
 */
public class Test2 {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                BigDecimal a = new BigDecimal(s[j]);
                BigDecimal b = new BigDecimal(s[j+1]);
                if (a.compareTo(b) < 0) {
                    String tmp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = tmp;
                }
            }
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

    public static void test1(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String []s = new String[n+2];
        for(int i = 0;i < n;i++){
            s[i] = sc.next();
        }

        for(int i = 0;i<n;i++){
            BigDecimal max = new BigDecimal(s[i]);
            int idx = i;
            for(int j = i+1;j<n;j++)
            {
                BigDecimal curr = new BigDecimal(s[j]);
                if(curr.compareTo(max) == 1){
                    max=curr;
                    idx=j;
                }
            }
            String temp = s[i];
            s[i] = s[idx];
            s[idx] = temp;
        }

        for(int i = 0;i<n;i++){
            System.out.println(s[i]);
        }

    }
}
