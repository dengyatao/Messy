package com.Tzzzzz.factory.AbstractFactory;

public abstract class Coffee {
    //获取咖啡名称（抽象方法）
    public abstract String getName();
    //加糖
    public void addSugar(){

        System.out.println("加糖");
    }
    //加奶
    public void addMilk(){

        System.out.println("加奶");
    }
}
