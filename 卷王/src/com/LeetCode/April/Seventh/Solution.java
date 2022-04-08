package com.LeetCode.April.Seventh;

//剑指 Offer 32 - I. 从上到下打印二叉树
//二叉树的广度优先遍历（层次遍历）

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public int[] levelOrder(TreeNode root) {
        if (root == null) return new int[0];
        //根据队列的特点来实现
        Queue<TreeNode> queue = new LinkedList(){};
        //讲树的节点加入队列中
        queue.add(root);
        //定义数组ans来记录出队元素
        ArrayList<Integer> ans = new ArrayList<>();
        //只要对列中元素不为空就循环
        while (!queue.isEmpty()){
            //出队，定义node记录此节点
            TreeNode node = queue.poll();
            //将出队节点存入数组
            ans.add(node.val);
            //判断节点的左右子节点是否为空，不为空则入队
            if(node.left != null ){
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }
        return res;
    }
}