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
 *  104 (same as 104, 695)
 *  IOIQualifier
 *  char
 *  <p>
 *  Code to qualify IOI use.
 *  <p>
 *  (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  695  (same as 104, 695)
 *  QuoteQualifier
 *  char
 *  <p>
 *  Code to qualify Quote use
 *  <p>
 *  See IOIQualifier (104) for description and valid values.
 *  <p></p>
 *  Valid values:
 *  <p>    A - All or None (AON)
 *  <p>    B - Market On Close (MOC) (held to close)
 *  <p>    C - At the close (around/not held to close)
 *  <p>    D - VWAP (Volume Weighted Average Price)
 *  <p>    I - In touch with
 *  <p></p>
 *  <p>    L - Limit
 *  <p>    M - More Behind
 *  <p>    O - At the Open
 *  <p>    P - Taking a Position
 *  <p>    Q - At the Market (previously called Current Quote)
 *  <p></p>
 *  <p>    R - Ready to Trade
 *  <p>    S - Portfolio Shown
 *  <p>    T - Through the Day
 *  <p>    V - Versus
 *  <p>    W - Indication -  Working Away
 *  <p></p>
 *  <p>    X - Crossing Opportunity
 *  <p>    Y - At the Midpoint
 *  <p>    Z - Pre-open
 */
public enum MyEnumQualifier implements LogFIXString, LogVerboseString {
    ALL_OR_NONE("A", "ALL_OR_NONE", "A - All or None (AON)"),
    MARKET_ON_CLOSE("B", "MARKET_ON_CLOSE", "B - Market On Close (MOC) (held to close)"),
    AT_THE_CLOSE("C", "AT_THE_CLOSE", "C - At the close (around/not held to close)"),
    VWAP("D", "VWAP", "D - VWAP (Volume Weighted Average Price)"),
    IN_TOUCH_WITH("I", "IN_TOUCH_WITH", "I - In touch with"),

    LIMIT("L", "LIMIT", "L - Limit"),
    MORE_BEHIND("M", "MORE_BEHIND", "M - More Behind"),
    AT_THE_OPEN("O", "AT_THE_OPEN", "O - At the Open"),
    TAKING_A_POSITION("P", "TAKING_A_POSITION", "P - Taking a Position"),
    AT_THE_MARKET("Q", "AT_THE_MARKET", "Q - At the Market (previously called Current Quote)"),

    READY_TO_TRADE("R", "READY_TO_TRADE", "R - Ready to Trade"),
    PORTFOLIO_SHOWN("S", "PORTFOLIO_SHOWN", "S - Portfolio Shown"),
    THROUGH_THE_DAY("T", "THROUGH_THE_DAY", "T - Through the Day"),
    VERSUS("V", "VERSUS", "V - Versus"),
    INDICATION_WORKING_AWAY("W", "INDICATION_WORKING_AWAY", "W - Indication -  Working Away"),

    CROSSING_OPPORTUNITY("X", "CROSSING_OPPORTUNITY", "X - Crossing Opportunity"),
    AT_THE_MIDPOINT("Y", "AT_THE_MIDPOINT", "Y - At the Midpoint"),
    PRE_OPEN("Z", "PRE_OPEN", "Z - Pre-open"),
    ;

    private final String id;
    private final String name;
    private final String description;

    MyEnumQualifier(final String id, final String name, final String description) {
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
        for (MyEnumQualifier oneEnum : MyEnumQualifier.values()) {
            System.out.println(oneEnum);
        }
    }
}
