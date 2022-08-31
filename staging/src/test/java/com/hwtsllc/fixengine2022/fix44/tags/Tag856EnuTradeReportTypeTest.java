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

import com.hwtsllc.fixengine2022.fix44.enums.Enum856TradeReportType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag856EnuTradeReportTypeTest {
    Tag856EnuTradeReportType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum856TradeReportType oneEnum : Enum856TradeReportType.values()) {
            tagData = new Tag856EnuTradeReportType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum856TradeReportType oneEnum : Enum856TradeReportType.values()) {
            tagData = new Tag856EnuTradeReportType(oneEnum);
            assertEquals( "FIX856_ENU_TRADE_REPORT_TYPE", tagData.toEnumLabelString());
            assertEquals( "856", tagData.toEnumIDString());
            assertEquals( "TRADE_REPORT_TYPE", tagData.toEnumNameString());
            assertEquals( "TradeReportType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum856TradeReportType oneEnum : Enum856TradeReportType.values()) {
            tagData = new Tag856EnuTradeReportType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  856
         *  TradeReportType
         *  int
         *  <p>    0 - Submit
         *  <p>    1 - Alleged
         *  <p>    2 - Accept
         *  <p>    3 - Decline
         *  <p>    4 - Addendum
         */
        tagData = new Tag856EnuTradeReportType( Enum856TradeReportType.SUBMIT );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ACCEPT);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.DECLINE);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ADDENDUM);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    5 - No-Was
         *  <p>    6 - Trade Report Cancel
         *  <p>    7 - (Locked-In) Trade Break
         *  <p>    8 - Defaulted
         *  <p>    9 - Invalid CMTA
         */
        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.NO_WAS);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.TRADE_REPORT_CANCEL);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.LOCKED_IN_TRADE_BREAK);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.DEFAULTED);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.INVALID_CMTA);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    10 - Pended
         *  <p>    11 - Alleged New
         *  <p>    12 - Alleged Addendum
         *  <p>    13 - Alleged No-Was
         *  <p>    14 - Alleged Trade Report Cancel
         */
        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.PENDED);
        assertEquals( "10", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED_NEW);
        assertEquals( "11", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED_ADDENDUM);
        assertEquals( "12", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED_NO_WAS);
        assertEquals( "13", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED_TRADE_REPORT_CANCEL);
        assertEquals( "14", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    15 - Alleged (Locked-In) Trade Break
         */
        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED_LOCKED_IN_TRADE_BREAK);
        assertEquals( "15", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( Enum856TradeReportType oneEnum : Enum856TradeReportType.values()) {
            tagData = new Tag856EnuTradeReportType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum856TradeReportType oneEnum : Enum856TradeReportType.values()) {
            tagData = new Tag856EnuTradeReportType(oneEnum);
            assertEquals( "Tag856EnuTradeReportType\n" +
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