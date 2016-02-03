package com.jcg2016.advanced3.java7;

public interface InterfaceWithDefinitions {
    String CONSTANT = "CONSTANT";
    
    enum InnerEnum {
        E1, E2;
    }
    
    class InnerClass {        
    }
        
    interface InnerInterface {
        void performInnerAction();
    }
    
    void performAction();
}
