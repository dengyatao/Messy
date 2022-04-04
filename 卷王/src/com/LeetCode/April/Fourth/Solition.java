package com.LeetCode.April.Fourth;

import java.util.ArrayList;

//剑指 Offer 06. 从尾到头打印链表

//单链表的定义
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

class Solution {
    ArrayList<Integer> tmp = new ArrayList<Integer>();
    public int[] reversePrint(ListNode head) {
        recur(head);
        int[] res = new int[tmp.size()];
        // 每次传入 head.next ，以 head == null（即走过链表尾部节点）为递归终止条件，此时直接返回。
        for(int i = 0; i < res.length ; i++){
            res[i] = tmp.get(i);
        }
        return res;
    }
    //递归函数
    void recur(ListNode head){
        if(head == null){
            return;
        }
        recur(head.next);
        tmp.add(head.val);
    }
}