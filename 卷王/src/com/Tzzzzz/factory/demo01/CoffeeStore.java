package com.Tzzzzz.factory.demo01;

public class CoffeeStore {
    public Coffee orderCoffee(String type){
        Coffee coffee =null;
        if("american".equals(type)){
            coffee = new AmericanCoffee();
        }else if("latte".equals(type)){
            coffee = new LatteCoffee();
        }else{
            throw new RuntimeException("你点的是个几把");
        }
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
