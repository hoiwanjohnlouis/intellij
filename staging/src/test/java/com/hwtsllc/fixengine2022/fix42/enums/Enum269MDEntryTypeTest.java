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

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum269MDEntryTypeTest {
    @Test
    void Enum0269Test() {
        Enum269MDEntryType enumType;

        /*
         * 0-9
         */
        enumType = Enum269MDEntryType.BID;
        enumType = Enum269MDEntryType.OFFER;
        enumType = Enum269MDEntryType.TRADE;
        enumType = Enum269MDEntryType.INDEX_VALUE;
        enumType = Enum269MDEntryType.OPENING_PRICE;
        enumType = Enum269MDEntryType.CLOSING_PRICE;
        enumType = Enum269MDEntryType.SETTLEMENT_PRICE;
        enumType = Enum269MDEntryType.TRADING_SESSION_HIGH_PRICE;
        enumType = Enum269MDEntryType.TRADING_SESSION_LOW_PRICE;
        enumType = Enum269MDEntryType.TRADING_SESSION_VWAP_PRICE;

        /*
         * A-Q
         */
        enumType = Enum269MDEntryType.IMBALANCE;
        enumType = Enum269MDEntryType.TRADE_VOLUME;
        enumType = Enum269MDEntryType.OPEN_INTEREST;
        enumType = Enum269MDEntryType.COMPOSITE_UNDERLYING_PRICE;
        enumType = Enum269MDEntryType.SIMULATED_SELL_PRICE;
        enumType = Enum269MDEntryType.SIMULATED_BUY_PRICE;
        enumType = Enum269MDEntryType.MARGIN_RATE;
        enumType = Enum269MDEntryType.MID_PRICE;
        enumType = Enum269MDEntryType.EMPTY_BOOK;
        enumType = Enum269MDEntryType.SETTLE_HIGH_PRICE;
        enumType = Enum269MDEntryType.SETTLE_LOW_PRICE;
        enumType = Enum269MDEntryType.PRIOR_SETTLE_PRICE;
        enumType = Enum269MDEntryType.SESSION_HIGH_BID;
        enumType = Enum269MDEntryType.SESSION_LOW_OFFER;
        enumType = Enum269MDEntryType.EARLY_PRICES;
        enumType = Enum269MDEntryType.AUCTION_CLEARING_PRICE;


        assertEquals(1,1);
        assertNotEquals(2,1);
    }
    /**
     *
     */
    public static void main(String[] args) {
        System.out.println();
    }
}