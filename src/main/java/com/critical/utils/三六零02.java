package com.critical.utils;

import java.util.Scanner;

import java.util.*;

public class 三六零02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            char[] a = new char[n + 2];
            a[0] = 'L';
            a[n + 1] = 'L';
            for (int i = 1; i <= n; i++) {
                a[i] = s.charAt(i - 1);
            }

            boolean[] vis = new boolean[n + 2];
            Queue<int[]> q = new LinkedList<>();
            q.add(new int[]{0, k});
            vis[0] = true;
            boolean found = false;

            while (!q.isEmpty()) {
                int[] cur = q.poll();
                int pos = cur[0];
                int remain = cur[1];

                if (pos == n + 1) {
                    found = true;
                    break;
                }

                for (int i = 1; i <= m && pos + i <= n + 1; i++) {
                    int next = pos + i;
                    if (a[next] == 'C') continue;

                    if (a[next] == 'L') {
                        if (!vis[next]) {
                            vis[next] = true;
                            q.add(new int[]{next, remain});
                        }
                    } else if (a[next] == 'W') {
                        int swim = 0;
                        int j = next;
                        while (j <= n + 1 && a[j] == 'W' && swim <= remain) {
                            if (j + 1 <= n + 1 && a[j + 1] == 'C') break;
                            if (a[j] == 'W') swim++;
                            if (swim > remain) break;

                            if (j + 1 <= n + 1 && a[j + 1] == 'L') {
                                if (!vis[j + 1]) {
                                    vis[j + 1] = true;
                                    q.add(new int[]{j + 1, remain - swim});
                                }
                                break;
                            }
                            j++;
                        }
                    }
                }
            }

            System.out.println(found ? "YES" : "NO");
        }
    }
}
