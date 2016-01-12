package com.hwtechservicesllc.stocks.fields;

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

import com.hwtechservicesllc.stocks.enums.FieldType;
import com.hwtechservicesllc.stocks.interfaces.LongName;
import com.hwtechservicesllc.stocks.interfaces.ShortName;
import com.hwtechservicesllc.stocks.interfaces.TickerSymbol;

public class Company implements TickerSymbol, ShortName, LongName {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private final FieldType fieldType = FieldType.COMPANY;

    private String tickerSymbol;
    private String shortName;
    private String longName;

    // no one can call default constructor
    private Company() {}

    public Company(String tickerSymbol, String shortName, String longName) {
        this.tickerSymbol = tickerSymbol;
        this.shortName = shortName;
        this.longName = longName;
    }

    @Override public String getTickerSymbol() {
        return tickerSymbol;
    }
    @Override public void setTickerSymbol(String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

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
