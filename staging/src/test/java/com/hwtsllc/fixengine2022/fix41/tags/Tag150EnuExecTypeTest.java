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

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.fix41.enums.Enum150ExecType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  150
 *  ExecType
 *  char
 *  <p>
 *  Describes the specific ExecutionRpt
 *  <p>
 *  (i.e. Pending Cancel) while OrdStatus (39) will always identify the current order status (i.e. Partially Filled)
 *  <p>
 *  *** SOME VALUES HAVE BEEN REPLACED - See "Replaced Features and Supported Approach" ***
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    3 - Done for day
 *  <p>    4 - Canceled
 *  <p>    5 - Replaced
 *  <p>    6 - Pending Cancel (e.g. result of Order Cancel Request)
 *  <p></p>
 *  <p>    7 - Stopped
 *  <p>    8 - Rejected
 *  <p>    9 - Suspended
 *  <p></p>
 *  <p>    A - Pending New
 *  <p>    B - Calculated
 *  <p>    C - Expired
 *  <p>    D - Restated (Execution Report sent unsolicited by sellside, with ExecRestatementReason (378) set)
 *  <p>    E - Pending Replace (e.g. result of Order Cancel/Replace Request)
 *  <p></p>
 *  <p>    F - Trade (partial fill or fill)
 *  <p>    G - Trade Correct
 *  <p>    H - Trade Cancel
 *  <p>    I - Order Status
 *  <p>    J - Trade in a Clearing Hold
 *  <p></p>
 *  <p>    K - Trade has been released to Clearing
 *  <p>    L - Triggered or Activated by System
 */
class Tag150EnuExecTypeTest {
    @Test
    void FIX0150Test() {
        FIX41 fixData = FIX41.FIX150_ENU_EXEC_TYPE;
        assertEquals( "150", fixData.toEnumIDString());
        assertEquals( "EXEC_TYPE", fixData.toEnumNameString());
        assertEquals( "ExecType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0150Test() {
        Tag150EnuExecType tagData;

        tagData = new Tag150EnuExecType(Enum150ExecType.NEW);
        assertEquals( Enum150ExecType.NEW.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.DONE_FOR_DAY);
        assertEquals( Enum150ExecType.DONE_FOR_DAY.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.CANCELED);
        assertEquals( Enum150ExecType.CANCELED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.REPLACED);
        assertEquals( Enum150ExecType.REPLACED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.PENDING_CANCEL);
        assertEquals( Enum150ExecType.PENDING_CANCEL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.STOPPED);
        assertEquals( Enum150ExecType.STOPPED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.REJECTED);
        assertEquals( Enum150ExecType.REJECTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.REJECTED);
        assertEquals( Enum150ExecType.REJECTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.PENDING_NEW);
        assertEquals( Enum150ExecType.PENDING_NEW.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.CALCULATED);
        assertEquals( Enum150ExecType.CALCULATED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.EXPIRED);
        assertEquals( Enum150ExecType.EXPIRED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.RESTATED);
        assertEquals( Enum150ExecType.RESTATED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.PENDING_REPLACE);
        assertEquals( Enum150ExecType.PENDING_REPLACE.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.TRADE_PARTIAL_OR_FILLED);
        assertEquals( Enum150ExecType.TRADE_PARTIAL_OR_FILLED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.TRADE_CORRECT);
        assertEquals( Enum150ExecType.TRADE_CORRECT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.TRADE_CANCEL);
        assertEquals( Enum150ExecType.TRADE_CANCEL.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.ORDER_STATUS);
        assertEquals( Enum150ExecType.ORDER_STATUS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.TRADE_IN_CLEARING_HOLD);
        assertEquals( Enum150ExecType.TRADE_IN_CLEARING_HOLD.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.TRADE_RELEASE_TO_CLEARING);
        assertEquals( Enum150ExecType.TRADE_RELEASE_TO_CLEARING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag150EnuExecType(Enum150ExecType.TRIGGERED_OR_ACTIVATED);
        assertEquals( Enum150ExecType.TRIGGERED_OR_ACTIVATED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag150EnuExecType tagData;

        // loop around the ENUM and process
        for (Enum150ExecType oneEnum : Enum150ExecType.values()) {
            tagData = new Tag150EnuExecType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag150EnuExecType tagData;

        // loop around the ENUM and process
        for (Enum150ExecType oneEnum : Enum150ExecType.values()) {
            tagData = new Tag150EnuExecType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag150EnuExecType tagData;

        // loop around the ENUM and process
        for (Enum150ExecType oneEnum : Enum150ExecType.values()) {
            tagData = new Tag150EnuExecType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag150EnuExecType tagData;

        // loop around the ENUM and process
        for (Enum150ExecType oneEnum : Enum150ExecType.values()) {
            tagData = new Tag150EnuExecType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag150EnuExecType tagData;

        // loop around the ENUM and process
        for (Enum150ExecType oneEnum : Enum150ExecType.values()) {
            tagData = new Tag150EnuExecType(oneEnum);
            assertEquals( "Tag150EnuExecType\n" +
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