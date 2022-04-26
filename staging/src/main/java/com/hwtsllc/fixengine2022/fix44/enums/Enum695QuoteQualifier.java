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

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum695QuoteQualifier implements EnumAccessors, LogStringVerbose {
    /**
     *  695  (same as 104, 695)
     *  QuoteQualifier
     *  Code to qualify Quote use
     *          See IOIQualifier (104) for description and valid values.
     *  Valid values:
     *      A - All or None (AON)
     *      B - Market On Close (MOC) (held to close)
     *      C - At the close (around/not held to close)
     *      D - VWAP (Volume Weighted Average Price)
     *      I - In touch with
     *      L - Limit
     *      M - More Behind
     *      O - At the Open
     *      P - Taking a Position
     *      Q - At the Market (previously called Current Quote)
     *      R - Ready to Trade
     *      S - Portfolio Shown
     *      T - Through the Day
     *      V - Versus
     *      W - Indication -  Working Away
     *      X - Crossing Opportunity
     *      Y - At the Midpoint
     *      Z - Pre-open
     */
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

    Enum695QuoteQualifier(final String id, final String name, final String description) {
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
        for (Enum695QuoteQualifier oneEnum : Enum695QuoteQualifier.values()) {
            System.out.println(oneEnum);
        }
    }
}
