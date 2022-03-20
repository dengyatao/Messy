package com.Tzzzzz.patternsingleton.demo02;

public class Client {
    public static void main(String[] args) {
        //1.创建Singleton类对象
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        //2.判断创建的两个对象是否为同一个对象
        System.out.println(instance == instance1);;
    }
}
