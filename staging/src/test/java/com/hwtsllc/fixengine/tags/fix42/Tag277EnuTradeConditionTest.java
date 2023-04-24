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

package com.hwtsllc.fixengine.tags.fix42;

import com.hwtsllc.fixengine.enums.fix42.Enum277TradeCondition;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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
            assertEquals( "FIX277_ENU_TRADE_CONDITION", tagData.toFIXLabelString());
            assertEquals( "277", tagData.toFIXIDString());
            assertEquals( "TRADE_CONDITION", tagData.toFIXNameString());
            assertEquals( "TradeCondition", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum277TradeCondition oneEnum : Enum277TradeCondition.values()) {
            tagData = new Tag277EnuTradeCondition(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  277
         *  TradeCondition
         *  MultipleStringValue
         *  <p>    0
         *  <p>    "0 - Cancel"
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        /*
         *  <p>    A-Z
         *  <p>    "A - Cash (only) Market"
         *  <p>    "B - Average Price Trade"
         *  <p>    "C - Cash Trade (same day clearing)"
         *  <p>    "D - Next Day (only) Market"
         *  <p>    "E - Opening/Reopening Trade Detail"
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CASH_MARKET);
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.AVERAGE_PRICE_TRADE);
        assertEquals( "B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CASH_TRADE);
        assertEquals( "C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.NEXT_DAY_MARKET);
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OPENING_REOPENING_TRADE_DETAIL);
        assertEquals( "E", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "F - Intraday Trade Detail"
         *  <p>    "G - Rule 127 Trade (NYSE)"
         *  <p>    "H - Rule 155 Trade (AMEX)"
         *  <p>    "I - Sold Last (late reporting)"
         *  <p>    "J - Next Day Trade (next day clearing)"
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.INTRADAY_TRADE_DETAIL);
        assertEquals( "F", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.RULE_127_TRADE_NYSE);
        assertEquals( "G", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.RULE_155_TRADE_AMEX);
        assertEquals( "H", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SOLD_LAST);
        assertEquals( "I", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.NEXT_DAY_TRADE);
        assertEquals( "J", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "K - Opened (late report of opened trade)"
         *  <p>    "L - Seller"
         *  <p>    "M - Sold (out of sequence)"
         *  <p>    "N - Stopped Stock (guarantee of price but does not execute the order)"
         *  <p>    "P - Imbalance More Buyers (cannot be used in combination with Q)"
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OPENED);
        assertEquals( "K", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SELLER);
        assertEquals( "L", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SOLD);
        assertEquals( "M", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED_STOCK);
        assertEquals( "N", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.IMBALANCE_MORE_BUYERS);
        assertEquals( "P", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "Q - Imbalance More Sellers (cannot be used in combination with P)"
         *  <p>    "R - Opening Price"
         *  <p>    "S - Bargain Condition (LSE)"
         *  <p>    "T - Converted Price Indicator"
         *  <p>    "U - Exchange Last"
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.IMBALANCE_MORE_SELLERS);
        assertEquals( "Q", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OPENING_PRICE);
        assertEquals( "R", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BARGAIN_CONDITION_LSE);
        assertEquals( "S", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CONVERTED_PRICE_INDICATOR);
        assertEquals( "T", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.EXCHANGE_LAST);
        assertEquals( "U", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "V - Final Price of Session"
         *  <p>    "W - Ex-pit"
         *  <p>    "X - Crossed"
         *  <p>    "Y - Trades resulting from manual/slow quote"
         *  <p>    "Z - Trades resulting from intermarket sweep"
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.FINAL_PRICE_OF_SESSION);
        assertEquals( "V", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.EX_PIT);
        assertEquals( "W", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CROSSED);
        assertEquals( "X", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.TRADES_FROM_MANUAL_OR_SLOW_QUOTE);
        assertEquals( "Y", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.TRADES_FROM_INTERMARKET_SWEEP);
        assertEquals( "Z", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        /*
         *  <p>    a-z
         *  <p>   "a - Volume Only"
         *  <p>   "b - Direct Plus"
         *  <p>   "c - Acquisition"
         *  <p>   "d - Bunched"
         *  <p>   "e - Distribution"
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.VOLUME_ONLY);
        assertEquals( "a", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.DIRECT_PLUS);
        assertEquals( "b", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.ACQUISITION);
        assertEquals( "c", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BUNCHED);
        assertEquals( "d", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.DISTRIBUTION);
        assertEquals( "e", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>   "f - Bunched Sale"
         *  <p>   "g - Split Trade"
         *  <p>   "h - Cancel Stopped"
         *  <p>   "i - Cancel ETH"
         *  <p>   "j - Cancel Stopped ETH"
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BUNCHED_SALE);
        assertEquals( "f", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SPLIT_TRADE);
        assertEquals( "g", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_STOPPED);
        assertEquals( "h", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_ETH);
        assertEquals( "i", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_STOPPED_ETH);
        assertEquals( "j", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>   "k - Out of Sequence ETH"
         *  <p>   "l - Cancel Last ETH"
         *  <p>   "m - Sold Last Sale ETH"
         *  <p>   "n - Cancel Last"
         *  <p>   "o - Sold Last Sale"
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OUT_OF_SEQUENCE_ETH);
        assertEquals( "k", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_LAST_ETH);
        assertEquals( "l", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SOLD_LAST_SALE_ETH);
        assertEquals( "m", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_LAST);
        assertEquals( "n", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SOLD_LAST_SALE);
        assertEquals( "o", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>   "p - Cancel Open"
         *  <p>   "q - Cancel Open ETH"
         *  <p>   "r - Opened Sale ETH"
         *  <p>   "s - Cancel Only"
         *  <p>   "t - Cancel Only ETH"
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_OPEN);
        assertEquals( "p", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_OPEN_ETH);
        assertEquals( "q", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OPENED_SALE_ETH);
        assertEquals( "r", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_ONLY);
        assertEquals( "s", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_ONLY_ETH);
        assertEquals( "t", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>   "u - Late Open ETH"
         *  <p>   "v - Auto Execution ETH"
         *  <p>   "w - Reopen"
         *  <p>   "x - Reopen ETH"
         *  <p>   "y - Adjusted"
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.LATE_OPEN_ETH);
        assertEquals( "u", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.AUTO_EXECUTION_ETH);
        assertEquals( "v", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.REOPEN);
        assertEquals( "w", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.REOPEN_ETH);
        assertEquals( "x", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.ADJUSTED);
        assertEquals( "y", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>   "z - Adjusted ETH"
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.ADJUSTED_ETH);
        assertEquals( "z", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        /*
         *  <p>    AA-AT
         *  <p>    "AA - Spread"
         *  <p>    "AB - Spread ETH"
         *  <p>    "AC - Straddle"
         *  <p>    "AD - Straddle ETH"
         *  <p>    "AE - Stopped"
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SPREAD);
        assertEquals( "AA", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SPREAD_ETH);
        assertEquals( "AB", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STRADDLE);
        assertEquals( "AC", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STRADDLE_ETH);
        assertEquals( "AD", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED);
        assertEquals( "AE", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "AF - Stopped ETH"
         *  <p>    "AG - Regular ETH"
         *  <p>    "AH - Combo"
         *  <p>    "AI - Combo ETH"
         *  <p>    "AJ - Official Closing Price"
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED_ETH);
        assertEquals( "AF", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.REGULAR_ETH);
        assertEquals( "AG", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.COMBO);
        assertEquals( "AH", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.COMBO_ETH);
        assertEquals( "AI", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OFFICIAL_CLOSING_PRICE);
        assertEquals( "AJ", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "AK - Prior Reference Price"
         *  <p>    "AL - Stopped Sold Last"
         *  <p>    "AM - Stopped Out of Sequence"
         *  <p>    "AN - Offical Closing Price"
         *  <p>    "AO - Crossed"
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.PRIOR_REFERENCE_PRICE);
        assertEquals( "AK", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED_SOLD_LAST);
        assertEquals( "AL", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED_OUT_OF_SEQUENCE);
        assertEquals( "AM", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OFFICAL_CLOSING_PRICE_AN);
        assertEquals( "AN", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CROSSED_AO);
        assertEquals( "AO", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "AP - Fast Market"
         *  <p>    "AQ - Automatic Execution"
         *  <p>    "AR - Form T"
         *  <p>    "AS - Basket Index"
         *  <p>    "AT - Burst Basket"
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.FAST_MARKET);
        assertEquals( "AP", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.AUTOMATIC_EXECUTION);
        assertEquals( "AQ", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.FORM_T);
        assertEquals( "AR", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BASKET_INDEX);
        assertEquals( "AS", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BURST_BASKET);
        assertEquals( "AT", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


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
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}