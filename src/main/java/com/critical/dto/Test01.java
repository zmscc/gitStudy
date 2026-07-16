package com.critical.dto;

public class Test01 {
    public int calculatingScore (String text) {
        // write code here
        String[] words = text.split(" ");
        int count= 0;
        for (String word : words){
            if(word.equalsIgnoreCase("coder")){
                count++;
            }
        }
        return count;
    }
}
