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

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.fix44.enums.Enum856TradeReportType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  856
 *  TradeReportType
 *  int
 *  <p></p>
 *  Type of Trade Report
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Submit
 *  <p>    1 - Alleged
 *  <p>    2 - Accept
 *  <p>    3 - Decline
 *  <p>    4 - Addendum
 *  <p></p>
 *  <p>    5 - No-Was
 *  <p>    6 - Trade Report Cancel
 *  <p>    7 - (Locked-In) Trade Break
 *  <p>    8 - Defaulted
 *  <p>    9 - Invalid CMTA
 *  <p></p>
 *  <p>    10 - Pended
 *  <p>    11 - Alleged New
 *  <p>    12 - Alleged Addendum
 *  <p>    13 - Alleged No-Was
 *  <p>    14 - Alleged Trade Report Cancel
 *  <p></p>
 *  <p>    15 - Alleged (Locked-In) Trade Break
 */
class Tag856EnuTradeReportTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX856_ENU_TRADE_REPORT_TYPE;
        assertEquals( "856", fixData.toEnumIDString());
        assertEquals( "TRADE_REPORT_TYPE", fixData.toEnumNameString());
        assertEquals( "TradeReportType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0856Test() {
        Tag856EnuTradeReportType tagData;
        Enum856TradeReportType oneElement;

        oneElement = Enum856TradeReportType.SUBMIT;
        tagData = new Tag856EnuTradeReportType( oneElement );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "856", tagData.toEnumIDString());
        assertEquals( "TRADE_REPORT_TYPE", tagData.toEnumNameString());
        assertEquals( "TradeReportType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED);
        assertEquals( Enum856TradeReportType.ALLEGED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ACCEPT);
        assertEquals( Enum856TradeReportType.ACCEPT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.DECLINE);
        assertEquals( Enum856TradeReportType.DECLINE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ADDENDUM);
        assertEquals( Enum856TradeReportType.ADDENDUM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.NO_WAS);
        assertEquals( Enum856TradeReportType.NO_WAS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.TRADE_REPORT_CANCEL);
        assertEquals( Enum856TradeReportType.TRADE_REPORT_CANCEL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.LOCKED_IN_TRADE_BREAK);
        assertEquals( Enum856TradeReportType.LOCKED_IN_TRADE_BREAK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.DEFAULTED);
        assertEquals( Enum856TradeReportType.DEFAULTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.INVALID_CMTA);
        assertEquals( Enum856TradeReportType.INVALID_CMTA.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.PENDED);
        assertEquals( Enum856TradeReportType.PENDED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED_NEW);
        assertEquals( Enum856TradeReportType.ALLEGED_NEW.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED_ADDENDUM);
        assertEquals( Enum856TradeReportType.ALLEGED_ADDENDUM.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED_NO_WAS);
        assertEquals( Enum856TradeReportType.ALLEGED_NO_WAS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED_TRADE_REPORT_CANCEL);
        assertEquals( Enum856TradeReportType.ALLEGED_TRADE_REPORT_CANCEL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag856EnuTradeReportType(Enum856TradeReportType.ALLEGED_LOCKED_IN_TRADE_BREAK);
        assertEquals( Enum856TradeReportType.ALLEGED_LOCKED_IN_TRADE_BREAK.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag856EnuTradeReportType tagData;

        // loop around the ENUM and process
        for ( Enum856TradeReportType oneEnum : Enum856TradeReportType.values()) {
            tagData = new Tag856EnuTradeReportType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag856EnuTradeReportType tagData;

        // loop around the ENUM and process
        for (Enum856TradeReportType oneEnum : Enum856TradeReportType.values()) {
            tagData = new Tag856EnuTradeReportType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag856EnuTradeReportType tagData;

        // loop around the ENUM and process
        for (Enum856TradeReportType oneEnum : Enum856TradeReportType.values()) {
            tagData = new Tag856EnuTradeReportType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag856EnuTradeReportType tagData;

        // loop around the ENUM and process
        for (Enum856TradeReportType oneEnum : Enum856TradeReportType.values()) {
            tagData = new Tag856EnuTradeReportType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag856EnuTradeReportType tagData;

        // loop around the ENUM and process
        for (Enum856TradeReportType oneEnum : Enum856TradeReportType.values()) {
            tagData = new Tag856EnuTradeReportType(oneEnum);
            assertEquals( "Tag856EnuTradeReportType\n" +
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