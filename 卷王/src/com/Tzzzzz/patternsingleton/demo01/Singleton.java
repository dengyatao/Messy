package com.Tzzzzz.patternsingleton.demo01;

//饿汉式 （静态变量）
public class Singleton {

    //1.私有构造方法
    private Singleton(){}

    //2.创建本类对象
    private static Singleton instance=new Singleton();

    //3.提供访问方式，让外界获取对象
    public  static Singleton getInstance(){
        return instance;
    }

}
