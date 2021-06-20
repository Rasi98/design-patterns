package com.company.decorator;

public class ExtraCheese extends PizzaDecorator {

    ExtraCheese(com.company.decorator.pizza p) {
        super.pizza=p;
    }

    @Override
    public double getCost() {
        return pizza.getCost()+200;
    }
}
