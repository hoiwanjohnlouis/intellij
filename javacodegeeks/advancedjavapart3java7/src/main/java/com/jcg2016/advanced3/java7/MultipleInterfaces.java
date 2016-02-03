package com.jcg2016.advanced3.java7;

public class MultipleInterfaces implements Runnable, AutoCloseable {
    @Override
    public void run() {
        // Some implementation here
    }
    
    @Override
    public void close() throws Exception {
       // Some implementation here
    }
}
