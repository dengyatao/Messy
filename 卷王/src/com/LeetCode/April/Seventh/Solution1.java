package com.LeetCode.April.Seventh;

//剑指 Offer 32 - II. 从上到下打印二叉树 II

import com.LeetCode.April.Third.CQueue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution1 {
    //注意此处函数的返回类型List<List<Integer>>
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList(){};
        //ArrayList实现类的实例对象就在这充当了这个指向List接口的对象引用。
        List<List<Integer>> res = new ArrayList<>();
        if (root != null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            //为了逐层打印，因此创建一个List来储存每层的节点
            List<Integer> tmp = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                tmp.add(node.val);
                if (node.left != null){
                    queue.add(node.left);
                }
                if (node.right != null){
                    queue.add(node.right);
                }
            }
            res.add(tmp);
        }
        return res;
    }
}
