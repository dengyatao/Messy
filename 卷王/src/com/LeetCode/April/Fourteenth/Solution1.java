package com.LeetCode.April.Fourteenth;

//剑指 Offer 57. 和为s的两个数字

public class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int left = 0,right = nums.length - 1;
        while (left < right){
            if(nums[left] + nums[right] > target){
                right--;
            }else if(nums[left] + nums[right] < target){
                left++;
            }else return new int[] {nums[left] ,nums[right]};
        }
        return new int[0];
    }
}