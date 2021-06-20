package com.company.decorator;

public class ThinCrustPizza extends pizza{
    ThinCrustPizza(){
        this.description="Thin crust pizza cost is";
    }

    @Override
    public double getCost() {
        return 500;
    }
}
