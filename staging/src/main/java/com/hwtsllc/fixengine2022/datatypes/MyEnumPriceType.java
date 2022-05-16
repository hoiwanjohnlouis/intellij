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

package com.hwtsllc.fixengine2022.datatypes;

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

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
public enum MyEnumPriceType implements LogFIXString, LogVerboseString {
    /*
     * 1-11, 13-19 msg types
     */
    PERCENTAGE( "1", "PERCENTAGE",
            "1 - Percentage (i.e. percent of par) (often called *dollar price* for fixed income)" ),
    PER_UNIT( "2", "PER_UNIT",
            "2 - Per unit (i.e. per share or contract)" ),
    FIXED_AMOUNT( "3", "FIXED_AMOUNT",
            "3 - Fixed amount (absolute value)" ),
    DISCOUNT( "4", "DISCOUNT",
            "4 - Discount - percentage points below par" ),
    PREMIUM( "5", "PREMIUM",
            "5 - Premium - percentage points over par" ),

    SPREAD( "6", "SPREAD",
            "6 - Spread (basis points spread)" ),
    TED_PRICE( "7", "TED_PRICE",
            "7 - TED Price" ),
    TED_YIELD( "8", "TED_YIELD",
            "8 - TED Yield" ),
    YIELD( "9", "YIELD",
            "9 - Yield" ),
    FIXED_TRADE_PRICE( "10", "FIXED_TRADE_PRICE",
            "10 - Fixed cabinet trade price (primarily for listed futures and options)" ),

    VARIABLE_TRADE_PRICE( "11", "VARIABLE_TRADE_PRICE",
            "11 - Variable cabinet trade price (primarily for listed futures and options)" ),
    TICKS_IN_HALFS( "13", "TICKS_IN_HALFS",
            "13 - Product ticks in halfs" ),
    TICKS_IN_FOURTHS( "14", "TICKS_IN_FOURTHS",
            "14 - Product ticks in fourths" ),
    TICKS_IN_EIGHTHS( "15", "TICKS_IN_EIGHTHS",
            "15 - Product ticks in eighths" ),
    TICKS_IN_SIXTEENTHS( "16", "TICKS_IN_SIXTEENTHS",
            "16 - Product ticks in sixteenths" ),

    TICKS_IN_THIRTY_SECONDS( "17", "TICKS_IN_THIRTY_SECONDS",
            "17 - Product ticks in thirty-seconds" ),
    TICKS_IN_SIXTY_FOURTHS( "18", "TICKS_IN_SIXTY_FOURTHS",
            "18 - Product ticks in sixty-fourths" ),
    TICKS_IN_ONE_TWENTY_EIGHTS( "19", "TICKS_IN_ONE_TWENTY_EIGHTS",
            "19 - Product ticks in one-twenty-eights" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    MyEnumPriceType(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toEnumNameString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toFIXIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toFIXNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toFIXDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat(toEnumNameString())
                .concat("]")
                .concat("\n\tAction[")
                .concat(toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat(toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(toFIXDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return toEnumNameString()
                .concat("=[")
                .concat(toFIXIDString())
                .concat(",")
                .concat(toFIXNameString())
                .concat(",")
                .concat(toFIXDescriptionString())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (MyEnumPriceType oneEnum : MyEnumPriceType.values()) {
            System.out.println(oneEnum);
        }
    }
}
