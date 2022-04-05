package com.LeetCode.April.Fifth;

//剑指 Offer 03. 数组中重复的数字

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int findRepeatNumber(int[] nums) {
        //定义HashSet，遍历数组nums中的每个数字num：
        //当num在dic中，说明重复，直接返回num；
        //否则将num添加至dic中；
        Set<Integer> dic = new HashSet<>();
        for (int num : nums){
            if (dic.contains(num)){
                return num;
            }
            dic.add(num);
        }
        return 0;
    }
}
