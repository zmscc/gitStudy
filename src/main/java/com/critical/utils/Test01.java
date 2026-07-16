package com.critical.utils;

import java.util.*;

public class Test01 {


    public static List<Integer> find(int[] nums, int k){
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        if(n < k){
            return result;
        }
        for(int i = 0 ; i <= n - k ; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i ; j < i + k ; j++){
                sb.append(nums[j]);
            }
            String str = sb.toString();
            if(isTru(str)){
                result.add(i);
            }
        }
        return result;
    }

    private static boolean isTru(String str) {
        int l = 0;
        int r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
