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
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  692
 *  QuotePriceType
 *  int
 *  <p></p>
 *  Code to represent price type requested in Quote.
 *  <p></p>
 *  If the Quote Request is for a Swap values 1-8 apply to all legs.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Percent (percent of par)
 *  <p>    2 - Per Share (e.g. cents per share)
 *  <p>    3 - Fixed Amount (absolute value)
 *  <p>    4 - Discount - percentage points below par
 *  <p>    5 - Premium - percentage points over par
 *  <p></p>
 *  <p>    6 - Spread - basis points relative to benchmark
 *  <p>    7 - TED Price
 *  <p>    8 - TED Yield
 *  <p>    9 - Yield Spread (swaps)
 *  <p>    10 - Yield
 */
public class Tag692EnuQuotePriceType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum692QuotePriceType dataValue;

    public final static Enum692QuotePriceType TESTA_ENU_QUOTE_PRICE_TYPE
            = Enum692QuotePriceType.DISCOUNT;
    public final static Enum692QuotePriceType TESTB_ENU_QUOTE_PRICE_TYPE
            = Enum692QuotePriceType.SPREAD;

    public Tag692EnuQuotePriceType(Enum692QuotePriceType dataValue) {
        setFixType(FIX44.FIX692_ENU_QUOTE_PRICE_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toEnumIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toEnumDescriptionString();
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
        Tag692EnuQuotePriceType tagData;

        tagData = new Tag692EnuQuotePriceType(TESTA_ENU_QUOTE_PRICE_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag692EnuQuotePriceType(TESTB_ENU_QUOTE_PRICE_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum692QuotePriceType oneEnum : Enum692QuotePriceType.values()) {
            System.out.println( new Tag692EnuQuotePriceType(oneEnum).toVerboseString() );
        }
    }
}
