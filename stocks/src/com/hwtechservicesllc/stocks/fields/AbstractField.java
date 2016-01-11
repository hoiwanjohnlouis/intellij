package com.hwtechservicesllc.stocks.fields;

/**
 * Copyright 01/07/2016 HW Tech Services, LLC
 * <p>
 * Login   KimSoYeon
 * <p>
 * Package com.hwtechservicesllc.stocks.interfaces
 * Project intellijPrototyping
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
 **/

import com.hwtechservicesllc.stocks.enums.FieldType;
import com.hwtechservicesllc.stocks.interfaces.LongName;
import com.hwtechservicesllc.stocks.interfaces.ShortName;

public abstract class AbstractField implements ShortName, LongName {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();

    private FieldType fieldType;
    private String shortName;
    private String longName;

    public FieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(FieldType fieldType) {
        this.fieldType = fieldType;
    }

    // each data field has their own display method, sometimes a string, sometimes a number.
    public abstract void displayField();

    @Override public String getLongName() {
        return longName;
    }
    @Override public void setLongName(String longName) {
        this.longName = longName;
    }

    @Override public String getShortName() {
        return shortName;
    }
    @Override public void setShortName(String shortName) {
        this.shortName = shortName;
    }

}
