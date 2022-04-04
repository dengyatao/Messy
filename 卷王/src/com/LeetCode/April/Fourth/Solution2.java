package com.LeetCode.April.Fourth;

//剑指 Offer 05. 替换空格

//在 Python 和 Java 等语言中，字符串都被设计成「不可变」的类型
//即无法直接修改字符串的某一位字符，需要新建一个字符串实现。
public class Solution2 {
    public String replaceSpace(String s) {
        //初始化一个StringBuilder类对象
        StringBuilder res = new StringBuilder();
        //遍历s中的每一个字符 注：此处为加强for循环（语法糖）
        for(Character c : s.toCharArray())
        {
            if(c == ' ') res.append("%20");
            else res.append(c);
        }
        return res.toString();
    }
}
