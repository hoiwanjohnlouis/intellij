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

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

public enum Enum40OrdType implements EnumAccessors, LogStringVerbose {
    MARKET("1", "MARKET", "1 - Market" ),
    LIMIT("2", "LIMIT", "2 - Limit" ),
    STOP_OR_STOP_LOSS("3", "STOP_OR_STOP_LOSS", "3 - Stop or Stop Loss" ),
    STOP_LIMIT("4", "STOP_LIMIT", "4 - Stop Limit" ),
    MARKET_ON_CLOSE("5", "MARKET_ON_CLOSE", "5 - Market On Close (No longer used)" ),
    WITH_OR_WITHOUT("6", "WITH_OR_WITHOUT", "6 - With Or Without" ),
    LIMIT_OR_BETTER("7", "LIMIT_OR_BETTER", "7 - Limit Or Better" ),
    LIMIT_WITH_OR_WITHOUT("8", "LIMIT_WITH_OR_WITHOUT", "8 - Limit With Or Without" ),
    ON_BASIS("9", "ON_BASIS", "9 - On Basis" ),

    ON_CLOSE("A", "ON_CLOSE", "A - On Close (No longer used)" ),
    LIMIT_ON_CLOSE("B", "LIMIT_ON_CLOSE", "B - Limit On Close (No longer used)" ),
    FOREX_MARKET("C", "FOREX_MARKET", "C - Forex Market (No longer used)" ),
    PREVIOUSLY_QUOTED("D", "PREVIOUSLY_QUOTED", "D - Previously Quoted" ),
    PREVIOUSLY_INDICATED("E", "PREVIOUSLY_INDICATED", "E - Previously Indicated" ),
    FOREX_LIMIT("F", "FOREX_LIMIT", "F - Forex Limit (No longer used)" ),
    FOREX_SWAP("G", "FOREX_SWAP", "G - Forex Swap" ),
    FOREX_PREVIOUSLY_QUOTED("H", "FOREX_PREVIOUSLY_QUOTED", "H - Forex Previously Quoted (No longer used)" ),
    FUNARI("I", "FUNARI",
            "I - Funari (Limit day order with unexecuted portion handles as Market On Close. E.g. Japan)" ),
    MARKET_IF_TOUCHED("J", "MARKET_IF_TOUCHED", "J - Market If Touched (MIT)" ),
    MARKET_WITH_LEFT_OVER_AS_LIMIT("K", "MARKET_WITH_LEFT_OVER_AS_LIMIT",
            "K - Market With Left Over as Limit (market order with unexecuted quantity becoming limit order at last price)" ),
    PREVIOUS_FUND_VALUATION_POINT("L", "PREVIOUS_FUND_VALUATION_POINT",
            "L - Previous Fund Valuation Point (Historic pricing;  for CIV)" ),
    NEXT_FUND_VALUATION_POINT("M", "NEXT_FUND_VALUATION_POINT",
            "M - Next Fund Valuation Point (Forward pricing;  for CIV)" ),
    PEGGED("P", "PEGGED", "P - Pegged" ),
    COUNTER_ORDER_SELECTION("Q", "COUNTER_ORDER_SELECTION", "Q - Counter-order selection" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum40OrdType(final String id, final String name, final String description) {
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
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("\n\tEnumName[")
                .append(getEnumName())
                .append("]")
                .append("\n\tAction[")
                .append(getID())
                .append("]")
                .append("\n\tName[")
                .append(getName())
                .append("]")
                .append("\n\tDescription[")
                .append(getDescription())
                .append("]");
        return sb.toString();
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEnumName())
                .append("=[")
                .append(getID())
                .append(",")
                .append(getName())
                .append(",")
                .append(getDescription())
                .append("]");
        return sb.toString();
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum40OrdType oneEnum : Enum40OrdType.values()) {
            System.out.println(oneEnum);
        }
    }
}
