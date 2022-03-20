package com.Tzzzzz.factory.FactoryMethod;

public class CoffeeStore {

    private  CoffeeFactorty factory;

    public void setFactory(CoffeeFactorty factory){
        this.factory = factory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = factory.creatCoffee();
        //加配料
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
