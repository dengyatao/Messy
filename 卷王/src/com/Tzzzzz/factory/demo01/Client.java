package com.Tzzzzz.factory.demo01;

public class Client {
    public static void main(String[] args) {
        //创建咖啡店类
        CoffeeStore coffeeStore = new CoffeeStore();

        //点咖啡
        Coffee coffee = coffeeStore.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
