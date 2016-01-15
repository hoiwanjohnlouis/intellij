package com.hwtechservicesllc.nyuscpsf2014.s03.thehackerati.academy;

public abstract class Shape implements IShape {
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(":\tarea = ");
        sb.append(area());
        return sb.toString();
    }
    public int foo() throws Exception {
        int x = 1/0;
        //System.out.println(x);
        return x;
    }
}
