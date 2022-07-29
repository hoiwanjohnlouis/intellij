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

import com.hwtsllc.fixengine2022.fix42.enums.Enum418BidTradeType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  418
 *  BidTradeType
 *  char
 *  <p>
 *  Code to represent the type of trade.
 *  <p>
 *  (Prior to FIX 4.4 this field was named "TradeType")
 *  <p></p>
 *  Valid values:
 *  <p>    A - Agency
 *  <p>    G - VWAP Guarantee
 *  <p>    J - Guaranteed Close
 *  <p>    R - Risk Trade
 */
class Tag418EnuBidTradeTypeTest {
    Tag418EnuBidTradeType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum418BidTradeType oneEnum : Enum418BidTradeType.values()) {
            tagData = new Tag418EnuBidTradeType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum418BidTradeType oneEnum : Enum418BidTradeType.values()) {
            tagData = new Tag418EnuBidTradeType(oneEnum);
            assertEquals( "FIX418_ENU_BID_TRADE_TYPE", tagData.toEnumLabelString());
            assertEquals( "418", tagData.toEnumIDString());
            assertEquals( "BID_TRADE_TYPE", tagData.toEnumNameString());
            assertEquals( "BidTradeType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         * A, G, J, and R msg types
         */
        tagData = new Tag418EnuBidTradeType(Enum418BidTradeType.AGENCY);
        assertEquals( Enum418BidTradeType.AGENCY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag418EnuBidTradeType(Enum418BidTradeType.VWAP_GUARANTEE);
        assertEquals( Enum418BidTradeType.VWAP_GUARANTEE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag418EnuBidTradeType(Enum418BidTradeType.GUARANTEED_CLOSE);
        assertEquals( Enum418BidTradeType.GUARANTEED_CLOSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag418EnuBidTradeType(Enum418BidTradeType.RISK_TRADE);
        assertEquals( Enum418BidTradeType.RISK_TRADE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum418BidTradeType oneEnum : Enum418BidTradeType.values()) {
            tagData = new Tag418EnuBidTradeType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum418BidTradeType oneEnum : Enum418BidTradeType.values()) {
            tagData = new Tag418EnuBidTradeType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum418BidTradeType oneEnum : Enum418BidTradeType.values()) {
            tagData = new Tag418EnuBidTradeType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum418BidTradeType oneEnum : Enum418BidTradeType.values()) {
            tagData = new Tag418EnuBidTradeType(oneEnum);
            assertEquals( "Tag418EnuBidTradeType\n" +
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