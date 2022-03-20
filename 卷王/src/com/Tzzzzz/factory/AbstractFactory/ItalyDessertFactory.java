package com.Tzzzzz.factory.AbstractFactory;

public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee creatCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert creatDessert() {
        return new Trimisu();
    }
}
