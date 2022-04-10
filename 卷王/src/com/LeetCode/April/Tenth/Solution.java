package com.LeetCode.April.Tenth;

//剑指 Offer 42. 连续子数组的最大和

public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) return 0;
        int max = nums[0];
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (num > 0){
                num += nums[i];
            }else {
                num = nums[i];
            }
            max = Math.max(max ,num);
        }
        return max;
    }
}
