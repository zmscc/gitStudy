package com.critical.utils;

import java.util.Scanner;

public class wangyi03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int hold = Integer.MIN_VALUE ;
        int notHold = 0;
        for(int i = 0; i < n; i++){
            int preHold = hold;
            int preNotHold = notHold;
            hold = Math.max(hold, preNotHold - arr[i] - k);
            notHold = Math.max(notHold, preHold + arr[i] - k - m);
            notHold = Math.max(notHold, preHold + arr[i]);
        }
        System.out.println(notHold);
    }
}

