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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum277TradeCondition;
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
    @Test
    void FIX0277Test() {
        FIX42 fixData = FIX42.FIX277_ENU_TRADE_CONDITION;
        assertEquals( "277", fixData.toFIXIDString());
        assertEquals( "TRADE_CONDITION", fixData.toFIXNameString());
        assertEquals( "TradeCondition", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0277Test() {
        Tag277EnuTradeCondition tagData;

        /*
         *  0
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL);
        assertEquals( Enum277TradeCondition.CANCEL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         *  A-Z
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CASH_MARKET);
        assertEquals( Enum277TradeCondition.CASH_MARKET.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.AVERAGE_PRICE_TRADE);
        assertEquals( Enum277TradeCondition.AVERAGE_PRICE_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CASH_TRADE);
        assertEquals( Enum277TradeCondition.CASH_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.NEXT_DAY_MARKET);
        assertEquals( Enum277TradeCondition.NEXT_DAY_MARKET.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OPENING_REOPENING_TRADE_DETAIL);
        assertEquals( Enum277TradeCondition.OPENING_REOPENING_TRADE_DETAIL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.INTRADAY_TRADE_DETAIL);
        assertEquals( Enum277TradeCondition.INTRADAY_TRADE_DETAIL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.RULE_127_TRADE_NYSE);
        assertEquals( Enum277TradeCondition.RULE_127_TRADE_NYSE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.RULE_155_TRADE_AMEX);
        assertEquals( Enum277TradeCondition.RULE_155_TRADE_AMEX.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SOLD_LAST);
        assertEquals( Enum277TradeCondition.SOLD_LAST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.NEXT_DAY_TRADE);
        assertEquals( Enum277TradeCondition.NEXT_DAY_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OPENED);
        assertEquals( Enum277TradeCondition.OPENED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SELLER);
        assertEquals( Enum277TradeCondition.SELLER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SOLD);
        assertEquals( Enum277TradeCondition.SOLD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED_STOCK);
        assertEquals( Enum277TradeCondition.STOPPED_STOCK.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.IMBALANCE_MORE_BUYERS);
        assertEquals( Enum277TradeCondition.IMBALANCE_MORE_BUYERS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.IMBALANCE_MORE_SELLERS);
        assertEquals( Enum277TradeCondition.IMBALANCE_MORE_SELLERS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OPENING_PRICE);
        assertEquals( Enum277TradeCondition.OPENING_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BARGAIN_CONDITION_LSE);
        assertEquals( Enum277TradeCondition.BARGAIN_CONDITION_LSE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CONVERTED_PRICE_INDICATOR);
        assertEquals( Enum277TradeCondition.CONVERTED_PRICE_INDICATOR.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.EXCHANGE_LAST);
        assertEquals( Enum277TradeCondition.EXCHANGE_LAST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.FINAL_PRICE_OF_SESSION);
        assertEquals( Enum277TradeCondition.FINAL_PRICE_OF_SESSION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.EX_PIT);
        assertEquals( Enum277TradeCondition.EX_PIT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CROSSED);
        assertEquals( Enum277TradeCondition.CROSSED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.TRADES_FROM_MANUAL_OR_SLOW_QUOTE);
        assertEquals( Enum277TradeCondition.TRADES_FROM_MANUAL_OR_SLOW_QUOTE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.TRADES_FROM_INTERMARKET_SWEEP);
        assertEquals( Enum277TradeCondition.TRADES_FROM_INTERMARKET_SWEEP.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * a-z
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.VOLUME_ONLY);
        assertEquals( Enum277TradeCondition.VOLUME_ONLY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.DIRECT_PLUS);
        assertEquals( Enum277TradeCondition.DIRECT_PLUS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.ACQUISITION);
        assertEquals( Enum277TradeCondition.ACQUISITION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BUNCHED);
        assertEquals( Enum277TradeCondition.BUNCHED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.DISTRIBUTION);
        assertEquals( Enum277TradeCondition.DISTRIBUTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BUNCHED_SALE);
        assertEquals( Enum277TradeCondition.BUNCHED_SALE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SPLIT_TRADE);
        assertEquals( Enum277TradeCondition.SPLIT_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_STOPPED);
        assertEquals( Enum277TradeCondition.CANCEL_STOPPED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_ETH);
        assertEquals( Enum277TradeCondition.CANCEL_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_STOPPED_ETH);
        assertEquals( Enum277TradeCondition.CANCEL_STOPPED_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OUT_OF_SEQUENCE_ETH);
        assertEquals( Enum277TradeCondition.OUT_OF_SEQUENCE_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_LAST_ETH);
        assertEquals( Enum277TradeCondition.CANCEL_LAST_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SOLD_LAST_SALE_ETH);
        assertEquals( Enum277TradeCondition.SOLD_LAST_SALE_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_LAST);
        assertEquals( Enum277TradeCondition.CANCEL_LAST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SOLD_LAST_SALE);
        assertEquals( Enum277TradeCondition.SOLD_LAST_SALE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_OPEN);
        assertEquals( Enum277TradeCondition.CANCEL_OPEN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_OPEN_ETH);
        assertEquals( Enum277TradeCondition.CANCEL_OPEN_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OPENED_SALE_ETH);
        assertEquals( Enum277TradeCondition.OPENED_SALE_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_ONLY);
        assertEquals( Enum277TradeCondition.CANCEL_ONLY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_ONLY_ETH);
        assertEquals( Enum277TradeCondition.CANCEL_ONLY_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.LATE_OPEN_ETH);
        assertEquals( Enum277TradeCondition.LATE_OPEN_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.AUTO_EXECUTION_ETH);
        assertEquals( Enum277TradeCondition.AUTO_EXECUTION_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.REOPEN);
        assertEquals( Enum277TradeCondition.REOPEN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.REOPEN_ETH);
        assertEquals( Enum277TradeCondition.REOPEN_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.ADJUSTED);
        assertEquals( Enum277TradeCondition.ADJUSTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.ADJUSTED_ETH);
        assertEquals( Enum277TradeCondition.ADJUSTED_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * AA-AT
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SPREAD);
        assertEquals( Enum277TradeCondition.SPREAD.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SPREAD_ETH);
        assertEquals( Enum277TradeCondition.SPREAD_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STRADDLE);
        assertEquals( Enum277TradeCondition.STRADDLE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STRADDLE_ETH);
        assertEquals( Enum277TradeCondition.STRADDLE_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED);
        assertEquals( Enum277TradeCondition.STOPPED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED_ETH);
        assertEquals( Enum277TradeCondition.STOPPED_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.REGULAR_ETH);
        assertEquals( Enum277TradeCondition.REGULAR_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.COMBO);
        assertEquals( Enum277TradeCondition.COMBO.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.COMBO_ETH);
        assertEquals( Enum277TradeCondition.COMBO_ETH.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OFFICIAL_CLOSING_PRICE);
        assertEquals( Enum277TradeCondition.OFFICIAL_CLOSING_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.PRIOR_REFERENCE_PRICE);
        assertEquals( Enum277TradeCondition.PRIOR_REFERENCE_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED_SOLD_LAST);
        assertEquals( Enum277TradeCondition.STOPPED_SOLD_LAST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED_OUT_OF_SEQUENCE);
        assertEquals( Enum277TradeCondition.STOPPED_OUT_OF_SEQUENCE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OFFICAL_CLOSING_PRICE_AN);
        assertEquals( Enum277TradeCondition.OFFICAL_CLOSING_PRICE_AN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CROSSED_AO);
        assertEquals( Enum277TradeCondition.CROSSED_AO.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.FAST_MARKET);
        assertEquals( Enum277TradeCondition.FAST_MARKET.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.AUTOMATIC_EXECUTION);
        assertEquals( Enum277TradeCondition.AUTOMATIC_EXECUTION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.FORM_T);
        assertEquals( Enum277TradeCondition.FORM_T.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BASKET_INDEX);
        assertEquals( Enum277TradeCondition.BASKET_INDEX.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BURST_BASKET);
        assertEquals( Enum277TradeCondition.BURST_BASKET.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}