package com.LeetCode.April.Sixth;

//剑指 Offer 50. 第一个只出现一次的字符

import java.util.HashMap;
import java.util.Map;

public class Solution2 {
    public char firstUniqChar(String s) {
        //定义一个哈希表，分别存储字符串s中的每个字符
        HashMap<Character , Boolean> dic = new HashMap<>();
        //将字符串转到字符数组中，用于遍历
        char[] sc = s.toCharArray();
        //遍历sc，并将遍历出来的字符存入Hashmap，如果这个数未存在过，则value值为true，否则将其改为false
        for (char c : sc){
            dic.put(c, !dic.containsKey(c));
        }
        //返回HashMap中的value值，若为true，则该value对应的key仅出现一次，返回即可
        for (char c : sc){
            if(dic.get(c)){
                return c;
            }
        }
        return ' ';
    }
}
