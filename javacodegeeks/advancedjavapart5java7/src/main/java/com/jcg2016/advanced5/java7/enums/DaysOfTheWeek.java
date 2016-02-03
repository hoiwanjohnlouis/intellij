package com.jcg2016.advanced5.java7.enums;

public enum DaysOfTheWeek {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    
    public boolean isWeekend( DaysOfTheWeek day ) {
        return( day == SATURDAY || day == SUNDAY );
    }
}
