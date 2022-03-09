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

public enum Enum47Rule80A {
    AGENCY_SINGLE_ORDER("A", "",
            "A - Agency single order"),
    SHORT_SELL_EXEMPT_A("B", "",
            "B - Short exempt transaction (refer to A type)"),
    PROGRAM_NON_INDEX_ARB_MEMBER("C", "",
            "C - Program order, non-index arb, for Member firm/org"),
    PROGRAM_INDEX_ARB_MEMBER("D", "",
            "D - Program order, index arb, for Member firm/org"),
    SHORT_SELL_EXEMPT_P("E", "",
            "E - Short Exempt Transaction for Principal"),
    SHORT_SELL_EXEMPT_W("F", "",
            "F - Short exempt transaction (refer to W type)"),
    SHORT_SELL_EXEMPT_I("H", "",
            "H - Short exempt transaction (refer to I type)"),
    INDIVIDUAL_INVESTOR_SINGLE_ORDER("I", "",
            "I - Individual Investor, single order"),
    PROGRAM_INDEX_ARB_INDIVIDUAL("J", "",
            "J - Program Order, index arb, for individual customer"),
    PROGRAM_NON_INDEX_ARB_INDIVIDUAL("K", "",
            "K - Program Order, non-index arb, for individual customer"),
    AGENCY_SINGLE_ORDER("L", "",
            "L - Short exempt transaction for member competing market-maker affliated with the " +
                            "firm clearing the trade (refer to P and O types)"),
    PROGRAM_INDEX_ARB_OTHER("M", "",
            "M - Program Order, index arb, for other member"),
    PROGRAM_NON_INDEX_ARB_OTHER("N", "",
            "N - Program Order, non-index arb, for other member"),
    AGENCY_SINGLE_ORDER("O", "",
            "O - Proprietary transactions for competing market-maker that is affiliated with the" +
                            " clearing memberr"),
    PRINCIPAL("P", "",
            "P - Principal"),
    AGENCY_SINGLE_ORDER("R", "",
            "R - Transactions for the account of a non-member competing market-maker"),
    SPECIALIST_TRADES("S", "",
            "S - Specialist trades"),
    AGENCY_SINGLE_ORDER("T", "",
            "T - Transactions for the account of an unaffiliated member's competing market-maker"),
    AGENCY_SINGLE_ORDER("U", "",
            "U - Program Order, index arb, for other agency"),
    AGENCY_SINGLE_ORDER("W", "",
            "W - All other orders as agent for other member"),
    AGENCY_SINGLE_ORDER("X", "",
            "X - Short exempt transaction for member competing market-maker not affiliated with " +
                            "the firm clearing the trade (refer to W and T types)"),
    AGENCY_SINGLE_ORDER("Y", "",
            "Y - Program Order, non-index arb, for other agency"),
    AGENCY_SINGLE_ORDER("Z", "",
            "Z - Short exempt transaction for non-member competing market-maker (refer to A and R types)"),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum47Rule80A(final String action, final String name, final String description) {
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
        System.out.println();
    }
}
