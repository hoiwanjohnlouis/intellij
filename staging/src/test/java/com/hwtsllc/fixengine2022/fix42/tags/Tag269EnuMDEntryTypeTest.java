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

import com.hwtsllc.fixengine2022.fix42.enums.Enum269MDEntryType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag269EnuMDEntryTypeTest {
    Tag269EnuMDEntryType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum269MDEntryType oneEnum : Enum269MDEntryType.values()) {
            tagData = new Tag269EnuMDEntryType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum269MDEntryType oneEnum : Enum269MDEntryType.values()) {
            tagData = new Tag269EnuMDEntryType(oneEnum);
            assertEquals( "FIX269_ENU_MD_ENTRY_TYPE", tagData.toEnumLabelString());
            assertEquals( "269", tagData.toEnumIDString());
            assertEquals( "MD_ENTRY_TYPE", tagData.toEnumNameString());
            assertEquals( "MDEntryType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum269MDEntryType oneEnum : Enum269MDEntryType.values()) {
            tagData = new Tag269EnuMDEntryType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  269
         *  MDEntryType
         *  char
         *  0-9 msg types
         *  <p>    "0 - Bid"
         *  <p>    "1 - Offer"
         *  <p>    "2 - Trade"
         *  <p>    "3 - Index Value"
         *  <p>    "4 - Opening Price"
         */
        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.BID);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.OFFER);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.TRADE);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.INDEX_VALUE);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.OPENING_PRICE);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "5 - Closing Price"
         *  <p>    "6 - Settlement Price"
         *  <p>    "7 - Trading Session High Price"
         *  <p>    "8 - Trading Session Low Price"
         *  <p>    "9 - Trading Session VWAP Price"
         */
        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.CLOSING_PRICE);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SETTLEMENT_PRICE);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.TRADING_SESSION_HIGH_PRICE);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.TRADING_SESSION_LOW_PRICE);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.TRADING_SESSION_VWAP_PRICE);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  A-Q msg types
         *  <p>    "A - Imbalance"
         *  <p>    "B - Trade Volume"
         *  <p>    "C - Open Interest"
         *  <p>    "D - Composite Underlying Price"
         *  <p>    "E - Simulated Sell Price"
         */
        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.IMBALANCE);
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.TRADE_VOLUME);
        assertEquals( "B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.OPEN_INTEREST);
        assertEquals( "C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.COMPOSITE_UNDERLYING_PRICE);
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SIMULATED_SELL_PRICE);
        assertEquals( "E", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "F - Simulated Buy Price"
         *  <p>    "G - Margin Rate"
         *  <p>    "H - Mid Price"
         *  <p>    "J - Empty Book"
         *  <p>    "K - Settle High Price"
         */
        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SIMULATED_BUY_PRICE);
        assertEquals( "F", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.MARGIN_RATE);
        assertEquals( "G", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.MID_PRICE);
        assertEquals( "H", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.EMPTY_BOOK);
        assertEquals( "J", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SETTLE_HIGH_PRICE);
        assertEquals( "K", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "L - Settle Low Price"
         *  <p>    "M - Prior Settle Price"
         *  <p>    "N - Session High Bid"
         *  <p>    "O - Session Low Offer"
         *  <p>    "P - Early Prices"
         */
        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SETTLE_LOW_PRICE);
        assertEquals( "L", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.PRIOR_SETTLE_PRICE);
        assertEquals( "M", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SESSION_HIGH_BID);
        assertEquals( "N", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.SESSION_LOW_OFFER);
        assertEquals( "O", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.EARLY_PRICES);
        assertEquals( "P", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "Q - Auction Clearing Price"
         */
        tagData = new Tag269EnuMDEntryType(Enum269MDEntryType.AUCTION_CLEARING_PRICE);
        assertEquals( "Q", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum269MDEntryType oneEnum : Enum269MDEntryType.values()) {
            tagData = new Tag269EnuMDEntryType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum269MDEntryType oneEnum : Enum269MDEntryType.values()) {
            tagData = new Tag269EnuMDEntryType(oneEnum);
            assertEquals( "Tag269EnuMDEntryType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
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