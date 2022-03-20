package com.Tzzzzz.patternsingleton.demo04;

//懒汉式（双重检查锁）
public class Singleton {
    //私有构造方法
    private Singleton(){}
    //声明变量
    private static volatile Singleton instance;//仅声明
    //对外提供访问方式
    public static Singleton getInstance(){
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
