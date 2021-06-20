package com.company.factory;

public class ContractbasisEmployee extends Employee {
     double rate;

     public ContractbasisEmployee(String name,String id, double rate){
         this.rate=rate;
         this.id=id;
         this.name=name;
     }

    @Override
    public double calcSalary() {
        return rate*5;
    }
}
