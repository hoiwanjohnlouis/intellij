package com.ntt2015.decoratorpattern;

/*
    Copyright (c) 2014  HW Tech Services, Inc., LLC
 
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at
 
        http://www.apache.org/licenses/LICENSE-2.0
 
    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

// Implements the Pizza interface with only the required
// methods from the interface

// Every Pizza made will start as a PlainPizza

public class PlainPizza implements Pizza {

    public PlainPizza () {

        System.out.println("---------- New Pizza ----------\n" + "Adding Dough");

    }


    @Override
    public String getDescription() {

        return "Thin dough";

    }


    @Override
    public double getCost() {

        System.out.println("Cost of Dough: " + 4.00);

        return 4.00;

    }

}
