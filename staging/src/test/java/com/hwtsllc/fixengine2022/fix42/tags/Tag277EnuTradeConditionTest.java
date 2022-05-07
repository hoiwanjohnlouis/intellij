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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import com.hwtsllc.fixengine2022.fix42.enums.Enum277TradeCondition;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag277EnuTradeConditionTest {
    @Test
    void FIX0277Test() {
        FIX42 fixData = FIX42.FIX277_ENU_TRADE_CONDITION;
        assertEquals( "277", fixData.getID());
        assertEquals( "TRADE_CONDITION", fixData.getName());
        assertEquals( "TradeCondition", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
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
    void Tag0277Test() {
        Tag277EnuTradeCondition tagData;

        /**
         *  0
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL);
        assertEquals( Enum277TradeCondition.CANCEL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         *  A-Z
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CASH_MARKET);
        assertEquals( Enum277TradeCondition.CASH_MARKET.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.AVERAGE_PRICE_TRADE);
        assertEquals( Enum277TradeCondition.AVERAGE_PRICE_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CASH_TRADE);
        assertEquals( Enum277TradeCondition.CASH_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.NEXT_DAY_MARKET);
        assertEquals( Enum277TradeCondition.NEXT_DAY_MARKET.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OPENING_REOPENING_TRADE_DETAIL);
        assertEquals( Enum277TradeCondition.OPENING_REOPENING_TRADE_DETAIL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.INTRADAY_TRADE_DETAIL);
        assertEquals( Enum277TradeCondition.INTRADAY_TRADE_DETAIL.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.RULE_127_TRADE_NYSE);
        assertEquals( Enum277TradeCondition.RULE_127_TRADE_NYSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.RULE_155_TRADE_AMEX);
        assertEquals( Enum277TradeCondition.RULE_155_TRADE_AMEX.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SOLD_LAST);
        assertEquals( Enum277TradeCondition.SOLD_LAST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.NEXT_DAY_TRADE);
        assertEquals( Enum277TradeCondition.NEXT_DAY_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OPENED);
        assertEquals( Enum277TradeCondition.OPENED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SELLER);
        assertEquals( Enum277TradeCondition.SELLER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SOLD);
        assertEquals( Enum277TradeCondition.SOLD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED_STOCK);
        assertEquals( Enum277TradeCondition.STOPPED_STOCK.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.IMBALANCE_MORE_BUYERS);
        assertEquals( Enum277TradeCondition.IMBALANCE_MORE_BUYERS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.IMBALANCE_MORE_SELLERS);
        assertEquals( Enum277TradeCondition.IMBALANCE_MORE_SELLERS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OPENING_PRICE);
        assertEquals( Enum277TradeCondition.OPENING_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BARGAIN_CONDITION_LSE);
        assertEquals( Enum277TradeCondition.BARGAIN_CONDITION_LSE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CONVERTED_PRICE_INDICATOR);
        assertEquals( Enum277TradeCondition.CONVERTED_PRICE_INDICATOR.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.EXCHANGE_LAST);
        assertEquals( Enum277TradeCondition.EXCHANGE_LAST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.FINAL_PRICE_OF_SESSION);
        assertEquals( Enum277TradeCondition.FINAL_PRICE_OF_SESSION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.EX_PIT);
        assertEquals( Enum277TradeCondition.EX_PIT.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CROSSED);
        assertEquals( Enum277TradeCondition.CROSSED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.TRADES_FROM_MANUAL_OR_SLOW_QUOTE);
        assertEquals( Enum277TradeCondition.TRADES_FROM_MANUAL_OR_SLOW_QUOTE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.TRADES_FROM_INTERMARKET_SWEEP);
        assertEquals( Enum277TradeCondition.TRADES_FROM_INTERMARKET_SWEEP.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * a-z
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.VOLUME_ONLY);
        assertEquals( Enum277TradeCondition.VOLUME_ONLY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.DIRECT_PLUS);
        assertEquals( Enum277TradeCondition.DIRECT_PLUS.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.ACQUISITION);
        assertEquals( Enum277TradeCondition.ACQUISITION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BUNCHED);
        assertEquals( Enum277TradeCondition.BUNCHED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.DISTRIBUTION);
        assertEquals( Enum277TradeCondition.DISTRIBUTION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BUNCHED_SALE);
        assertEquals( Enum277TradeCondition.BUNCHED_SALE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SPLIT_TRADE);
        assertEquals( Enum277TradeCondition.SPLIT_TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_STOPPED);
        assertEquals( Enum277TradeCondition.CANCEL_STOPPED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_ETH);
        assertEquals( Enum277TradeCondition.CANCEL_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_STOPPED_ETH);
        assertEquals( Enum277TradeCondition.CANCEL_STOPPED_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OUT_OF_SEQUENCE_ETH);
        assertEquals( Enum277TradeCondition.OUT_OF_SEQUENCE_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_LAST_ETH);
        assertEquals( Enum277TradeCondition.CANCEL_LAST_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SOLD_LAST_SALE_ETH);
        assertEquals( Enum277TradeCondition.SOLD_LAST_SALE_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_LAST);
        assertEquals( Enum277TradeCondition.CANCEL_LAST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SOLD_LAST_SALE);
        assertEquals( Enum277TradeCondition.SOLD_LAST_SALE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_OPEN);
        assertEquals( Enum277TradeCondition.CANCEL_OPEN.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_OPEN_ETH);
        assertEquals( Enum277TradeCondition.CANCEL_OPEN_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OPENED_SALE_ETH);
        assertEquals( Enum277TradeCondition.OPENED_SALE_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_ONLY);
        assertEquals( Enum277TradeCondition.CANCEL_ONLY.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CANCEL_ONLY_ETH);
        assertEquals( Enum277TradeCondition.CANCEL_ONLY_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.LATE_OPEN_ETH);
        assertEquals( Enum277TradeCondition.LATE_OPEN_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.AUTO_EXECUTION_ETH);
        assertEquals( Enum277TradeCondition.AUTO_EXECUTION_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.REOPEN);
        assertEquals( Enum277TradeCondition.REOPEN.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.REOPEN_ETH);
        assertEquals( Enum277TradeCondition.REOPEN_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.ADJUSTED);
        assertEquals( Enum277TradeCondition.ADJUSTED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.ADJUSTED_ETH);
        assertEquals( Enum277TradeCondition.ADJUSTED_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * AA-AT
         */
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SPREAD);
        assertEquals( Enum277TradeCondition.SPREAD.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.SPREAD_ETH);
        assertEquals( Enum277TradeCondition.SPREAD_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STRADDLE);
        assertEquals( Enum277TradeCondition.STRADDLE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STRADDLE_ETH);
        assertEquals( Enum277TradeCondition.STRADDLE_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED);
        assertEquals( Enum277TradeCondition.STOPPED.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED_ETH);
        assertEquals( Enum277TradeCondition.STOPPED_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.REGULAR_ETH);
        assertEquals( Enum277TradeCondition.REGULAR_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.COMBO);
        assertEquals( Enum277TradeCondition.COMBO.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.COMBO_ETH);
        assertEquals( Enum277TradeCondition.COMBO_ETH.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OFFICIAL_CLOSING_PRICE);
        assertEquals( Enum277TradeCondition.OFFICIAL_CLOSING_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.PRIOR_REFERENCE_PRICE);
        assertEquals( Enum277TradeCondition.PRIOR_REFERENCE_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED_SOLD_LAST);
        assertEquals( Enum277TradeCondition.STOPPED_SOLD_LAST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.STOPPED_OUT_OF_SEQUENCE);
        assertEquals( Enum277TradeCondition.STOPPED_OUT_OF_SEQUENCE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.OFFICAL_CLOSING_PRICE_AN);
        assertEquals( Enum277TradeCondition.OFFICAL_CLOSING_PRICE_AN.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.CROSSED_AO);
        assertEquals( Enum277TradeCondition.CROSSED_AO.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.FAST_MARKET);
        assertEquals( Enum277TradeCondition.FAST_MARKET.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.AUTOMATIC_EXECUTION);
        assertEquals( Enum277TradeCondition.AUTOMATIC_EXECUTION.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.FORM_T);
        assertEquals( Enum277TradeCondition.FORM_T.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BASKET_INDEX);
        assertEquals( Enum277TradeCondition.BASKET_INDEX.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        tagData = new Tag277EnuTradeCondition(Enum277TradeCondition.BURST_BASKET);
        assertEquals( Enum277TradeCondition.BURST_BASKET.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}