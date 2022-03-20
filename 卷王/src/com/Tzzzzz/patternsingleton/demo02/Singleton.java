package com.Tzzzzz.patternsingleton.demo02;
//饿汉式（静态代码块）
public class Singleton {
    //私有构造方法
    private  Singleton(){}
    //声明成员变量
    private static Singleton instance;//null
    //在静态代码块中进行赋值
    static {
        instance = new Singleton();
    }
    //提供访问方式，让外界获取对象
    public static Singleton getInstance(){
        return instance;
    }
}
