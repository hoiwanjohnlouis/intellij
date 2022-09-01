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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.fix41.enums.Enum150ExecType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag150EnuExecTypeTest {
    Tag150EnuExecType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum150ExecType oneEnum : Enum150ExecType.values()) {
            tagData = new Tag150EnuExecType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum150ExecType oneEnum : Enum150ExecType.values()) {
            tagData = new Tag150EnuExecType(oneEnum);
            assertEquals( "FIX150_ENU_EXEC_TYPE", tagData.toFIXLabelString());
            assertEquals( "150", tagData.toFIXIDString());
            assertEquals( "EXEC_TYPE", tagData.toFIXNameString());
            assertEquals( "ExecType", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum150ExecType oneEnum : Enum150ExecType.values()) {
            tagData = new Tag150EnuExecType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  150
         *  <p>    0 - New
         *  <p>    3 - Done for day
         *  <p>    4 - Canceled
         *  <p>    5 - Replaced
         *  <p>    6 - Pending Cancel (e.g. result of Order Cancel Request)
         */
        tagData = new Tag150EnuExecType(Enum150ExecType.NEW);
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag150EnuExecType(Enum150ExecType.DONE_FOR_DAY);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag150EnuExecType(Enum150ExecType.CANCELED);
        assertEquals( "4", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag150EnuExecType(Enum150ExecType.REPLACED);
        assertEquals( "5", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag150EnuExecType(Enum150ExecType.PENDING_CANCEL);
        assertEquals( "6", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  150
         *  <p>    7 - Stopped
         *  <p>    8 - Rejected
         *  <p>    9 - Suspended
         */
        tagData = new Tag150EnuExecType(Enum150ExecType.STOPPED);
        assertEquals( "7", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag150EnuExecType(Enum150ExecType.REJECTED);
        assertEquals( "8", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag150EnuExecType(Enum150ExecType.SUSPENDED);
        assertEquals( "9", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    A - Pending New
         *  <p>    B - Calculated
         *  <p>    C - Expired
         *  <p>    D - Restated (Execution Report sent unsolicited by sellside, with ExecRestatementReason (378) set)
         *  <p>    E - Pending Replace (e.g. result of Order Cancel/Replace Request)
         */
        tagData = new Tag150EnuExecType(Enum150ExecType.PENDING_NEW);
        assertEquals( "A", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag150EnuExecType(Enum150ExecType.CALCULATED);
        assertEquals( "B", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag150EnuExecType(Enum150ExecType.EXPIRED);
        assertEquals( "C", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag150EnuExecType(Enum150ExecType.RESTATED);
        assertEquals( "D", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag150EnuExecType(Enum150ExecType.PENDING_REPLACE);
        assertEquals( "E", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    F - Trade (partial fill or fill)
         *  <p>    G - Trade Correct
         *  <p>    H - Trade Cancel
         *  <p>    I - Order Status
         *  <p>    J - Trade in a Clearing Hold
         */
        tagData = new Tag150EnuExecType(Enum150ExecType.TRADE_PARTIAL_OR_FILLED);
        assertEquals( "F", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag150EnuExecType(Enum150ExecType.TRADE_CORRECT);
        assertEquals( "G", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag150EnuExecType(Enum150ExecType.TRADE_CANCEL);
        assertEquals( "H", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag150EnuExecType(Enum150ExecType.ORDER_STATUS);
        assertEquals( "I", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag150EnuExecType(Enum150ExecType.TRADE_IN_CLEARING_HOLD);
        assertEquals( "J", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        /*
         *  <p>    K - Trade has been released to Clearing
         *  <p>    L - Triggered or Activated by System
         */
        tagData = new Tag150EnuExecType(Enum150ExecType.TRADE_RELEASE_TO_CLEARING);
        assertEquals( "K", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag150EnuExecType(Enum150ExecType.TRIGGERED_OR_ACTIVATED);
        assertEquals( "L", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for (Enum150ExecType oneEnum : Enum150ExecType.values()) {
            tagData = new Tag150EnuExecType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum150ExecType oneEnum : Enum150ExecType.values()) {
            tagData = new Tag150EnuExecType(oneEnum);
            assertEquals( "Tag150EnuExecType\n" +
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