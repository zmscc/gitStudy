package com.critical.utils;

import java.util.Arrays;
import java.util.Scanner;

public class jitu02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int res = 1;
        int dp[] = new int[line.length()];
        Arrays.fill(dp, 1);
        for(int i = 1 ; i < line.length(); i++){
            if(line.charAt(i) == line.charAt(i-1)){
                dp[i] = dp[i-1] + 1;
                res = Math.max(res, dp[i]);
            }
        }
        if(res == line.length()){
            System.out.println(res);
            return;
        }
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i) == line.charAt(line.length() - 1)){
                dp[line.length() - 1] = dp[line.length() - 1] + 1;
                res = Math.max(res, dp[line.length() - 1]);
            }else {
                break;
            }
        }
        System.out.println(res);
    }
}
