package com.critical.utils;

import java.util.Scanner;
import java.util.*;

public class migu01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i = 0; i < T; i++){
            int n = sc.nextInt();
//            sc.nextLine();
            Stack<String> stack = new Stack<>();
            boolean flag = true;
            for(int j = 0; j < n; j++){
                String line = sc.nextLine();
                if(line.startsWith("end")){
                    String name = line.substring(4);
                    if(stack.isEmpty() || !stack.peek().equals(name)){
                        flag = false;
                    }else {
                        stack.pop();
                    }
                }else{
                    stack.push(line);
                }
            }
            if(! stack.isEmpty()){
                flag = false;
            }
            System.out.println(flag ? "YES" : "NO");
        }
    }
}
