package com.LeetCode.April.Fifth;

//剑指 Offer 53 - I. 在排序数组中查找数字 I

class Solution1 {
    public int search(int[] nums, int target) {
        //利用二分查找法找出target在nums[]最左边的元素的序号，依次往后遍历nums[]，直到不等于target
        int left = 0,right = nums.length -1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] < target){
                left = mid +1;
            } else
                right = mid;
            }
        int i = left;
        for (; i < nums.length; i++) {
            if(nums[i] != target){
                break;
            }
        }
        return i-left;
    }
}

