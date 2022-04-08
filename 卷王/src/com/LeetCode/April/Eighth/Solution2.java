package com.LeetCode.April.Eighth;

//剑指 Offer 28. 对称的二叉树

public class Solution2 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return helper(root.left ,root.right);
    }
    public boolean helper(TreeNode left ,TreeNode right){
        if(left == null && right ==null) return true;
        if (left == null || right == null || left.val != right.val) return false;
        return helper(left.left ,right.right) && helper(left.right ,right.left);
    }
}
