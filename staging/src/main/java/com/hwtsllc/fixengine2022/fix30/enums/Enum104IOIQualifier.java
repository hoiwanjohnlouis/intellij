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

package com.hwtsllc.fixengine2022.fix30.enums;

import com.hwtsllc.fixengine2022.msgs.application.Quote;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum Enum104IOIQualifier {
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

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum104IOIQualifier(final String action, final String name, final String description) {
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
        System.out.println(Enum104IOIQualifier.ALL_OR_NONE);
        System.out.println(Enum104IOIQualifier.MARKET_ON_CLOSE);
        System.out.println(Enum104IOIQualifier.AT_THE_CLOSE);
        System.out.println(Enum104IOIQualifier.VWAP);
        System.out.println(Enum104IOIQualifier.IN_TOUCH_WITH);

        System.out.println(Enum104IOIQualifier.LIMIT);
        System.out.println(Enum104IOIQualifier.MORE_BEHIND);
        System.out.println(Enum104IOIQualifier.AT_THE_OPEN);
        System.out.println(Enum104IOIQualifier.TAKING_A_POSITION);
        System.out.println(Enum104IOIQualifier.AT_THE_MARKET);

        System.out.println(Enum104IOIQualifier.READY_TO_TRADE);
        System.out.println(Enum104IOIQualifier.PORTFOLIO_SHOWN);
        System.out.println(Enum104IOIQualifier.THROUGH_THE_DAY);
        System.out.println(Enum104IOIQualifier.VERSUS);
        System.out.println(Enum104IOIQualifier.INDICATION_WORKING_AWAY);

        System.out.println(Enum104IOIQualifier.CROSSING_OPPORTUNITY);
        System.out.println(Enum104IOIQualifier.AT_THE_MIDPOINT);
        System.out.println(Enum104IOIQualifier.PRE_OPEN);
    }
}
