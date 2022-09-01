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
 *  <p></p>
 *  Type of Trade Report
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Submit
 *  <p>    1 - Alleged
 *  <p>    2 - Accept
 *  <p>    3 - Decline
 *  <p>    4 - Addendum
 *  <p></p>
 *  <p>    5 - No-Was
 *  <p>    6 - Trade Report Cancel
 *  <p>    7 - (Locked-In) Trade Break
 *  <p>    8 - Defaulted
 *  <p>    9 - Invalid CMTA
 *  <p></p>
 *  <p>    10 - Pended
 *  <p>    11 - Alleged New
 *  <p>    12 - Alleged Addendum
 *  <p>    13 - Alleged No-Was
 *  <p>    14 - Alleged Trade Report Cancel
 *  <p></p>
 *  <p>    15 - Alleged (Locked-In) Trade Break
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
    public String toFIXLabelString() {
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
                .concat( toFIXLabelString())
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
        for (Enum856TradeReportType oneEnum : Enum856TradeReportType.values()) {
            System.out.println(oneEnum);
            System.out.println(oneEnum.toVerboseString());
        }
    }
}
