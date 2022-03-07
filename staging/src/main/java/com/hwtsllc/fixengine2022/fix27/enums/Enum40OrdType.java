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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum Enum40OrdType {
    MARKET("1", "NEW", "Market" ),
    LIMIT("2", "NEW", "Limit" ),
    STOP_OR_STOP_LOSS("3", "NEW", "Stop or Stop Loss" ),
    STOP_LIMIT("4", "NEW", "Stop Limit" ),
    MARKET_ON_CLOSE("5", "NEW", "Market On Close (No longer used)" ),
    WITH_OR_WITHOUT("6", "NEW", "With Or Without" ),
    LIMIT_OR_BETTER("7", "NEW", "Limit Or Better" ),
    LIMIT_WITH_OR_WITHOUT("8", "NEW", "Limit With Or Without" ),
    ON_BASIS("9", "NEW", "On Basis" ),
    ON_CLOSE("A", "NEW", "On Close (No longer used)" ),
    LIMIT_ON_CLOSE("B", "NEW", "Limit On Close (No longer used)" ),
    FOREX_MARKET("C", "NEW", "Forex Market (No longer used)" ),
    PREVIOUSLY_QUOTED("D", "NEW", "Previously Quoted" ),
    PREVIOUSLY_INDICATED("E", "NEW", "Previously Indicated" ),
    FOREX_LIMIT("F", "NEW", "Forex Limit (No longer used)" ),
    FOREX_SWAP("G", "NEW", "Forex Swap" ),
    FOREX_PREVIOUSLY_QUOTED("H", "NEW", "Forex Previously Quoted (No longer used)" ),
    FUNARI("I", "NEW", "Funari (Limit day order with unexecuted portion handles as Market On Close. E.g. Japan)" ),
    MARKET_IF_TOUCHED("J", "NEW", "Market If Touched (MIT)" ),
    MARKET_WITH_LEFT_OVER_AS_LIMIT("K", "NEW", "Market With Left Over as Limit (market order with unexecuted quantity becoming limit order at last price)" ),
    PREVIOUS_FUND_VALUATION_POINT("L", "NEW", "Previous Fund Valuation Point (Historic pricing;  for CIV)" ),
    NEXT_FUND_VALUATION_POINT("M", "NEW", "Next Fund Valuation Point (Forward pricing;  for CIV)" ),
    PEGGED("P", "NEW", "Pegged" ),
    COUNTER_ORDER_SELECTION("Q", "NEW", "Counter-order selection" ),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum40OrdType(final String action, final String name, final String description) {
        this.action = action;
        this.name = name;
        this.description = description;
    }

    public String getEnumName() {
        return this.name();
    }
    public String getAction() {
        return action;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getEnumName())
                .append("=[")
                .append(getAction())
                .append(",")
                .append(getName())
                .append(",")
                .append(getDescription())
                .append("]");
        return sb.toString();
    }
    public String toLogStringVerbose() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName())
                .append("\n\tEnumName[")
                .append(getEnumName())
                .append("]")
                .append("\n\tAction[")
                .append(getAction())
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
     *
     */
    public static void main(String[] args) {
        System.out.println(Enum40OrdType.MARKET);
        System.out.println(Enum40OrdType.LIMIT);
        System.out.println(Enum40OrdType.STOP_OR_STOP_LOSS);
        System.out.println(Enum40OrdType.STOP_LIMIT);
        System.out.println(Enum40OrdType.MARKET_ON_CLOSE);
        System.out.println(Enum40OrdType.WITH_OR_WITHOUT);
        System.out.println(Enum40OrdType.LIMIT_OR_BETTER);
        System.out.println(Enum40OrdType.LIMIT_WITH_OR_WITHOUT);
        System.out.println(Enum40OrdType.ON_BASIS);
        System.out.println(Enum40OrdType.ON_CLOSE);
        System.out.println(Enum40OrdType.LIMIT_ON_CLOSE);
        System.out.println(Enum40OrdType.FOREX_MARKET);
        System.out.println(Enum40OrdType.PREVIOUSLY_QUOTED);
        System.out.println(Enum40OrdType.PREVIOUSLY_INDICATED);
        System.out.println(Enum40OrdType.FOREX_LIMIT);
        System.out.println(Enum40OrdType.FOREX_SWAP);
        System.out.println(Enum40OrdType.FOREX_PREVIOUSLY_QUOTED);
        System.out.println(Enum40OrdType.FUNARI);
        System.out.println(Enum40OrdType.MARKET_IF_TOUCHED);
        System.out.println(Enum40OrdType.MARKET_WITH_LEFT_OVER_AS_LIMIT);
        System.out.println(Enum40OrdType.PREVIOUS_FUND_VALUATION_POINT);
        System.out.println(Enum40OrdType.NEXT_FUND_VALUATION_POINT);
        System.out.println(Enum40OrdType.PEGGED);
        System.out.println(Enum40OrdType.COUNTER_ORDER_SELECTION);
    }
}
