package com.jcg2016.advanced5.java7.enums;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {
    public static void main(String[] args) {
        final Map< DaysOfTheWeek, String > enumMap = new EnumMap<>( DaysOfTheWeek.class );               
        enumMap.put( DaysOfTheWeek.MONDAY, "Lundi" );
        enumMap.put( DaysOfTheWeek.TUESDAY, "Mardi" );
        // Some implementation here
    }
}
