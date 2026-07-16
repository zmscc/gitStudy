package com.critical.utils;

import java.util.Scanner;

import java.util.*;

public class wangyi031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        long result = 0;
        int buyDay = -1;

        for(int i = 0; i < n; i++){
            if(buyDay == -1){
                // 寻找买入机会
                if(i < n-1 && arr[i+1] > arr[i] + 2*k + m){
                    buyDay = i;
                }
            } else {
                // 寻找卖出机会
                if(arr[i] > arr[buyDay] + 2*k + m*(i-buyDay)){
                    result += arr[i] - arr[buyDay] - 2*k - m*(i-buyDay);
                    buyDay = -1;
                }
            }
        }

        System.out.println(result + (long) m * n);
    }
}
