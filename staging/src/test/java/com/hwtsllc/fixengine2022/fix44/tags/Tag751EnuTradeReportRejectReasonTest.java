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

import com.hwtsllc.fixengine2022.fix44.enums.Enum751TradeReportRejectReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  751
 *  TradeReportRejectReason
 *  int
 *  <p></p>
 *  Reason Trade Capture Request was rejected.
 *  <p></p>
 *  4000+ Reserved and available for bi-laterally agreed upon user-defined values
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Successful (default)
 *  <p>    1 - Invalid party information
 *  <p>    2 - Unknown instrument
 *  <p>    3 - Unauthorized to report trades
 *  <p>    4 - Invalid trade type
 *  <p></p>
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Tag751EnuTradeReportRejectReasonTest {
    Tag751EnuTradeReportRejectReason tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum751TradeReportRejectReason oneEnum : Enum751TradeReportRejectReason.values()) {
            tagData = new Tag751EnuTradeReportRejectReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum751TradeReportRejectReason oneEnum : Enum751TradeReportRejectReason.values()) {
            tagData = new Tag751EnuTradeReportRejectReason(oneEnum);
            assertEquals( "FIX751_ENU_TRADE_REPORT_REJECT_REASON", tagData.toEnumLabelString());
            assertEquals( "751", tagData.toEnumIDString());
            assertEquals( "TRADE_REPORT_REJECT_REASON", tagData.toEnumNameString());
            assertEquals( "TradeReportRejectReason", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         *  <p>    0 - Successful (default)
         *  <p>    1 - Invalid party information
         *  <p>    2 - Unknown instrument
         *  <p>    3 - Unauthorized to report trades
         *  <p>    4 - Invalid trade type
         */
        tagData = new Tag751EnuTradeReportRejectReason( Enum751TradeReportRejectReason.SUCCESSFUL );
        assertEquals( "0", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag751EnuTradeReportRejectReason(Enum751TradeReportRejectReason.INVALID_PARTY_INFORMATION);
        assertEquals( "1", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag751EnuTradeReportRejectReason(Enum751TradeReportRejectReason.UNKNOWN_INSTRUMENT);
        assertEquals( "2", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag751EnuTradeReportRejectReason(Enum751TradeReportRejectReason.UNAUTHORIZED_TO_REPORT_TRADES);
        assertEquals( "3", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        tagData = new Tag751EnuTradeReportRejectReason(Enum751TradeReportRejectReason.INVALID_TRADE_TYPE);
        assertEquals( "4", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        /*
         *  <p>    99 - Other
         *  <p>    or any value conforming to the data type Reserved100Plus
         */
        tagData = new Tag751EnuTradeReportRejectReason(Enum751TradeReportRejectReason.OTHER);
        assertEquals( "99", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        // loop around the ENUM and process
        for ( Enum751TradeReportRejectReason oneEnum : Enum751TradeReportRejectReason.values()) {
            tagData = new Tag751EnuTradeReportRejectReason(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum751TradeReportRejectReason oneEnum : Enum751TradeReportRejectReason.values()) {
            tagData = new Tag751EnuTradeReportRejectReason(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum751TradeReportRejectReason oneEnum : Enum751TradeReportRejectReason.values()) {
            tagData = new Tag751EnuTradeReportRejectReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum751TradeReportRejectReason oneEnum : Enum751TradeReportRejectReason.values()) {
            tagData = new Tag751EnuTradeReportRejectReason(oneEnum);
            assertEquals( "Tag751EnuTradeReportRejectReason\n" +
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