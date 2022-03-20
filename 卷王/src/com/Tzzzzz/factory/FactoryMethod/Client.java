package com.Tzzzzz.factory.FactoryMethod;

public class Client {
    public static void main(String[] args) {

        //创建咖啡店对象
        CoffeeStore store = new CoffeeStore();
        //创建对象
        CoffeeFactorty factory = new AmericanCoffeeFactory();
        store.setFactory(factory);

        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
