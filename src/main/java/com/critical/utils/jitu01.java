package com.critical.utils;

import java.util.Scanner;

public class jitu01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int n = sc.nextInt();
            for (int j = 0; j <= n; j++) {
                if(j != n){
                    System.out.println(j + " ");
                }else {
                    System.out.println(j);
                }
            }
            System.out.println();
        }
    }
}
