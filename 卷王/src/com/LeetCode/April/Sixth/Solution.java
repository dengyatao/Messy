package com.LeetCode.April.Sixth;

//剑指 Offer 04. 二维数组中的查找
//将矩阵逆时针旋转 45° ，并将其转化为图形式，发现其类似于 二叉搜索树 ，即对于每个元素，其左分支元素更小、右分支元素更大。
// 因此，通过从 “根节点” 开始搜索，遇到比 target 大的元素就向左，反之向右，即可找到目标值 target 。

public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while(i >= 0 && j < matrix[0].length){
            if (target == matrix[i][j]){
                return true;
            }else if (target > matrix[i][j]){
                j++;
            }else {
                i--;
            }
        }
        return false;
    }
}
