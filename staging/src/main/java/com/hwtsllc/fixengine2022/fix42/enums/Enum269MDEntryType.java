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

package com.hwtsllc.fixengine2022.fix42.enums;

import com.hwtsllc.fixengine2022.interfaces.EnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  269
 *  MDEntryType
 *
 *  0-9 msg types
 *      "0 - Bid"
 *      "1 - Offer"
 *      "2 - Trade"
 *      "3 - Index Value"
 *      "4 - Opening Price"
 *      "5 - Closing Price"
 *      "6 - Settlement Price"
 *      "7 - Trading Session High Price"
 *      "8 - Trading Session Low Price"
 *      "9 - Trading Session VWAP Price"
 *
 *  A-Q msg types
 *      "A - Imbalance"
 *      "B - Trade Volume"
 *      "C - Open Interest"
 *      "D - Composite Underlying Price"
 *      "E - Simulated Sell Price"
 *      "F - Simulated Buy Price"
 *      "G - Margin Rate"
 *      "H - Mid Price"
 *      "J - Empty Book"
 *      "K - Settle High Price"
 *      "L - Settle Low Price"
 *      "M - Prior Settle Price"
 *      "N - Session High Bid"
 *      "O - Session Low Offer"
 *      "P - Early Prices"
 *      "Q - Auction Clearing Price"
 */
public enum Enum269MDEntryType implements EnumAccessors, LogStringVerbose {
    /**
     * 0-9 msg types
     */
    BID( "0", "BID", "0 - Bid" ),
    OFFER( "1", "OFFER", "1 - Offer" ),
    TRADE( "2", "TRADE", "2 - Trade" ),
    INDEX_VALUE( "3", "INDEX_VALUE", "3 - Index Value" ),
    OPENING_PRICE( "4", "OPENING_PRICE", "4 - Opening Price" ),
    CLOSING_PRICE( "5", "CLOSING_PRICE", "5 - Closing Price" ),
    SETTLEMENT_PRICE( "6", "SETTLEMENT_PRICE", "6 - Settlement Price" ),
    TRADING_SESSION_HIGH_PRICE( "7", "TRADING_SESSION_HIGH_PRICE", "7 - Trading Session High Price" ),
    TRADING_SESSION_LOW_PRICE( "8", "TRADING_SESSION_LOW_PRICE", "8 - Trading Session Low Price" ),
    TRADING_SESSION_VWAP_PRICE( "9", "TRADING_SESSION_VWAP_PRICE", "9 - Trading Session VWAP Price" ),

    /**
     * A-Q msg types
     */
    IMBALANCE( "A", "IMBALANCE", "A - Imbalance" ),
    TRADE_VOLUME( "B", "TRADE_VOLUME", "B - Trade Volume" ),
    OPEN_INTEREST( "C", "OPEN_INTEREST", "C - Open Interest" ),
    COMPOSITE_UNDERLYING_PRICE( "D", "COMPOSITE_UNDERLYING_PRICE", "D - Composite Underlying Price" ),
    SIMULATED_SELL_PRICE( "E", "SIMULATED_SELL_PRICE", "E - Simulated Sell Price" ),
    SIMULATED_BUY_PRICE( "F", "SIMULATED_BUY_PRICE", "F - Simulated Buy Price" ),
    MARGIN_RATE( "G", "MARGIN_RATE", "G - Margin Rate" ),
    MID_PRICE( "H", "MID_PRICE", "H - Mid Price" ),
    EMPTY_BOOK( "J", "EMPTY_BOOK", "J - Empty Book" ),
    SETTLE_HIGH_PRICE( "K", "SETTLE_HIGH_PRICE", "K - Settle High Price" ),
    SETTLE_LOW_PRICE( "L", "SETTLE_LOW_PRICE", "L - Settle Low Price" ),
    PRIOR_SETTLE_PRICE( "M", "PRIOR_SETTLE_PRICE", "M - Prior Settle Price" ),
    SESSION_HIGH_BID( "N", "SESSION_HIGH_BID", "N - Session High Bid" ),
    SESSION_LOW_OFFER( "O", "SESSION_LOW_OFFER", "O - Session Low Offer" ),
    EARLY_PRICES( "P", "EARLY_PRICES", "P - Early Prices" ),
    AUCTION_CLEARING_PRICE( "Q", "AUCTION_CLEARING_PRICE", "Q - Auction Clearing Price" ),
    ;

    private final String id;
    private final String name;
    private final String description;

    Enum269MDEntryType(final String id, final String name, final String description) {
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
        for (Enum269MDEntryType oneEnum : Enum269MDEntryType.values()) {
            System.out.println(oneEnum);
        }
    }
}
