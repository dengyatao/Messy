package com.LeetCode.April.Fourteenth;

//剑指 Offer 21. 调整数组顺序使奇数位于偶数前面

public class Solution {
    public int[] exchange(int[] nums) {
        int i = 0,j = nums.length - 1;
        while (i < j){
            int tmp;
            if (i < j && nums[i] % 2 != 0){
                i++;
            }
            if (i < j && nums[j] % 2 == 0){
                j--;
            }
            tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
        return nums;
    }
}
