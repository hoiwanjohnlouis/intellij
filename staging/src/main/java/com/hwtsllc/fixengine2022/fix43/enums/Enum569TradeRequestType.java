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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  569
 *  TradeRequestType
 *  int
 *  <p></p>
 *  Type of Trade Capture Report.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - All Trades
 *  <p>    1 - Matched trades matching criteria provided on request
 *              (Parties, ExecID, TradeID, OrderID, Instrument, InputSource, etc.)
 *  <p>    2 - Unmatched trades that match criteria
 *  <p>    3 - Unreported trades that match criteria
 *  <p>    4 - Advisories that match criteria
 */
public enum Enum569TradeRequestType implements LogFIXString, LogVerboseString {
    /*
     *  0-4 types
     */
    ALL_TRADES( "0", "ALL_TRADES", "0 - All Trades" ),
    MATCHED_TRADES( "1", "MATCHED_TRADES", "1 - Matched trades matching criteria provided on request (Parties, ExecID, TradeID, OrderID, Instrument, InputSource, etc.)" ),
    UNMATCHED_TRADES( "2", "UNMATCHED_TRADES", "2 - Unmatched trades that match criteria" ),
    UNREPORTED_TRADES( "3", "UNREPORTED_TRADES", "3 - Unreported trades that match criteria" ),
    ADVISORIES( "4", "ADVISORIES", "4 - Advisories that match criteria" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum569TradeRequestType(final String id, final String name, final String description) {
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
        for (Enum569TradeRequestType oneEnum : Enum569TradeRequestType.values()) {
            System.out.println(oneEnum.toVerboseString());
        }
    }
}