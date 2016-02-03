package com.jcg2016.advanced3.java8;

public class FunctionalInterface {
    public void runMe( final Runnable r ) {
        r.run();
    }
    
    public static void main(String[] args) {
        new FunctionalInterface().runMe( () -> System.out.println( "Run!" ) );
    }
}
