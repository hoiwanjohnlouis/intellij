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

public class DateStamp {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private FieldType fieldType;
    private String dateStamp;

    // no one can call default constructor
    private DateStamp() {}

    public DateStamp(final FieldType fieldType, final String dateStamp) {
        this.fieldType = fieldType;
        this.dateStamp = dateStamp;
    }

    public String getDateStamp() {
        return dateStamp;
    }
    public void setDateStamp(final String dateStamp) {
        this.dateStamp = dateStamp;
    }

}
