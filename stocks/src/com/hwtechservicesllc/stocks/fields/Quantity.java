package com.hwtechservicesllc.stocks.fields;

/*
    Copyright (c) 2014  Hoi Wan Louis

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

import com.hwtechservicesllc.stocks.enums.FieldType;

public class Quantity {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private FieldType fieldType;
    private double quantity;

    // no one can call default constructor
    private Quantity() {}

    public Quantity(final FieldType fieldType, final double quantity) {
        this.fieldType = fieldType;
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }
    public void setQuantity(final double quantity) {
        this.quantity = quantity;
    }

}
