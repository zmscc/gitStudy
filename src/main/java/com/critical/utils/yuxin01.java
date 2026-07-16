package com.critical.utils;

import java.util.Scanner;

public class yuxin01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int t = 0; t < T; t++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            for(int i = 1 ; i <= n; i++){
                a += b;
            }
            System.out.println(a);
        }
    }
}
