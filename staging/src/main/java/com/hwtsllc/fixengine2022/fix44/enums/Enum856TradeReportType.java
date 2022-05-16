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
 *  856
 *  TradeReportType
 *  int
 *  Type of Trade Report
 *  Valid values:
 *      0 - Submit
 *      1 - Alleged
 *      2 - Accept
 *      3 - Decline
 *      4 - Addendum
 *      5 - No-Was
 *      6 - Trade Report Cancel
 *      7 - (Locked-In) Trade Break
 *      8 - Defaulted
 *      9 - Invalid CMTA
 *      10 - Pended
 *      11 - Alleged New
 *      12 - Alleged Addendum
 *      13 - Alleged No-Was
 *      14 - Alleged Trade Report Cancel
 *      15 - Alleged (Locked-In) Trade Break
 */
public enum Enum856TradeReportType implements LogFIXString, LogVerboseString {
    SUBMIT( "0", "SUBMIT", "0 - Submit" ),
    ALLEGED( "1", "ALLEGED", "1 - Alleged" ),
    ACCEPT( "2", "ACCEPT", "2 - Accept" ),
    DECLINE( "3", "DECLINE", "3 - Decline" ),
    ADDENDUM( "4", "ADDENDUM", "4 - Addendum" ),

    NO_WAS( "5", "NO_WAS", "5 - No-Was" ),
    TRADE_REPORT_CANCEL( "6", "TRADE_REPORT_CANCEL", "6 - Trade Report Cancel" ),
    LOCKED_IN_TRADE_BREAK( "7", "LOCKED_IN_TRADE_BREAK", "7 - (Locked-In) Trade Break" ),
    DEFAULTED( "8", "DEFAULTED", "8 - Defaulted" ),
    INVALID_CMTA( "9", "INVALID_CMTA", "9 - Invalid CMTA" ),

    PENDED( "10", "PENDED", "10 - Pended" ),
    ALLEGED_NEW( "11", "ALLEGED_NEW", "11 - Alleged New" ),
    ALLEGED_ADDENDUM( "12", "ALLEGED_ADDENDUM", "12 - Alleged Addendum" ),
    ALLEGED_NO_WAS( "13", "ALLEGED_NO_WAS", "13 - Alleged No-Was" ),
    ALLEGED_TRADE_REPORT_CANCEL( "14", "ALLEGED_TRADE_REPORT_CANCEL", "14 - Alleged Trade Report Cancel" ),

    ALLEGED_LOCKED_IN_TRADE_BREAK( "15", "ALLEGED_LOCKED_IN_TRADE_BREAK", "15 - Alleged (Locked-In) Trade Break" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum856TradeReportType(final String id, final String name, final String description) {
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
        for (Enum856TradeReportType oneEnum : Enum856TradeReportType.values()) {
            System.out.println(oneEnum);
        }
    }
}
