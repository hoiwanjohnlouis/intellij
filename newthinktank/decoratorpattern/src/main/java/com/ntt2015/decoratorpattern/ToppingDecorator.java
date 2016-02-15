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

// Has a "Has a" relationship with Pizza. This is an
// Aggregation Relationship

abstract class ToppingDecorator implements Pizza {

    protected Pizza tempPizza;

    // Assigns the type instance to this attribute
    // of a Pizza

    // All decorators can dynamically customize the Pizza
    // instance PlainPizza because of this

    public ToppingDecorator(Pizza newPizza){

        tempPizza = newPizza;

    }

    @Override
    public String getDescription() {

        return tempPizza.getDescription();

    }

    @Override
    public double getCost() {

        return tempPizza.getCost();

    }

}

