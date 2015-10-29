package com.hwtechservicesllc.tij4.ch01introductiontoobjects;

/**
 * Created by callas on 9/16/2014.
 */
public class Ch01Tester {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Starting Ch01Tester-IntroductionToObjects");
        Ex01SimpleData ex01 = new Ex01SimpleData(10,'a');
        System.out.println(ex01);
        Ex01SimpleData ex01b = new Ex01SimpleData(20,'b');
        System.out.println(ex01b);

        Ex02HelloDate ex02 = new Ex02HelloDate();
        System.out.println(ex02);
        System.out.println("Ending Ch01Tester-IntroductionToObjects");
    }
}
