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

package com.hwtsllc.fixengine.tags.fix42.enums;

import com.hwtsllc.fixengine.interfaces.LogFIXString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  326
 *  SecurityTradingStatus
 *  int
 *  <p>
 *  Identifies the trading status applicable to the transaction.
 *  <p></p>
 *  Valid values:
 *  <p>    1-10, 12-23 msg types. skipped 11.
 *  <p>    1 - Opening delay
 *  <p>    2 - Trading halt
 *  <p>    3 - Resume
 *  <p>    4 - No Open / No Resume
 *  <p>    5 - Price indication
 *  <p></p>
 *  <p>    6 - Trading Range Indication
 *  <p>    7 - Market Imbalance Buy
 *  <p>    8 - Market Imbalance Sell
 *  <p>    9 - Market on Close Imbalance Buy
 *  <p>    10 - Market on Close Imbalance Sell
 *  <p></p>
 *  <p>    12 - No Market Imbalance
 *  <p>    13 - No Market on Close Imbalance
 *  <p>    14 - ITS Pre-opening
 *  <p>    15 - New Price Indication
 *  <p></p>
 *  <p>    16 - Trade Dissemination Time
 *  <p>    17 - Ready to trade (start of session)
 *  <p>    18 - Not available for trading (end of session)
 *  <p>    19 - Not traded on this market
 *  <p>    20 - Unknown or Invalid
 *  <p></p>
 *  <p>    21 - Pre-open
 *  <p>    22 - Opening Rotation
 *  <p>    23 - Fast Market
 */
public enum Enum326SecurityTradingStatus implements LogFIXString, LogVerboseString {
    /*
     * 1-10, 12-23 msg types. skipped 11.
     */
    OPENING_DELAY( "1", "OPENING_DELAY", "1 - Opening delay" ),
    TRADING_HALT( "2", "TRADING_HALT", "2 - Trading halt" ),
    RESUME( "3", "RESUME", "3 - Resume" ),
    NO_OPEN_NO_RESUME( "4", "NO_OPEN_NO_RESUME", "4 - No Open / No Resume" ),
    PRICE_INDICATION( "5", "PRICE_INDICATION", "5 - Price indication" ),

    TRADING_RANGE_INDICATION( "6", "TRADING_RANGE_INDICATION", "6 - Trading Range Indication" ),
    MARKET_IMBALANCE_BUY( "7", "MARKET_IMBALANCE_BUY", "7 - Market Imbalance Buy" ),
    MARKET_IMBALANCE_SELL( "8", "MARKET_IMBALANCE_SELL", "8 - Market Imbalance Sell" ),
    MARKET_ON_CLOSE_IMBALANCE_BUY( "9", "MARKET_ON_CLOSE_IMBALANCE_BUY", "9 - Market on Close Imbalance Buy" ),
    MARKET_ON_CLOSE_IMBALANCE_SELL( "10", "MARKET_ON_CLOSE_IMBALANCE_SELL", "10 - Market on Close Imbalance Sell" ),

    NO_MARKET_IMBALANCE( "12", "NO_MARKET_IMBALANCE", "12 - No Market Imbalance" ),
    NO_MARKET_ON_CLOSE_IMBALANCE( "13", "NO_MARKET_ON_CLOSE_IMBALANCE", "13 - No Market on Close Imbalance" ),
    ITS_PRE_OPENING( "14", "ITS_PRE_OPENING", "14 - ITS Pre-opening" ),
    NEW_PRICE_INDICATION( "15", "NEW_PRICE_INDICATION", "15 - New Price Indication" ),

    TRADE_DISSEMINATION_TIME( "16", "TRADE_DISSEMINATION_TIME", "16 - Trade Dissemination Time" ),
    READY_TO_TRADE( "17", "READY_TO_TRADE", "17 - Ready to trade (start of session)" ),
    NOT_AVAILABLE_FOR_TRADING( "18", "NOT_AVAILABLE_FOR_TRADING", "18 - Not available for trading (end of session)" ),
    NOT_TRADED_ON_THIS_MARKET( "19", "NOT_TRADED_ON_THIS_MARKET", "19 - Not traded on this market" ),
    UNKNOWN_OR_INVALID( "20", "UNKNOWN_OR_INVALID", "20 - Unknown or Invalid" ),

    PRE_OPEN( "21", "PRE_OPEN", "21 - Pre-open" ),
    OPENING_ROTATION( "22", "OPENING_ROTATION", "22 - Opening Rotation" ),
    FAST_MARKET( "23", "FAST_MARKET", "23 - Fast Market" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum326SecurityTradingStatus(final String id, final String name, final String description) {
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
        for (Enum326SecurityTradingStatus oneEnum : Enum326SecurityTradingStatus.values()) {
            System.out.println(oneEnum);
        }
    }
}
