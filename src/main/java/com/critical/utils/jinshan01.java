package com.critical.utils;

import java.util.*;


import java.util.*;

public class jinshan01 {
    static List<Integer>[] graph;
    static boolean[] visited;
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int s = sc.nextInt();

        graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            graph[x].add(y);
            graph[y].add(x);
        }
        visited = new boolean[n + 1];
        int days = 1;
        markVisited(s);

        while (true) {
            int next = findFarthest();
            if (next == -1) break;
            markVisited(next);
            days++;
        }

        System.out.println(days);
    }
    static void markVisited(int u) {
        visited[u] = true;
        for (int v : graph[u]) {
            visited[v] = true;
        }
    }
    static int findFarthest() {
        for (int i = n; i >= 1; i--) {
            if (!visited[i]) {
                return i;
            }
        }
        return -1;
    }
}
