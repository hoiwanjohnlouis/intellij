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
 *  269
 *  MDEntryType
 *  char
 *  <p></p>
 *  Type  Market Data entry.
 *  <p></p>
 *  Valid values:
 *  <p></p>
 *  0-9 msg types
 *  <p>    "0 - Bid"
 *  <p>    "1 - Offer"
 *  <p>    "2 - Trade"
 *  <p>    "3 - Index Value"
 *  <p>    "4 - Opening Price"
 *  <p></p>
 *  <p>    "5 - Closing Price"
 *  <p>    "6 - Settlement Price"
 *  <p>    "7 - Trading Session High Price"
 *  <p>    "8 - Trading Session Low Price"
 *  <p>    "9 - Trading Session VWAP Price"
 *  <p></p>
 *  A-Q msg types
 *  <p>    "A - Imbalance"
 *  <p>    "B - Trade Volume"
 *  <p>    "C - Open Interest"
 *  <p>    "D - Composite Underlying Price"
 *  <p>    "E - Simulated Sell Price"
 *  <p></p>
 *  <p>    "F - Simulated Buy Price"
 *  <p>    "G - Margin Rate"
 *  <p>    "H - Mid Price"
 *  <p>    "J - Empty Book"
 *  <p>    "K - Settle High Price"
 *  <p></p>
 *  <p>    "L - Settle Low Price"
 *  <p>    "M - Prior Settle Price"
 *  <p>    "N - Session High Bid"
 *  <p>    "O - Session Low Offer"
 *  <p>    "P - Early Prices"
 *  <p></p>
 *  <p>    "Q - Auction Clearing Price"
 */
class Enum269MDEntryTypeTest {
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
        assertEquals( "BID", enumType.toEnumNameString());
        assertEquals( "0 - Bid", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.OFFER;
        assertEquals( "1", enumType.toFIXIDString());
        assertEquals( "OFFER", enumType.toEnumNameString());
        assertEquals( "1 - Offer", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.TRADE;
        assertEquals( "2", enumType.toFIXIDString());
        assertEquals( "TRADE", enumType.toEnumNameString());
        assertEquals( "2 - Trade", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.INDEX_VALUE;
        assertEquals( "3", enumType.toFIXIDString());
        assertEquals( "INDEX_VALUE", enumType.toEnumNameString());
        assertEquals( "3 - Index Value", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.OPENING_PRICE;
        assertEquals( "4", enumType.toFIXIDString());
        assertEquals( "OPENING_PRICE", enumType.toEnumNameString());
        assertEquals( "4 - Opening Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.CLOSING_PRICE;
        assertEquals( "5", enumType.toFIXIDString());
        assertEquals( "CLOSING_PRICE", enumType.toEnumNameString());
        assertEquals( "5 - Closing Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.SETTLEMENT_PRICE;
        assertEquals( "6", enumType.toFIXIDString());
        assertEquals( "SETTLEMENT_PRICE", enumType.toEnumNameString());
        assertEquals( "6 - Settlement Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.TRADING_SESSION_HIGH_PRICE;
        assertEquals( "7", enumType.toFIXIDString());
        assertEquals( "TRADING_SESSION_HIGH_PRICE", enumType.toEnumNameString());
        assertEquals( "7 - Trading Session High Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.TRADING_SESSION_LOW_PRICE;
        assertEquals( "8", enumType.toFIXIDString());
        assertEquals( "TRADING_SESSION_LOW_PRICE", enumType.toEnumNameString());
        assertEquals( "8 - Trading Session Low Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.TRADING_SESSION_VWAP_PRICE;
        assertEquals( "9", enumType.toFIXIDString());
        assertEquals( "TRADING_SESSION_VWAP_PRICE", enumType.toEnumNameString());
        assertEquals( "9 - Trading Session VWAP Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        /*
         * A-Q
         */
        enumType = Enum269MDEntryType.IMBALANCE;
        assertEquals( "A", enumType.toFIXIDString());
        assertEquals( "IMBALANCE", enumType.toEnumNameString());
        assertEquals( "A - Imbalance", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.TRADE_VOLUME;
        assertEquals( "B", enumType.toFIXIDString());
        assertEquals( "TRADE_VOLUME", enumType.toEnumNameString());
        assertEquals( "B - Trade Volume", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.OPEN_INTEREST;
        assertEquals( "C", enumType.toFIXIDString());
        assertEquals( "OPEN_INTEREST", enumType.toEnumNameString());
        assertEquals( "C - Open Interest", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.COMPOSITE_UNDERLYING_PRICE;
        assertEquals( "D", enumType.toFIXIDString());
        assertEquals( "COMPOSITE_UNDERLYING_PRICE", enumType.toEnumNameString());
        assertEquals( "D - Composite Underlying Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.SIMULATED_SELL_PRICE;
        assertEquals( "E", enumType.toFIXIDString());
        assertEquals( "SIMULATED_SELL_PRICE", enumType.toEnumNameString());
        assertEquals( "E - Simulated Sell Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.SIMULATED_BUY_PRICE;
        assertEquals( "F", enumType.toFIXIDString());
        assertEquals( "SIMULATED_BUY_PRICE", enumType.toEnumNameString());
        assertEquals( "F - Simulated Buy Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.MARGIN_RATE;
        assertEquals( "G", enumType.toFIXIDString());
        assertEquals( "MARGIN_RATE", enumType.toEnumNameString());
        assertEquals( "G - Margin Rate", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.MID_PRICE;
        assertEquals( "H", enumType.toFIXIDString());
        assertEquals( "MID_PRICE", enumType.toEnumNameString());
        assertEquals( "H - Mid Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.EMPTY_BOOK;
        assertEquals( "J", enumType.toFIXIDString());
        assertEquals( "EMPTY_BOOK", enumType.toEnumNameString());
        assertEquals( "J - Empty Book", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.SETTLE_HIGH_PRICE;
        assertEquals( "K", enumType.toFIXIDString());
        assertEquals( "SETTLE_HIGH_PRICE", enumType.toEnumNameString());
        assertEquals( "K - Settle High Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.SETTLE_LOW_PRICE;
        assertEquals( "L", enumType.toFIXIDString());
        assertEquals( "SETTLE_LOW_PRICE", enumType.toEnumNameString());
        assertEquals( "L - Settle Low Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.PRIOR_SETTLE_PRICE;
        assertEquals( "M", enumType.toFIXIDString());
        assertEquals( "PRIOR_SETTLE_PRICE", enumType.toEnumNameString());
        assertEquals( "M - Prior Settle Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.SESSION_HIGH_BID;
        assertEquals( "N", enumType.toFIXIDString());
        assertEquals( "SESSION_HIGH_BID", enumType.toEnumNameString());
        assertEquals( "N - Session High Bid", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.SESSION_LOW_OFFER;
        assertEquals( "O", enumType.toFIXIDString());
        assertEquals( "SESSION_LOW_OFFER", enumType.toEnumNameString());
        assertEquals( "O - Session Low Offer", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.EARLY_PRICES;
        assertEquals( "P", enumType.toFIXIDString());
        assertEquals( "EARLY_PRICES", enumType.toEnumNameString());
        assertEquals( "P - Early Prices", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum269MDEntryType.AUCTION_CLEARING_PRICE;
        assertEquals( "Q", enumType.toFIXIDString());
        assertEquals( "AUCTION_CLEARING_PRICE", enumType.toEnumNameString());
        assertEquals( "Q - Auction Clearing Price", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}