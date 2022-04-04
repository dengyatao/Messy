package com.LeetCode.April.Third;

import java.util.Stack;

//LeetCode剑指offer 09.用两个栈实现队列

public class CQueue {
    //创建两个栈，一个用于进栈，一个用于出栈
    Stack<Integer> inStack;
    Stack<Integer> outStack;

    public CQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }
    //将value加入栈A
    public void appendTail(int value) {
        inStack.push(value);
    }

    //当栈 B 不为空： B中仍有已完成倒序的元素，因此直接返回 B 的栈顶元素。
    //否则，当 A 为空： 即两个栈都为空，无元素，因此返回 -1−1 。
    //否则： 将栈 A 元素全部转移至栈 B 中，实现元素倒序，并返回栈 B 的栈顶元素。
    public int deleteHead() {
        if(!outStack.empty()){
            return outStack.pop();
        }else{
            while(!inStack.empty()){
                outStack.push(inStack.pop());
            }
            return !outStack.empty()? -1 :outStack.pop();
        }
    }
}
