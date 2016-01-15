package com.hwtechservicesllc.ntt2014.patterns.decorator;

public class TestPizzaMaker {

    public static void main(String[] args){

        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor

        Pizza basicPizza = new Pepperoni(new Mozzarella(new TomatoSauce(new PlainPizza())));
//        Pizza basicPizza = new PlainPizza();

        System.out.println("Ingredients: " + basicPizza.getDescription());

        System.out.println("Price: " + basicPizza.getCost());

    }
}

