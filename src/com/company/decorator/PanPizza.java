package com.company.decorator;

public class PanPizza extends pizza {
    PanPizza(){
        this.description="Pan pizza";
    }

    @Override
    public double getCost() {
        return 1000;
    }
}
