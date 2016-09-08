package object;

import org.junit.*;

/***********************************************************************
 * Copyright 2016 HW Tech Services, LLC
 * Licensed under the Apache License, Version 2.0 (the "License");
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * @author KimSoYeon
 ***********************************************************************/

public class TestObjects {
    public static void main(String[] args) {
        // Test MyE01_DefaultInitialization
        System.out.println("\nMyE01_DefaultInitialization():");
        System.out.println(new MyE01_DefaultInitialization());
        System.out.println(new MyE01_DefaultInitialization(7,'z'));

        // Test Ex02
        System.out.println("\nMyE02_HelloWorld():");
        System.out.println(new MyE02_HelloWorld());

    }
}
