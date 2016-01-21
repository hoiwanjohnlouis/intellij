package com.hwtechservicesllc.stocks.fields;

import com.hwtechservicesllc.stocks.enums.FieldType;
import org.apache.log4j.Logger;

/**
 * Copyright 01/12/2016 HW Tech Services, LLC
 * <p>
 * Login   Hoi Wan Louis
 * <p>
 * Package com.hwtechservicesllc.staging.fields
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
    private final Logger logger = Logger.getLogger(this.getClass());

    public final static TickerSymbol DEFAULT_TICKER_SYMBOL_FIELD = new TickerSymbol();
    private final FieldType DEFAULT_FIELD_TYPE = FieldType.DEFAULT_TICKER_SYMBOL;
    private final String DEFAULT_TICKER_SYMBOL = "WDGTS";

    private FieldType fieldType;
    private String tickerSymbol;

    //
    public TickerSymbol() {
        this.fieldType = DEFAULT_FIELD_TYPE;
        this.tickerSymbol = DEFAULT_TICKER_SYMBOL;
    }

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
        sb.append(fieldType.name());
        sb.append(":[");
        sb.append(getTickerSymbol());
        sb.append("]");

        return sb.toString();
    }
}
