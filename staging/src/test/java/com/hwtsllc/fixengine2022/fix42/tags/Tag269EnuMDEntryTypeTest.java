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
import com.hwtsllc.fixengine2022.fix42.enums.Enum269MDEntryType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag269EnuMDEntryTypeTest {
    @Test
    void FIX0269Test() {
        FIX42 fixData = FIX42.FIX269_ENU_MD_ENTRY_TYPE;
        assertEquals( "269", fixData.getID());
        assertEquals( "MD_ENTRY_TYPE", fixData.getName());
        assertEquals( "MDEntryType", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
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
    void Tag0269Test() {
        Tag269EnuMDEntryType tagData;

        /**
         * 0-9 msg types
         */
        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.BID);
        assertEquals( Enum269MDEntryType.BID.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.OFFER);
        assertEquals( Enum269MDEntryType.OFFER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.TRADE);
        assertEquals( Enum269MDEntryType.TRADE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.INDEX_VALUE);
        assertEquals( Enum269MDEntryType.INDEX_VALUE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.OPENING_PRICE);
        assertEquals( Enum269MDEntryType.OPENING_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.CLOSING_PRICE);
        assertEquals( Enum269MDEntryType.CLOSING_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SETTLEMENT_PRICE);
        assertEquals( Enum269MDEntryType.SETTLEMENT_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.TRADING_SESSION_HIGH_PRICE);
        assertEquals( Enum269MDEntryType.TRADING_SESSION_HIGH_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.TRADING_SESSION_LOW_PRICE);
        assertEquals( Enum269MDEntryType.TRADING_SESSION_LOW_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.TRADING_SESSION_VWAP_PRICE);
        assertEquals( Enum269MDEntryType.TRADING_SESSION_VWAP_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        /**
         * A-Q msg types
         */
        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.IMBALANCE);
        assertEquals( Enum269MDEntryType.IMBALANCE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.TRADE_VOLUME);
        assertEquals( Enum269MDEntryType.TRADE_VOLUME.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.OPEN_INTEREST);
        assertEquals( Enum269MDEntryType.OPEN_INTEREST.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.COMPOSITE_UNDERLYING_PRICE);
        assertEquals( Enum269MDEntryType.COMPOSITE_UNDERLYING_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SIMULATED_SELL_PRICE);
        assertEquals( Enum269MDEntryType.SIMULATED_SELL_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SIMULATED_BUY_PRICE);
        assertEquals( Enum269MDEntryType.SIMULATED_BUY_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.MARGIN_RATE);
        assertEquals( Enum269MDEntryType.MARGIN_RATE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.MID_PRICE);
        assertEquals( Enum269MDEntryType.MID_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.EMPTY_BOOK);
        assertEquals( Enum269MDEntryType.EMPTY_BOOK.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SETTLE_HIGH_PRICE);
        assertEquals( Enum269MDEntryType.SETTLE_HIGH_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SETTLE_LOW_PRICE);
        assertEquals( Enum269MDEntryType.SETTLE_LOW_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.PRIOR_SETTLE_PRICE);
        assertEquals( Enum269MDEntryType.PRIOR_SETTLE_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SESSION_HIGH_BID);
        assertEquals( Enum269MDEntryType.SESSION_HIGH_BID.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SESSION_LOW_OFFER);
        assertEquals( Enum269MDEntryType.SESSION_LOW_OFFER.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.EARLY_PRICES);
        assertEquals( Enum269MDEntryType.EARLY_PRICES.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.AUCTION_CLEARING_PRICE);
        assertEquals( Enum269MDEntryType.AUCTION_CLEARING_PRICE.getID(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
   }
}