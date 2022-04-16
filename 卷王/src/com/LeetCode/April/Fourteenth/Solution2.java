package com.LeetCode.April.Fourteenth;

//剑指 Offer 58 - I. 翻转单词顺序

public class Solution2 {
    public String reverseWords(String s) {
        s = s.trim();
        int i = s.length() - 1,j = i;
        StringBuilder str = new StringBuilder();
        while (i >= 0){
            while (i >= 0 && s.charAt(i) != ' '){
                i--;
            }
            str.append(s.substring(i+1 ,j+1) +" ");
            while (i >= 0 && s.charAt(i) == ' '){
                i--;
            }
            j = i;
        }
        return str.toString().trim();
    }
}