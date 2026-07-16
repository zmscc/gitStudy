package com.critical.utils;

import java.util.Scanner;

public class jinshan02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long res = 1;
        for(int i = n ; i > 0; i--){
            res = res * i;
        }
        String s = String.valueOf(res);
        int result = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '0'){
                result++;
            }else{
                break;
            }
        }
        System.out.println(result);
    }
}
