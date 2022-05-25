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

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  277
 *  TradeCondition
 *  MultipleStringValue
 *  <p>
 *  Space-delimited list of conditions describing a trade
 *  <p></p>
 *  Valid values:
 *  <p>    0
 *  <p>    "0 - Cancel"
 *  <p></p>
 *  <p>    A-Z
 *  <p>    "A - Cash (only) Market"
 *  <p>    "B - Average Price Trade"
 *  <p>    "C - Cash Trade (same day clearing)"
 *  <p>    "D - Next Day (only) Market"
 *  <p>    "E - Opening/Reopening Trade Detail"
 *  <p></p>
 *  <p>    "F - Intraday Trade Detail"
 *  <p>    "G - Rule 127 Trade (NYSE)"
 *  <p>    "H - Rule 155 Trade (AMEX)"
 *  <p>    "I - Sold Last (late reporting)"
 *  <p>    "J - Next Day Trade (next day clearing)"
 *  <p></p>
 *  <p>    "K - Opened (late report of opened trade)"
 *  <p>    "L - Seller"
 *  <p>    "M - Sold (out of sequence)"
 *  <p>    "N - Stopped Stock (guarantee of price but does not execute the order)"
 *  <p>    "P - Imbalance More Buyers (cannot be used in combination with Q)"
 *  <p></p>
 *  <p>    "Q - Imbalance More Sellers (cannot be used in combination with P)"
 *  <p>    "R - Opening Price"
 *  <p>    "S - Bargain Condition (LSE)"
 *  <p>    "T - Converted Price Indicator"
 *  <p>    "U - Exchange Last"
 *  <p></p>
 *  <p>    "V - Final Price of Session"
 *  <p>    "W - Ex-pit"
 *  <p>    "X - Crossed"
 *  <p>    "Y - Trades resulting from manual/slow quote"
 *  <p>    "Z - Trades resulting from intermarket sweep"
 *  <p></p>
 *  <p>    a-z
 *  <p>   "a - Volume Only"
 *  <p>   "b - Direct Plus"
 *  <p>   "c - Acquisition"
 *  <p>   "d - Bunched"
 *  <p>   "e - Distribution"
 *  <p></p>
 *  <p>   "f - Bunched Sale"
 *  <p>   "g - Split Trade"
 *  <p>   "h - Cancel Stopped"
 *  <p>   "i - Cancel ETH"
 *  <p>   "j - Cancel Stopped ETH"
 *  <p></p>
 *  <p>   "k - Out of Sequence ETH"
 *  <p>   "l - Cancel Last ETH"
 *  <p>   "m - Sold Last Sale ETH"
 *  <p>   "n - Cancel Last"
 *  <p>   "o - Sold Last Sale"
 *  <p></p>
 *  <p>   "p - Cancel Open"
 *  <p>   "q - Cancel Open ETH"
 *  <p>   "r - Opened Sale ETH"
 *  <p>   "s - Cancel Only"
 *  <p>   "t - Cancel Only ETH"
 *  <p></p>
 *  <p>   "u - Late Open ETH"
 *  <p>   "v - Auto Execution ETH"
 *  <p>   "w - Reopen"
 *  <p>   "x - Reopen ETH"
 *  <p>   "y - Adjusted"
 *  <p></p>
 *  <p>   "z - Adjusted ETH"
 *  <p></p>
 *  <p>    AA-AT
 *  <p>    "AA - Spread"
 *  <p>    "AB - Spread ETH"
 *  <p>    "AC - Straddle"
 *  <p>    "AD - Straddle ETH"
 *  <p>    "AE - Stopped"
 *  <p></p>
 *  <p>    "AF - Stopped ETH"
 *  <p>    "AG - Regular ETH"
 *  <p>    "AH - Combo"
 *  <p>    "AI - Combo ETH"
 *  <p>    "AJ - Official Closing Price"
 *  <p></p>
 *  <p>    "AK - Prior Reference Price"
 *  <p>    "AL - Stopped Sold Last"
 *  <p>    "AM - Stopped Out of Sequence"
 *  <p>    "AN - Offical Closing Price"
 *  <p>    "AO - Crossed"
 *  <p></p>
 *  <p>    "AP - Fast Market"
 *  <p>    "AQ - Automatic Execution"
 *  <p>    "AR - Form T"
 *  <p>    "AS - Basket Index"
 *  <p>    "AT - Burst Basket"
 */
