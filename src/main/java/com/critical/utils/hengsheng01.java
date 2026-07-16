package com.critical.utils;


import java.util.Arrays;
import java.util.Scanner;

/*
* select a.farm_name, c.crop_name, c.crop_type,
round(avg(b.health_index), 2) as avg_health_index,
avg(b.yield_kg_per_hectare) as avg_yield_kg_per_hectare,
count(*) as growth_days
from farms a join crop_data b on a.farm_id = b.farm_id join crops c on c.crop_id = b.crop_id
where b.measurement_date in('2024-03', '2024-06')
group by c.crop_name
* */
public class hengsheng01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] line = sc.nextLine().split(" ");
        int n = Integer.parseInt(line[0]);
        int ans = Integer.parseInt(line[1]);
        int a = Integer.parseInt(line[2]);
        int b = Integer.parseInt(line[3]);
        int query = 0;
        int guess = 0;
        for (int i = 0; i < n; i++){
            String [] line1 = sc.nextLine().split(" ");
            char op = line1[0].charAt(0);
            int x = Integer.parseInt(line1[1]);
            if(op == '?'){
                query++;
                if(x == ans){
                    if(query <= a && guess <= b){
                        System.out.println("Yes");
                    }else {
                        System.out.println("No");
                    }
                }
            }
            if(op == '!'){
                guess++;
                if(x == ans){
                    if(query <= a && guess <= b){
                        System.out.println("Yes");
                    }else {
                        System.out.println("No");
                    }
                }
            }
        }
    }
}
