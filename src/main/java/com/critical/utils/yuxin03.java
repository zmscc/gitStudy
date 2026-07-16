package com.critical.utils;

import java.util.Scanner;

import java.util.Scanner;

public class yuxin03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String line = sc.next();
        StringBuilder sb = new StringBuilder(line);
        for (int i = 0; i < k; i++) {
            if (sb.length() == 0) {
                break;
            }
            if (sb.length() == 1 && sb.charAt(0) == '0') {
                break;
            }
            int index = 0;
            for (; index < sb.length(); index++) {
                if (sb.charAt(index) == '0') {
                    break;
                }
            }
            if (index < sb.length()) {
                sb = sb.delete(0, index);
                reverse(sb);
            } else {
                reverse(sb);
            }
        }
        System.out.println(sb.length() == 0 ? "0" : sb.toString());
    }
    public static void reverse(StringBuilder line) {
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == '0') {
                line.setCharAt(i, '1');
            } else {
                line.setCharAt(i, '0');
            }
        }
    }
}
