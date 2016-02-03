package com.jcg2016.advanced5.java7.enums;

public class SwitchExample {

    public void performAction( DaysOfTheWeek instance ) {
        switch( instance ) {
            case MONDAY:
                // Do something
                break;
                
            case TUESDAY:
                // Do something
                break;
            
            // Other enum constants here
        }
    }
}
