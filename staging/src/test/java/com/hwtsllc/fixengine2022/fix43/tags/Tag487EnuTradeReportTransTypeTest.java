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

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum487TradeReportTransType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  487
 *  TradeReportTransType
 *  int
 *  <p></p>
 *  Identifies Trade Report message transaction type
 *  <p></p>
 *  (Prior to FIX 4.4 this field was of type char)
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    1 - Cancel
 *  <p>    2 - Replace
 *  <p>    3 - Release
 *  <p>    4 - Reverse
 *  <p></p>
 *  <p>    5 - Cancel Due To Back Out of Trade
 */
class Tag487EnuTradeReportTransTypeTest {
    @Test
    void FIX0487Test() {
        FIX43 fixData = FIX43.FIX487_ENU_TRADE_REPORT_TRANS_TYPE;
        assertEquals( "487", fixData.toEnumIDString());
        assertEquals( "TRADE_REPORT_TRANS_TYPE", fixData.toEnumNameString());
        assertEquals( "TradeReportTransType", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0487Test() {
        Tag487EnuTradeReportTransType tagData;

        /*
         * 0-5 types
         */
        tagData = new Tag487EnuTradeReportTransType( Enum487TradeReportTransType.NEW );
        assertEquals( Enum487TradeReportTransType.NEW.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag487EnuTradeReportTransType( Enum487TradeReportTransType.CANCEL );
        assertEquals( Enum487TradeReportTransType.CANCEL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag487EnuTradeReportTransType( Enum487TradeReportTransType.REPLACE );
        assertEquals( Enum487TradeReportTransType.REPLACE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag487EnuTradeReportTransType( Enum487TradeReportTransType.RELEASE );
        assertEquals( Enum487TradeReportTransType.RELEASE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag487EnuTradeReportTransType( Enum487TradeReportTransType.REVERSE );
        assertEquals( Enum487TradeReportTransType.REVERSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag487EnuTradeReportTransType( Enum487TradeReportTransType.CANCEL_BACK_OUT_TRADE );
        assertEquals( Enum487TradeReportTransType.CANCEL_BACK_OUT_TRADE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag487EnuTradeReportTransType tagData;

        // loop around the ENUM and process
        for ( Enum487TradeReportTransType oneEnum : Enum487TradeReportTransType.values()) {
            tagData = new Tag487EnuTradeReportTransType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag487EnuTradeReportTransType tagData;

        // loop around the ENUM and process
        for (Enum487TradeReportTransType oneEnum : Enum487TradeReportTransType.values()) {
            tagData = new Tag487EnuTradeReportTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag487EnuTradeReportTransType tagData;

        // loop around the ENUM and process
        for (Enum487TradeReportTransType oneEnum : Enum487TradeReportTransType.values()) {
            tagData = new Tag487EnuTradeReportTransType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag487EnuTradeReportTransType tagData;

        // loop around the ENUM and process
        for (Enum487TradeReportTransType oneEnum : Enum487TradeReportTransType.values()) {
            tagData = new Tag487EnuTradeReportTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag487EnuTradeReportTransType tagData;

        // loop around the ENUM and process
        for (Enum487TradeReportTransType oneEnum : Enum487TradeReportTransType.values()) {
            tagData = new Tag487EnuTradeReportTransType(oneEnum);
            assertEquals( "Tag487EnuTradeReportTransType\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}