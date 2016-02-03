package com.jcg2016.advanced3.java8;

public interface InterfaceWithDefaultMethods {
    void performAction();
    
    default void performDefaulAction() {
        // Implementation here
    }
    
    static void createAction() {
        // Implementation here
    }
}
