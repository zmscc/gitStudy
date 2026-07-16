package com.critical.dto;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
    public class Solution {
        long count = 0;

        public long countPairs(int[] a) {
            count = 0;
            backtrack(a, 0, new ArrayList<>());
            return count;
        }

        private void backtrack(int[] a, int start, List<Integer> path) {
            if (path.size() == 2) {
                long product = (long) path.get(0) * (long) path.get(1);
                long sqrt = (long) Math.sqrt(product);
                if (sqrt * sqrt == product) {
                    count++;
                }
                return;
            }

            for (int i = start; i < a.length; i++) {
                path.add(a[i]);
                backtrack(a, i + 1, path);
                path.remove(path.size() - 1);
            }
        }
    }
}
