package com.company.factory;

public class EmployeeFactory {


    public Employee getInstance(
            String type,
            String name,
            int hoursWorked,
            double rate){
        Employee employee=null;
        if(type.equals("hourly")){
            employee=new Hourlyemployee(name,"1",hoursWorked,rate);
        }
        else if(type.equals("monthly")){
            employee=new monthlyEmployee(name,"2",rate);
        }
        else if(type.equals("contract")){
            employee=new ContractbasisEmployee(name,"3",rate);
        }
        return employee;
    }
}
