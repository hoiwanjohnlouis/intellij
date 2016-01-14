package com.hwtechservicesllc.me.strings;

public class NewString {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();

    public static boolean tryIt(String[] aa) {
        aa = new String [] {"xx", "yy", "xxx", "xxx"};
        System.out.println("result = " + aa);
        return true;
    }

    public static void main(String[] args) {
        boolean flag;
        flag = tryIt(args);
        System.out.println("args = " + args);
    }

}