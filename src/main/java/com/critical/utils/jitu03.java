package com.critical.utils;

import java.util.Scanner;

public class jitu03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        long k = sc.nextLong();
        long res = 0;
        long temp = 0;
        long postNum = n - k;
        for(long i = 1; i <= postNum; i++){
            temp = temp + i;
        }
        long u = postNum - k + 1;
        res = u + k - 1;
        System.out.println(res);
    }
}
