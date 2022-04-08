package com.LeetCode.April.Eighth;

//剑指 Offer 26. 树的子结构

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class Solution {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null && B == null){
            return false;
        }
        //若节点值相同则向下比较
        if(A.val == B.val && (helper(A.left ,B.left) && helper(A.right ,B.right))){
            return true;
        }
        //遍历A的每一个节点，直到遍历完成或出现与B相同的子树为止
        return isSubStructure(A.left ,B) || isSubStructure(A.right ,B);
    }

    //判断A的子树是否与B完全相同
    public boolean helper(TreeNode a, TreeNode b){
        if(b == null){
            return true;
        }
        if (a == null){
            return false;
        }
        if(a.val == b.val){
            return helper(a.left ,b.left)&&helper(a.right ,b.right);
        }else{
            return false;
        }
    }
}