/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine2022.fix40;

import com.hwtsllc.fixengine2022.datatypes.FieldType;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Tag55Symbol {
    private final String DEBUG_TAG = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    public final static String TESTA_TICKER_SYMBOL = "TESTA_SYMBOL";
    public final static String TESTB_TICKER_SYMBOL = "TESTB_SYMBOL";

    private final FieldType fieldType = FieldType.TICKER_SYMBOL;
    private final String tickerSymbol;

    public Tag55Symbol(final String tickerSymbol) {
        this.tickerSymbol = tickerSymbol;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public String getTickerSymbol() {
        return tickerSymbol;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getFieldType().name());
        sb.append(":[");
        sb.append(getTickerSymbol());
        sb.append("]");

        return sb.toString();
    }
}
