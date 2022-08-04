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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.fix43.enums.Enum569TradeRequestType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  569
 *  TradeRequestType
 *  int
 *  <p></p>
 *  Type of Trade Capture Report.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - All Trades
 *  <p>    1 - Matched trades matching criteria provided on request
 *              (Parties, ExecID, TradeID, OrderID, Instrument, InputSource, etc.)
 *  <p>    2 - Unmatched trades that match criteria
 *  <p>    3 - Unreported trades that match criteria
 *  <p>    4 - Advisories that match criteria
 */
class Tag569EnuTradeRequestTypeTest {
    Tag569EnuTradeRequestType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum569TradeRequestType oneEnum : Enum569TradeRequestType.values()) {
            tagData = new Tag569EnuTradeRequestType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum569TradeRequestType oneEnum : Enum569TradeRequestType.values()) {
            tagData = new Tag569EnuTradeRequestType(oneEnum);
            assertEquals( "FIX569_ENU_TRADE_REQUEST_TYPE", tagData.toEnumLabelString());
            assertEquals( "569", tagData.toEnumIDString());
            assertEquals( "TRADE_REQUEST_TYPE", tagData.toEnumNameString());
            assertEquals( "TradeRequestType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  0-4 types
         */
        tagData = new Tag569EnuTradeRequestType( Enum569TradeRequestType.ALL_TRADES );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag569EnuTradeRequestType( Enum569TradeRequestType.MATCHED_TRADES );
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag569EnuTradeRequestType( Enum569TradeRequestType.UNMATCHED_TRADES );
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag569EnuTradeRequestType( Enum569TradeRequestType.UNREPORTED_TRADES );
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag569EnuTradeRequestType( Enum569TradeRequestType.ADVISORIES );
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for (Enum569TradeRequestType oneEnum : Enum569TradeRequestType.values()) {
            tagData = new Tag569EnuTradeRequestType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum569TradeRequestType oneEnum : Enum569TradeRequestType.values()) {
            tagData = new Tag569EnuTradeRequestType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for (Enum569TradeRequestType oneEnum : Enum569TradeRequestType.values()) {
            tagData = new Tag569EnuTradeRequestType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum569TradeRequestType oneEnum : Enum569TradeRequestType.values()) {
            tagData = new Tag569EnuTradeRequestType(oneEnum);
            assertEquals( "Tag569EnuTradeRequestType\n" +
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