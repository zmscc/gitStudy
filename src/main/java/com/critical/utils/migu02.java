package com.critical.utils;

import java.util.*;

public class migu02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = 1000000;
        int[] help = new int[max + 1];
        Arrays.fill(help, -1);
        Queue<Integer> queue = new LinkedList<>();
        help[1] = 0;
        queue.add(1);
        while(!queue.isEmpty()){
            int cur = queue.poll();
            if(cur == b){
                System.out.println(help[cur]);
                return;
            }
            long next1 = (long)cur * a;
            if(next1 <= max && help[(int)next1] == -1){
                help[(int)next1] = help[cur] + 1;
                queue.add((int)next1);
            }
            if(cur >= 10){
                String s = String.valueOf(cur);
                String str = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
                if(str.charAt(0) != '0'){
                    int next2 = Integer.parseInt(str);
                    help[next2] = help[cur] + 1;
                    queue.add(next2);
                }
            }
        }
        System.out.println(-1);
    }
}
