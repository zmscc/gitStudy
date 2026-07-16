package com.critical.utils;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0 ; j < t; j++) {
            int[] params = new int[5];
            for (int i = 0; i < 5; i++) {
                params[i] = sc.nextInt();
            }
            int x = params[0];
            int y = params[1];
            int[] arr = new int[]{params[2], params[3], params[4]};
            System.out.println(process(arr, x, y));
        }
    }

    public static int process(int[] arr, int x, int y) {
        if (x > 0 && y > 0 && x != 0 && y != 0) {
            //单点步数
            int singleStep = (x + y) * arr[0];
            //联动+单点
            int linkStep = Math.min(x, y) * arr[1] + Math.abs(x - y) * arr[0];
            return Math.min(singleStep, linkStep);
        }
        if (x < 0 && y < 0 && x != 0 && y != 0) {
            int absX = Math.abs(x);
            int absY = Math.abs(y);
            int singleStep = (absX + absY) * arr[0];
            int linkStep = Math.min(absX, absY) * arr[1] + Math.abs(absX - absY) * arr[0];
            return Math.min(singleStep, linkStep);
        }
        if (x < 0 && y > 0 && x != 0 && y != 0) {
            int singleStep = (y - x) * arr[0];
            //平衡+单点
            int balanceStep = Math.min(Math.abs(x), y) * arr[2] + Math.abs(y - Math.abs(x)) * arr[0];
            return Math.min(singleStep, balanceStep);
        }
        if (x > 0 && y < 0 && x != 0 && y != 0) {
            int singleStep = (x - y) * arr[0];
            //平衡+单点
            int balanceStep = Math.min(x, Math.abs(y)) * arr[2] + Math.abs(x - Math.abs(y)) * arr[0];
            return Math.min(singleStep, balanceStep);
        }
        return Math.abs(x) * arr[0] + Math.abs(y) * arr[0];
    }
}
