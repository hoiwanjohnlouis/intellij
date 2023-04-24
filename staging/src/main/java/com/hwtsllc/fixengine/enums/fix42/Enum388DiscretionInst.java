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

package com.hwtsllc.fixengine.enums.fix42;

import com.hwtsllc.fixengine.interfaces.LogFIXString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  388
 *  DiscretionInst
 *  char
 *  <p>
 *  Code to identify the price a DiscretionOffsetValue (389) is related to and should be mathematically added to.
 *  <p></p>
 *  Valid values:
 *  <p>     0 - Related to displayed price
 *  <p>     1 - Related to market price
 *  <p>     2 - Related to primary price
 *  <p>     3 - Related to local primary price
 *  <p>     4 - Related to midpoint price
 *  <p></p>
 *  <p>     5 - Related to last trade price
 *  <p>     6 - Related to VWAP
 *  <p>     7 - Average Price Guarantee
 */
public enum Enum388DiscretionInst implements LogFIXString, LogVerboseString {
    /*
     * 0-7 msg types
     */
    RELATED_TO_DISPLAYED_PRICE( "0", "RELATED_TO_DISPLAYED_PRICE",
            "0 - Related to displayed price" ),
    RELATED_TO_MARKET_PRICE( "1", "RELATED_TO_MARKET_PRICE",
            "1 - Related to market price" ),
    RELATED_TO_PRIMARY_PRICE( "2", "RELATED_TO_PRIMARY_PRICE",
            "2 - Related to primary price" ),
    RELATED_TO_LOCAL_PRIMARY_PRICE( "3", "RELATED_TO_LOCAL_PRIMARY_PRICE",
            "3 - Related to local primary price" ),
    RELATED_TO_MIDPOINT_PRICE( "4", "RELATED_TO_MIDPOINT_PRICE",
            "4 - Related to midpoint price" ),

    RELATED_TO_LAST_TRADE_PRICE( "5", "RELATED_TO_LAST_TRADE_PRICE",
            "5 - Related to last trade price" ),
    RELATED_TO_VWAP( "6", "RELATED_TO_VWAP",
            "6 - Related to VWAP" ),
    AVERAGE_PRICE_GUARANTEE( "7", "AVERAGE_PRICE_GUARANTEE",
            "7 - Average Price Guarantee" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum388DiscretionInst(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toFIXLabelString() {
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
                .concat( toFIXLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toFIXDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return id;
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum388DiscretionInst oneEnum : Enum388DiscretionInst.values()) {
            System.out.println(oneEnum);
        }
    }
}
