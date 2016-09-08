package object;

/***********************************************************************
 * Copyright 2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * @author KimSoYeon
 ***********************************************************************/

class MyE01_DefaultInitialization {
    private int intData;
    private char characterData;

    static private StringBuffer sb;

    MyE01_DefaultInitialization() {
    }
    MyE01_DefaultInitialization(int i, char c) {
        this.intData = i;
        this.characterData = c;
    }

    @Override
    public String toString() {
        sb = new StringBuffer();
        sb.append("intData:");
        sb.append(intData);
        sb.append("\ncharacter:");
        sb.append(characterData);
        return String.valueOf(sb);
    }

}
