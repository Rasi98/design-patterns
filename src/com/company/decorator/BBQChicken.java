package com.company.decorator;

public class BBQChicken extends PizzaDecorator {

    BBQChicken(com.company.decorator.pizza p) {
        super.pizza=p;
    }

    @Override
    public double getCost() {
        return pizza.getCost()+400;
    }
}
