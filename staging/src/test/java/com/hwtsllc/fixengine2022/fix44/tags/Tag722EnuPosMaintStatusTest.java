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
import com.hwtsllc.fixengine2022.fix44.enums.Enum722PosMaintStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  722
 *  PosMaintStatus
 *  int
 *  <p></p>
 *  Status of Position Maintenance Request
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Accepted
 *  <p>    1 - Accepted With Warnings
 *  <p>    2 - Rejected
 *  <p>    3 - Completed
 *  <p>    4 - Completed With Warnings
 */
class Tag722EnuPosMaintStatusTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX722_ENU_POS_MAINT_STATUS;
        assertEquals( "722", fixData.toEnumIDString());
        assertEquals( "POS_MAINT_STATUS", fixData.toEnumNameString());
        assertEquals( "PosMaintStatus", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0722Test() {
        Tag722EnuPosMaintStatus tagData;
        Enum722PosMaintStatus oneElement;

        oneElement = Enum722PosMaintStatus.ACCEPTED;
        tagData = new Tag722EnuPosMaintStatus( oneElement );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "722", tagData.toEnumIDString());
        assertEquals( "POS_MAINT_STATUS", tagData.toEnumNameString());
        assertEquals( "PosMaintStatus", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag722EnuPosMaintStatus(Enum722PosMaintStatus.ACCEPTED_WITH_WARNINGS);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag722EnuPosMaintStatus(Enum722PosMaintStatus.REJECTED);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag722EnuPosMaintStatus(Enum722PosMaintStatus.COMPLETED);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag722EnuPosMaintStatus(Enum722PosMaintStatus.COMPLETED_WITH_WARNINGS);
        assertEquals( "4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag722EnuPosMaintStatus tagData;

        // loop around the ENUM and process
        for ( Enum722PosMaintStatus oneEnum : Enum722PosMaintStatus.values()) {
            tagData = new Tag722EnuPosMaintStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag722EnuPosMaintStatus tagData;

        // loop around the ENUM and process
        for (Enum722PosMaintStatus oneEnum : Enum722PosMaintStatus.values()) {
            tagData = new Tag722EnuPosMaintStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag722EnuPosMaintStatus tagData;

        // loop around the ENUM and process
        for (Enum722PosMaintStatus oneEnum : Enum722PosMaintStatus.values()) {
            tagData = new Tag722EnuPosMaintStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag722EnuPosMaintStatus tagData;

        // loop around the ENUM and process
        for (Enum722PosMaintStatus oneEnum : Enum722PosMaintStatus.values()) {
            tagData = new Tag722EnuPosMaintStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag722EnuPosMaintStatus tagData;

        // loop around the ENUM and process
        for (Enum722PosMaintStatus oneEnum : Enum722PosMaintStatus.values()) {
            tagData = new Tag722EnuPosMaintStatus(oneEnum);
            assertEquals( "Tag722EnuPosMaintStatus\n" +
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