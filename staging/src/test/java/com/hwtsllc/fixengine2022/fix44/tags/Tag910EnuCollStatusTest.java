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
import com.hwtsllc.fixengine2022.fix44.enums.Enum910CollStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  910
 *  CollStatus
 *  int
 *  <p></p>
 *  Collateral Status
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Unassigned
 *  <p>    1 - Partially Assigned
 *  <p>    2 - Assignment Proposed
 *  <p>    3 - Assigned (Accepted)
 *  <p>    4 - Challenged
 */
class Tag910EnuCollStatusTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX910_ENU_COLL_STATUS;
        assertEquals( "910", fixData.toEnumIDString());
        assertEquals( "COLL_STATUS", fixData.toEnumNameString());
        assertEquals( "CollStatus", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0910Test() {
        Tag910EnuCollStatus tagData;
        Enum910CollStatus oneElement;

        oneElement = Enum910CollStatus.UNASSIGNED;
        tagData = new Tag910EnuCollStatus( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "910", tagData.toEnumIDString());
        assertEquals( "COLL_STATUS", tagData.toEnumNameString());
        assertEquals( "CollStatus", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag910EnuCollStatus( Enum910CollStatus.PARTIALLY_ASSIGNED );
        assertEquals( Enum910CollStatus.PARTIALLY_ASSIGNED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag910EnuCollStatus( Enum910CollStatus.ASSIGNMENT_PROPOSED );
        assertEquals( Enum910CollStatus.ASSIGNMENT_PROPOSED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag910EnuCollStatus( Enum910CollStatus.ASSIGNED );
        assertEquals( Enum910CollStatus.ASSIGNED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag910EnuCollStatus( Enum910CollStatus.CHALLENGED );
        assertEquals( Enum910CollStatus.CHALLENGED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag910EnuCollStatus tagData;

        // loop around the ENUM and process
        for ( Enum910CollStatus oneEnum : Enum910CollStatus.values()) {
            tagData = new Tag910EnuCollStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag910EnuCollStatus tagData;

        // loop around the ENUM and process
        for (Enum910CollStatus oneEnum : Enum910CollStatus.values()) {
            tagData = new Tag910EnuCollStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag910EnuCollStatus tagData;

        // loop around the ENUM and process
        for (Enum910CollStatus oneEnum : Enum910CollStatus.values()) {
            tagData = new Tag910EnuCollStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag910EnuCollStatus tagData;

        // loop around the ENUM and process
        for (Enum910CollStatus oneEnum : Enum910CollStatus.values()) {
            tagData = new Tag910EnuCollStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag910EnuCollStatus tagData;

        // loop around the ENUM and process
        for (Enum910CollStatus oneEnum : Enum910CollStatus.values()) {
            tagData = new Tag910EnuCollStatus(oneEnum);
            assertEquals( "Tag910EnuCollStatus\n" +
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