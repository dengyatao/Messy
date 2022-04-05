package com.LeetCode.April.Fifth;

//剑指 Offer 11. 旋转数组的最小数字
//考虑数组中的最后一个元素 xx：在最小值右侧的元素，它们的值一定都小于等于 xx；
// 而在最小值左侧的元素，它们的值一定都大于等于 xx。
// 因此，我们可以根据这一条性质，通过二分查找的方法找出最小值。

class Solution2 {
    public int minArray(int[] numbers) {
        //二分查找法，定义左右指针
        int low = 0 ,high = numbers.length - 1;
        while (low < high) {
            //定义中间指针
            int pivot = low + (high - low) / 2;
            // 第一种情况是numbers[pivot] < numbers[high]，这说明 numbers[pivot] 是最小值右侧的元素，因此我们可以忽略二分查找区间的右半部分。
            // 第二种情况是numbers[pivot] > numbers[high]，这说明 numbers[pivot] 是最小值左侧的元素，因此我们可以忽略二分查找区间的左半部分。
            // 第三种情况是numbers[pivot] == numbers[high]，由于重复元素的存在，我们并不能确定 numbers[pivot] 究竟在最小值的左侧还是右侧，因此我们不能莽撞地忽略某一部分的元素。
            // 我们唯一可以知道的是，由于它们的值相同，所以无论 numbers[high] 是不是最小值，都有一个它的「替代品」numbers[pivot]，因此我们可以忽略二分查找区间的右端点。
            if (numbers[pivot] < numbers[high]) {
                high = pivot;
            } else if (numbers[pivot] > numbers[high]) {
                low = pivot + 1;
            } else {
                high -= 1;
            }
        }
        return numbers[low];
    }
}


