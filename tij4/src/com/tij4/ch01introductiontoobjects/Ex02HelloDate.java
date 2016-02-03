package com.tij4.ch01introductiontoobjects;

/**
 * Created by callas on 9/16/2014.
 */
public class Ex02HelloDate {
    static private StringBuffer sb;
    @Override
    public String toString() {
        sb = new StringBuffer();
        sb.append("Hello, World");
        return String.valueOf(sb);
    }

}
