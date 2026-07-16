package com.critical.utils;

import java.util.*;
public class haier02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr.length == 1){
            System.out.println(1);
        }
        if(arr.length == 2){
            if(arr[1] - arr[0] <= 20){
                System.out.println(1);
                return;
            }else {
                System.out.println(2);
                return;
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if(arr.length > i+2){
                if(arr[i+2] - arr[i] <= 20){
                    res++;
                    i = i+2;
                    continue;
                }
            }
            if(arr.length > i+1){
                if(arr[i+1] - arr[i] <= 20){
                    res++;
                    i = i+1;
                    continue;
                }
            }
            res++;
        }
        System.out.println(res);
    }
}
//1 11 12 13