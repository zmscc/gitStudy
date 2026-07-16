package com.critical.utils;

import java.util.Scanner;

public class MainRedBook02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int MAX = 500001;
        int[] cnt = new int[MAX];
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a < MAX) cnt[a]++;
        }
        int[] multiples = new int[MAX];
        for (int i = 1; i < MAX; i++) {
            for (int j = i; j < MAX; j += i) {
                multiples[i] += cnt[j];
            }
        }
        int[] divisors = new int[MAX];
        for (int i = 1; i < MAX; i++) {
            for (int j = i; j < MAX; j += i) {
                divisors[j] += cnt[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int res = multiples[x] + divisors[x] - cnt[x];
            sb.append(res).append("\n");
        }
        System.out.print(sb);
    }
}

