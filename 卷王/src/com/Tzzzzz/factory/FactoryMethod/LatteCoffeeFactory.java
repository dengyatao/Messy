package com.Tzzzzz.factory.FactoryMethod;

public class LatteCoffeeFactory implements CoffeeFactorty{

    //拿铁咖啡工厂
    @Override
    public Coffee creatCoffee() {
        return new LatteCoffee();
    }
}
