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

/**
 *
 * Used in FIX18_EXEC_INST
 */
public enum Enum18ExecInst {
    STAY_ON_OFFER_SIDE("0", "STAY_ON_OFFER_SIDE", "Stay on offer side" ),
    NOT_HELD("1", "NOT_HELD", "Not held" ),
    WORK("2", "WORK", "Work" ),
    GO_ALONG("3", "GO_ALONG", "Go along" ),
    OVER_THE_DAY("4", "OVER_THE_DAY", "Over the day" ),
    HELD("5", "HELD", "Held" ),
    PARTICIPANT_DONT_INITIATE("6", "PARTICIPANT_DONT_INITIATE", "Participant don't initiate" ),
    STRICT_SCALE("7", "STRICT_SCALE", "Strict scale" ),
    TRY_TO_SCALE("8", "TRY_TO_SCALE", "Try to scale" ),
    STAY_ON_BID_SIDE("9", "STAY_ON_BID_SIDE", "Stay on bid side" ),
    NO_CROSS("A", "NO_CROSS", "No cross (cross is forbidden)" ),
    OKAY_TO_CROSS("B", "OKAY_TO_CROSS", "OK to cross" ),
    CALL_FIRST("C", "CALL_FIRST", "Call first" ),
    PERCENT_OF_VOLUME("D", "PERCENT_OF_VOLUME",
            "Percent of volume (indicates that the sender does not want to be all of the volume on the floor vs. a specific percentage)" ),
    DO_NOT_INCREASE("E", "DO_NOT_INCREASE", "Do not increase - DNI" ),
    DO_NOT_REDUCE("F", "DO_NOT_REDUCE", "Do not reduce - DNR" ),
    ALL_OR_NONE("G", "ALL_OR_NONE", "All or none - AON" ),
    REINSTATE_ON_SYSTEM_FAILURE("H", "REINSTATE_ON_SYSTEM_FAILURE",
            "Reinstate on system failure (mutually exclusive with Q)" ),
    INSTITUTION_ONLY("I", "INSTITUTION_ONLY", "Institutions only" ),
    REINSTATE_ON_TRADING_HALTED("J", "REINSTATE_ON_TRADING_HALTED",
            "Reinstate on Trading Halt (mutually exclusive with K)" ),
    CANCEL_ON_TRADING_HALTED("K", "CANCEL_ON_TRADING_HALTED",
            "Cancel on Trading Halt (mutually exclusive with J)" ),
    LAST_PEG("L", "LAST_PEG", "Last peg (last sale)" ),
    MID_PRICE_PEG("M", "MID_PRICE_PEG", "Mid-price peg (midprice of inside quote)" ),
    NON_NEGOTIABLE("N", "NON_NEGOTIABLE", "Non-negotiable" ),
    OPENING_PEG("O", "OPENING_PEG", "Opening peg" ),
    MARKET_PEG("P", "MARKET_PEG", "Market peg" ),
    CANCEL_ON_SYSTEM_FAILURE("Q", "CANCEL_ON_SYSTEM_FAILURE",
            "Cancel on system failure (mutually exclusive with H)" ),
    PRIMARY_PEG("R", "PRIMARY_PEG", "Primary peg (primary market - buy at bid/sell at offer)" ),
    SUSPENDED("S", "SUSPENDED", "Suspend" ),
    FIXED_PEG_TO_LOCAL_BEST("T", "FIXED_PEG_TO_LOCAL_BEST",
            "Fixed Peg to Local best bid or offer at time of order" ),
    CUSTOMER_DISPLAY_INSTRUCTION("U", "CUSTOMER_DISPLAY_INSTRUCTION",
            "Customer Display Instruction (Rule 11Ac1-1/4)" ),
    NETTING("V", "NETTING", "Netting (for Forex)" ),
    PEG_TO_VWAP("W", "PEG_TO_VWAP", "Peg to VWAP" ),
    TRADE_ALONG("X", "TRADE_ALONG", "Trade Along" ),
    TRY_TO_STOP("Y", "TRY_TO_STOP", "Try To Stop" ),
    CANCEL_IF_NOT_BEST("Z", "CANCEL_IF_NOT_BEST", "Cancel if not best" ),
    TRAILING_STOP_PEG("a", "TRAILING_STOP_PEG", "Trailing Stop Peg" ),
    STRICT_LIMIT("b", "STRICT_LIMIT", "Strict Limit (No price improvement)" ),
    IGNORE_PRICE_VALIDITY_CHECKS("c", "IGNORE_PRICE_VALIDITY_CHECKS", "Ignore Price Validity Checks" ),
    PEG_TO_LIMIT_PRICE("d", "PEG_TO_LIMIT_PRICE", "Peg to Limit Price" ),
    WORK_TO_TARGET_STRATEGY("e", "WORK_TO_TARGET_STRATEGY", "Work to Target Strategy" ),
    INTERMARKET_SWEEP("f", "INTERMARKET_SWEEP", "Intermarket Sweep" ),
    EXTERNAL_ROUTING_ALLOWED("g", "EXTERNAL_ROUTING_ALLOWED", "External Routing Allowed" ),
    EXTERNAL_ROUTING_NOT_ALLOWED("h", "EXTERNAL_ROUTING_NOT_ALLOWED", "External Routing Not Allowed" ),
    IMBALANCE_ONLY("i", "IMBALANCE_ONLY", "Imbalance Only" ),
    SINGLE_EXECUTION_REQUESTED("j", "SINGLE_EXECUTION_REQUESTED", "Single execution requested for block trade" ),
    BEST_EXECUTION("k", "BEST_EXECUTION", "Best Execution" ),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum18ExecInst(final String action, final String name, final String description) {
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
        System.out.println(Enum18ExecInst.STAY_ON_OFFER_SIDE);
        System.out.println(Enum18ExecInst.NOT_HELD);
        System.out.println(Enum18ExecInst.WORK);
        System.out.println(Enum18ExecInst.GO_ALONG);
        System.out.println(Enum18ExecInst.OVER_THE_DAY);

        System.out.println(Enum18ExecInst.HELD);
        System.out.println(Enum18ExecInst.PARTICIPANT_DONT_INITIATE);
        System.out.println(Enum18ExecInst.STRICT_SCALE);
        System.out.println(Enum18ExecInst.TRY_TO_SCALE);
        System.out.println(Enum18ExecInst.STAY_ON_BID_SIDE);

        System.out.println(Enum18ExecInst.NO_CROSS);
        System.out.println(Enum18ExecInst.OKAY_TO_CROSS);
        System.out.println(Enum18ExecInst.CALL_FIRST);
        System.out.println(Enum18ExecInst.PERCENT_OF_VOLUME);
        System.out.println(Enum18ExecInst.DO_NOT_INCREASE);

        System.out.println(Enum18ExecInst.DO_NOT_REDUCE);
        System.out.println(Enum18ExecInst.ALL_OR_NONE);
        System.out.println(Enum18ExecInst.REINSTATE_ON_SYSTEM_FAILURE);
        System.out.println(Enum18ExecInst.INSTITUTION_ONLY);
        System.out.println(Enum18ExecInst.REINSTATE_ON_TRADING_HALTED);

        System.out.println(Enum18ExecInst.CANCEL_ON_TRADING_HALTED);
        System.out.println(Enum18ExecInst.LAST_PEG);
        System.out.println(Enum18ExecInst.MID_PRICE_PEG);
        System.out.println(Enum18ExecInst.NON_NEGOTIABLE);
        System.out.println(Enum18ExecInst.OPENING_PEG);

        System.out.println(Enum18ExecInst.MARKET_PEG);
        System.out.println(Enum18ExecInst.CANCEL_ON_SYSTEM_FAILURE);
        System.out.println(Enum18ExecInst.PRIMARY_PEG);
        System.out.println(Enum18ExecInst.SUSPENDED);
        System.out.println(Enum18ExecInst.FIXED_PEG_TO_LOCAL_BEST);

        System.out.println(Enum18ExecInst.CUSTOMER_DISPLAY_INSTRUCTION);
        System.out.println(Enum18ExecInst.NETTING);
        System.out.println(Enum18ExecInst.PEG_TO_VWAP);
        System.out.println(Enum18ExecInst.TRADE_ALONG);
        System.out.println(Enum18ExecInst.TRY_TO_STOP);

        System.out.println(Enum18ExecInst.CANCEL_IF_NOT_BEST);
        System.out.println(Enum18ExecInst.TRAILING_STOP_PEG);
        System.out.println(Enum18ExecInst.STRICT_LIMIT);
        System.out.println(Enum18ExecInst.IGNORE_PRICE_VALIDITY_CHECKS);
        System.out.println(Enum18ExecInst.PEG_TO_LIMIT_PRICE);

        System.out.println(Enum18ExecInst.WORK_TO_TARGET_STRATEGY);
        System.out.println(Enum18ExecInst.INTERMARKET_SWEEP);
        System.out.println(Enum18ExecInst.EXTERNAL_ROUTING_ALLOWED);
        System.out.println(Enum18ExecInst.EXTERNAL_ROUTING_NOT_ALLOWED);
        System.out.println(Enum18ExecInst.IMBALANCE_ONLY);

        System.out.println(Enum18ExecInst.SINGLE_EXECUTION_REQUESTED);
        System.out.println(Enum18ExecInst.BEST_EXECUTION);
    }
}
