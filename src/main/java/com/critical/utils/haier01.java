package com.critical.utils;

import java.util.Scanner;

public class haier01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int l = Integer.parseInt(line[1]);
        int r = Integer.parseInt(line[2]);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int res = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] >= l && arr[i] <= r && arr[i] % 2 == 0){
                res++;
            }
        }
        System.out.println(res);
    }
}
