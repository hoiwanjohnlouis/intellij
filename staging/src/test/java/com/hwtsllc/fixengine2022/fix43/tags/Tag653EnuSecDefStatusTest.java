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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum653SecDefStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  653
 *  SecDefStatus
 *  int
 *  <p></p>
 *  Deprecated in FIX.4.2
 *  <p></p>
 *  State of a security definition request made to a market.
 *  <p></p>
 *  Useful for markets, such as derivatives markets, where market participants
 *  are permitted to define instruments for subsequent trading
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Pending Approval
 *  <p>    1 - Approved (Accepted)
 *  <p>    2 - Rejected
 *  <p>    3 - Unauthorized Request
 *  <p>    4 - Invalid Definition Request
 */
// @Deprecated
class Tag653EnuSecDefStatusTest {
    @Test
    void FIX0653Test() {
        FIX43 fixData = FIX43.FIX653_ENU_SEC_DEF_STATUS;
        assertEquals( "653", fixData.toEnumIDString());
        assertEquals( "SEC_DEF_STATUS", fixData.toEnumNameString());
        assertEquals( "SecDefStatus (replaced)", fixData.toEnumDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0653Test() {
        Tag653EnuSecDefStatus tagData;

        /*
         *  0-4 types
         */
        tagData = new Tag653EnuSecDefStatus( Enum653SecDefStatus.PENDING );
        assertEquals( Enum653SecDefStatus.PENDING.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag653EnuSecDefStatus( Enum653SecDefStatus.APPROVED );
        assertEquals( Enum653SecDefStatus.APPROVED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag653EnuSecDefStatus( Enum653SecDefStatus.REJECTED );
        assertEquals( Enum653SecDefStatus.REJECTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag653EnuSecDefStatus( Enum653SecDefStatus.UNAUTHORIZED );
        assertEquals( Enum653SecDefStatus.UNAUTHORIZED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag653EnuSecDefStatus( Enum653SecDefStatus.INVALID );
        assertEquals( Enum653SecDefStatus.INVALID.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag653EnuSecDefStatus tagData;

        // loop around the ENUM and process
        for ( Enum653SecDefStatus oneEnum : Enum653SecDefStatus.values()) {
            tagData = new Tag653EnuSecDefStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag653EnuSecDefStatus tagData;

        // loop around the ENUM and process
        for (Enum653SecDefStatus oneEnum : Enum653SecDefStatus.values()) {
            tagData = new Tag653EnuSecDefStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag653EnuSecDefStatus tagData;

        // loop around the ENUM and process
        for (Enum653SecDefStatus oneEnum : Enum653SecDefStatus.values()) {
            tagData = new Tag653EnuSecDefStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag653EnuSecDefStatus tagData;

        // loop around the ENUM and process
        for (Enum653SecDefStatus oneEnum : Enum653SecDefStatus.values()) {
            tagData = new Tag653EnuSecDefStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag653EnuSecDefStatus tagData;

        // loop around the ENUM and process
        for (Enum653SecDefStatus oneEnum : Enum653SecDefStatus.values()) {
            tagData = new Tag653EnuSecDefStatus(oneEnum);
            assertEquals( "Tag653EnuSecDefStatus\n" +
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