package com.jcg2016.advanced3.java8;

public interface DefaultMethods extends Runnable, AutoCloseable {
    @Override
    default void run() {
        // Some implementation here
    }
    
    @Override
    default void close() throws Exception {
       // Some implementation here
    }
}
