package com.company.factory;

public class monthlyEmployee extends Employee{
    double rate;

    public monthlyEmployee(
            String name,
            String id,
            double rate
    ){
        this.rate=rate;
        this.name=name;//inherit
        this.id=id;//inherit

    }

    @Override
    public double calcSalary() {
        return rate;
    }
}
