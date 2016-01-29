package com.ntt2014.patterns.decorator;

public class PizzaMakerTest {

    public static void main(String[] args){

        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor

        Pizza thePizza;


        thePizza = new PlainPizza();
        System.out.println("Ingredients: " + thePizza.getDescription());
        System.out.println("Price: " + thePizza.getCost());


        thePizza = new Pepperoni(new Mozzarella(new TomatoSauce(new PlainPizza())));
        System.out.println("Ingredients: " + thePizza.getDescription());
        System.out.println("Price: " + thePizza.getCost());

        thePizza = new Parmesan(new Fontina(new Pepperoni(new Mozzarella(new TomatoSauce(new
                PlainPizza())))));
        System.out.println("Ingredients: " + thePizza.getDescription());
        System.out.println("Price: " + thePizza.getCost());

    }
}

