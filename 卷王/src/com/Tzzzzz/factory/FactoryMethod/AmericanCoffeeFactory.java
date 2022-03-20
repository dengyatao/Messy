package com.Tzzzzz.factory.FactoryMethod;

public class AmericanCoffeeFactory implements CoffeeFactorty{

    //美式咖啡工厂对象
    @Override
    public Coffee creatCoffee() {
        return new AmericanCoffee();
    }
}
