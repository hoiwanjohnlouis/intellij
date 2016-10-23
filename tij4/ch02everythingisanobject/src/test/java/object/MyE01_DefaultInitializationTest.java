package object;

import static org.junit.Assert.*;

/***********************************************************************
 * Copyright 2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * @author KimSoYeon
 ***********************************************************************/
public class MyE01_DefaultInitializationTest {
    public static void main(String[] args) {
        System.out.println("Default constructor: " + new MyE01_DefaultInitialization());
        System.out.println("(int, char) constructor: " + new MyE01_DefaultInitialization(7, 'a'));
    }
}