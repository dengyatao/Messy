package com.LeetCode.April.Third;

import java.util.Stack;

//剑指 Offer 30. 包含min函数的栈

public class MinStack {
    /** initialize your data structure here. */

    //本题难点：
    //将 min() 函数复杂度降为 O(1)，可通过建立辅助栈实现；
    //数据栈 A ： 栈 A 用于存储所有元素，保证入栈 push() 函数、出栈 pop() 函数、获取栈顶 top() 函数的正常逻辑。
    //辅助栈 B ： 栈 B 中存储栈 A 中所有 非严格降序 的元素，则栈 A 中的最小元素始终对应栈 B 的栈顶元素，即 min() 函数只需返回栈 B 的栈顶元素即可。
    //因此，只需设法维护好 栈 B 的元素，使其保持非严格降序，即可实现 min() 函数的 O(1) 复杂度。

    Stack<Integer> A,B;
    public MinStack() {
        A = new Stack<>();
        B = new Stack<>();
    }

    //push(x) 函数： 重点为保持栈 B 的元素是非严格降序的。
    //将 xx 压入栈 A （即 A.add(x) ）；
    //若 ① 栈 B 为空 或 ② x 小于等于 栈 B 的栈顶元素，则将 x 压入栈 B （即 B.add(x) ）
    public void push(int x) {
        A.add(x);
        if(B.empty() || x <= B.peek()){
            B.add(x);
        }
    }

    // pop() 函数： 重点为保持栈A,B的 元素一致性 。
    //执行栈 A 出栈（即 A.pop() ），将出栈元素记为 y ；
    //若 y 等于栈 B 的栈顶元素，则执行栈 B 出栈（即 B.pop() ）。
    public void pop() {
        if (A.pop().equals(B.peek())){
            B.pop();
        }
    }

    //直接返回栈 A 的栈顶元素即可，即返回 A.peek() 。
    public int top() {
        return A.peek();
    }

    //直接返回栈 B 的栈顶元素即可，即返回 B.peek() 。
    public int min() {
        return B.peek();
    }
}
