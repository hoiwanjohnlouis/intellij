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
    AGENCY_SINGLE_ORDER("A", "AGENCY_SINGLE_ORDER",
            "A - Agency single order"),
    SHORT_EXEMPT_A("B", "SHORT_EXEMPT_A",
            "B - Short exempt transaction (refer to A type)"),
    PROGRAM_NON_INDEX_ARB_MEMBER("C", "PROGRAM_NON_INDEX_ARB_MEMBER",
            "C - Program order, non-index arb, for Member firm/org"),
    PROGRAM_INDEX_ARB_MEMBER("D", "PROGRAM_INDEX_ARB_MEMBER",
            "D - Program order, index arb, for Member firm/org"),
    SHORT_EXEMPT_P("E", "SHORT_EXEMPT_P",
            "E - Short Exempt Transaction for Principal"),
    SHORT_EXEMPT_W("F", "SHORT_EXEMPT_W",
            "F - Short exempt transaction (refer to W type)"),
    SHORT_EXEMPT_I("H", "SHORT_EXEMPT_I",
            "H - Short exempt transaction (refer to I type)"),
    INDIVIDUAL_INVESTOR_SINGLE_ORDER("I", "INDIVIDUAL_INVESTOR_SINGLE_ORDER",
            "I - Individual Investor, single order"),
    PROGRAM_INDEX_ARB_INDIVIDUAL("J", "PROGRAM_INDEX_ARB_INDIVIDUAL",
            "J - Program Order, index arb, for individual customer"),
    PROGRAM_NON_INDEX_ARB_INDIVIDUAL("K", "PROGRAM_NON_INDEX_ARB_INDIVIDUAL",
            "K - Program Order, non-index arb, for individual customer"),
    SHORT_EXEMPT_MARKET_MAKER_P_O("L", "SHORT_EXEMPT_MARKET_MAKER_P_O",
            "L - Short exempt transaction for member competing market-maker affiliated " +
                            "with the firm clearing the trade (refer to P and O types)"),
    PROGRAM_INDEX_ARB_OTHER_MEMBER("M", "PROGRAM_INDEX_ARB_OTHER_MEMBER",
            "M - Program Order, index arb, for other member"),
    PROGRAM_NON_INDEX_ARB_OTHER_MEMBER("N", "PROGRAM_NON_INDEX_ARB_OTHER_MEMBER",
            "N - Program Order, non-index arb, for other member"),
    PROPRIETARY_MARKET_MAKER_CLEARING("O", "PROPRIETARY_MARKET_MAKER_CLEARING",
            "O - Proprietary transactions for competing market-maker that is affiliated " +
                            "with the clearing member"),
    PRINCIPAL("P", "PRINCIPAL",
            "P - Principal"),
    NON_MEMBER_MARKET_MAKER("R", "NON_MEMBER_MARKET_MAKER",
            "R - Transactions for the account of a non-member competing market-maker"),
    SPECIALIST_TRADES("S", "SPECIALIST_TRADES",
            "S - Specialist trades"),
    UNAFFILIATED_MEMBER_MARKET_MAKER("T", "UNAFFILIATED_MEMBER_MARKET_MAKER",
            "T - Transactions for the account of an unaffiliated member's competing market-maker"),
    PROGRAM_INDEX_ARB_OTHER_AGENCY("U", "PROGRAM_INDEX_ARB_OTHER_AGENCY",
            "U - Program Order, index arb, for other agency"),
    AGENT_FOR_OTHER_MEMBER("W", "AGENT_FOR_OTHER_MEMBER",
            "W - All other orders as agent for other member"),
    SHORT_EXEMPT_MARKET_MAKER_W_T("X", "SHORT_EXEMPT_MARKET_MAKER_W_T",
            "X - Short exempt transaction for member competing market-maker not affiliated with " +
                            "the firm clearing the trade (refer to W and T types)"),
    PROGRAM_NON_INDEX_ARB_OTHER_AGENCY("Y", "PROGRAM_NON_INDEX_ARB_OTHER_AGENCY",
            "Y - Program Order, non-index arb, for other agency"),
    SHORT_EXEMPT_NON_MEMBER_MARKET_MAKER_A_R("Z", "SHORT_EXEMPT_NON_MEMBER_MARKET_MAKER_A_R",
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
        System.out.println(Enum47Rule80A.AGENCY_SINGLE_ORDER);
        System.out.println(Enum47Rule80A.SHORT_EXEMPT_A);
        System.out.println(Enum47Rule80A.PROGRAM_NON_INDEX_ARB_MEMBER);
        System.out.println(Enum47Rule80A.PROGRAM_INDEX_ARB_MEMBER);
        System.out.println(Enum47Rule80A.SHORT_EXEMPT_P);

        System.out.println(Enum47Rule80A.SHORT_EXEMPT_W);
        System.out.println(Enum47Rule80A.SHORT_EXEMPT_I);
        System.out.println(Enum47Rule80A.INDIVIDUAL_INVESTOR_SINGLE_ORDER);
        System.out.println(Enum47Rule80A.PROGRAM_INDEX_ARB_INDIVIDUAL);
        System.out.println(Enum47Rule80A.PROGRAM_NON_INDEX_ARB_INDIVIDUAL);

        System.out.println(Enum47Rule80A.SHORT_EXEMPT_MARKET_MAKER_P_O);
        System.out.println(Enum47Rule80A.PROGRAM_INDEX_ARB_OTHER_MEMBER);
        System.out.println(Enum47Rule80A.PROPRIETARY_MARKET_MAKER_CLEARING);
        System.out.println(Enum47Rule80A.PRINCIPAL);
        System.out.println(Enum47Rule80A.NON_MEMBER_MARKET_MAKER);

        System.out.println(Enum47Rule80A.SPECIALIST_TRADES);
        System.out.println(Enum47Rule80A.UNAFFILIATED_MEMBER_MARKET_MAKER);
        System.out.println(Enum47Rule80A.PROGRAM_INDEX_ARB_OTHER_AGENCY);
        System.out.println(Enum47Rule80A.AGENT_FOR_OTHER_MEMBER);
        System.out.println(Enum47Rule80A.SHORT_EXEMPT_MARKET_MAKER_W_T);

        System.out.println(Enum47Rule80A.PROGRAM_NON_INDEX_ARB_OTHER_AGENCY);
        System.out.println(Enum47Rule80A.SHORT_EXEMPT_NON_MEMBER_MARKET_MAKER_A_R);
    }
}
