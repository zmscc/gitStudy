package com.critical.utils;

import java.util.Scanner;

import java.util.Scanner;

import java.util.*;

public class 三六零01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String[] s = sc.nextLine().split(" ");
            String[] f = s[0].split("/");
            String[] t = s[1].split("/");

            String a = f[0], b = f[1];
            String c = t[0], d = t[1];

            if (check(a, c) && check(b, d) && del(a, c).equals(del(b, d))) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    static boolean check(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) j++;
            i++;
        }
        return j == t.length();
    }

    static String del(String s, String t) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) != t.charAt(j)) sb.append(s.charAt(i));
            else j++;
            i++;
        }
        while (i < s.length()) {
            sb.append(s.charAt(i));
            i++;
        }
        return sb.toString();
    }
}