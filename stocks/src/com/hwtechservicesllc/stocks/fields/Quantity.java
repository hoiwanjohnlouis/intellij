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
import com.hwtechservicesllc.stocks.interfaces.IQuantity;

public class Quantity implements IQuantity {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();

    private double quantity;
    private String shortName;
    private String longName;
    private FieldType description;

    @Override
    public double getQuantity() {
        return 0;
    }

    @Override
    public void setQuantity(double quantity) {

    }

    @Override
    public FieldType getDescription() {
        return null;
    }

    @Override
    public void setDescription(FieldType description) {

    }

    @Override
    public String getLongName() {
        return null;
    }

    @Override
    public void setLongName(String longName) {

    }

    @Override
    public String getShortName() {
        return null;
    }

    @Override
    public void setShortName(String shortName) {

    }
}
