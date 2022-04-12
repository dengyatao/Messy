package com.LeetCode.April.Twelfth;

//剑指 Offer 22. 链表中倒数第k个节点

import java.util.Stack;
//双指针解法，快慢指针
//快指针先走k-1步，然后快慢指针同时走

public class Solution1 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head ,slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}



//栈解法
/*public class Solution1 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = null;
        while (head != null){
            stack.add(head);
            head = head.next;
        }
        for (int i = 1; i <= k; i++) {
            cur = stack.pop();
        }
        return cur;
    }
}*/
