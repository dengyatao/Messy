package com.Tzzzzz.patternsingleton.demo03;

public class Singleton {
    //私有构造方法
    private  Singleton(){}
    //声明变量
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
