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
import com.hwtsllc.fixengine2022.fix44.enums.Enum665ConfirmStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  665
 *  ConfirmStatus
 *  int
 *  <p></p>
 *  Identifies the status of the Confirmation.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Received
 *  <p>    2 - Mismatched Account
 *  <p>    3 - Missing Settlement Instructions
 *  <p>    4 - Confirmed
 *  <p>    5 - Request Rejected
 */
class Tag665EnuConfirmStatusTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX665_ENU_CONFIRM_STATUS;
        assertEquals( "665", fixData.toEnumIDString());
        assertEquals( "CONFIRM_STATUS", fixData.toEnumNameString());
        assertEquals( "ConfirmStatus", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0665Test() {
        Tag665EnuConfirmStatus tagData;
        Enum665ConfirmStatus oneElement;

        oneElement = Enum665ConfirmStatus.RECEIVED;
        tagData = new Tag665EnuConfirmStatus( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "665", tagData.toEnumIDString());
        assertEquals( "CONFIRM_STATUS", tagData.toEnumNameString());
        assertEquals( "ConfirmStatus", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag665EnuConfirmStatus(Enum665ConfirmStatus.MISMATCHED_ACCOUNT);
        assertEquals( Enum665ConfirmStatus.MISMATCHED_ACCOUNT.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag665EnuConfirmStatus(Enum665ConfirmStatus.MISSING_INSTRUCTIONS);
        assertEquals( Enum665ConfirmStatus.MISSING_INSTRUCTIONS.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag665EnuConfirmStatus(Enum665ConfirmStatus.CONFIRMED);
        assertEquals( Enum665ConfirmStatus.CONFIRMED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag665EnuConfirmStatus(Enum665ConfirmStatus.REJECTED);
        assertEquals( Enum665ConfirmStatus.REJECTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag665EnuConfirmStatus tagData;

        // loop around the ENUM and process
        for ( Enum665ConfirmStatus oneEnum : Enum665ConfirmStatus.values()) {
            tagData = new Tag665EnuConfirmStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag665EnuConfirmStatus tagData;

        // loop around the ENUM and process
        for (Enum665ConfirmStatus oneEnum : Enum665ConfirmStatus.values()) {
            tagData = new Tag665EnuConfirmStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag665EnuConfirmStatus tagData;

        // loop around the ENUM and process
        for (Enum665ConfirmStatus oneEnum : Enum665ConfirmStatus.values()) {
            tagData = new Tag665EnuConfirmStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag665EnuConfirmStatus tagData;

        // loop around the ENUM and process
        for (Enum665ConfirmStatus oneEnum : Enum665ConfirmStatus.values()) {
            tagData = new Tag665EnuConfirmStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag665EnuConfirmStatus tagData;

        // loop around the ENUM and process
        for (Enum665ConfirmStatus oneEnum : Enum665ConfirmStatus.values()) {
            tagData = new Tag665EnuConfirmStatus(oneEnum);
            assertEquals( "Tag665EnuConfirmStatus\n" +
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