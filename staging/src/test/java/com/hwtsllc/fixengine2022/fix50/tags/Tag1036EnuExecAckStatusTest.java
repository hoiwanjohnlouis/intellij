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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1036ExecAckStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1036
 *  ExecAckStatus
 *  char
 *  <p>
 *  The status of this execution acknowledgement message.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Received, not yet processed
 *  <p>    1 - Accepted
 *  <p>    2 - Don't know / Rejected
 */
class Tag1036EnuExecAckStatusTest {
    @Test
    void FIX1036Test() {
        FIX50 fixData = FIX50.FIX1036_ENU_EXEC_ACK_STATUS;
        assertEquals( "1036", fixData.toEnumIDString());
        assertEquals( "EXEC_ACK_STATUS", fixData.toEnumNameString());
        assertEquals( "ExecAckStatus", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag1036Test() {
        Tag1036EnuExecAckStatus tagData;

        tagData = new Tag1036EnuExecAckStatus( Enum1036ExecAckStatus.RECEIVED );
        assertEquals( Enum1036ExecAckStatus.RECEIVED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1036EnuExecAckStatus( Enum1036ExecAckStatus.ACCEPTED );
        assertEquals( Enum1036ExecAckStatus.ACCEPTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1036EnuExecAckStatus( Enum1036ExecAckStatus.DONT_KNOW_REJECTED );
        assertEquals( Enum1036ExecAckStatus.DONT_KNOW_REJECTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1036EnuExecAckStatus tagData;

        // loop around the ENUM and process
        for ( Enum1036ExecAckStatus oneEnum : Enum1036ExecAckStatus.values()) {
            tagData = new Tag1036EnuExecAckStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1036EnuExecAckStatus tagData;

        // loop around the ENUM and process
        for (Enum1036ExecAckStatus oneEnum : Enum1036ExecAckStatus.values()) {
            tagData = new Tag1036EnuExecAckStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1036EnuExecAckStatus tagData;

        // loop around the ENUM and process
        for (Enum1036ExecAckStatus oneEnum : Enum1036ExecAckStatus.values()) {
            tagData = new Tag1036EnuExecAckStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1036EnuExecAckStatus tagData;

        // loop around the ENUM and process
        for (Enum1036ExecAckStatus oneEnum : Enum1036ExecAckStatus.values()) {
            tagData = new Tag1036EnuExecAckStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1036EnuExecAckStatus tagData;

        // loop around the ENUM and process
        for (Enum1036ExecAckStatus oneEnum : Enum1036ExecAckStatus.values()) {
            tagData = new Tag1036EnuExecAckStatus(oneEnum);
            assertEquals( "Tag1036EnuExecAckStatus\n" +
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