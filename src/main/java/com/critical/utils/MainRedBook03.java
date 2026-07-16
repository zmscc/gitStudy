package com.critical.utils;

import java.util.Scanner;

public class MainRedBook03 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }

        int res = 0;
        for (int i = 0; i < n; i++){
            long maxSum = Long.MIN_VALUE;
            long curSum = 0;
            for(int j = i; j < n; j++){
                curSum += a[j];
                maxSum = Math.max(maxSum, curSum);
                if (maxSum == k){
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}

