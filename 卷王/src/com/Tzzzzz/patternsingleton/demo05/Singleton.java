package com.Tzzzzz.patternsingleton.demo05;

//懒汉式（静态内部类）
public class Singleton {
    //私有方法构造
    private  Singleton(){}
    //定义一个静态内部类
    private static class SingletonHolder{
        //在内部类中声明并初始化外部内的对象
        private static final Singleton INSTANCE =new Singleton();
    }
    //提供外部访问
    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
