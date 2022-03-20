package com.Tzzzzz.factory.AbstractFactory;

public class AmericanDessertFactory implements DessertFactory{
    @Override
    public Coffee creatCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert creatDessert() {
        return new MatchaMousse();
    }
}
