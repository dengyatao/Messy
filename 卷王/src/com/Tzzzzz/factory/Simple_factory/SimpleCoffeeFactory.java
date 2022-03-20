package com.Tzzzzz.factory.Simple_factory;


public class SimpleCoffeeFactory {
    //静态简单工厂
    public static Coffee creatCoffee(String type){
        Coffee coffee =null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("你点的是个几把");
        }
       
        return coffee;
    }
}
