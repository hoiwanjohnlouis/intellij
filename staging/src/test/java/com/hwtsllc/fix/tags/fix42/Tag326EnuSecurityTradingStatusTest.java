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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.enums.fix42.Enum326SecurityTradingStatus;
import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag326EnuSecurityTradingStatusTest {
    Tag326EnuSecurityTradingStatus tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum326SecurityTradingStatus oneEnum : Enum326SecurityTradingStatus.values()) {
            tagData = new Tag326EnuSecurityTradingStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum326SecurityTradingStatus oneEnum : Enum326SecurityTradingStatus.values()) {
            tagData = new Tag326EnuSecurityTradingStatus(oneEnum);
            assertEquals( "FIX326_ENU_SECURITY_TRADING_STATUS", tagData.toFIXLabelString());
            assertEquals( "326", tagData.toFIXIDString());
            assertEquals( "SECURITY_TRADING_STATUS", tagData.toFIXNameString());
            assertEquals( "SecurityTradingStatus", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum326SecurityTradingStatus oneEnum : Enum326SecurityTradingStatus.values()) {
            tagData = new Tag326EnuSecurityTradingStatus(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  326
         *  SecurityTradingStatus
         *  int
         *  <p>    1-10, 12-23 msg types. skipped 11.
         *  <p>    1 - Opening delay
         *  <p>    2 - Trading halt
         *  <p>    3 - Resume
         *  <p>    4 - No Open / No Resume
         *  <p>    5 - Price indication
         */
        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.OPENING_DELAY);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.TRADING_HALT);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.RESUME);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NO_OPEN_NO_RESUME);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.PRICE_INDICATION);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    6 - Trading Range Indication
         *  <p>    7 - Market Imbalance Buy
         *  <p>    8 - Market Imbalance Sell
         *  <p>    9 - Market on Close Imbalance Buy
         *  <p>    10 - Market on Close Imbalance Sell
         */
        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.TRADING_RANGE_INDICATION);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.MARKET_IMBALANCE_BUY);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.MARKET_IMBALANCE_SELL);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_BUY);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_SELL);
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    12 - No Market Imbalance
         *  <p>    13 - No Market on Close Imbalance
         *  <p>    14 - ITS Pre-opening
         *  <p>    15 - New Price Indication
         */
        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NO_MARKET_IMBALANCE);
        assertEquals( "12", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NO_MARKET_ON_CLOSE_IMBALANCE);
        assertEquals( "13", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.ITS_PRE_OPENING);
        assertEquals( "14", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NEW_PRICE_INDICATION);
        assertEquals( "15", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    16 - Trade Dissemination Time
         *  <p>    17 - Ready to trade (start of session)
         *  <p>    18 - Not available for trading (end of session)
         *  <p>    19 - Not traded on this market
         *  <p>    20 - Unknown or Invalid
         */
        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.TRADE_DISSEMINATION_TIME);
        assertEquals( "16", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.READY_TO_TRADE);
        assertEquals( "17", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NOT_AVAILABLE_FOR_TRADING);
        assertEquals( "18", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NOT_TRADED_ON_THIS_MARKET);
        assertEquals( "19", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.UNKNOWN_OR_INVALID);
        assertEquals( "20", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    21 - Pre-open
         *  <p>    22 - Opening Rotation
         *  <p>    23 - Fast Market
         */
        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.PRE_OPEN);
        assertEquals( "21", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.OPENING_ROTATION);
        assertEquals( "22", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.FAST_MARKET);
        assertEquals( "23", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum326SecurityTradingStatus oneEnum : Enum326SecurityTradingStatus.values()) {
            tagData = new Tag326EnuSecurityTradingStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum326SecurityTradingStatus oneEnum : Enum326SecurityTradingStatus.values()) {
            tagData = new Tag326EnuSecurityTradingStatus(oneEnum);
            assertEquals( "Tag326EnuSecurityTradingStatus\n" +
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