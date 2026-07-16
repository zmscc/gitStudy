package com.critical.dto;

public class Test03 {
    class Solution {
        long maxSum = Long.MIN_VALUE;
        public long maxBlindBoxValue(int[] a) {
            int n = a.length;
            int k = n / 2;
            maxSum = Long.MIN_VALUE;
            dfs(a, 0, k, 0, -2);
            return maxSum;
        }
        private void dfs(int[] a, int index, int remaining, long currentSum, int lastTaken) {
            if (remaining == 0) {
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
                return;
            }
            if (index >= a.length) {
                return;
            }
            if (index > lastTaken + 1) {
                dfs(a, index + 1, remaining - 1, currentSum + a[index], index);
            }
            dfs(a, index + 1, remaining, currentSum, lastTaken);
        }
    }
}
