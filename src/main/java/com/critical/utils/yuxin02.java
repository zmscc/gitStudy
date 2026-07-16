package com.critical.utils;

import java.util.Scanner;

public class yuxin02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int help[] = new int[ m + 1];
        for(int j = 0; j < n; j++){
            int k = sc.nextInt();
            int c = sc.nextInt();
            int arr[] = new int[k];
            for(int i = 0; i < k - 1; i++){
                arr[i] = sc.nextInt();
            }
            int spend = (c + k - 1) / k;
            for(int i = 0; i < k - 1; i++){
                help[arr[i]] += spend;
            }
        }
        for(int i = 1; i <= m; i++){
            System.out.print(help[i] + " ");
        }
    }
}
