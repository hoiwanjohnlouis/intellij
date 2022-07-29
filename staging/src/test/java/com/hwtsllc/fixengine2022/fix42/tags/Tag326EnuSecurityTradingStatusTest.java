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
    Tag326EnuSecurityTradingStatus tagData;

    @Test
    void FIX0326Test() {
    }
    @Test
    void Tag0326Test() {
    }
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
            assertEquals( "FIX326_ENU_SECURITY_TRADING_STATUS", tagData.toEnumLabelString());
            assertEquals( "326", tagData.toEnumIDString());
            assertEquals( "SECURITY_TRADING_STATUS", tagData.toEnumNameString());
            assertEquals( "SecurityTradingStatus", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         * 1-10, 12-23 msg types. skipped 11.
         */
        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.OPENING_DELAY);
        assertEquals( Enum326SecurityTradingStatus.OPENING_DELAY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.TRADING_HALT);
        assertEquals( Enum326SecurityTradingStatus.TRADING_HALT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.RESUME);
        assertEquals( Enum326SecurityTradingStatus.RESUME.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NO_OPEN_NO_RESUME);
        assertEquals( Enum326SecurityTradingStatus.NO_OPEN_NO_RESUME.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.PRICE_INDICATION);
        assertEquals( Enum326SecurityTradingStatus.PRICE_INDICATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.TRADING_RANGE_INDICATION);
        assertEquals( Enum326SecurityTradingStatus.TRADING_RANGE_INDICATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.MARKET_IMBALANCE_BUY);
        assertEquals( Enum326SecurityTradingStatus.MARKET_IMBALANCE_BUY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.MARKET_IMBALANCE_SELL);
        assertEquals( Enum326SecurityTradingStatus.MARKET_IMBALANCE_SELL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_BUY);
        assertEquals( Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_BUY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_SELL);
        assertEquals( Enum326SecurityTradingStatus.MARKET_ON_CLOSE_IMBALANCE_SELL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NO_MARKET_IMBALANCE);
        assertEquals( Enum326SecurityTradingStatus.NO_MARKET_IMBALANCE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NO_MARKET_ON_CLOSE_IMBALANCE);
        assertEquals( Enum326SecurityTradingStatus.NO_MARKET_ON_CLOSE_IMBALANCE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.ITS_PRE_OPENING);
        assertEquals( Enum326SecurityTradingStatus.ITS_PRE_OPENING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NEW_PRICE_INDICATION);
        assertEquals( Enum326SecurityTradingStatus.NEW_PRICE_INDICATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.TRADE_DISSEMINATION_TIME);
        assertEquals( Enum326SecurityTradingStatus.TRADE_DISSEMINATION_TIME.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.READY_TO_TRADE);
        assertEquals( Enum326SecurityTradingStatus.READY_TO_TRADE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NOT_AVAILABLE_FOR_TRADING);
        assertEquals( Enum326SecurityTradingStatus.NOT_AVAILABLE_FOR_TRADING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.NOT_TRADED_ON_THIS_MARKET);
        assertEquals( Enum326SecurityTradingStatus.NOT_TRADED_ON_THIS_MARKET.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.UNKNOWN_OR_INVALID);
        assertEquals( Enum326SecurityTradingStatus.UNKNOWN_OR_INVALID.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.PRE_OPEN);
        assertEquals( Enum326SecurityTradingStatus.PRE_OPEN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.OPENING_ROTATION);
        assertEquals( Enum326SecurityTradingStatus.OPENING_ROTATION.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag326EnuSecurityTradingStatus(Enum326SecurityTradingStatus.FAST_MARKET);
        assertEquals( Enum326SecurityTradingStatus.FAST_MARKET.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum326SecurityTradingStatus oneEnum : Enum326SecurityTradingStatus.values()) {
            tagData = new Tag326EnuSecurityTradingStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum326SecurityTradingStatus oneEnum : Enum326SecurityTradingStatus.values()) {
            tagData = new Tag326EnuSecurityTradingStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
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
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}