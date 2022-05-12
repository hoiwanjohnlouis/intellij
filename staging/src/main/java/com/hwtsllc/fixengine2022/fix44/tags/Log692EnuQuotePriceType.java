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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.fix44.enums.Enum692QuotePriceType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  692
 *  QuotePriceType
 *  Code to represent price type requested in Quote.
 *      If the Quote Request is for a Swap values 1-8 apply to all legs.
 *  Valid values:
 *      1 - Percent (percent of par)
 *      2 - Per Share (e.g. cents per share)
 *      3 - Fixed Amount (absolute value)
 *      4 - Discount - percentage points below par
 *      5 - Premium - percentage points over par
 *      6 - Spread - basis points relative to benchmark
 *      7 - TED Price
 *      8 - TED Yield
 *      9 - Yield Spread (swaps)
 *      10 - Yield
 */
public class Log692EnuQuotePriceType extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum692QuotePriceType dataValue;

    public final static Enum692QuotePriceType TESTA_ENU_QUOTE_PRICE_TYPE
            = Enum692QuotePriceType.DISCOUNT;
    public final static Enum692QuotePriceType TESTB_ENU_QUOTE_PRICE_TYPE
            = Enum692QuotePriceType.SPREAD;

    public Log692EnuQuotePriceType(Enum692QuotePriceType dataValue) {
        setFixType(FIX44.FIX692_ENU_QUOTE_PRICE_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Log692EnuQuotePriceType tagData;

        tagData = new Log692EnuQuotePriceType(TESTA_ENU_QUOTE_PRICE_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log692EnuQuotePriceType(TESTB_ENU_QUOTE_PRICE_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
