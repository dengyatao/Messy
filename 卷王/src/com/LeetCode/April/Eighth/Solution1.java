package com.LeetCode.April.Eighth;

//剑指 Offer 27. 二叉树的镜像
//递归

public class Solution1 {
    public TreeNode mirrorTree(TreeNode root) {
         if (root == null) return null;
         TreeNode lefttemp = root.left;
         TreeNode righttemp = root.right;
         root.left = mirrorTree(righttemp);
         root.right = mirrorTree(lefttemp);
         return root;
    }
}
