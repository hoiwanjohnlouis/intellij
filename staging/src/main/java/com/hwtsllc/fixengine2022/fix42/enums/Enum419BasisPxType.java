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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  419
 *  BasisPxType
 *  char
 *  <p>
 *  Code to represent the basis price type.
 *  <p></p>
 *  Valid values:
 *  <p>    2 - Closing price at morning session
 *  <p>    3 - Closing price
 *  <p>    4 - Current price
 *  <p>    5 - SQ
 *  <p>    6 - VWAP through a day
 *  <p></p>
 *  <p>    7 - VWAP through a morning session
 *  <p>    8 - VWAP through an afternoon session
 *  <p>    9 - VWAP through a day except "YORI" (an opening auction)
 *  <p></p>
 *  <p>    A - VWAP through a morning session except "YORI" (an opening auction)
 *  <p>    B - VWAP through an afternoon session except "YORI" (an opening auction)
 *  <p>    C - Strike
 *  <p>    D - Open
 *  <p></p>
 *  <p>    Z - Others
 */
public enum Enum419BasisPxType implements LogFIXString, LogVerboseString {
    /*
     * 2-9, A-D, Z msg types
     */
    CLOSING_PRICE_MORNING( "2", "CLOSING_PRICE_MORNING",
            "2 - Closing price at morning session" ),
    CLOSING_PRICE( "3", "CLOSING_PRICE",
            "3 - Closing price" ),
    CURRENT_PRICE( "4", "CURRENT_PRICE",
            "4 - Current price" ),
    SQ( "5", "SQ",
            "5 - SQ" ),
    VWAP_DAY( "6", "VWAP_DAY",
            "6 - VWAP through a day" ),

    VWAP_MORNING( "7", "VWAP_MORNING",
            "7 - VWAP through a morning session" ),
    VWAP_AFTERNOON( "8", "VWAP_AFTERNOON",
            "8 - VWAP through an afternoon session" ),
    VWAP_DAY_EXCEPT_YORI( "9", "VWAP_DAY_EXCEPT_YORI",
            "9 - VWAP through a day except YORI (an opening auction)" ),

    VWAP_MORNING_EXCEPT_YORI( "A", "VWAP_MORNING_EXCEPT_YORI",
            "A - VWAP through a morning session except YORI (an opening auction)" ),
    VWAP_AFTERNOON_EXCEPT_YORI( "B", "VWAP_AFTERNOON_EXCEPT_YORI",
            "B - VWAP through an afternoon session except YORI (an opening auction)" ),
    STRIKE( "C", "STRIKE",
            "C - Strike" ),
    OPEN( "D", "OPEN",
            "D - Open" ),

    OTHER( "Z", "OTHER",
            "Z - Others" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum419BasisPxType(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toEnumLabelString() {
        return this.name();
    }
    /**
     * standard wrapper to retrieve the specific fix action code for this enum. eg: the first field
     */
    @Override
    public String toEnumIDString() {
        return id;
    }
    /**
     * standard wrapper to retrieve the specific fix name for this enum. eg: the second field
     */
    @Override
    public String toEnumNameString() {
        return name;
    }
    /**
     * standard wrapper to retrieve the specific fix description for this enum. eg: the third field
     */
    @Override
    public String toEnumDescriptionString() {
        return description;
    }
    /**
     * standard wrapper to format a detailed string describing this enum
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n\tEnumName[")
                .concat( toEnumLabelString())
                .concat("]")
                .concat("\n\tAction[")
                .concat( toEnumIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat( toEnumNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat( toEnumDescriptionString())
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
        for (Enum419BasisPxType oneEnum : Enum419BasisPxType.values()) {
            System.out.println(oneEnum);
        }
    }
}
