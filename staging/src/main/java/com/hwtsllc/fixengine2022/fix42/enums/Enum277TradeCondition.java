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

import com.hwtsllc.fixengine2022.interfaces.FixEnumAccessors;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public enum Enum277TradeCondition implements FixEnumAccessors, LogStringVerbose {
    /*
     * 0
     */
    CANCEL( "0", "CANCEL", "0 - Cancel" ),

    /*
     * A-Z
     */
    CASH_MARKET( "A", "CASH_MARKET",
            "A - Cash (only) Market" ),
    AVERAGE_PRICE_TRADE( "B", "AVERAGE_PRICE_TRADE",
            "B - Average Price Trade" ),
    CASH_TRADE( "C", "CASH_TRADE",
            "C - Cash Trade (same day clearing)" ),
    NEXT_DAY_MARKET( "D", "NEXT_DAY_MARKET",
            "D - Next Day (only) Market" ),
    OPENING_REOPENING_TRADE_DETAIL( "E", "OPENING_REOPENING_TRADE_DETAIL",
            "E - Opening/Reopening Trade Detail" ),
    INTRADAY_TRADE_DETAIL( "F", "INTRADAY_TRADE_DETAIL",
            "F - Intraday Trade Detail" ),
    RULE_127_TRADE_NYSE( "G", "RULE_127_TRADE_NYSE",
            "G - Rule 127 Trade (NYSE)" ),
    RULE_155_TRADE_AMEX( "H", "RULE_155_TRADE_AMEX",
            "H - Rule 155 Trade (AMEX)" ),
    SOLD_LAST( "I", "SOLD_LAST",
            "I - Sold Last (late reporting)" ),
    NEXT_DAY_TRADE( "J", "NEXT_DAY_TRADE",
            "J - Next Day Trade (next day clearing)" ),
    OPENED( "K", "OPENED",
            "K - Opened (late report of opened trade)" ),
    SELLER( "L", "SELLER",
            "L - Seller" ),
    SOLD( "M", "SOLD",
            "M - Sold (out of sequence)" ),
    STOPPED_STOCK( "N", "STOPPED_STOCK",
            "N - Stopped Stock (guarantee of price but does not execute the order)" ),
    IMBALANCE_MORE_BUYERS( "P", "IMBALANCE_MORE_BUYERS",
            "P - Imbalance More Buyers (cannot be used in combination with Q)" ),
    IMBALANCE_MORE_SELLERS( "Q", "IMBALANCE_MORE_SELLERS",
            "Q - Imbalance More Sellers (cannot be used in combination with P)" ),
    OPENING_PRICE( "R", "OPENING_PRICE",
            "R - Opening Price" ),
    BARGAIN_CONDITION_LSE( "S", "BARGAIN_CONDITION_LSE",
            "S - Bargain Condition (LSE)" ),
    CONVERTED_PRICE_INDICATOR( "T", "CONVERTED_PRICE_INDICATOR",
            "T - Converted Price Indicator" ),
    EXCHANGE_LAST( "U", "EXCHANGE_LAST",
            "U - Exchange Last" ),
    FINAL_PRICE_OF_SESSION( "V", "FINAL_PRICE_OF_SESSION",
            "V - Final Price of Session" ),
    EX_PIT( "W", "EX_PIT",
            "W - Ex-pit" ),
    CROSSED( "X", "CROSSED",
            "X - Crossed" ),
    TRADES_FROM_MANUAL_OR_SLOW_QUOTE( "Y", "TRADES_FROM_MANUAL_OR_SLOW_QUOTE",
            "Y - Trades resulting from manual/slow quote" ),
    TRADES_FROM_INTERMARKET_SWEEP( "Z", "TRADES_FROM_INTERMARKET_SWEEP",
            "Z - Trades resulting from intermarket sweep" ),

    /*
     * a-z
     */
    VOLUME_ONLY( "a", "VOLUME_ONLY", "a - Volume Only" ),
    DIRECT_PLUS( "b", "DIRECT_PLUS", "b - Direct Plus" ),
    ACQUISITION( "c", "ACQUISITION", "c - Acquisition" ),
    BUNCHED( "d", "BUNCHED", "d - Bunched" ),
    DISTRIBUTION( "e", "DISTRIBUTION", "e - Distribution" ),
    BUNCHED_SALE( "f", "BUNCHED_SALE", "f - Bunched Sale" ),
    SPLIT_TRADE( "g", "SPLIT_TRADE", "g - Split Trade" ),
    CANCEL_STOPPED( "h", "CANCEL_STOPPED", "h - Cancel Stopped" ),
    CANCEL_ETH( "i", "CANCEL_ETH", "i - Cancel ETH" ),
    CANCEL_STOPPED_ETH( "j", "CANCEL_STOPPED_ETH", "j - Cancel Stopped ETH" ),
    OUT_OF_SEQUENCE_ETH( "k", "OUT_OF_SEQUENCE_ETH", "k - Out of Sequence ETH" ),
    CANCEL_LAST_ETH( "l", "CANCEL_LAST_ETH", "l - Cancel Last ETH" ),
    SOLD_LAST_SALE_ETH( "m", "SOLD_LAST_SALE_ETH", "m - Sold Last Sale ETH" ),
    CANCEL_LAST( "n", "CANCEL_LAST", "n - Cancel Last" ),
    SOLD_LAST_SALE( "o", "SOLD_LAST_SALE", "o - Sold Last Sale" ),
    CANCEL_OPEN( "p", "CANCEL_OPEN", "p - Cancel Open" ),
    CANCEL_OPEN_ETH( "q", "CANCEL_OPEN_ETH", "q - Cancel Open ETH" ),
    OPENED_SALE_ETH( "r", "OPENED_SALE_ETH", "r - Opened Sale ETH" ),
    CANCEL_ONLY( "s", "CANCEL_ONLY", "s - Cancel Only" ),
    CANCEL_ONLY_ETH( "t", "CANCEL_ONLY_ETH", "t - Cancel Only ETH" ),
    LATE_OPEN_ETH( "u", "LATE_OPEN_ETH", "u - Late Open ETH" ),
    AUTO_EXECUTION_ETH( "v", "AUTO_EXECUTION_ETH", "v - Auto Execution ETH" ),
    REOPEN( "w", "REOPEN", "w - Reopen" ),
    REOPEN_ETH( "x", "REOPEN_ETH", "x - Reopen ETH" ),
    ADJUSTED( "y", "ADJUSTED", "y - Adjusted" ),
    ADJUSTED_ETH( "z", "ADJUSTED_ETH", "z - Adjusted ETH" ),

    /*
     * AA-AT
     */
    SPREAD( "AA", "SPREAD", "AA - Spread" ),
    SPREAD_ETH( "AB", "SPREAD_ETH", "AB - Spread ETH" ),
    STRADDLE( "AC", "STRADDLE", "AC - Straddle" ),
    STRADDLE_ETH( "AD", "STRADDLE_ETH", "AD - Straddle ETH" ),
    STOPPED( "AE", "STOPPED", "AE - Stopped" ),
    STOPPED_ETH( "AF", "STOPPED_ETH", "AF - Stopped ETH" ),
    REGULAR_ETH( "AG", "REGULAR_ETH", "AG - Regular ETH" ),
    COMBO( "AH", "COMBO", "AH - Combo" ),
    COMBO_ETH( "AI", "COMBO_ETH", "AI - Combo ETH" ),
    OFFICIAL_CLOSING_PRICE( "AJ", "OFFICIAL_CLOSING_PRICE", "AJ - Official Closing Price" ),
    PRIOR_REFERENCE_PRICE( "AK", "PRIOR_REFERENCE_PRICE", "AK - Prior Reference Price" ),
    STOPPED_SOLD_LAST( "AL", "STOPPED_SOLD_LAST", "AL - Stopped Sold Last" ),
    STOPPED_OUT_OF_SEQUENCE( "AM", "STOPPED_OUT_OF_SEQUENCE", "AM - Stopped Out of Sequence" ),
    OFFICAL_CLOSING_PRICE_AN( "AN", "OFFICAL_CLOSING_PRICE_AN", "AN - Offical Closing Price" ),
    CROSSED_AO( "AO", "CROSSED_AO", "AO - Crossed" ),
    FAST_MARKET( "AP", "FAST_MARKET", "AP - Fast Market" ),
    AUTOMATIC_EXECUTION( "AQ", "AUTOMATIC_EXECUTION", "AQ - Automatic Execution" ),
    FORM_T( "AR", "FORM_T", "AR - Form T" ),
    BASKET_INDEX( "AS", "BASKET_INDEX", "AS - Basket Index" ),
    BURST_BASKET( "AT", "BURST_BASKET", "AT - Burst Basket" ),
    ;

    private final String WHERE_AM_I = this.getClass().getSimpleName();
    private static final Logger logger = LogManager.getRootLogger();

    private final String action;
    private final String name;
    private final String description;

    Enum277TradeCondition(final String action, final String name, final String description) {
        this.action = action;
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
    public String getAction() {
        return action;
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
     * standard wrapper to format a simple string describing this enum
     */
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

    /**
     *
     */
    public static void main(String[] args) {
        /*
         * dump all the enum values
         */
        for (Enum277TradeCondition oneEnum : Enum277TradeCondition.values()) {
            System.out.println(oneEnum);
        }
    }
}
