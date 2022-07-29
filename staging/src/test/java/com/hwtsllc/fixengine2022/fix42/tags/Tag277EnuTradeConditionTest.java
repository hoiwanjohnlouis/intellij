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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.fix42.enums.Enum277TradeCondition;
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
class Tag277EnuTradeConditionTest {
    Tag277EnuTradeCondition tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum277TradeCondition oneEnum : Enum277TradeCondition.values()) {
            tagData = new Tag277EnuTradeCondition(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum277TradeCondition oneEnum : Enum277TradeCondition.values()) {
            tagData = new Tag277EnuTradeCondition(oneEnum);
            assertEquals( "FIX277_ENU_TRADE_CONDITION", tagData.toEnumLabelString());
            assertEquals( "277", tagData.toEnumIDString());
            assertEquals( "TRADE_CONDITION", tagData.toEnumNameString());
            assertEquals( "TradeCondition", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  0
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL);
        assertEquals( Enum277TradeCondition.CANCEL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  A-Z
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CASH_MARKET);
        assertEquals( Enum277TradeCondition.CASH_MARKET.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.AVERAGE_PRICE_TRADE);
        assertEquals( Enum277TradeCondition.AVERAGE_PRICE_TRADE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CASH_TRADE);
        assertEquals( Enum277TradeCondition.CASH_TRADE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.NEXT_DAY_MARKET);
        assertEquals( Enum277TradeCondition.NEXT_DAY_MARKET.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OPENING_REOPENING_TRADE_DETAIL);
        assertEquals( Enum277TradeCondition.OPENING_REOPENING_TRADE_DETAIL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.INTRADAY_TRADE_DETAIL);
        assertEquals( Enum277TradeCondition.INTRADAY_TRADE_DETAIL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.RULE_127_TRADE_NYSE);
        assertEquals( Enum277TradeCondition.RULE_127_TRADE_NYSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.RULE_155_TRADE_AMEX);
        assertEquals( Enum277TradeCondition.RULE_155_TRADE_AMEX.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SOLD_LAST);
        assertEquals( Enum277TradeCondition.SOLD_LAST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.NEXT_DAY_TRADE);
        assertEquals( Enum277TradeCondition.NEXT_DAY_TRADE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OPENED);
        assertEquals( Enum277TradeCondition.OPENED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SELLER);
        assertEquals( Enum277TradeCondition.SELLER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SOLD);
        assertEquals( Enum277TradeCondition.SOLD.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED_STOCK);
        assertEquals( Enum277TradeCondition.STOPPED_STOCK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.IMBALANCE_MORE_BUYERS);
        assertEquals( Enum277TradeCondition.IMBALANCE_MORE_BUYERS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.IMBALANCE_MORE_SELLERS);
        assertEquals( Enum277TradeCondition.IMBALANCE_MORE_SELLERS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OPENING_PRICE);
        assertEquals( Enum277TradeCondition.OPENING_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BARGAIN_CONDITION_LSE);
        assertEquals( Enum277TradeCondition.BARGAIN_CONDITION_LSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CONVERTED_PRICE_INDICATOR);
        assertEquals( Enum277TradeCondition.CONVERTED_PRICE_INDICATOR.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.EXCHANGE_LAST);
        assertEquals( Enum277TradeCondition.EXCHANGE_LAST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.FINAL_PRICE_OF_SESSION);
        assertEquals( Enum277TradeCondition.FINAL_PRICE_OF_SESSION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.EX_PIT);
        assertEquals( Enum277TradeCondition.EX_PIT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CROSSED);
        assertEquals( Enum277TradeCondition.CROSSED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.TRADES_FROM_MANUAL_OR_SLOW_QUOTE);
        assertEquals( Enum277TradeCondition.TRADES_FROM_MANUAL_OR_SLOW_QUOTE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.TRADES_FROM_INTERMARKET_SWEEP);
        assertEquals( Enum277TradeCondition.TRADES_FROM_INTERMARKET_SWEEP.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * a-z
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.VOLUME_ONLY);
        assertEquals( Enum277TradeCondition.VOLUME_ONLY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.DIRECT_PLUS);
        assertEquals( Enum277TradeCondition.DIRECT_PLUS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.ACQUISITION);
        assertEquals( Enum277TradeCondition.ACQUISITION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BUNCHED);
        assertEquals( Enum277TradeCondition.BUNCHED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.DISTRIBUTION);
        assertEquals( Enum277TradeCondition.DISTRIBUTION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BUNCHED_SALE);
        assertEquals( Enum277TradeCondition.BUNCHED_SALE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SPLIT_TRADE);
        assertEquals( Enum277TradeCondition.SPLIT_TRADE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_STOPPED);
        assertEquals( Enum277TradeCondition.CANCEL_STOPPED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_ETH);
        assertEquals( Enum277TradeCondition.CANCEL_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_STOPPED_ETH);
        assertEquals( Enum277TradeCondition.CANCEL_STOPPED_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OUT_OF_SEQUENCE_ETH);
        assertEquals( Enum277TradeCondition.OUT_OF_SEQUENCE_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_LAST_ETH);
        assertEquals( Enum277TradeCondition.CANCEL_LAST_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SOLD_LAST_SALE_ETH);
        assertEquals( Enum277TradeCondition.SOLD_LAST_SALE_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_LAST);
        assertEquals( Enum277TradeCondition.CANCEL_LAST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SOLD_LAST_SALE);
        assertEquals( Enum277TradeCondition.SOLD_LAST_SALE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_OPEN);
        assertEquals( Enum277TradeCondition.CANCEL_OPEN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_OPEN_ETH);
        assertEquals( Enum277TradeCondition.CANCEL_OPEN_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OPENED_SALE_ETH);
        assertEquals( Enum277TradeCondition.OPENED_SALE_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_ONLY);
        assertEquals( Enum277TradeCondition.CANCEL_ONLY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_ONLY_ETH);
        assertEquals( Enum277TradeCondition.CANCEL_ONLY_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.LATE_OPEN_ETH);
        assertEquals( Enum277TradeCondition.LATE_OPEN_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.AUTO_EXECUTION_ETH);
        assertEquals( Enum277TradeCondition.AUTO_EXECUTION_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.REOPEN);
        assertEquals( Enum277TradeCondition.REOPEN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.REOPEN_ETH);
        assertEquals( Enum277TradeCondition.REOPEN_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.ADJUSTED);
        assertEquals( Enum277TradeCondition.ADJUSTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.ADJUSTED_ETH);
        assertEquals( Enum277TradeCondition.ADJUSTED_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * AA-AT
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SPREAD);
        assertEquals( Enum277TradeCondition.SPREAD.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SPREAD_ETH);
        assertEquals( Enum277TradeCondition.SPREAD_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STRADDLE);
        assertEquals( Enum277TradeCondition.STRADDLE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STRADDLE_ETH);
        assertEquals( Enum277TradeCondition.STRADDLE_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED);
        assertEquals( Enum277TradeCondition.STOPPED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED_ETH);
        assertEquals( Enum277TradeCondition.STOPPED_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.REGULAR_ETH);
        assertEquals( Enum277TradeCondition.REGULAR_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.COMBO);
        assertEquals( Enum277TradeCondition.COMBO.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.COMBO_ETH);
        assertEquals( Enum277TradeCondition.COMBO_ETH.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OFFICIAL_CLOSING_PRICE);
        assertEquals( Enum277TradeCondition.OFFICIAL_CLOSING_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.PRIOR_REFERENCE_PRICE);
        assertEquals( Enum277TradeCondition.PRIOR_REFERENCE_PRICE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED_SOLD_LAST);
        assertEquals( Enum277TradeCondition.STOPPED_SOLD_LAST.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED_OUT_OF_SEQUENCE);
        assertEquals( Enum277TradeCondition.STOPPED_OUT_OF_SEQUENCE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OFFICAL_CLOSING_PRICE_AN);
        assertEquals( Enum277TradeCondition.OFFICAL_CLOSING_PRICE_AN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CROSSED_AO);
        assertEquals( Enum277TradeCondition.CROSSED_AO.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.FAST_MARKET);
        assertEquals( Enum277TradeCondition.FAST_MARKET.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.AUTOMATIC_EXECUTION);
        assertEquals( Enum277TradeCondition.AUTOMATIC_EXECUTION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.FORM_T);
        assertEquals( Enum277TradeCondition.FORM_T.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BASKET_INDEX);
        assertEquals( Enum277TradeCondition.BASKET_INDEX.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BURST_BASKET);
        assertEquals( Enum277TradeCondition.BURST_BASKET.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum277TradeCondition oneEnum : Enum277TradeCondition.values()) {
            tagData = new Tag277EnuTradeCondition(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum277TradeCondition oneEnum : Enum277TradeCondition.values()) {
            tagData = new Tag277EnuTradeCondition(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum277TradeCondition oneEnum : Enum277TradeCondition.values()) {
            tagData = new Tag277EnuTradeCondition(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum277TradeCondition oneEnum : Enum277TradeCondition.values()) {
            tagData = new Tag277EnuTradeCondition(oneEnum);
            assertEquals( "Tag277EnuTradeCondition\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}