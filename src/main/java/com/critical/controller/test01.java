package com.critical.controller;

import java.util.*;
import java.util.regex.*;

public class test01 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            sc.useDelimiter("\\A");
            if (!sc.hasNext()) return;
            String input = sc.next().trim();
            Pattern p = Pattern.compile("\\((-?\\d+),\\s*(-?\\d+)\\)");
            Matcher m = p.matcher(input);
            List<int[]> list = new ArrayList<>();
            while (m.find()) {
                int a = Integer.parseInt(m.group(1));
                int b = Integer.parseInt(m.group(2));
                if (a > b) { System.out.println("false"); return; }
                list.add(new int[]{a, b});
            }
            if (list.isEmpty()) return;
            list.sort(Comparator.comparingInt(a -> a[0]));
            // ensure start from 0
            if (list.get(0)[0] != 0) list.get(0)[0] = 0;
            // fix gaps and check invalids
            for (int i = 1; i < list.size(); i++) {
                int prevEnd = list.get(i-1)[1];
                if (list.get(i)[0] != prevEnd) list.get(i)[0] = prevEnd;
                if (list.get(i)[0] > list.get(i)[1]) { System.out.println("false"); return; }
            }
            // ensure end at 99
            int last = list.size() - 1;
            if (list.get(last)[1] != 99) list.get(last)[1] = 99;
            if (list.get(last)[0] > list.get(last)[1]) { System.out.println("false"); return; }
            // output
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) sb.append(",");
                sb.append("(").append(list.get(i)[0]).append(",").append(list.get(i)[1]).append(")");
            }
            System.out.println(sb.toString());
        }
    }
}
//(0,20],(20,40],(40,60],(60,99]

