package com.critical.utils;

import java.util.Scanner;

public class ShenZhou02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i = 0 ; i < t; i++){
            String S = sc.nextLine();
            String T = sc.nextLine();
            String twoS = S + S;
            if(twoS.contains(T) && S.length() == T.length()){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
