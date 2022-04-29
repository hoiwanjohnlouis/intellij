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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum277TradeConditionTest {
    /**
     *  277
     *  TradeCondition
     *
     *      0
     *      "0 - Cancel"
     *
     *      A-Z
     *      "A - Cash (only) Market"
     *      "B - Average Price Trade"
     *      "C - Cash Trade (same day clearing)"
     *      "D - Next Day (only) Market"
     *      "E - Opening/Reopening Trade Detail"
     *      "F - Intraday Trade Detail"
     *      "G - Rule 127 Trade (NYSE)"
     *      "H - Rule 155 Trade (AMEX)"
     *      "I - Sold Last (late reporting)"
     *      "J - Next Day Trade (next day clearing)"
     *      "K - Opened (late report of opened trade)"
     *      "L - Seller"
     *      "M - Sold (out of sequence)"
     *      "N - Stopped Stock (guarantee of price but does not execute the order)"
     *      "P - Imbalance More Buyers (cannot be used in combination with Q)"
     *      "Q - Imbalance More Sellers (cannot be used in combination with P)"
     *      "R - Opening Price"
     *      "S - Bargain Condition (LSE)"
     *      "T - Converted Price Indicator"
     *      "U - Exchange Last"
     *      "V - Final Price of Session"
     *      "W - Ex-pit"
     *      "X - Crossed"
     *      "Y - Trades resulting from manual/slow quote"
     *      "Z - Trades resulting from intermarket sweep"
     *
     *      a-z
     *     "a - Volume Only"
     *     "b - Direct Plus"
     *     "c - Acquisition"
     *     "d - Bunched"
     *     "e - Distribution"
     *     "f - Bunched Sale"
     *     "g - Split Trade"
     *     "h - Cancel Stopped"
     *     "i - Cancel ETH"
     *     "j - Cancel Stopped ETH"
     *     "k - Out of Sequence ETH"
     *     "l - Cancel Last ETH"
     *     "m - Sold Last Sale ETH"
     *     "n - Cancel Last"
     *     "o - Sold Last Sale"
     *     "p - Cancel Open"
     *     "q - Cancel Open ETH"
     *     "r - Opened Sale ETH"
     *     "s - Cancel Only"
     *     "t - Cancel Only ETH"
     *     "u - Late Open ETH"
     *     "v - Auto Execution ETH"
     *     "w - Reopen"
     *     "x - Reopen ETH"
     *     "y - Adjusted"
     *     "z - Adjusted ETH"
     *
     *      AA-AT
     *      "AA - Spread"
     *      "AB - Spread ETH"
     *      "AC - Straddle"
     *      "AD - Straddle ETH"
     *      "AE - Stopped"
     *      "AF - Stopped ETH"
     *      "AG - Regular ETH"
     *      "AH - Combo"
     *      "AI - Combo ETH"
     *      "AJ - Official Closing Price"
     *      "AK - Prior Reference Price"
     *      "AL - Stopped Sold Last"
     *      "AM - Stopped Out of Sequence"
     *      "AN - Offical Closing Price"
     *      "AO - Crossed"
     *      "AP - Fast Market"
     *      "AQ - Automatic Execution"
     *      "AR - Form T"
     *      "AS - Basket Index"
     *      "AT - Burst Basket"
     */
    @Test
    void Enum0277Test() {
        Enum277TradeCondition enumType;

        /**
         * 0 msg types
         */
        enumType = Enum277TradeCondition.CANCEL;
        assertEquals("0", enumType.getID());
        assertEquals("CANCEL", enumType.getName());
        assertEquals("0 - Cancel", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());


        /**
         * A-N, msg types
         */
        enumType = Enum277TradeCondition.CASH_MARKET;
        assertEquals( "A", enumType.getID());
        assertEquals( "CASH_MARKET", enumType.getName());
        assertEquals( "A - Cash (only) Market", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.AVERAGE_PRICE_TRADE;
        assertEquals( "B", enumType.getID());
        assertEquals( "AVERAGE_PRICE_TRADE", enumType.getName());
        assertEquals( "B - Average Price Trade", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.CASH_TRADE;
        assertEquals( "C", enumType.getID());
        assertEquals( "CASH_TRADE", enumType.getName());
        assertEquals( "C - Cash Trade (same day clearing)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.NEXT_DAY_MARKET;
        assertEquals( "D", enumType.getID());
        assertEquals( "NEXT_DAY_MARKET", enumType.getName());
        assertEquals( "D - Next Day (only) Market", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.OPENING_REOPENING_TRADE_DETAIL;
        assertEquals( "E", enumType.getID());
        assertEquals( "OPENING_REOPENING_TRADE_DETAIL", enumType.getName());
        assertEquals( "E - Opening/Reopening Trade Detail", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.INTRADAY_TRADE_DETAIL;
        assertEquals( "F", enumType.getID());
        assertEquals( "INTRADAY_TRADE_DETAIL", enumType.getName());
        assertEquals( "F - Intraday Trade Detail", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.RULE_127_TRADE_NYSE;
        assertEquals( "G", enumType.getID());
        assertEquals( "RULE_127_TRADE_NYSE", enumType.getName());
        assertEquals( "G - Rule 127 Trade (NYSE)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.RULE_155_TRADE_AMEX;
        assertEquals( "H", enumType.getID());
        assertEquals( "RULE_155_TRADE_AMEX", enumType.getName());
        assertEquals( "H - Rule 155 Trade (AMEX)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.SOLD_LAST;
        assertEquals( "I", enumType.getID());
        assertEquals( "SOLD_LAST", enumType.getName());
        assertEquals( "I - Sold Last (late reporting)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.NEXT_DAY_TRADE;
        assertEquals( "J", enumType.getID());
        assertEquals( "NEXT_DAY_TRADE", enumType.getName());
        assertEquals( "J - Next Day Trade (next day clearing)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.OPENED;
        assertEquals( "K", enumType.getID());
        assertEquals( "OPENED", enumType.getName());
        assertEquals( "K - Opened (late report of opened trade)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.SELLER;
        assertEquals( "L", enumType.getID());
        assertEquals( "SELLER", enumType.getName());
        assertEquals( "L - Seller", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.SOLD;
        assertEquals( "M", enumType.getID());
        assertEquals( "SOLD", enumType.getName());
        assertEquals( "M - Sold (out of sequence)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.STOPPED_STOCK;
        assertEquals( "N", enumType.getID());
        assertEquals( "STOPPED_STOCK", enumType.getName());
        assertEquals( "N - Stopped Stock (guarantee of price but does not execute the order)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());


        /**
         * P-Z msg types
         */
        enumType = Enum277TradeCondition.IMBALANCE_MORE_BUYERS;
        assertEquals( "P", enumType.getID());
        assertEquals( "IMBALANCE_MORE_BUYERS", enumType.getName());
        assertEquals( "P - Imbalance More Buyers (cannot be used in combination with Q)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.IMBALANCE_MORE_SELLERS;
        assertEquals( "Q", enumType.getID());
        assertEquals( "IMBALANCE_MORE_SELLERS", enumType.getName());
        assertEquals( "Q - Imbalance More Sellers (cannot be used in combination with P)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.OPENING_PRICE;
        assertEquals( "R", enumType.getID());
        assertEquals( "OPENING_PRICE", enumType.getName());
        assertEquals( "R - Opening Price", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.BARGAIN_CONDITION_LSE;
        assertEquals( "S", enumType.getID());
        assertEquals( "BARGAIN_CONDITION_LSE", enumType.getName());
        assertEquals( "S - Bargain Condition (LSE)", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.CONVERTED_PRICE_INDICATOR;
        assertEquals( "T", enumType.getID());
        assertEquals( "CONVERTED_PRICE_INDICATOR", enumType.getName());
        assertEquals( "T - Converted Price Indicator", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.EXCHANGE_LAST;
        assertEquals( "U", enumType.getID());
        assertEquals( "EXCHANGE_LAST", enumType.getName());
        assertEquals( "U - Exchange Last", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.FINAL_PRICE_OF_SESSION;
        assertEquals( "V", enumType.getID());
        assertEquals( "FINAL_PRICE_OF_SESSION", enumType.getName());
        assertEquals( "V - Final Price of Session", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.EX_PIT;
        assertEquals( "W", enumType.getID());
        assertEquals( "EX_PIT", enumType.getName());
        assertEquals( "W - Ex-pit", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.CROSSED;
        assertEquals( "X", enumType.getID());
        assertEquals( "CROSSED", enumType.getName());
        assertEquals( "X - Crossed", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.TRADES_FROM_MANUAL_OR_SLOW_QUOTE;
        assertEquals( "Y", enumType.getID());
        assertEquals( "TRADES_FROM_MANUAL_OR_SLOW_QUOTE", enumType.getName());
        assertEquals( "Y - Trades resulting from manual/slow quote", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.TRADES_FROM_INTERMARKET_SWEEP;
        assertEquals( "Z", enumType.getID());
        assertEquals( "TRADES_FROM_INTERMARKET_SWEEP", enumType.getName());
        assertEquals( "Z - Trades resulting from intermarket sweep", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());


        /**
         * a-z msg types
         */
        enumType = Enum277TradeCondition.VOLUME_ONLY;
        assertEquals( "a", enumType.getID());
        assertEquals( "VOLUME_ONLY", enumType.getName());
        assertEquals( "a - Volume Only", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.DIRECT_PLUS;
        assertEquals( "b", enumType.getID());
        assertEquals( "DIRECT_PLUS", enumType.getName());
        assertEquals( "b - Direct Plus", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.ACQUISITION;
        assertEquals( "c", enumType.getID());
        assertEquals( "ACQUISITION", enumType.getName());
        assertEquals( "c - Acquisition", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.BUNCHED;
        assertEquals( "d", enumType.getID());
        assertEquals( "BUNCHED", enumType.getName());
        assertEquals( "d - Bunched", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.DISTRIBUTION;
        assertEquals( "e", enumType.getID());
        assertEquals( "DISTRIBUTION", enumType.getName());
        assertEquals( "e - Distribution", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.BUNCHED_SALE;
        assertEquals( "f", enumType.getID());
        assertEquals( "BUNCHED_SALE", enumType.getName());
        assertEquals( "f - Bunched Sale", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.SPLIT_TRADE;
        assertEquals( "g", enumType.getID());
        assertEquals( "SPLIT_TRADE", enumType.getName());
        assertEquals( "g - Split Trade", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.CANCEL_STOPPED;
        assertEquals( "h", enumType.getID());
        assertEquals( "CANCEL_STOPPED", enumType.getName());
        assertEquals( "h - Cancel Stopped", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.CANCEL_ETH;
        assertEquals( "i", enumType.getID());
        assertEquals( "CANCEL_ETH", enumType.getName());
        assertEquals( "i - Cancel ETH", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.CANCEL_STOPPED_ETH;
        assertEquals( "j", enumType.getID());
        assertEquals( "CANCEL_STOPPED_ETH", enumType.getName());
        assertEquals( "j - Cancel Stopped ETH", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.OUT_OF_SEQUENCE_ETH;
        assertEquals( "k", enumType.getID());
        assertEquals( "OUT_OF_SEQUENCE_ETH", enumType.getName());
        assertEquals( "k - Out of Sequence ETH", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.CANCEL_LAST_ETH;
        assertEquals( "l", enumType.getID());
        assertEquals( "CANCEL_LAST_ETH", enumType.getName());
        assertEquals( "l - Cancel Last ETH", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.SOLD_LAST_SALE_ETH;
        assertEquals( "m", enumType.getID());
        assertEquals( "SOLD_LAST_SALE_ETH", enumType.getName());
        assertEquals( "m - Sold Last Sale ETH", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.CANCEL_LAST;
        assertEquals( "n", enumType.getID());
        assertEquals( "CANCEL_LAST", enumType.getName());
        assertEquals( "n - Cancel Last", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.SOLD_LAST_SALE;
        assertEquals( "o", enumType.getID());
        assertEquals( "SOLD_LAST_SALE", enumType.getName());
        assertEquals( "o - Sold Last Sale", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.CANCEL_OPEN;
        assertEquals( "p", enumType.getID());
        assertEquals( "CANCEL_OPEN", enumType.getName());
        assertEquals( "p - Cancel Open", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.CANCEL_OPEN_ETH;
        assertEquals( "q", enumType.getID());
        assertEquals( "CANCEL_OPEN_ETH", enumType.getName());
        assertEquals( "q - Cancel Open ETH", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.OPENED_SALE_ETH;
        assertEquals( "r", enumType.getID());
        assertEquals( "OPENED_SALE_ETH", enumType.getName());
        assertEquals( "r - Opened Sale ETH", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.CANCEL_ONLY;
        assertEquals( "s", enumType.getID());
        assertEquals( "CANCEL_ONLY", enumType.getName());
        assertEquals( "s - Cancel Only", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.CANCEL_ONLY_ETH;
        assertEquals( "t", enumType.getID());
        assertEquals( "CANCEL_ONLY_ETH", enumType.getName());
        assertEquals( "t - Cancel Only ETH", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.LATE_OPEN_ETH;
        assertEquals( "u", enumType.getID());
        assertEquals( "LATE_OPEN_ETH", enumType.getName());
        assertEquals( "u - Late Open ETH", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.AUTO_EXECUTION_ETH;
        assertEquals( "v", enumType.getID());
        assertEquals( "AUTO_EXECUTION_ETH", enumType.getName());
        assertEquals( "v - Auto Execution ETH", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.REOPEN;
        assertEquals( "w", enumType.getID());
        assertEquals( "REOPEN", enumType.getName());
        assertEquals( "w - Reopen", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.REOPEN_ETH;
        assertEquals( "x", enumType.getID());
        assertEquals( "REOPEN_ETH", enumType.getName());
        assertEquals( "x - Reopen ETH", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.ADJUSTED;
        assertEquals( "y", enumType.getID());
        assertEquals( "ADJUSTED", enumType.getName());
        assertEquals( "y - Adjusted", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.ADJUSTED_ETH;
        assertEquals( "z", enumType.getID());
        assertEquals( "ADJUSTED_ETH", enumType.getName());
        assertEquals( "z - Adjusted ETH", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());


        /**
         * AA-AT msg types
         */
        enumType = Enum277TradeCondition.SPREAD;
        assertEquals( "AA", enumType.getID());
        assertEquals( "SPREAD", enumType.getName());
        assertEquals( "AA - Spread", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.SPREAD_ETH;
        assertEquals( "AB", enumType.getID());
        assertEquals( "SPREAD_ETH", enumType.getName());
        assertEquals( "AB - Spread ETH", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.STRADDLE;
        assertEquals( "AC", enumType.getID());
        assertEquals( "STRADDLE", enumType.getName());
        assertEquals( "AC - Straddle", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.STRADDLE_ETH;
        assertEquals( "AD", enumType.getID());
        assertEquals( "STRADDLE_ETH", enumType.getName());
        assertEquals( "AD - Straddle ETH", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.STOPPED;
        assertEquals( "AE", enumType.getID());
        assertEquals( "STOPPED", enumType.getName());
        assertEquals( "AE - Stopped", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.STOPPED_ETH;
        assertEquals( "AF", enumType.getID());
        assertEquals( "STOPPED_ETH", enumType.getName());
        assertEquals( "AF - Stopped ETH", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.REGULAR_ETH;
        assertEquals( "AG", enumType.getID());
        assertEquals( "REGULAR_ETH", enumType.getName());
        assertEquals( "AG - Regular ETH", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.COMBO;
        assertEquals( "AH", enumType.getID());
        assertEquals( "COMBO", enumType.getName());
        assertEquals( "AH - Combo", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.COMBO_ETH;
        assertEquals( "AI", enumType.getID());
        assertEquals( "COMBO_ETH", enumType.getName());
        assertEquals( "AI - Combo ETH", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.OFFICIAL_CLOSING_PRICE;
        assertEquals( "AJ", enumType.getID());
        assertEquals( "OFFICIAL_CLOSING_PRICE", enumType.getName());
        assertEquals( "AJ - Official Closing Price", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.PRIOR_REFERENCE_PRICE;
        assertEquals( "AK", enumType.getID());
        assertEquals( "PRIOR_REFERENCE_PRICE", enumType.getName());
        assertEquals( "AK - Prior Reference Price", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.STOPPED_SOLD_LAST;
        assertEquals( "AL", enumType.getID());
        assertEquals( "STOPPED_SOLD_LAST", enumType.getName());
        assertEquals( "AL - Stopped Sold Last", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.STOPPED_OUT_OF_SEQUENCE;
        assertEquals( "AM", enumType.getID());
        assertEquals( "STOPPED_OUT_OF_SEQUENCE", enumType.getName());
        assertEquals( "AM - Stopped Out of Sequence", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.OFFICAL_CLOSING_PRICE_AN;
        assertEquals( "AN", enumType.getID());
        assertEquals( "OFFICAL_CLOSING_PRICE_AN", enumType.getName());
        assertEquals( "AN - Offical Closing Price", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.CROSSED_AO;
        assertEquals( "AO", enumType.getID());
        assertEquals( "CROSSED_AO", enumType.getName());
        assertEquals( "AO - Crossed", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.FAST_MARKET;
        assertEquals( "AP", enumType.getID());
        assertEquals( "FAST_MARKET", enumType.getName());
        assertEquals( "AP - Fast Market", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.AUTOMATIC_EXECUTION;
        assertEquals( "AQ", enumType.getID());
        assertEquals( "AUTOMATIC_EXECUTION", enumType.getName());
        assertEquals( "AQ - Automatic Execution", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.FORM_T;
        assertEquals( "AR", enumType.getID());
        assertEquals( "FORM_T", enumType.getName());
        assertEquals( "AR - Form T", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.BASKET_INDEX;
        assertEquals( "AS", enumType.getID());
        assertEquals( "BASKET_INDEX", enumType.getName());
        assertEquals( "AS - Basket Index", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum277TradeCondition.BURST_BASKET;
        assertEquals("AT", enumType.getID());
        assertEquals("BURST_BASKET", enumType.getName());
        assertEquals("AT - Burst Basket", enumType.getDescription());
        assertNotEquals( FIX42.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( FIX42.JUNK_ID, enumType.getID());
        assertNotEquals( FIX42.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX42.JUNK_DESCRIPTION, enumType.getDescription());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}