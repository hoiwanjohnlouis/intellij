package com.jcg2016.advanced3.java8;

public class DiamondOfDeath {
    interface A {
        default void performAction() {            
        }
    }
    
    interface B extends A {
        @Override
        default void performAction() {
        }
    }
    
    interface C extends A {
        @Override
        default void performAction() {
        }
    }
    
    // E is not compilable unless it overrides perfromAction() as well
    interface E extends B, C {        
    }
}
