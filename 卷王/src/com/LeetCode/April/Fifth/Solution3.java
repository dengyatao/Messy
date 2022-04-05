package com.LeetCode.April.Fifth;

//剑指 Offer 53 - II. 0～n-1中缺失的数字

public class Solution3 {
    public int missingNumber(int[] nums) {
        //利用二分法找出右子数组的首位元素即可
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] == m) i = m + 1;
            else j = m - 1;
        }
        return i;
    }
}
