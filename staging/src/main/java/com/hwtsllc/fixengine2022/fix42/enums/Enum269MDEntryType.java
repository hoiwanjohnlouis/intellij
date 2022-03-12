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

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum Enum269MDEntryType {
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

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum269MDEntryType(final String action, final String name, final String description) {
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
        System.out.println(Enum269MDEntryType.BID);
        System.out.println(Enum269MDEntryType.OFFER);
        System.out.println(Enum269MDEntryType.TRADE);
        System.out.println(Enum269MDEntryType.INDEX_VALUE);
        System.out.println(Enum269MDEntryType.OPENING_PRICE);

        System.out.println(Enum269MDEntryType.CLOSING_PRICE);
        System.out.println(Enum269MDEntryType.SETTLEMENT_PRICE);
        System.out.println(Enum269MDEntryType.TRADING_SESSION_HIGH_PRICE);
        System.out.println(Enum269MDEntryType.TRADING_SESSION_LOW_PRICE);
        System.out.println(Enum269MDEntryType.TRADING_SESSION_VWAP_PRICE);

        System.out.println(Enum269MDEntryType.IMBALANCE);
        System.out.println(Enum269MDEntryType.TRADE_VOLUME);
        System.out.println(Enum269MDEntryType.OPEN_INTEREST);
        System.out.println(Enum269MDEntryType.COMPOSITE_UNDERLYING_PRICE);
        System.out.println(Enum269MDEntryType.SIMULATED_SELL_PRICE);

        System.out.println(Enum269MDEntryType.SIMULATED_BUY_PRICE);
        System.out.println(Enum269MDEntryType.MARGIN_RATE);
        System.out.println(Enum269MDEntryType.MID_PRICE);
        System.out.println(Enum269MDEntryType.EMPTY_BOOK);
        System.out.println(Enum269MDEntryType.SETTLE_HIGH_PRICE);

        System.out.println(Enum269MDEntryType.SETTLE_LOW_PRICE);
        System.out.println(Enum269MDEntryType.PRIOR_SETTLE_PRICE);
        System.out.println(Enum269MDEntryType.SESSION_HIGH_BID);
        System.out.println(Enum269MDEntryType.SESSION_LOW_OFFER);
        System.out.println(Enum269MDEntryType.EARLY_PRICES);

        System.out.println(Enum269MDEntryType.AUCTION_CLEARING_PRICE);
    }
}
