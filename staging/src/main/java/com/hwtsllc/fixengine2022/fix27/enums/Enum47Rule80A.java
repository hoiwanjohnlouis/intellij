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

import com.hwtsllc.fixengine2022.interfaces.LogFIXString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  47
 *  Rule80A(No Longer Used)
 *  char
 *  Deprecated in FIX.4.3
 *  Note that the name of this field is changing to 'OrderCapacity' as Rule80A is a
 *  very US market-specific term. Other world markets need to convey similar information,
 *  however, often a subset of the US values.
 *
 *      See the 'Rule80A (aka OrderCapacity) Usage by Market' appendix
 *      for market-specific usage of this field.
 *
 *  Valid values:
 *      A - Agency single order
 *      B - Short exempt transaction (refer to A type)
 *      C - Program order, non-index arb, for Member firm/org
 *      D - Program order, index arb, for Member firm/org
 *      E - Short Exempt Transaction for Principal
 *          (was incorrectly identified in the FIX spec as "Registered Equity Market Maker trades")
 *
 *      F - Short exempt transaction (refer to W type)
 *      H - Short exempt transaction (refer to I type)
 *      I - Individual Investor, single order
 *      J - Program Order, index arb, for individual customer
 *      K - Program Order, non-index arb, for individual customer
 *
 *      L - Short exempt transaction for member competing market-maker affliated with the firm clearing the trade
 *          (refer to P and O types)
 *      M - Program Order, index arb, for other member
 *      N - Program Order, non-index arb, for other member
 *      O - Proprietary transactions for competing market-maker that is affiliated with the clearing member
 *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
 *      P - Principal
 *
 *      R - Transactions for the account of a non-member compting market-maker
 *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
 *      S - Specialist trades
 *      T - Transactions for the account of an unaffiliated member's competing market-maker
 *          (was incorrectly identified in the FIX spec as "Competing dealer trades")
 *      U - Program Order, index arb, for other agency
 *      W - All other orders as agent for other member
 *
 *      X - Short exempt transaction for member competing market-maker not affiliated with the firm clearing the trade
 *      (refer to W and T types)
 *      Y - Program Order, non-index arb, for other agency
 *      Z - Short exempt transaction for non-member competing market-maker (refer to A and R types)
 */
public enum Enum47Rule80A implements LogFIXString, LogVerboseString {
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

    private final String id;
    private final String name;
    private final String description;

    Enum47Rule80A(final String id, final String name, final String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /**
     * standard wrapper to retrieve the specific enum name
     */
    @Override
    public String toEnumNameString() {
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
                .concat(toEnumNameString())
                .concat("]")
                .concat("\n\tAction[")
                .concat(toFIXIDString())
                .concat("]")
                .concat("\n\tName[")
                .concat(toFIXNameString())
                .concat("]")
                .concat("\n\tDescription[")
                .concat(toFIXDescriptionString())
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing this enum
     */
    @Override
    public String toString() {
        return toEnumNameString()
                .concat("=[")
                .concat(toFIXIDString())
                .concat(",")
                .concat(toFIXNameString())
                .concat(",")
                .concat(toFIXDescriptionString())
                .concat("]");
    }

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum47Rule80A oneEnum : Enum47Rule80A.values()) {
            System.out.println(oneEnum);
        }
    }
}
