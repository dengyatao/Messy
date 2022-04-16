package com.LeetCode.April.Thirteenth;

//剑指 Offer 52. 两个链表的第一个公共节点

public class Solution1 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode A = headA, B = headB;
        while (A != B) {
            A = A != null ? A.next : headB;
            B = B != null ? B.next : headA;
        }
        return A;
    }
}

