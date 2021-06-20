package com.company.factory;

public class Hourlyemployee extends Employee{
    int hoursWorked;
    double rate;

    public Hourlyemployee(
            String name,
            String id,
            int hoursWorked,
            double rate
    ){
        this.hoursWorked=hoursWorked;
        this.rate=rate;
        this.name=name;//inherit
        this.id=id;//inherit

    }

    @Override
    public double calcSalary() {
        return hoursWorked*rate;
    }
}
