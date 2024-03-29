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

package com.hwtsllc.fix.enums.fix43;

import com.hwtsllc.fix.interfaces.LogFIXString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  487
 *  TradeReportTransType
 *  int
 *  <p></p>
 *  Identifies Trade Report message transaction type
 *  <p></p>
 *  (Prior to FIX 4.4 this field was of type char)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    1 - Cancel
 *  <p>    2 - Replace
 *  <p>    3 - Release
 *  <p>    4 - Reverse
 *  <p></p>
 *  <p>    5 - Cancel Due To Back Out of Trade
 */
public enum Enum487TradeReportTransType implements LogFIXString, LogVerboseString {
    /*
     * 0-5 types
     */
    NEW("0", "NEW", "0 - New" ),
    CANCEL("1", "CANCEL", "1 - Cancel" ),
    REPLACE("2", "REPLACE", "2 - Replace" ),
    RELEASE("3", "RELEASE", "3 - Release" ),
    REVERSE("4", "REVERSE", "4 - Reverse" ),

    CANCEL_BACK_OUT_TRADE("5", "CANCEL_BACK_OUT_TRADE", "5 - Cancel Due To Back Out of Trade" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum487TradeReportTransType(final String id, final String name, final String description) {
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
         * dump all the enum values for review
         */
        for (Enum487TradeReportTransType oneEnum : Enum487TradeReportTransType.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}