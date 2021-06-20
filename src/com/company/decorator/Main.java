package com.company.decorator;

public class Main {
    public static void main(String[]args){
        pizza pizza=new ThinCrustPizza();
        pizza bbqchickenpizza=new BBQChicken(pizza);
        pizza bbqchickenwithextracheese=new ExtraCheese(bbqchickenpizza);
        System.out.println("bbqchickenwithextracheese :"+bbqchickenwithextracheese.getCost());

        pizza pizza1=new PanPizza();
        pizza pizza1withthandurichicken=new ThanduriChicken(pizza1);
        System.out.println("Cost of pan pizza with thanduri: "+pizza1withthandurichicken.getCost());

    }
}
