package com.tij4f2014.ch01;

/**
 * Created by callas on 9/16/2014.
 */
public class Ex01SimpleData {
    private int m_ctr;
    private char m_char;

    static private StringBuffer sb;
    public Ex01SimpleData() {
        setM_ctr(0);
        setM_char(' ');
    }
    public Ex01SimpleData(int i, char c) {
        setM_ctr(i);
        setM_char(c);
    }
    public int getM_ctr () {
        return m_ctr;
    }
    protected void setM_ctr (int i) {
        m_ctr = i;
    }
    public char getM_char () {
        return m_char;
    }
    protected void setM_char (char c) {
        m_char = c;
    }
    @Override
    public String toString() {
        sb = new StringBuffer();
        sb.append("counter:");
        sb.append(m_ctr);
        sb.append("\ncharacter:");
        sb.append(m_char);
        return String.valueOf(sb);
    }
}
