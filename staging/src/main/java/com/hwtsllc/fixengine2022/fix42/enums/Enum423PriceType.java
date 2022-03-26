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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum423PriceType implements EnumAccessors, LogStringVerbose {
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

    Enum423PriceType(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String getEnumName() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String getID() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String getName() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String getDescription() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toLogStringVerbose() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat(getEnumName())
                .concat("]")
                .concat("\n\tAction[")
                .concat(getID())
                .concat("]")
                .concat("\n\tName[")
                .concat(getName())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(getDescription())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return getEnumName()
                .concat("=[")
                .concat(getID())
                .concat(",")
                .concat(getName())
                .concat(",")
                .concat(getDescription())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum423PriceType oneEnum : Enum423PriceType.values()) {
            System.out.println(oneEnum);
        }
    }
}
