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
            assertEquals( "FIX418_ENU_BID_TRADE_TYPE", tagData.toFIXLabelString());
            assertEquals( "418", tagData.toFIXIDString());
            assertEquals( "BID_TRADE_TYPE", tagData.toFIXNameString());
            assertEquals( "BidTradeType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum418BidTradeType oneEnum : Enum418BidTradeType.values()) {
            tagData = new Tag418EnuBidTradeType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  418
         *  BidTradeType
         *  char
         *  <p>    A - Agency
         *  <p>    G - VWAP Guarantee
         *  <p>    J - Guaranteed Close
         *  <p>    R - Risk Trade
         */
        tagData = new Tag418EnuBidTradeType(Enum418BidTradeType.AGENCY);
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag418EnuBidTradeType(Enum418BidTradeType.VWAP_GUARANTEE);
        assertEquals( "G", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag418EnuBidTradeType(Enum418BidTradeType.GUARANTEED_CLOSE);
        assertEquals( "J", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag418EnuBidTradeType(Enum418BidTradeType.RISK_TRADE);
        assertEquals( "R", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


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
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
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