package com.Tzzzzz.patternsingleton.demo04;

public class Client {
    public static void main(String[] args) {
        //创建Singleton对象
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        //判断是否相等
        System.out.println(instance==instance1);
    }
}
