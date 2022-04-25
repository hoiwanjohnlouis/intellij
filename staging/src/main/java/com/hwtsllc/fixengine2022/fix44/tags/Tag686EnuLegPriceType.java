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
import com.hwtsllc.fixengine2022.fix44.enums.Enum686LegPriceType;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  686 (same as 423, 663, 686, 698)
 *  The price type of the LegBidPx (681) and/or LegOfferPx (684).
 *        See PriceType (423) for description and valid values
 *  LegPriceType
 *  Valid values:
 *      1 - Percentage (i.e. percent of par) (often called "dollar price" for fixed income)
 *      2 - Per unit (i.e. per share or contract)
 *      3 - Fixed amount (absolute value)
 *      4 - Discount - percentage points below par
 *      5 - Premium - percentage points over par
 *      6 - Spread (basis points spread)
 *      7 - TED Price
 *      8 - TED Yield
 *      9 - Yield
 *      10 - Fixed cabinet trade price (primarily for listed futures and options)
 *      11 - Variable cabinet trade price (primarily for listed futures and options)
 *      13 - Product ticks in halfs
 *      14 - Product ticks in fourths
 *      15 - Product ticks in eights
 *      16 - Product ticks in sixteenths
 *      17 - Product ticks in thirty-seconds
 *      18 - Product ticks in sixty-forths
 *      19 - Product ticks in one-twenty-eights
 */
public class Tag686EnuLegPriceType extends FIX44Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum686LegPriceType dataValue;

    public final static Enum686LegPriceType TESTA_ENU_LEG_PRICE_TYPE
            = Enum686LegPriceType.TED_PRICE;
    public final static Enum686LegPriceType TESTB_ENU_LEG_PRICE_TYPE
            = Enum686LegPriceType.VARIABLE_TRADE_PRICE;

    public Tag686EnuLegPriceType(Enum686LegPriceType dataValue) {
        setFixType(FIX44.FIX686_ENU_LEG_PRICE_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
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
        Tag686EnuLegPriceType tagData;

        tagData = new Tag686EnuLegPriceType(TESTA_ENU_LEG_PRICE_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag686EnuLegPriceType(TESTB_ENU_LEG_PRICE_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
