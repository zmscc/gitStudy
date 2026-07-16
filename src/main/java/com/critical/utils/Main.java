package com.critical.utils;

import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int x = sc.nextInt();
            System.out.println(solution(x));
        }
    }

    public static String solution(int x) {
        for (int i = 3; i <= 50; i++) {
            long left = 1;
            long right = (long) Math.sqrt(x) + 100;
            while (left <= right) {
                long mid = left + (right - left) / 2;
                long product = 1;
                boolean flag = false;
                for (int j = 0; j < i; j++) {
                    if (product > x / (mid + j)) {
                        flag = true;
                        break;
                    }
                    product *= (mid + j);
                }
                if (flag || product > x) {
                    right = mid - 1;
                } else if (product < x) {
                    left = mid + 1;
                }else {
                    return "YES";
                }
            }
        }
        return "NO";
    }
}