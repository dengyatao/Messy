package com.LeetCode.April.Twelfth;

//剑指 Offer 18. 删除链表的节点

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


public class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) return head.next;
        ListNode cur = head;
        while (cur.next != null && cur.next.val != val){
            cur = cur.next;
        }
        if (cur.next != null){
            cur.next = cur.next.next;
        }
        return head;
    }
}