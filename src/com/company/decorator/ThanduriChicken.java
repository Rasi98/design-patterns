package com.company.decorator;

public class ThanduriChicken extends PizzaDecorator {

    ThanduriChicken(com.company.decorator.pizza p) {
        super.pizza=p;
    }

    @Override
    public double getCost() {
        return pizza.getCost()+300;
    }
}
