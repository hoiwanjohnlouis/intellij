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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
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
public enum Enum692QuotePriceType implements LogFIXString, LogVerboseString {
    PERCENT( "1", "PERCENT", "1 - Percent (percent of par)" ),
    PER_SHARE( "2", "PER_SHARE", "2 - Per Share (e.g. cents per share)" ),
    FIXED_AMOUNT( "3", "FIXED_AMOUNT", "3 - Fixed Amount (absolute value)" ),
    DISCOUNT( "4", "DISCOUNT", "4 - Discount - percentage points below par" ),
    PREMIUM( "5", "PREMIUM", "5 - Premium - percentage points over par" ),

    SPREAD( "6", "SPREAD", "6 - Spread - basis points relative to benchmark" ),
    TED_PRICE( "7", "TED_PRICE", "7 - TED Price" ),
    TED_YIELD( "8", "TED_YIELD", "8 - TED Yield" ),
    YIELD_SPREAD( "9", "YIELD_SPREAD", "9 - Yield Spread (swaps)" ),
    YIELD( "10", "YIELD", "10 - Yield" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum692QuotePriceType(final String id, final String name, final String description) {
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
        for (Enum692QuotePriceType oneEnum : Enum692QuotePriceType.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
