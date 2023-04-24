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

package com.hwtsllc.fixengine.tags.fix42.tags;

import com.hwtsllc.fixengine.tags.fix42.enums.Enum340TradSesStatus;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag340EnuTradSesStatusTest {
    Tag340EnuTradSesStatus tagData;

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
            assertEquals( "FIX340_ENU_TRAD_SES_STATUS", tagData.toFIXLabelString());
            assertEquals( "340", tagData.toFIXIDString());
            assertEquals( "TRAD_SES_STATUS", tagData.toFIXNameString());
            assertEquals( "TradSesStatus", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( Enum340TradSesStatus oneEnum : Enum340TradSesStatus.values()) {
            tagData = new Tag340EnuTradSesStatus(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  340
         *  Enu
         *  TradSesStatus
         *  int
         *  <p>    0-6 msg types
         *  <p>    "0 - Unknown"
         *  <p>    "1 - Halted"
         *  <p>    "2 - Open"
         *  <p>    "3 - Closed"
         *  <p>    "4 - Pre-Open"
         */
        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.UNKNOWN);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.HALTED);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.OPEN);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.CLOSED);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.PRE_OPEN);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    "5 - Pre-Close"
         *  <p>    "6 - Request Rejected"
         */
        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.PRE_CLOSE);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.REQUEST_REJECTED);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


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
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
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