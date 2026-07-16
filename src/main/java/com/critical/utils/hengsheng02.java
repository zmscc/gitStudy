package com.critical.utils;

import java.util.Arrays;
import java.util.Scanner;

public class hengsheng02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        long[] preHelp = new long[n];
        int pre = 1;
        for (int i = 0; i < n; i++){
            pre = pre * arr[i];
            preHelp[i] = pre;
        }
        long[] postHelp = new long[n];
        int post = 1;
        for (int i = n - 1; i >= 0; i--){
            post = post * arr[i];
            postHelp[i] = post;
        }
        int res = 0;
        for(int i = 0; i < n; i++){
            long sqrt = (long) Math.sqrt(preHelp[i]);
            if(sqrt * sqrt == preHelp[i]){
                res = Math.max(res, i+1);
            }
        }
        for(int i = n - 1; i >= 0; i--){
            long sqrt = (long) Math.sqrt(postHelp[i]);
            if(sqrt * sqrt == postHelp[i]){
                res = Math.max(res, n - i);
            }
        }
        if(res == 0){
            System.out.println(-1);
        }else {
            System.out.println(res);
        }
    }
}
