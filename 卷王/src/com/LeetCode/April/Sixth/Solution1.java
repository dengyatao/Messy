package com.LeetCode.April.Sixth;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution1 {
    public static void main(String[] args) {
        //HashMap简单用法
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,6);
        map.put(2,5);
        map.put(3,4);
        map.put(4,3);
        map.put(5,2);
        map.put(6,1);
        System.out.println(map.get(4));
        //遍历hashmap
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.print(entry.getKey()+" ");
            System.out.println(entry.getValue());
        }
    }
}
