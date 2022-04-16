package com.LeetCode.April.Thirteenth;

//剑指 Offer 35. 复杂链表的复制

import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}


public class Solution2 {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        Node cur = head;
        Map<Node ,Node> map = new HashMap<>();
        //复制各节点，并建立“原节点--->新节点”的Map映射
        while (cur != null){
            map.put(cur ,new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        //构建新链表的Next和Random指向
        while (cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
}
