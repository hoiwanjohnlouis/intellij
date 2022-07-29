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

import com.hwtsllc.fixengine2022.fix42.enums.Enum340TradSesStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  340
 *  Enu
 *  TradSesStatus
 *  int
 *  <p>
 *  State of the trading session.
 *  <p></p>
 *  Valid values:
 *  <p>    0-6 msg types
 *  <p>    "0 - Unknown"
 *  <p>    "1 - Halted"
 *  <p>    "2 - Open"
 *  <p>    "3 - Closed"
 *  <p>    "4 - Pre-Open"
 *  <p></p>
 *  <p>    "5 - Pre-Close"
 *  <p>    "6 - Request Rejected"
 */
class Tag340EnuTradSesStatusTest {
    Tag340EnuTradSesStatus tagData;

    @Test
    void FIX0340Test() {
    }
    @Test
    void Tag0340Test() {
    }
    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( Enum340TradSesStatus oneEnum : Enum340TradSesStatus.values()) {
            tagData = new Tag340EnuTradSesStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( Enum340TradSesStatus oneEnum : Enum340TradSesStatus.values()) {
            tagData = new Tag340EnuTradSesStatus(oneEnum);
            assertEquals( "FIX340_ENU_TRAD_SES_STATUS", tagData.toEnumLabelString());
            assertEquals( "340", tagData.toEnumIDString());
            assertEquals( "TRAD_SES_STATUS", tagData.toEnumNameString());
            assertEquals( "TradSesStatus", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        /*
         * 0-6 msg types
         */
        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.UNKNOWN);
        assertEquals( Enum340TradSesStatus.UNKNOWN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.HALTED);
        assertEquals( Enum340TradSesStatus.HALTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.OPEN);
        assertEquals( Enum340TradSesStatus.OPEN.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.CLOSED);
        assertEquals( Enum340TradSesStatus.CLOSED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.PRE_CLOSE);
        assertEquals( Enum340TradSesStatus.PRE_CLOSE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.REQUEST_REJECTED);
        assertEquals( Enum340TradSesStatus.REQUEST_REJECTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.CLOSED);
        assertEquals( Enum340TradSesStatus.CLOSED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        // loop around the ENUM and process
        for ( Enum340TradSesStatus oneEnum : Enum340TradSesStatus.values()) {
            tagData = new Tag340EnuTradSesStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum340TradSesStatus oneEnum : Enum340TradSesStatus.values()) {
            tagData = new Tag340EnuTradSesStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for ( Enum340TradSesStatus oneEnum : Enum340TradSesStatus.values()) {
            tagData = new Tag340EnuTradSesStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( Enum340TradSesStatus oneEnum : Enum340TradSesStatus.values()) {
            tagData = new Tag340EnuTradSesStatus(oneEnum);
            assertEquals( "Tag340EnuTradSesStatus\n" +
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