class Enum277TradeConditionTest {
    @Test
    void Enum0277Test() {
        Enum277TradeCondition enumType;

        /*
         * 0 msg types
         */
        enumType = Enum277TradeCondition.CANCEL;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("CANCEL", enumType.toFIXNameString());
        assertEquals("0 - Cancel", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * A-N, msg types
         */
        enumType = Enum277TradeCondition.CASH_MARKET;
        assertEquals( "A", enumType.toFIXIDString());
        assertEquals( "CASH_MARKET", enumType.toFIXNameString());
        assertEquals( "A - Cash (only) Market", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.AVERAGE_PRICE_TRADE;
        assertEquals( "B", enumType.toFIXIDString());
        assertEquals( "AVERAGE_PRICE_TRADE", enumType.toFIXNameString());
        assertEquals( "B - Average Price Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.CASH_TRADE;
        assertEquals( "C", enumType.toFIXIDString());
        assertEquals( "CASH_TRADE", enumType.toFIXNameString());
        assertEquals( "C - Cash Trade (same day clearing)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.NEXT_DAY_MARKET;
        assertEquals( "D", enumType.toFIXIDString());
        assertEquals( "NEXT_DAY_MARKET", enumType.toFIXNameString());
        assertEquals( "D - Next Day (only) Market", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.OPENING_REOPENING_TRADE_DETAIL;
        assertEquals( "E", enumType.toFIXIDString());
        assertEquals( "OPENING_REOPENING_TRADE_DETAIL", enumType.toFIXNameString());
        assertEquals( "E - Opening/Reopening Trade Detail", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.INTRADAY_TRADE_DETAIL;
        assertEquals( "F", enumType.toFIXIDString());
        assertEquals( "INTRADAY_TRADE_DETAIL", enumType.toFIXNameString());
        assertEquals( "F - Intraday Trade Detail", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.RULE_127_TRADE_NYSE;
        assertEquals( "G", enumType.toFIXIDString());
        assertEquals( "RULE_127_TRADE_NYSE", enumType.toFIXNameString());
        assertEquals( "G - Rule 127 Trade (NYSE)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.RULE_155_TRADE_AMEX;
        assertEquals( "H", enumType.toFIXIDString());
        assertEquals( "RULE_155_TRADE_AMEX", enumType.toFIXNameString());
        assertEquals( "H - Rule 155 Trade (AMEX)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.SOLD_LAST;
        assertEquals( "I", enumType.toFIXIDString());
        assertEquals( "SOLD_LAST", enumType.toFIXNameString());
        assertEquals( "I - Sold Last (late reporting)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.NEXT_DAY_TRADE;
        assertEquals( "J", enumType.toFIXIDString());
        assertEquals( "NEXT_DAY_TRADE", enumType.toFIXNameString());
        assertEquals( "J - Next Day Trade (next day clearing)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.OPENED;
        assertEquals( "K", enumType.toFIXIDString());
        assertEquals( "OPENED", enumType.toFIXNameString());
        assertEquals( "K - Opened (late report of opened trade)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.SELLER;
        assertEquals( "L", enumType.toFIXIDString());
        assertEquals( "SELLER", enumType.toFIXNameString());
        assertEquals( "L - Seller", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.SOLD;
        assertEquals( "M", enumType.toFIXIDString());
        assertEquals( "SOLD", enumType.toFIXNameString());
        assertEquals( "M - Sold (out of sequence)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.STOPPED_STOCK;
        assertEquals( "N", enumType.toFIXIDString());
        assertEquals( "STOPPED_STOCK", enumType.toFIXNameString());
        assertEquals( "N - Stopped Stock (guarantee of price but does not execute the order)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * P-Z msg types
         */
        enumType = Enum277TradeCondition.IMBALANCE_MORE_BUYERS;
        assertEquals( "P", enumType.toFIXIDString());
        assertEquals( "IMBALANCE_MORE_BUYERS", enumType.toFIXNameString());
        assertEquals( "P - Imbalance More Buyers (cannot be used in combination with Q)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.IMBALANCE_MORE_SELLERS;
        assertEquals( "Q", enumType.toFIXIDString());
        assertEquals( "IMBALANCE_MORE_SELLERS", enumType.toFIXNameString());
        assertEquals( "Q - Imbalance More Sellers (cannot be used in combination with P)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.OPENING_PRICE;
        assertEquals( "R", enumType.toFIXIDString());
        assertEquals( "OPENING_PRICE", enumType.toFIXNameString());
        assertEquals( "R - Opening Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.BARGAIN_CONDITION_LSE;
        assertEquals( "S", enumType.toFIXIDString());
        assertEquals( "BARGAIN_CONDITION_LSE", enumType.toFIXNameString());
        assertEquals( "S - Bargain Condition (LSE)", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.CONVERTED_PRICE_INDICATOR;
        assertEquals( "T", enumType.toFIXIDString());
        assertEquals( "CONVERTED_PRICE_INDICATOR", enumType.toFIXNameString());
        assertEquals( "T - Converted Price Indicator", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.EXCHANGE_LAST;
        assertEquals( "U", enumType.toFIXIDString());
        assertEquals( "EXCHANGE_LAST", enumType.toFIXNameString());
        assertEquals( "U - Exchange Last", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.FINAL_PRICE_OF_SESSION;
        assertEquals( "V", enumType.toFIXIDString());
        assertEquals( "FINAL_PRICE_OF_SESSION", enumType.toFIXNameString());
        assertEquals( "V - Final Price of Session", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.EX_PIT;
        assertEquals( "W", enumType.toFIXIDString());
        assertEquals( "EX_PIT", enumType.toFIXNameString());
        assertEquals( "W - Ex-pit", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.CROSSED;
        assertEquals( "X", enumType.toFIXIDString());
        assertEquals( "CROSSED", enumType.toFIXNameString());
        assertEquals( "X - Crossed", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.TRADES_FROM_MANUAL_OR_SLOW_QUOTE;
        assertEquals( "Y", enumType.toFIXIDString());
        assertEquals( "TRADES_FROM_MANUAL_OR_SLOW_QUOTE", enumType.toFIXNameString());
        assertEquals( "Y - Trades resulting from manual/slow quote", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.TRADES_FROM_INTERMARKET_SWEEP;
        assertEquals( "Z", enumType.toFIXIDString());
        assertEquals( "TRADES_FROM_INTERMARKET_SWEEP", enumType.toFIXNameString());
        assertEquals( "Z - Trades resulting from intermarket sweep", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * a-z msg types
         */
        enumType = Enum277TradeCondition.VOLUME_ONLY;
        assertEquals( "a", enumType.toFIXIDString());
        assertEquals( "VOLUME_ONLY", enumType.toFIXNameString());
        assertEquals( "a - Volume Only", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.DIRECT_PLUS;
        assertEquals( "b", enumType.toFIXIDString());
        assertEquals( "DIRECT_PLUS", enumType.toFIXNameString());
        assertEquals( "b - Direct Plus", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.ACQUISITION;
        assertEquals( "c", enumType.toFIXIDString());
        assertEquals( "ACQUISITION", enumType.toFIXNameString());
        assertEquals( "c - Acquisition", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.BUNCHED;
        assertEquals( "d", enumType.toFIXIDString());
        assertEquals( "BUNCHED", enumType.toFIXNameString());
        assertEquals( "d - Bunched", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.DISTRIBUTION;
        assertEquals( "e", enumType.toFIXIDString());
        assertEquals( "DISTRIBUTION", enumType.toFIXNameString());
        assertEquals( "e - Distribution", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.BUNCHED_SALE;
        assertEquals( "f", enumType.toFIXIDString());
        assertEquals( "BUNCHED_SALE", enumType.toFIXNameString());
        assertEquals( "f - Bunched Sale", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.SPLIT_TRADE;
        assertEquals( "g", enumType.toFIXIDString());
        assertEquals( "SPLIT_TRADE", enumType.toFIXNameString());
        assertEquals( "g - Split Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_STOPPED;
        assertEquals( "h", enumType.toFIXIDString());
        assertEquals( "CANCEL_STOPPED", enumType.toFIXNameString());
        assertEquals( "h - Cancel Stopped", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_ETH;
        assertEquals( "i", enumType.toFIXIDString());
        assertEquals( "CANCEL_ETH", enumType.toFIXNameString());
        assertEquals( "i - Cancel ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_STOPPED_ETH;
        assertEquals( "j", enumType.toFIXIDString());
        assertEquals( "CANCEL_STOPPED_ETH", enumType.toFIXNameString());
        assertEquals( "j - Cancel Stopped ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.OUT_OF_SEQUENCE_ETH;
        assertEquals( "k", enumType.toFIXIDString());
        assertEquals( "OUT_OF_SEQUENCE_ETH", enumType.toFIXNameString());
        assertEquals( "k - Out of Sequence ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_LAST_ETH;
        assertEquals( "l", enumType.toFIXIDString());
        assertEquals( "CANCEL_LAST_ETH", enumType.toFIXNameString());
        assertEquals( "l - Cancel Last ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.SOLD_LAST_SALE_ETH;
        assertEquals( "m", enumType.toFIXIDString());
        assertEquals( "SOLD_LAST_SALE_ETH", enumType.toFIXNameString());
        assertEquals( "m - Sold Last Sale ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_LAST;
        assertEquals( "n", enumType.toFIXIDString());
        assertEquals( "CANCEL_LAST", enumType.toFIXNameString());
        assertEquals( "n - Cancel Last", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.SOLD_LAST_SALE;
        assertEquals( "o", enumType.toFIXIDString());
        assertEquals( "SOLD_LAST_SALE", enumType.toFIXNameString());
        assertEquals( "o - Sold Last Sale", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_OPEN;
        assertEquals( "p", enumType.toFIXIDString());
        assertEquals( "CANCEL_OPEN", enumType.toFIXNameString());
        assertEquals( "p - Cancel Open", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_OPEN_ETH;
        assertEquals( "q", enumType.toFIXIDString());
        assertEquals( "CANCEL_OPEN_ETH", enumType.toFIXNameString());
        assertEquals( "q - Cancel Open ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.OPENED_SALE_ETH;
        assertEquals( "r", enumType.toFIXIDString());
        assertEquals( "OPENED_SALE_ETH", enumType.toFIXNameString());
        assertEquals( "r - Opened Sale ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_ONLY;
        assertEquals( "s", enumType.toFIXIDString());
        assertEquals( "CANCEL_ONLY", enumType.toFIXNameString());
        assertEquals( "s - Cancel Only", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_ONLY_ETH;
        assertEquals( "t", enumType.toFIXIDString());
        assertEquals( "CANCEL_ONLY_ETH", enumType.toFIXNameString());
        assertEquals( "t - Cancel Only ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.LATE_OPEN_ETH;
        assertEquals( "u", enumType.toFIXIDString());
        assertEquals( "LATE_OPEN_ETH", enumType.toFIXNameString());
        assertEquals( "u - Late Open ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.AUTO_EXECUTION_ETH;
        assertEquals( "v", enumType.toFIXIDString());
        assertEquals( "AUTO_EXECUTION_ETH", enumType.toFIXNameString());
        assertEquals( "v - Auto Execution ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.REOPEN;
        assertEquals( "w", enumType.toFIXIDString());
        assertEquals( "REOPEN", enumType.toFIXNameString());
        assertEquals( "w - Reopen", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.REOPEN_ETH;
        assertEquals( "x", enumType.toFIXIDString());
        assertEquals( "REOPEN_ETH", enumType.toFIXNameString());
        assertEquals( "x - Reopen ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.ADJUSTED;
        assertEquals( "y", enumType.toFIXIDString());
        assertEquals( "ADJUSTED", enumType.toFIXNameString());
        assertEquals( "y - Adjusted", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.ADJUSTED_ETH;
        assertEquals( "z", enumType.toFIXIDString());
        assertEquals( "ADJUSTED_ETH", enumType.toFIXNameString());
        assertEquals( "z - Adjusted ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());


        /*
         * AA-AT msg types
         */
        enumType = Enum277TradeCondition.SPREAD;
        assertEquals( "AA", enumType.toFIXIDString());
        assertEquals( "SPREAD", enumType.toFIXNameString());
        assertEquals( "AA - Spread", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.SPREAD_ETH;
        assertEquals( "AB", enumType.toFIXIDString());
        assertEquals( "SPREAD_ETH", enumType.toFIXNameString());
        assertEquals( "AB - Spread ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.STRADDLE;
        assertEquals( "AC", enumType.toFIXIDString());
        assertEquals( "STRADDLE", enumType.toFIXNameString());
        assertEquals( "AC - Straddle", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.STRADDLE_ETH;
        assertEquals( "AD", enumType.toFIXIDString());
        assertEquals( "STRADDLE_ETH", enumType.toFIXNameString());
        assertEquals( "AD - Straddle ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.STOPPED;
        assertEquals( "AE", enumType.toFIXIDString());
        assertEquals( "STOPPED", enumType.toFIXNameString());
        assertEquals( "AE - Stopped", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.STOPPED_ETH;
        assertEquals( "AF", enumType.toFIXIDString());
        assertEquals( "STOPPED_ETH", enumType.toFIXNameString());
        assertEquals( "AF - Stopped ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.REGULAR_ETH;
        assertEquals( "AG", enumType.toFIXIDString());
        assertEquals( "REGULAR_ETH", enumType.toFIXNameString());
        assertEquals( "AG - Regular ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.COMBO;
        assertEquals( "AH", enumType.toFIXIDString());
        assertEquals( "COMBO", enumType.toFIXNameString());
        assertEquals( "AH - Combo", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.COMBO_ETH;
        assertEquals( "AI", enumType.toFIXIDString());
        assertEquals( "COMBO_ETH", enumType.toFIXNameString());
        assertEquals( "AI - Combo ETH", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.OFFICIAL_CLOSING_PRICE;
        assertEquals( "AJ", enumType.toFIXIDString());
        assertEquals( "OFFICIAL_CLOSING_PRICE", enumType.toFIXNameString());
        assertEquals( "AJ - Official Closing Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.PRIOR_REFERENCE_PRICE;
        assertEquals( "AK", enumType.toFIXIDString());
        assertEquals( "PRIOR_REFERENCE_PRICE", enumType.toFIXNameString());
        assertEquals( "AK - Prior Reference Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.STOPPED_SOLD_LAST;
        assertEquals( "AL", enumType.toFIXIDString());
        assertEquals( "STOPPED_SOLD_LAST", enumType.toFIXNameString());
        assertEquals( "AL - Stopped Sold Last", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.STOPPED_OUT_OF_SEQUENCE;
        assertEquals( "AM", enumType.toFIXIDString());
        assertEquals( "STOPPED_OUT_OF_SEQUENCE", enumType.toFIXNameString());
        assertEquals( "AM - Stopped Out of Sequence", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.OFFICAL_CLOSING_PRICE_AN;
        assertEquals( "AN", enumType.toFIXIDString());
        assertEquals( "OFFICAL_CLOSING_PRICE_AN", enumType.toFIXNameString());
        assertEquals( "AN - Offical Closing Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.CROSSED_AO;
        assertEquals( "AO", enumType.toFIXIDString());
        assertEquals( "CROSSED_AO", enumType.toFIXNameString());
        assertEquals( "AO - Crossed", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.FAST_MARKET;
        assertEquals( "AP", enumType.toFIXIDString());
        assertEquals( "FAST_MARKET", enumType.toFIXNameString());
        assertEquals( "AP - Fast Market", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.AUTOMATIC_EXECUTION;
        assertEquals( "AQ", enumType.toFIXIDString());
        assertEquals( "AUTOMATIC_EXECUTION", enumType.toFIXNameString());
        assertEquals( "AQ - Automatic Execution", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.FORM_T;
        assertEquals( "AR", enumType.toFIXIDString());
        assertEquals( "FORM_T", enumType.toFIXNameString());
        assertEquals( "AR - Form T", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.BASKET_INDEX;
        assertEquals( "AS", enumType.toFIXIDString());
        assertEquals( "BASKET_INDEX", enumType.toFIXNameString());
        assertEquals( "AS - Basket Index", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum277TradeCondition.BURST_BASKET;
        assertEquals("AT", enumType.toFIXIDString());
        assertEquals("BURST_BASKET", enumType.toFIXNameString());
        assertEquals("AT - Burst Basket", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}