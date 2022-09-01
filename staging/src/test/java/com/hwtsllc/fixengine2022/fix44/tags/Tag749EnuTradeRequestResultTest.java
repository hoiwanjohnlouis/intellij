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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.fix44.enums.Enum749TradeRequestResult;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag749EnuTradeRequestResultTest {
    Tag749EnuTradeRequestResult tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum749TradeRequestResult oneEnum : Enum749TradeRequestResult.values()) {
            tagData = new Tag749EnuTradeRequestResult(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum749TradeRequestResult oneEnum : Enum749TradeRequestResult.values()) {
            tagData = new Tag749EnuTradeRequestResult(oneEnum);
            assertEquals( "FIX749_ENU_TRADE_REQUEST_RESULT", tagData.toFIXLabelString());
            assertEquals( "749", tagData.toFIXIDString());
            assertEquals( "TRADE_REQUEST_RESULT", tagData.toFIXNameString());
            assertEquals( "TradeRequestResult", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum749TradeRequestResult oneEnum : Enum749TradeRequestResult.values()) {
            tagData = new Tag749EnuTradeRequestResult(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  749
         *  TradeRequestResult
         *  int
         *  <p>    0 - Successful (default)
         *  <p>    1 - Invalid or unknown instrument
         *  <p>    2 - Invalid type of trade requested
         *  <p>    3 - Invalid parties
         *  <p>    4 - Invalid transport type requested
         */
        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.SUCCESSFUL);
        assertEquals( "0", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.UNKNOWN_INSTRUMENT);
        assertEquals( "1", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.INVALID_TRADE_TYPE);
        assertEquals( "2", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.INVALID_PARTIES);
        assertEquals( "3", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.INVALID_TRANSPORT_TYPE);
        assertEquals( "4", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    5 - Invalid destination requested
         *  <p>    8 - TradeRequestType not supported
         *  <p>    9 - Unauthorized for Trade Capture Report Request
         */
        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.INVALID_DESTINATION_REQUESTED);
        assertEquals( "5", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.TRADE_REQUEST_TYPE_NOT_SUPPORTED);
        assertEquals( "8", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.UNAUTHORIZED_REPORT_REQUEST);
        assertEquals( "9", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );

        /*
         *  <p>    99 - Other
         *  <p>    or any value conforming to the data type Reserved100Plus
         */
        tagData = new Tag749EnuTradeRequestResult(Enum749TradeRequestResult.OTHER);
        assertEquals( "99", tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );


        // loop around the ENUM and process
        for ( Enum749TradeRequestResult oneEnum : Enum749TradeRequestResult.values()) {
            tagData = new Tag749EnuTradeRequestResult(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum749TradeRequestResult oneEnum : Enum749TradeRequestResult.values()) {
            tagData = new Tag749EnuTradeRequestResult(oneEnum);
            assertEquals( "Tag749EnuTradeRequestResult\n" +
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