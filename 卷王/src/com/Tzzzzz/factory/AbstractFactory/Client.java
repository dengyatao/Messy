package com.Tzzzzz.factory.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        ItalyDessertFactory factory = new ItalyDessertFactory();
        Coffee coffee = factory.creatCoffee();
        Dessert dessert = factory.creatDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
