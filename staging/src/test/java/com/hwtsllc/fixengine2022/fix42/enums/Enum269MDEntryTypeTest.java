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

        /*
         *  0-9, A-Q,
         */

        /*
         *  0-9
         */
        enumType = Enum269MDEntryType.BID;
        assertEquals( "0", enumType.toFIXIDString());
        assertEquals( "BID", enumType.toFIXNameString());
        assertEquals( "0 - Bid", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.OFFER;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "OFFER", enumType.toFIXNameString());
        assertEquals( "1 - Offer", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.TRADE;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "TRADE", enumType.toFIXNameString());
        assertEquals( "2 - Trade", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.INDEX_VALUE;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "INDEX_VALUE", enumType.toFIXNameString());
        assertEquals( "3 - Index Value", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.OPENING_PRICE;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "OPENING_PRICE", enumType.toFIXNameString());
        assertEquals( "4 - Opening Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.CLOSING_PRICE;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "CLOSING_PRICE", enumType.toFIXNameString());
        assertEquals( "5 - Closing Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.SETTLEMENT_PRICE;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "SETTLEMENT_PRICE", enumType.toFIXNameString());
        assertEquals( "6 - Settlement Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.TRADING_SESSION_HIGH_PRICE;
        assertEquals( "7", enumType.toFIXIDString());
        assertEquals( "TRADING_SESSION_HIGH_PRICE", enumType.toFIXNameString());
        assertEquals( "7 - Trading Session High Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.TRADING_SESSION_LOW_PRICE;
        assertEquals( "8", enumType.toFIXIDString());
        assertEquals( "TRADING_SESSION_LOW_PRICE", enumType.toFIXNameString());
        assertEquals( "8 - Trading Session Low Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.TRADING_SESSION_VWAP_PRICE;
        assertEquals( "9", enumType.toFIXIDString());
        assertEquals( "TRADING_SESSION_VWAP_PRICE", enumType.toFIXNameString());
        assertEquals( "9 - Trading Session VWAP Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        /*
         * A-Q
         */
        enumType = Enum269MDEntryType.IMBALANCE;
        assertEquals( "A", enumType.toFIXIDString());
        assertEquals( "IMBALANCE", enumType.toFIXNameString());
        assertEquals( "A - Imbalance", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.TRADE_VOLUME;
        assertEquals( "B", enumType.toFIXIDString());
        assertEquals( "TRADE_VOLUME", enumType.toFIXNameString());
        assertEquals( "B - Trade Volume", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.OPEN_INTEREST;
        assertEquals( "C", enumType.toFIXIDString());
        assertEquals( "OPEN_INTEREST", enumType.toFIXNameString());
        assertEquals( "C - Open Interest", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.COMPOSITE_UNDERLYING_PRICE;
        assertEquals( "D", enumType.toFIXIDString());
        assertEquals( "COMPOSITE_UNDERLYING_PRICE", enumType.toFIXNameString());
        assertEquals( "D - Composite Underlying Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.SIMULATED_SELL_PRICE;
        assertEquals( "E", enumType.toFIXIDString());
        assertEquals( "SIMULATED_SELL_PRICE", enumType.toFIXNameString());
        assertEquals( "E - Simulated Sell Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.SIMULATED_BUY_PRICE;
        assertEquals( "F", enumType.toFIXIDString());
        assertEquals( "SIMULATED_BUY_PRICE", enumType.toFIXNameString());
        assertEquals( "F - Simulated Buy Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.MARGIN_RATE;
        assertEquals( "G", enumType.toFIXIDString());
        assertEquals( "MARGIN_RATE", enumType.toFIXNameString());
        assertEquals( "G - Margin Rate", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.MID_PRICE;
        assertEquals( "H", enumType.toFIXIDString());
        assertEquals( "MID_PRICE", enumType.toFIXNameString());
        assertEquals( "H - Mid Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.EMPTY_BOOK;
        assertEquals( "J", enumType.toFIXIDString());
        assertEquals( "EMPTY_BOOK", enumType.toFIXNameString());
        assertEquals( "J - Empty Book", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.SETTLE_HIGH_PRICE;
        assertEquals( "K", enumType.toFIXIDString());
        assertEquals( "SETTLE_HIGH_PRICE", enumType.toFIXNameString());
        assertEquals( "K - Settle High Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.SETTLE_LOW_PRICE;
        assertEquals( "L", enumType.toFIXIDString());
        assertEquals( "SETTLE_LOW_PRICE", enumType.toFIXNameString());
        assertEquals( "L - Settle Low Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.PRIOR_SETTLE_PRICE;
        assertEquals( "M", enumType.toFIXIDString());
        assertEquals( "PRIOR_SETTLE_PRICE", enumType.toFIXNameString());
        assertEquals( "M - Prior Settle Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.SESSION_HIGH_BID;
        assertEquals( "N", enumType.toFIXIDString());
        assertEquals( "SESSION_HIGH_BID", enumType.toFIXNameString());
        assertEquals( "N - Session High Bid", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.SESSION_LOW_OFFER;
        assertEquals( "O", enumType.toFIXIDString());
        assertEquals( "SESSION_LOW_OFFER", enumType.toFIXNameString());
        assertEquals( "O - Session Low Offer", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.EARLY_PRICES;
        assertEquals( "P", enumType.toFIXIDString());
        assertEquals( "EARLY_PRICES", enumType.toFIXNameString());
        assertEquals( "P - Early Prices", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum269MDEntryType.AUCTION_CLEARING_PRICE;
        assertEquals( "Q", enumType.toFIXIDString());
        assertEquals( "AUCTION_CLEARING_PRICE", enumType.toFIXNameString());
        assertEquals( "Q - Auction Clearing Price", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}