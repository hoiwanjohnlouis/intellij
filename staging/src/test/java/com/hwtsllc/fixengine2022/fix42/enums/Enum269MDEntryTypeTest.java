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

import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum269MDEntryTypeTest {
    /**
     *  269
     *  MDEntryType
     *
     *  0-9 msg types
     *      "0 - Bid"
     *      "1 - Offer"
     *      "2 - Trade"
     *      "3 - Index Value"
     *      "4 - Opening Price"
     *      "5 - Closing Price"
     *      "6 - Settlement Price"
     *      "7 - Trading Session High Price"
     *      "8 - Trading Session Low Price"
     *      "9 - Trading Session VWAP Price"
     *
     *  A-Q msg types
     *      "A - Imbalance"
     *      "B - Trade Volume"
     *      "C - Open Interest"
     *      "D - Composite Underlying Price"
     *      "E - Simulated Sell Price"
     *      "F - Simulated Buy Price"
     *      "G - Margin Rate"
     *      "H - Mid Price"
     *      "J - Empty Book"
     *      "K - Settle High Price"
     *      "L - Settle Low Price"
     *      "M - Prior Settle Price"
     *      "N - Session High Bid"
     *      "O - Session Low Offer"
     *      "P - Early Prices"
     *      "Q - Auction Clearing Price"
     */
    @Test
    void Enum0269Test() {
        Enum269MDEntryType enumType;

        /**
         *  0-9, A-Q,
         */

        /**
         *  0-9
         */
        enumType = Enum269MDEntryType.BID;
        assertEquals( "0", enumType.getID());
        assertEquals( "BID", enumType.getName());
        assertEquals( "0 - Bid", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.OFFER;
        assertEquals( "1", enumType.getID());
        assertEquals( "OFFER", enumType.getName());
        assertEquals( "1 - Offer", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.TRADE;
        assertEquals( "2", enumType.getID());
        assertEquals( "TRADE", enumType.getName());
        assertEquals( "2 - Trade", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.INDEX_VALUE;
        assertEquals( "3", enumType.getID());
        assertEquals( "INDEX_VALUE", enumType.getName());
        assertEquals( "3 - Index Value", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.OPENING_PRICE;
        assertEquals( "4", enumType.getID());
        assertEquals( "OPENING_PRICE", enumType.getName());
        assertEquals( "4 - Opening Price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.CLOSING_PRICE;
        assertEquals( "5", enumType.getID());
        assertEquals( "CLOSING_PRICE", enumType.getName());
        assertEquals( "5 - Closing Price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.SETTLEMENT_PRICE;
        assertEquals( "6", enumType.getID());
        assertEquals( "SETTLEMENT_PRICE", enumType.getName());
        assertEquals( "6 - Settlement Price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.TRADING_SESSION_HIGH_PRICE;
        assertEquals( "7", enumType.getID());
        assertEquals( "TRADING_SESSION_HIGH_PRICE", enumType.getName());
        assertEquals( "7 - Trading Session High Price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.TRADING_SESSION_LOW_PRICE;
        assertEquals( "8", enumType.getID());
        assertEquals( "TRADING_SESSION_LOW_PRICE", enumType.getName());
        assertEquals( "8 - Trading Session Low Price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.TRADING_SESSION_VWAP_PRICE;
        assertEquals( "9", enumType.getID());
        assertEquals( "TRADING_SESSION_VWAP_PRICE", enumType.getName());
        assertEquals( "9 - Trading Session VWAP Price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        /**
         * A-Q
         */
        enumType = Enum269MDEntryType.IMBALANCE;
        assertEquals( "A", enumType.getID());
        assertEquals( "IMBALANCE", enumType.getName());
        assertEquals( "A - Imbalance", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.TRADE_VOLUME;
        assertEquals( "B", enumType.getID());
        assertEquals( "TRADE_VOLUME", enumType.getName());
        assertEquals( "B - Trade Volume", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.OPEN_INTEREST;
        assertEquals( "C", enumType.getID());
        assertEquals( "OPEN_INTEREST", enumType.getName());
        assertEquals( "C - Open Interest", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.COMPOSITE_UNDERLYING_PRICE;
        assertEquals( "D", enumType.getID());
        assertEquals( "COMPOSITE_UNDERLYING_PRICE", enumType.getName());
        assertEquals( "D - Composite Underlying Price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.SIMULATED_SELL_PRICE;
        assertEquals( "E", enumType.getID());
        assertEquals( "SIMULATED_SELL_PRICE", enumType.getName());
        assertEquals( "E - Simulated Sell Price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.SIMULATED_BUY_PRICE;
        assertEquals( "F", enumType.getID());
        assertEquals( "SIMULATED_BUY_PRICE", enumType.getName());
        assertEquals( "F - Simulated Buy Price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.MARGIN_RATE;
        assertEquals( "G", enumType.getID());
        assertEquals( "MARGIN_RATE", enumType.getName());
        assertEquals( "G - Margin Rate", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.MID_PRICE;
        assertEquals( "H", enumType.getID());
        assertEquals( "MID_PRICE", enumType.getName());
        assertEquals( "H - Mid Price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.EMPTY_BOOK;
        assertEquals( "J", enumType.getID());
        assertEquals( "EMPTY_BOOK", enumType.getName());
        assertEquals( "J - Empty Book", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.SETTLE_HIGH_PRICE;
        assertEquals( "K", enumType.getID());
        assertEquals( "SETTLE_HIGH_PRICE", enumType.getName());
        assertEquals( "K - Settle High Price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.SETTLE_LOW_PRICE;
        assertEquals( "L", enumType.getID());
        assertEquals( "SETTLE_LOW_PRICE", enumType.getName());
        assertEquals( "L - Settle Low Price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.PRIOR_SETTLE_PRICE;
        assertEquals( "M", enumType.getID());
        assertEquals( "PRIOR_SETTLE_PRICE", enumType.getName());
        assertEquals( "M - Prior Settle Price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.SESSION_HIGH_BID;
        assertEquals( "N", enumType.getID());
        assertEquals( "SESSION_HIGH_BID", enumType.getName());
        assertEquals( "N - Session High Bid", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.SESSION_LOW_OFFER;
        assertEquals( "O", enumType.getID());
        assertEquals( "SESSION_LOW_OFFER", enumType.getName());
        assertEquals( "O - Session Low Offer", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.EARLY_PRICES;
        assertEquals( "P", enumType.getID());
        assertEquals( "EARLY_PRICES", enumType.getName());
        assertEquals( "P - Early Prices", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum269MDEntryType.AUCTION_CLEARING_PRICE;
        assertEquals( "Q", enumType.getID());
        assertEquals( "AUCTION_CLEARING_PRICE", enumType.getName());
        assertEquals( "Q - Auction Clearing Price", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.getEnumName());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}