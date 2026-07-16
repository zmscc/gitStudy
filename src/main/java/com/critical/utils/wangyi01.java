package com.critical.utils;

import java.util.Scanner;
import java.util.Stack;

public class wangyi01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(solution(line));
    }
    public static boolean solution(String line){
        Stack<Integer> stack = new Stack<>();
        int n = line.length();
        for (int i = 0; i < n; i++) {
            if(i < n - 1 && line.charAt(i) == '{' && line.charAt(i + 1) == '{'){
                if(!stack.isEmpty()) return false;
                stack.push(i);
                i++;
            }else if(i < n - 1 && line.charAt(i) == '}' && line.charAt(i + 1) == '}'){
                if(stack.isEmpty()) return false;
                int start = stack.pop();
                if(!valid(line.substring(start + 2, i))){
                    return false;
                }
                i++;
            }else if(line.charAt(i) == '{' || line.charAt(i) == '}'){
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static boolean valid(String line){
        for(char ch : line.toCharArray()){
            if(ch != ' '){
                return true;
            }
        }
        return false;
    }
}
