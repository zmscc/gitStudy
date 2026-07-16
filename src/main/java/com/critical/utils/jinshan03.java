package com.critical.utils;

import java.util.Arrays;
import java.util.Scanner;

public class jinshan03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dp[] = new int[n+1];
//        dp[j]:组成j的最少完全平方数之和
//        装满背包最少的物品数
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int j = 1; j <= n; j++){
            for (int i = 1; i * i <= n; i++) {
                if(j >= i*i && dp[j - i*i] != Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j], dp[j-i*i]+1);
                }
            }
        }
        System.out.println(dp[n]);
    }
}
