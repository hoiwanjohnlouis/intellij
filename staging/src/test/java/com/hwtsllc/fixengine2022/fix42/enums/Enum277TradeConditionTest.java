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
        assertEquals("CANCEL", enumType.toEnumNameString());
        assertEquals("0 - Cancel", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * A-N, msg types
         */
        enumType = Enum277TradeCondition.CASH_MARKET;
        assertEquals( "A", enumType.toFIXIDString());
        assertEquals( "CASH_MARKET", enumType.toEnumNameString());
        assertEquals( "A - Cash (only) Market", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.AVERAGE_PRICE_TRADE;
        assertEquals( "B", enumType.toFIXIDString());
        assertEquals( "AVERAGE_PRICE_TRADE", enumType.toEnumNameString());
        assertEquals( "B - Average Price Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.CASH_TRADE;
        assertEquals( "C", enumType.toFIXIDString());
        assertEquals( "CASH_TRADE", enumType.toEnumNameString());
        assertEquals( "C - Cash Trade (same day clearing)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.NEXT_DAY_MARKET;
        assertEquals( "D", enumType.toFIXIDString());
        assertEquals( "NEXT_DAY_MARKET", enumType.toEnumNameString());
        assertEquals( "D - Next Day (only) Market", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.OPENING_REOPENING_TRADE_DETAIL;
        assertEquals( "E", enumType.toFIXIDString());
        assertEquals( "OPENING_REOPENING_TRADE_DETAIL", enumType.toEnumNameString());
        assertEquals( "E - Opening/Reopening Trade Detail", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.INTRADAY_TRADE_DETAIL;
        assertEquals( "F", enumType.toFIXIDString());
        assertEquals( "INTRADAY_TRADE_DETAIL", enumType.toEnumNameString());
        assertEquals( "F - Intraday Trade Detail", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.RULE_127_TRADE_NYSE;
        assertEquals( "G", enumType.toFIXIDString());
        assertEquals( "RULE_127_TRADE_NYSE", enumType.toEnumNameString());
        assertEquals( "G - Rule 127 Trade (NYSE)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.RULE_155_TRADE_AMEX;
        assertEquals( "H", enumType.toFIXIDString());
        assertEquals( "RULE_155_TRADE_AMEX", enumType.toEnumNameString());
        assertEquals( "H - Rule 155 Trade (AMEX)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.SOLD_LAST;
        assertEquals( "I", enumType.toFIXIDString());
        assertEquals( "SOLD_LAST", enumType.toEnumNameString());
        assertEquals( "I - Sold Last (late reporting)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.NEXT_DAY_TRADE;
        assertEquals( "J", enumType.toFIXIDString());
        assertEquals( "NEXT_DAY_TRADE", enumType.toEnumNameString());
        assertEquals( "J - Next Day Trade (next day clearing)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.OPENED;
        assertEquals( "K", enumType.toFIXIDString());
        assertEquals( "OPENED", enumType.toEnumNameString());
        assertEquals( "K - Opened (late report of opened trade)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.SELLER;
        assertEquals( "L", enumType.toFIXIDString());
        assertEquals( "SELLER", enumType.toEnumNameString());
        assertEquals( "L - Seller", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.SOLD;
        assertEquals( "M", enumType.toFIXIDString());
        assertEquals( "SOLD", enumType.toEnumNameString());
        assertEquals( "M - Sold (out of sequence)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.STOPPED_STOCK;
        assertEquals( "N", enumType.toFIXIDString());
        assertEquals( "STOPPED_STOCK", enumType.toEnumNameString());
        assertEquals( "N - Stopped Stock (guarantee of price but does not execute the order)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * P-Z msg types
         */
        enumType = Enum277TradeCondition.IMBALANCE_MORE_BUYERS;
        assertEquals( "P", enumType.toFIXIDString());
        assertEquals( "IMBALANCE_MORE_BUYERS", enumType.toEnumNameString());
        assertEquals( "P - Imbalance More Buyers (cannot be used in combination with Q)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.IMBALANCE_MORE_SELLERS;
        assertEquals( "Q", enumType.toFIXIDString());
        assertEquals( "IMBALANCE_MORE_SELLERS", enumType.toEnumNameString());
        assertEquals( "Q - Imbalance More Sellers (cannot be used in combination with P)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.OPENING_PRICE;
        assertEquals( "R", enumType.toFIXIDString());
        assertEquals( "OPENING_PRICE", enumType.toEnumNameString());
        assertEquals( "R - Opening Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.BARGAIN_CONDITION_LSE;
        assertEquals( "S", enumType.toFIXIDString());
        assertEquals( "BARGAIN_CONDITION_LSE", enumType.toEnumNameString());
        assertEquals( "S - Bargain Condition (LSE)", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.CONVERTED_PRICE_INDICATOR;
        assertEquals( "T", enumType.toFIXIDString());
        assertEquals( "CONVERTED_PRICE_INDICATOR", enumType.toEnumNameString());
        assertEquals( "T - Converted Price Indicator", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.EXCHANGE_LAST;
        assertEquals( "U", enumType.toFIXIDString());
        assertEquals( "EXCHANGE_LAST", enumType.toEnumNameString());
        assertEquals( "U - Exchange Last", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.FINAL_PRICE_OF_SESSION;
        assertEquals( "V", enumType.toFIXIDString());
        assertEquals( "FINAL_PRICE_OF_SESSION", enumType.toEnumNameString());
        assertEquals( "V - Final Price of Session", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.EX_PIT;
        assertEquals( "W", enumType.toFIXIDString());
        assertEquals( "EX_PIT", enumType.toEnumNameString());
        assertEquals( "W - Ex-pit", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.CROSSED;
        assertEquals( "X", enumType.toFIXIDString());
        assertEquals( "CROSSED", enumType.toEnumNameString());
        assertEquals( "X - Crossed", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.TRADES_FROM_MANUAL_OR_SLOW_QUOTE;
        assertEquals( "Y", enumType.toFIXIDString());
        assertEquals( "TRADES_FROM_MANUAL_OR_SLOW_QUOTE", enumType.toEnumNameString());
        assertEquals( "Y - Trades resulting from manual/slow quote", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.TRADES_FROM_INTERMARKET_SWEEP;
        assertEquals( "Z", enumType.toFIXIDString());
        assertEquals( "TRADES_FROM_INTERMARKET_SWEEP", enumType.toEnumNameString());
        assertEquals( "Z - Trades resulting from intermarket sweep", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * a-z msg types
         */
        enumType = Enum277TradeCondition.VOLUME_ONLY;
        assertEquals( "a", enumType.toFIXIDString());
        assertEquals( "VOLUME_ONLY", enumType.toEnumNameString());
        assertEquals( "a - Volume Only", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.DIRECT_PLUS;
        assertEquals( "b", enumType.toFIXIDString());
        assertEquals( "DIRECT_PLUS", enumType.toEnumNameString());
        assertEquals( "b - Direct Plus", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.ACQUISITION;
        assertEquals( "c", enumType.toFIXIDString());
        assertEquals( "ACQUISITION", enumType.toEnumNameString());
        assertEquals( "c - Acquisition", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.BUNCHED;
        assertEquals( "d", enumType.toFIXIDString());
        assertEquals( "BUNCHED", enumType.toEnumNameString());
        assertEquals( "d - Bunched", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.DISTRIBUTION;
        assertEquals( "e", enumType.toFIXIDString());
        assertEquals( "DISTRIBUTION", enumType.toEnumNameString());
        assertEquals( "e - Distribution", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.BUNCHED_SALE;
        assertEquals( "f", enumType.toFIXIDString());
        assertEquals( "BUNCHED_SALE", enumType.toEnumNameString());
        assertEquals( "f - Bunched Sale", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.SPLIT_TRADE;
        assertEquals( "g", enumType.toFIXIDString());
        assertEquals( "SPLIT_TRADE", enumType.toEnumNameString());
        assertEquals( "g - Split Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_STOPPED;
        assertEquals( "h", enumType.toFIXIDString());
        assertEquals( "CANCEL_STOPPED", enumType.toEnumNameString());
        assertEquals( "h - Cancel Stopped", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_ETH;
        assertEquals( "i", enumType.toFIXIDString());
        assertEquals( "CANCEL_ETH", enumType.toEnumNameString());
        assertEquals( "i - Cancel ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_STOPPED_ETH;
        assertEquals( "j", enumType.toFIXIDString());
        assertEquals( "CANCEL_STOPPED_ETH", enumType.toEnumNameString());
        assertEquals( "j - Cancel Stopped ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.OUT_OF_SEQUENCE_ETH;
        assertEquals( "k", enumType.toFIXIDString());
        assertEquals( "OUT_OF_SEQUENCE_ETH", enumType.toEnumNameString());
        assertEquals( "k - Out of Sequence ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_LAST_ETH;
        assertEquals( "l", enumType.toFIXIDString());
        assertEquals( "CANCEL_LAST_ETH", enumType.toEnumNameString());
        assertEquals( "l - Cancel Last ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.SOLD_LAST_SALE_ETH;
        assertEquals( "m", enumType.toFIXIDString());
        assertEquals( "SOLD_LAST_SALE_ETH", enumType.toEnumNameString());
        assertEquals( "m - Sold Last Sale ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_LAST;
        assertEquals( "n", enumType.toFIXIDString());
        assertEquals( "CANCEL_LAST", enumType.toEnumNameString());
        assertEquals( "n - Cancel Last", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.SOLD_LAST_SALE;
        assertEquals( "o", enumType.toFIXIDString());
        assertEquals( "SOLD_LAST_SALE", enumType.toEnumNameString());
        assertEquals( "o - Sold Last Sale", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_OPEN;
        assertEquals( "p", enumType.toFIXIDString());
        assertEquals( "CANCEL_OPEN", enumType.toEnumNameString());
        assertEquals( "p - Cancel Open", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_OPEN_ETH;
        assertEquals( "q", enumType.toFIXIDString());
        assertEquals( "CANCEL_OPEN_ETH", enumType.toEnumNameString());
        assertEquals( "q - Cancel Open ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.OPENED_SALE_ETH;
        assertEquals( "r", enumType.toFIXIDString());
        assertEquals( "OPENED_SALE_ETH", enumType.toEnumNameString());
        assertEquals( "r - Opened Sale ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_ONLY;
        assertEquals( "s", enumType.toFIXIDString());
        assertEquals( "CANCEL_ONLY", enumType.toEnumNameString());
        assertEquals( "s - Cancel Only", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.CANCEL_ONLY_ETH;
        assertEquals( "t", enumType.toFIXIDString());
        assertEquals( "CANCEL_ONLY_ETH", enumType.toEnumNameString());
        assertEquals( "t - Cancel Only ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.LATE_OPEN_ETH;
        assertEquals( "u", enumType.toFIXIDString());
        assertEquals( "LATE_OPEN_ETH", enumType.toEnumNameString());
        assertEquals( "u - Late Open ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.AUTO_EXECUTION_ETH;
        assertEquals( "v", enumType.toFIXIDString());
        assertEquals( "AUTO_EXECUTION_ETH", enumType.toEnumNameString());
        assertEquals( "v - Auto Execution ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.REOPEN;
        assertEquals( "w", enumType.toFIXIDString());
        assertEquals( "REOPEN", enumType.toEnumNameString());
        assertEquals( "w - Reopen", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.REOPEN_ETH;
        assertEquals( "x", enumType.toFIXIDString());
        assertEquals( "REOPEN_ETH", enumType.toEnumNameString());
        assertEquals( "x - Reopen ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.ADJUSTED;
        assertEquals( "y", enumType.toFIXIDString());
        assertEquals( "ADJUSTED", enumType.toEnumNameString());
        assertEquals( "y - Adjusted", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.ADJUSTED_ETH;
        assertEquals( "z", enumType.toFIXIDString());
        assertEquals( "ADJUSTED_ETH", enumType.toEnumNameString());
        assertEquals( "z - Adjusted ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());


        /*
         * AA-AT msg types
         */
        enumType = Enum277TradeCondition.SPREAD;
        assertEquals( "AA", enumType.toFIXIDString());
        assertEquals( "SPREAD", enumType.toEnumNameString());
        assertEquals( "AA - Spread", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.SPREAD_ETH;
        assertEquals( "AB", enumType.toFIXIDString());
        assertEquals( "SPREAD_ETH", enumType.toEnumNameString());
        assertEquals( "AB - Spread ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.STRADDLE;
        assertEquals( "AC", enumType.toFIXIDString());
        assertEquals( "STRADDLE", enumType.toEnumNameString());
        assertEquals( "AC - Straddle", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.STRADDLE_ETH;
        assertEquals( "AD", enumType.toFIXIDString());
        assertEquals( "STRADDLE_ETH", enumType.toEnumNameString());
        assertEquals( "AD - Straddle ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.STOPPED;
        assertEquals( "AE", enumType.toFIXIDString());
        assertEquals( "STOPPED", enumType.toEnumNameString());
        assertEquals( "AE - Stopped", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.STOPPED_ETH;
        assertEquals( "AF", enumType.toFIXIDString());
        assertEquals( "STOPPED_ETH", enumType.toEnumNameString());
        assertEquals( "AF - Stopped ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.REGULAR_ETH;
        assertEquals( "AG", enumType.toFIXIDString());
        assertEquals( "REGULAR_ETH", enumType.toEnumNameString());
        assertEquals( "AG - Regular ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.COMBO;
        assertEquals( "AH", enumType.toFIXIDString());
        assertEquals( "COMBO", enumType.toEnumNameString());
        assertEquals( "AH - Combo", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.COMBO_ETH;
        assertEquals( "AI", enumType.toFIXIDString());
        assertEquals( "COMBO_ETH", enumType.toEnumNameString());
        assertEquals( "AI - Combo ETH", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.OFFICIAL_CLOSING_PRICE;
        assertEquals( "AJ", enumType.toFIXIDString());
        assertEquals( "OFFICIAL_CLOSING_PRICE", enumType.toEnumNameString());
        assertEquals( "AJ - Official Closing Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.PRIOR_REFERENCE_PRICE;
        assertEquals( "AK", enumType.toFIXIDString());
        assertEquals( "PRIOR_REFERENCE_PRICE", enumType.toEnumNameString());
        assertEquals( "AK - Prior Reference Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.STOPPED_SOLD_LAST;
        assertEquals( "AL", enumType.toFIXIDString());
        assertEquals( "STOPPED_SOLD_LAST", enumType.toEnumNameString());
        assertEquals( "AL - Stopped Sold Last", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.STOPPED_OUT_OF_SEQUENCE;
        assertEquals( "AM", enumType.toFIXIDString());
        assertEquals( "STOPPED_OUT_OF_SEQUENCE", enumType.toEnumNameString());
        assertEquals( "AM - Stopped Out of Sequence", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.OFFICAL_CLOSING_PRICE_AN;
        assertEquals( "AN", enumType.toFIXIDString());
        assertEquals( "OFFICAL_CLOSING_PRICE_AN", enumType.toEnumNameString());
        assertEquals( "AN - Offical Closing Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.CROSSED_AO;
        assertEquals( "AO", enumType.toFIXIDString());
        assertEquals( "CROSSED_AO", enumType.toEnumNameString());
        assertEquals( "AO - Crossed", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.FAST_MARKET;
        assertEquals( "AP", enumType.toFIXIDString());
        assertEquals( "FAST_MARKET", enumType.toEnumNameString());
        assertEquals( "AP - Fast Market", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.AUTOMATIC_EXECUTION;
        assertEquals( "AQ", enumType.toFIXIDString());
        assertEquals( "AUTOMATIC_EXECUTION", enumType.toEnumNameString());
        assertEquals( "AQ - Automatic Execution", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.FORM_T;
        assertEquals( "AR", enumType.toFIXIDString());
        assertEquals( "FORM_T", enumType.toEnumNameString());
        assertEquals( "AR - Form T", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.BASKET_INDEX;
        assertEquals( "AS", enumType.toFIXIDString());
        assertEquals( "BASKET_INDEX", enumType.toEnumNameString());
        assertEquals( "AS - Basket Index", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum277TradeCondition.BURST_BASKET;
        assertEquals("AT", enumType.toFIXIDString());
        assertEquals("BURST_BASKET", enumType.toEnumNameString());
        assertEquals("AT - Burst Basket", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}