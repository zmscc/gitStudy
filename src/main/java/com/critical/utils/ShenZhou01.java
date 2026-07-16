package com.critical.utils;

import java.util.*;

public class ShenZhou01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[26];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'A']++;
        }
        int res = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 0){
                res += 'A' + i;
            }
        }
        System.out.println(res);
    }
}
