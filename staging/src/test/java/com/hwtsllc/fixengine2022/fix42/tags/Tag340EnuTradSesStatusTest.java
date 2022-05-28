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

import com.hwtsllc.fixengine2022.datatypes.FIX42;
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
    @Test
    void FIX0340Test() {
        FIX42 fixData = FIX42.FIX340_ENU_TRAD_SES_STATUS;
        assertEquals( "340", fixData.toFIXIDString());
        assertEquals( "TRAD_SES_STATUS", fixData.toFIXNameString());
        assertEquals( "TradSesStatus", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0340Test() {
        Tag340EnuTradSesStatus tagData;

        /*
         * 0-6 msg types
         */
        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.UNKNOWN);
        assertEquals( Enum340TradSesStatus.UNKNOWN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.HALTED);
        assertEquals( Enum340TradSesStatus.HALTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.OPEN);
        assertEquals( Enum340TradSesStatus.OPEN.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.CLOSED);
        assertEquals( Enum340TradSesStatus.CLOSED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.PRE_CLOSE);
        assertEquals( Enum340TradSesStatus.PRE_CLOSE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.REQUEST_REJECTED);
        assertEquals( Enum340TradSesStatus.REQUEST_REJECTED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag340EnuTradSesStatus(Enum340TradSesStatus.CLOSED);
        assertEquals( Enum340TradSesStatus.CLOSED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag340EnuTradSesStatus tagData;

        // loop around the ENUM and process
        for (Enum340TradSesStatus oneEnum : Enum340TradSesStatus.values()) {
            tagData = new Tag340EnuTradSesStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag340EnuTradSesStatus tagData;

        // loop around the ENUM and process
        for (Enum340TradSesStatus oneEnum : Enum340TradSesStatus.values()) {
            tagData = new Tag340EnuTradSesStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag340EnuTradSesStatus tagData;

        // loop around the ENUM and process
        for (Enum340TradSesStatus oneEnum : Enum340TradSesStatus.values()) {
            tagData = new Tag340EnuTradSesStatus(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag340EnuTradSesStatus tagData;

        // loop around the ENUM and process
        for (Enum340TradSesStatus oneEnum : Enum340TradSesStatus.values()) {
            tagData = new Tag340EnuTradSesStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag340EnuTradSesStatus tagData;

        // loop around the ENUM and process
        for (Enum340TradSesStatus oneEnum : Enum340TradSesStatus.values()) {
            tagData = new Tag340EnuTradSesStatus(oneEnum);
            assertEquals( "Tag340EnuTradSesStatus\n" +
                            "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toDataIDString() + "]\n" +
                            "\tValuePair[" + tagData.toFIXIDString() + "=" + tagData.toDataIDString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}