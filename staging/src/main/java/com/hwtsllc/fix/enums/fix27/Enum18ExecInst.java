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

package com.hwtsllc.fix.enums.fix27;

import com.hwtsllc.fix.interfaces.LogFIXString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  18
 *  ExecInst
 *  MultipleCharValue
 *  <p></p>
 *  Instructions for order handling on exchange trading floor.
 *  <p></p>
 *  If more than one instruction is applicable to an order,
 *  this field can contain multiple instructions separated by space.
 *  <p></p>
 *  *** SOME VALUES HAVE BEEN REPLACED ***
 *  *** See Replaced Features and Supported Approach ***
 *  <p></p>
 *  (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Stay on offer side
 *  <p>    1 - Not held
 *  <p>    2 - Work
 *  <p>    3 - Go along
 *  <p>    4 - Over the day
 *  <p></p>
 *  <p>    5 - Held
 *  <p>    6 - Participant don't initiate
 *  <p>    7 - Strict scale
 *  <p>    8 - Try to scale
 *  <p>    9 - Stay on bid side
 *  <p></p>
 *  <p>    A - No cross (cross is forbidden)
 *  <p>    B - OK to cross
 *  <p>    C - Call first
 *  <p>    D - Percent of volume
 *          (indicates that the sender does not want
 *          all the volume on the floor vs. a specific percentage)
 *  <p>    E - Do not increase - DNI
 *  <p></p>
 *  <p>    F - Do not reduce - DNR
 *  <p>    G - All or none - AON
 *  <p>    H - Reinstate on system failue (mutually exclusive with Q)
 *  <p>    I - Institutions only
 *  <p>    J - Reinstate on Trading Halt (mutually exclusive with K)
 *  <p></p>
 *  <p>    K - Cancel on Trading Halt (mutually exclusive with J)
 *  <p>    L - Last peg (last sale)
 *  <p>    M - Mid-price peg (midprice of inside quote)
 *  <p>    N - Non-negotiable
 *  <p>    O - Opening peg
 *  <p></p>
 *  <p>    P - Market peg
 *  <p>    Q - Cancel on system failure (mutually exclusive with H)
 *  <p>    R - Primary peg (primary market - buy at bid/sell at offer)
 *  <p>    S - Suspend
 *  <p>    T - Fixed Peg to Local best bid or offer at time of order
 *  <p></p>
 *  <p>    U - Customer Display Instruction (Rule 11Ac1-1/4)
 *  <p>    V - Netting (for Forex)
 *  <p>    W - Peg to VWAP
 *  <p>    X - Trade Along
 *  <p>    Y - Try To Stop
 *  <p></p>
 *  <p>    Z - Cancel if not best
 *  <p></p>
 *  <p>    a - Trailing Stop Peg
 *  <p>    b - Strict Limit (No price improvement)
 *  <p>    c - Ignore Price Validity Checks
 *  <p>    d - Peg to Limit Price
 *  <p>    e - Work to Target Strategy
 *  <p></p>
 *  <p>    f - Intermarket Sweep
 *  <p>    g - External Routing Allowed
 *  <p>    h - External Routing Not Allowed
 *  <p>    i - Imbalance Only
 *  <p>    j - Single execution requested for block trade
 *  <p></p>
 *  <p>    k - Best Execution
 */
public enum Enum18ExecInst implements LogFIXString, LogVerboseString {
    STAY_ON_OFFER_SIDE("0", "STAY_ON_OFFER_SIDE", "0 - Stay on offer side" ),
    NOT_HELD("1", "NOT_HELD", "1 - Not held" ),
    WORK("2", "WORK", "2 - Work" ),
    GO_ALONG("3", "GO_ALONG", "3 - Go along" ),
    OVER_THE_DAY("4", "OVER_THE_DAY", "4 - Over the day" ),

    HELD("5", "HELD", "5 - Held" ),
    PARTICIPANT_DONT_INITIATE("6", "PARTICIPANT_DONT_INITIATE", "6 - Participant don't initiate" ),
    STRICT_SCALE("7", "STRICT_SCALE", "7 - Strict scale" ),
    TRY_TO_SCALE("8", "TRY_TO_SCALE", "8 - Try to scale" ),
    STAY_ON_BID_SIDE("9", "STAY_ON_BID_SIDE", "9 - Stay on bid side" ),

    NO_CROSS("A", "NO_CROSS", "A - No cross (cross is forbidden)" ),
    OKAY_TO_CROSS("B", "OKAY_TO_CROSS", "B - OK to cross" ),
    CALL_FIRST("C", "CALL_FIRST", "C - Call first" ),
    PERCENT_OF_VOLUME("D", "PERCENT_OF_VOLUME",
            "D - Percent of volume (indicates that the sender does not want to be all of the volume" +
                    " on the floor vs. a specific percentage)" ),
    DO_NOT_INCREASE("E", "DO_NOT_INCREASE", "E - Do not increase - DNI" ),

    DO_NOT_REDUCE("F", "DO_NOT_REDUCE", "F - Do not reduce - DNR" ),
    ALL_OR_NONE("G", "ALL_OR_NONE", "G - All or none - AON" ),
    REINSTATE_ON_SYSTEM_FAILURE("H", "REINSTATE_ON_SYSTEM_FAILURE",
            "H - Reinstate on system failure (mutually exclusive with Q)" ),
    INSTITUTION_ONLY("I", "INSTITUTION_ONLY", "I - Institutions only" ),
    REINSTATE_ON_TRADING_HALTED("J", "REINSTATE_ON_TRADING_HALTED",
            "J - Reinstate on Trading Halt (mutually exclusive with K)" ),

    CANCEL_ON_TRADING_HALTED("K", "CANCEL_ON_TRADING_HALTED",
            "K - Cancel on Trading Halt (mutually exclusive with J)" ),
    LAST_PEG("L", "LAST_PEG", "L - Last peg (last sale)" ),
    MID_PRICE_PEG("M", "MID_PRICE_PEG", "M - Mid-price peg (midprice of inside quote)" ),
    NON_NEGOTIABLE("N", "NON_NEGOTIABLE", "N - Non-negotiable" ),
    OPENING_PEG("O", "OPENING_PEG", "O - Opening peg" ),

    MARKET_PEG("P", "MARKET_PEG", "P - Market peg" ),
    CANCEL_ON_SYSTEM_FAILURE("Q", "CANCEL_ON_SYSTEM_FAILURE",
            "Q - Cancel on system failure (mutually exclusive with H)" ),
    PRIMARY_PEG("R", "PRIMARY_PEG", "R - Primary peg (primary market - buy at bid/sell at offer)" ),
    SUSPENDED("S", "SUSPENDED", "S - Suspended" ),
    FIXED_PEG_TO_LOCAL_BEST("T", "FIXED_PEG_TO_LOCAL_BEST",
            "T - Fixed Peg to Local best bid or offer at time of order" ),

    CUSTOMER_DISPLAY_INSTRUCTION("U", "CUSTOMER_DISPLAY_INSTRUCTION",
            "U - Customer Display Instruction (Rule 11Ac1-1/4)" ),
    NETTING("V", "NETTING", "V - Netting (for Forex)" ),
    PEG_TO_VWAP("W", "PEG_TO_VWAP", "W - Peg to VWAP" ),
    TRADE_ALONG("X", "TRADE_ALONG", "X - Trade Along" ),
    TRY_TO_STOP("Y", "TRY_TO_STOP", "Y - Try To Stop" ),

    CANCEL_IF_NOT_BEST("Z", "CANCEL_IF_NOT_BEST", "Z - Cancel if not best" ),
    TRAILING_STOP_PEG("a", "TRAILING_STOP_PEG", "a - Trailing Stop Peg" ),
    STRICT_LIMIT("b", "STRICT_LIMIT", "b - Strict Limit (No price improvement)" ),
    IGNORE_PRICE_VALIDITY_CHECKS("c", "IGNORE_PRICE_VALIDITY_CHECKS",
            "c - Ignore Price Validity Checks" ),
    PEG_TO_LIMIT_PRICE("d", "PEG_TO_LIMIT_PRICE", "d - Peg to Limit Price" ),

    WORK_TO_TARGET_STRATEGY("e", "WORK_TO_TARGET_STRATEGY", "e - Work to Target Strategy" ),
    INTERMARKET_SWEEP("f", "INTERMARKET_SWEEP", "f - Intermarket Sweep" ),
    EXTERNAL_ROUTING_ALLOWED("g", "EXTERNAL_ROUTING_ALLOWED", "g - External Routing Allowed" ),
    EXTERNAL_ROUTING_NOT_ALLOWED("h", "EXTERNAL_ROUTING_NOT_ALLOWED",
            "h - External Routing Not Allowed" ),
    IMBALANCE_ONLY("i", "IMBALANCE_ONLY", "i - Imbalance Only" ),

    SINGLE_EXECUTION_REQUESTED("j", "SINGLE_EXECUTION_REQUESTED",
            "j - Single execution requested for block trade" ),
    BEST_EXECUTION("k", "BEST_EXECUTION", "k - Best Execution" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum18ExecInst(final String id, final String name, final String description) {
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
        for (Enum18ExecInst oneEnum : Enum18ExecInst.values()) {
            System.out.println(oneEnum);
        }
    }
}
