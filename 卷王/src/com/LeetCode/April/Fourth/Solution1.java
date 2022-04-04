package com.LeetCode.April.Fourth;

//剑指 Offer 24. 反转链表

public class Solution1 {
    public ListNode reverseList(ListNode head) {
        //初始化pre，cur分别指向null和头节点
        ListNode cur = head,pre = null;
        //采用双指针反转链表
        while(cur != null){
            ListNode tmp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = tmp;
        }
        return pre;
    }
}
