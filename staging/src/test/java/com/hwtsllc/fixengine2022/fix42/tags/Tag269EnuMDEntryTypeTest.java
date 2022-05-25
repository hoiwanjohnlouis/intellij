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
import com.hwtsllc.fixengine2022.fix42.enums.Enum269MDEntryType;
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
class Tag269EnuMDEntryTypeTest {
    @Test
    void FIX0269Test() {
        FIX42 fixData = FIX42.FIX269_ENU_MD_ENTRY_TYPE;
        assertEquals( "269", fixData.toFIXIDString());
        assertEquals( "MD_ENTRY_TYPE", fixData.toFIXNameString());
        assertEquals( "MDEntryType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0269Test() {
        Tag269EnuMDEntryType tagData;

        /*
         * 0-9 msg types
         */
        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.BID);
        assertEquals( Enum269MDEntryType.BID.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.OFFER);
        assertEquals( Enum269MDEntryType.OFFER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.TRADE);
        assertEquals( Enum269MDEntryType.TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.INDEX_VALUE);
        assertEquals( Enum269MDEntryType.INDEX_VALUE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.OPENING_PRICE);
        assertEquals( Enum269MDEntryType.OPENING_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.CLOSING_PRICE);
        assertEquals( Enum269MDEntryType.CLOSING_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SETTLEMENT_PRICE);
        assertEquals( Enum269MDEntryType.SETTLEMENT_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.TRADING_SESSION_HIGH_PRICE);
        assertEquals( Enum269MDEntryType.TRADING_SESSION_HIGH_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.TRADING_SESSION_LOW_PRICE);
        assertEquals( Enum269MDEntryType.TRADING_SESSION_LOW_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.TRADING_SESSION_VWAP_PRICE);
        assertEquals( Enum269MDEntryType.TRADING_SESSION_VWAP_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /*
         * A-Q msg types
         */
        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.IMBALANCE);
        assertEquals( Enum269MDEntryType.IMBALANCE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.TRADE_VOLUME);
        assertEquals( Enum269MDEntryType.TRADE_VOLUME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.OPEN_INTEREST);
        assertEquals( Enum269MDEntryType.OPEN_INTEREST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.COMPOSITE_UNDERLYING_PRICE);
        assertEquals( Enum269MDEntryType.COMPOSITE_UNDERLYING_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SIMULATED_SELL_PRICE);
        assertEquals( Enum269MDEntryType.SIMULATED_SELL_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SIMULATED_BUY_PRICE);
        assertEquals( Enum269MDEntryType.SIMULATED_BUY_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.MARGIN_RATE);
        assertEquals( Enum269MDEntryType.MARGIN_RATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.MID_PRICE);
        assertEquals( Enum269MDEntryType.MID_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.EMPTY_BOOK);
        assertEquals( Enum269MDEntryType.EMPTY_BOOK.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SETTLE_HIGH_PRICE);
        assertEquals( Enum269MDEntryType.SETTLE_HIGH_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SETTLE_LOW_PRICE);
        assertEquals( Enum269MDEntryType.SETTLE_LOW_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.PRIOR_SETTLE_PRICE);
        assertEquals( Enum269MDEntryType.PRIOR_SETTLE_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SESSION_HIGH_BID);
        assertEquals( Enum269MDEntryType.SESSION_HIGH_BID.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SESSION_LOW_OFFER);
        assertEquals( Enum269MDEntryType.SESSION_LOW_OFFER.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.EARLY_PRICES);
        assertEquals( Enum269MDEntryType.EARLY_PRICES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.AUCTION_CLEARING_PRICE);
        assertEquals( Enum269MDEntryType.AUCTION_CLEARING_PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
   }
}