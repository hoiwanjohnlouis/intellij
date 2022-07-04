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
import com.hwtsllc.fixengine2022.fix44.enums.Enum729PosReqStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  729
 *  PosReqStatus
 *  int
 *  <p></p>
 *  Status of Request for Positions
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Completed
 *  <p>    1 - Completed With Warnings
 *  <p>    2 - Rejected
 */
class Tag729EnuPosReqStatusTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX729_ENU_POS_REQ_STATUS;
        assertEquals( "729", fixData.toEnumIDString());
        assertEquals( "POS_REQ_STATUS", fixData.toEnumNameString());
        assertEquals( "PosReqStatus", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0729Test() {
        Tag729EnuPosReqStatus tagData;
        Enum729PosReqStatus oneElement;

        oneElement = Enum729PosReqStatus.COMPLETED;
        tagData = new Tag729EnuPosReqStatus( oneElement );
        assertEquals( "0", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "729", tagData.toEnumIDString());
        assertEquals( "POS_REQ_STATUS", tagData.toEnumNameString());
        assertEquals( "PosReqStatus", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag729EnuPosReqStatus(Enum729PosReqStatus.COMPLETED_WITH_WARNINGS);
        assertEquals( "1", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag729EnuPosReqStatus(Enum729PosReqStatus.REJECTED);
        assertEquals( "2", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag729EnuPosReqStatus tagData;

        // loop around the ENUM and process
        for ( Enum729PosReqStatus oneEnum : Enum729PosReqStatus.values()) {
            tagData = new Tag729EnuPosReqStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag729EnuPosReqStatus tagData;

        // loop around the ENUM and process
        for (Enum729PosReqStatus oneEnum : Enum729PosReqStatus.values()) {
            tagData = new Tag729EnuPosReqStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag729EnuPosReqStatus tagData;

        // loop around the ENUM and process
        for (Enum729PosReqStatus oneEnum : Enum729PosReqStatus.values()) {
            tagData = new Tag729EnuPosReqStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag729EnuPosReqStatus tagData;

        // loop around the ENUM and process
        for (Enum729PosReqStatus oneEnum : Enum729PosReqStatus.values()) {
            tagData = new Tag729EnuPosReqStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag729EnuPosReqStatus tagData;

        // loop around the ENUM and process
        for (Enum729PosReqStatus oneEnum : Enum729PosReqStatus.values()) {
            tagData = new Tag729EnuPosReqStatus(oneEnum);
            assertEquals( "Tag729EnuPosReqStatus\n" +
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