package com.hwtechservicesllc.stocks.fields;

import com.hwtechservicesllc.stocks.enums.FieldType;

/**
 * Copyright 01/12/2016 HW Tech Services, LLC
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

public class TickerSymbol {

    // for logging purposes
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private FieldType fieldType;
    private String tickerSymbol;

    // no one can call default constructor
    private TickerSymbol() {}

    public TickerSymbol(final FieldType fieldType, final String tickerSymbol) {
        this.fieldType = fieldType;
        this.tickerSymbol = tickerSymbol;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }
    public void setTickerSymbol(final String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------------"+fieldType.name()+"---------------------");
        sb.append("\n TickerSymbol: ");
        sb.append(getTickerSymbol());

        return sb.toString();
    }
}
