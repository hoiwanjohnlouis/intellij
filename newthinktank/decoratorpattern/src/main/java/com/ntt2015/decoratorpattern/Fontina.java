package com.ntt2015.decoratorpattern;

/**
 * ************************************************************************
 * Copyright 01/28/2016 HW Tech Services, LLC
 * <p>
 * Login   KimSoYeon
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * *************************************************************************
 */

public class Fontina extends ToppingDecorator {

    public static final String thisCheese = "Fontina";
    public static final double thisCost = .75;
    private static final StringBuilder sb = new StringBuilder();

    public Fontina(Pizza newPizza) {

        super(newPizza);
        sb.delete(0, sb.length());
        sb.append("Adding ");
        sb.append(thisCheese);
        System.out.println(sb.toString());

    }

    @Override
    public String getDescription() {

        sb.delete(0, sb.length());
        sb.append(tempPizza.getDescription());
        sb.append(", ");
        sb.append(thisCheese);
        return sb.toString();

    }

    @Override
    public double getCost() {

        sb.delete(0, sb.length());
        sb.append("Cost of ");
        sb.append(thisCheese);
        sb.append(": ");
        sb.append(thisCost);
        System.out.println(sb.toString());

        return tempPizza.getCost() + thisCost;

    }
}
