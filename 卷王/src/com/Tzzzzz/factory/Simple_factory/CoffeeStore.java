package com.Tzzzzz.factory.Simple_factory;



public class CoffeeStore {
    public Coffee orderCoffee(String type){
        //调用生产咖啡的方法
        Coffee coffee = SimpleCoffeeFactory.creatCoffee(type);

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
