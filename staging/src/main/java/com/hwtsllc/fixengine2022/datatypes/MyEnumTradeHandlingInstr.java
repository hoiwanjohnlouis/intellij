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
 *  1123 (same as 1123, 1124,)
 *  TradeHandlingInstr
 *  char
 *  <p>
 *  Specified how the Trade Capture Report should be handled by the Respondent.
 *  <p></p>
 *  1124
 *  OrigTradeHandlingInstr
 *  char
 *  <p>
 *  Optionally used with TradeHandlingInstr = 0 to relay the trade handling instruction
 *  used when reporting the trade to the marketplace.
 *  <p>
 *  Same values as TradeHandlingInstr (1123)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Trade Confirmation
 *  <p>    1 - Two-Party Report
 *  <p>    2 - One-Party Report for Matching
 *  <p>    3 - One-Party Report for Pass Through
 *  <p>    4 - Automated Floor Order Routing
 */
public enum MyEnumTradeHandlingInstr implements LogFIXString, LogVerboseString {
    TRADE_CONFIRMATION( "0", "TRADE_CONFIRMATION", "0 - Trade Confirmation" ),
    TWO_PARTY_REPORT( "1", "TWO_PARTY_REPORT", "1 - Two-Party Report" ),
    ONE_PARTY_MATCHING( "2", "ONE_PARTY_MATCHING", "2 - One-Party Report for Matching" ),
    ONE_PARTY_PASS_THROUGH( "3", "ONE_PARTY_PASS_THROUGH", "3 - One-Party Report for Pass Through" ),
    AUTOMATED_ROUTING( "4", "AUTOMATED_ROUTING", "4 - Automated Floor Order Routing" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    MyEnumTradeHandlingInstr(final String id, final String name, final String description) {
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
        for (MyEnumTradeHandlingInstr oneEnum : MyEnumTradeHandlingInstr.values()) {
            System.out.println(oneEnum);
        }
    }
}
