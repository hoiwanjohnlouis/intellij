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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.FIX44;
import com.hwtsllc.fix.datatypes.FIX44Abstract;
import com.hwtsllc.fix.datatypes.MyEnumPriceType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  423 (same as 423, 663, 686, 698)
 *  PriceType
 *  int
 *  <p>
 *  Code to represent the price type.
 *  <p>
 *  (For Financing transactions PriceType implies the "repo type"
 *  – Fixed or Floating – 9 (Yield) or 6 (Spread) respectively
 *  - and Price (44) gives the corresponding "repo rate".
 *  <p>
 *  See Volume : "Glossary" for further value definitions)
 *  <p></p>
 *  663
 *  BenchmarkPriceType
 *  int
 *  <p>
 *  Identifies type of BenchmarkPrice (662).
 *  <p>
 *  See PriceType (423) for valid values.
 *  <p></p>
 *  686
 *  LegPriceType
 *  int
 *  <p>
 *  The price type of the LegBidPx (681) and/or LegOfferPx (684).
 *  <p>
 *  See PriceType (423) for description and valid values
 *  <p></p>
 *  698
 *  YieldRedemptionPriceType
 *  int
 *  <p>
 *  The price type of the YieldRedemptionPrice (697)
 *  <p>
 *  See PriceType (423) for description and valid values.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Percentage (i.e. percent of par) (often called "dollar price" for fixed income)
 *  <p>    2 - Per unit (i.e. per share or contract)
 *  <p>    3 - Fixed amount (absolute value)
 *  <p>    4 - Discount - percentage points below par
 *  <p>    5 - Premium - percentage points over par
 *  <p></p>
 *  <p>    6 - Spread (basis points spread)
 *  <p>    7 - TED Price
 *  <p>    8 - TED Yield
 *  <p>    9 - Yield
 *  <p>    10 - Fixed cabinet trade price (primarily for listed futures and options)
 *  <p></p>
 *  <p>    11 - Variable cabinet trade price (primarily for listed futures and options)
 *  <p></p>
 *  <p>    13 - Product ticks in halfs
 *  <p>    14 - Product ticks in fourths
 *  <p>    15 - Product ticks in eights
 *  <p>    16 - Product ticks in sixteenths
 *  <p>    17 - Product ticks in thirty-seconds
 *  <p></p>
 *  <p>    18 - Product ticks in sixty-forths
 *  <p>    19 - Product ticks in one-twenty-eights
 */
public class Tag686EnuLegPriceType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumPriceType dataValue;

    public final static MyEnumPriceType TESTA_ENU_LEG_PRICE_TYPE
            = MyEnumPriceType.TED_PRICE;
    public final static MyEnumPriceType TESTB_ENU_LEG_PRICE_TYPE
            = MyEnumPriceType.VARIABLE_TRADE_PRICE;

    public Tag686EnuLegPriceType(MyEnumPriceType dataValue) {
        setFixType(FIX44.FIX686_ENU_LEG_PRICE_TYPE);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(dataValue.toString());
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
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag686EnuLegPriceType tagData;

        tagData = new Tag686EnuLegPriceType(TESTA_ENU_LEG_PRICE_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag686EnuLegPriceType(TESTB_ENU_LEG_PRICE_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( MyEnumPriceType oneEnum : MyEnumPriceType.values()) {
            System.out.println( new Tag686EnuLegPriceType(oneEnum).toVerboseString() );
        }
    }
}
