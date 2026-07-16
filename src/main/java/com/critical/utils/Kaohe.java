package com.critical.utils;

import java.util.Scanner;
import java.util.Stack;

/**
 * 合法的
 * ({})
 * ()()
 * {{()}}
 * 无效的
 * ({)}
 * )()
 * {{)
 * ()()(
 * )
 * (
 */
public class Kaohe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        if(line.charAt(0) != '(' | line.charAt(0) != '{'){
            System.out.println("无效");
            return;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < line.length() ; i++){
            char ch = line.charAt(i);
            if(ch == '(' || ch == '{'){
                stack.push(ch);
                continue;
            }
            while(!stack.isEmpty()){
                char cur = stack.pop();
                if(ch == '}'){
                    if(cur != '{'){
                        System.out.println("无效");
                        return;
                    }
                }else if(ch == ')'){
                    if(cur != '('){
                        System.out.println("无效");
                        return;
                    }
                }else {
                    System.out.println("无效");
                    return;
                }
            }
        }
        System.out.println("有效");
    }

}
