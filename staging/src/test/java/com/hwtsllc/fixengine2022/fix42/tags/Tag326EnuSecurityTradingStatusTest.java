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
import com.hwtsllc.fixengine2022.fix42.enums.Enum326SecurityTradingStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  326
 *  SecurityTradingStatus
 *  int
 *  <p>
 *  Identifies the trading status applicable to the transaction.
 *  <p></p>
 *  Valid values:
 *  <p>    1-10, 12-23 msg types. skipped 11.
 *  <p>    1 - Opening delay
 *  <p>    2 - Trading halt
 *  <p>    3 - Resume
 *  <p>    4 - No Open / No Resume
 *  <p>    5 - Price indication
 *  <p></p>
 *  <p>    6 - Trading Range Indication
 *  <p>    7 - Market Imbalance Buy
 *  <p>    8 - Market Imbalance Sell
 *  <p>    9 - Market on Close Imbalance Buy
 *  <p>    10 - Market on Close Imbalance Sell
 *  <p></p>
 *  <p>    12 - No Market Imbalance
 *  <p>    13 - No Market on Close Imbalance
 *  <p>    14 - ITS Pre-opening
 *  <p>    15 - New Price Indication
 *  <p></p>
 *  <p>    16 - Trade Dissemination Time
 *  <p>    17 - Ready to trade (start of session)
 *  <p>    18 - Not available for trading (end of session)
 *  <p>    19 - Not traded on this market
 *  <p>    20 - Unknown or Invalid
 *  <p></p>
 *  <p>    21 - Pre-open
 *  <p>    22 - Opening Rotation
 *  <p>    23 - Fast Market
 */
class Tag326EnuSecurityTradingStatusTest {
    @Test
    void FIX0326Test() {
        FIX42 fixData = FIX42.FIX326_ENU_SECURITY_TRADING_STATUS;
        assertEquals( "326", fixData.toFIXIDString());
        assertEquals( "SECURITY_TRADING_STATUS", fixData.toFIXNameString());
        assertEquals( "SecurityTradingStatus", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0326Test() {
        Tag326EnuSecurityTradingStatus tagData;

        /*
         * 1-10, 12-23 msg types. skipped 11.
         */
        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.OPENING_DELAY);
        assertEquals( Enum326SecurityTradingStatus.OPENING_DELAY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.TRADING_HALT);
        assertEquals( Enum326SecurityTradingStatus.TRADING_HALT.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.RESUME);
        assertEquals( Enum326SecurityTradingStatus.RESUME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NO_OPEN_NO_RESUME);
        assertEquals( Enum326SecurityTradingStatus.NO_OPEN_NO_RESUME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.PRICE_INDICATION);
        assertEquals( Enum326SecurityTradingStatus.PRICE_INDICATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.TRADING_RANGE_INDICATION);
        assertEquals( Enum326SecurityTradingStatus.TRADING_RANGE_INDICATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.MARKET_IMBALANCE_BUY);
        assertEquals( Enum326SecurityTradingStatus.MARKET_IMBALANCE_BUY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.MARKET_IMBALANCE_SELL);
        assertEquals( Enum326SecurityTradingStatus.MARKET_IMBALANCE_SELL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_BUY);
        assertEquals( Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_BUY.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_SELL);
        assertEquals( Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_SELL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NO_MARKET_IMBALANCE);
        assertEquals( Enum326SecurityTradingStatus.NO_MARKET_IMBALANCE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NO_MARKET_ON_CLOSE_IMBALANCE);
        assertEquals( Enum326SecurityTradingStatus.NO_MARKET_ON_CLOSE_IMBALANCE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.ITS_PRE_OPENING);
        assertEquals( Enum326SecurityTradingStatus.ITS_PRE_OPENING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NEW_PRICE_INDICATION);
        assertEquals( Enum326SecurityTradingStatus.NEW_PRICE_INDICATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.TRADE_DISSEMINATION_TIME);
        assertEquals( Enum326SecurityTradingStatus.TRADE_DISSEMINATION_TIME.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.READY_TO_TRADE);
        assertEquals( Enum326SecurityTradingStatus.READY_TO_TRADE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NOT_AVAILABLE_FOR_TRADING);
        assertEquals( Enum326SecurityTradingStatus.NOT_AVAILABLE_FOR_TRADING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NOT_TRADED_ON_THIS_MARKET);
        assertEquals( Enum326SecurityTradingStatus.NOT_TRADED_ON_THIS_MARKET.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.UNKNOWN_OR_INVALID);
        assertEquals( Enum326SecurityTradingStatus.UNKNOWN_OR_INVALID.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.PRE_OPEN);
        assertEquals( Enum326SecurityTradingStatus.PRE_OPEN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.OPENING_ROTATION);
        assertEquals( Enum326SecurityTradingStatus.OPENING_ROTATION.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.FAST_MARKET);
        assertEquals( Enum326SecurityTradingStatus.FAST_MARKET.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag326EnuSecurityTradingStatus tagData;

        // loop around the ENUM and process
        for (Enum326SecurityTradingStatus oneEnum : Enum326SecurityTradingStatus.values()) {
            tagData = new Tag326EnuSecurityTradingStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag326EnuSecurityTradingStatus tagData;

        // loop around the ENUM and process
        for (Enum326SecurityTradingStatus oneEnum : Enum326SecurityTradingStatus.values()) {
            tagData = new Tag326EnuSecurityTradingStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag326EnuSecurityTradingStatus tagData;

        // loop around the ENUM and process
        for (Enum326SecurityTradingStatus oneEnum : Enum326SecurityTradingStatus.values()) {
            tagData = new Tag326EnuSecurityTradingStatus(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag326EnuSecurityTradingStatus tagData;

        // loop around the ENUM and process
        for (Enum326SecurityTradingStatus oneEnum : Enum326SecurityTradingStatus.values()) {
            tagData = new Tag326EnuSecurityTradingStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag326EnuSecurityTradingStatus tagData;

        // loop around the ENUM and process
        for (Enum326SecurityTradingStatus oneEnum : Enum326SecurityTradingStatus.values()) {
            tagData = new Tag326EnuSecurityTradingStatus(oneEnum);
            assertEquals( "Tag326EnuSecurityTradingStatus\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}