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
import com.hwtsllc.fixengine2022.fix44.enums.Enum706PosQtyStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  706
 *  PosQtyStatus
 *  String
 *  <p></p>
 *  Status of this position.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Submitted
 *  <p>    1 - Accepted
 *  <p>    2 - Rejected
 */
class Tag706EnuPosQtyStatusTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX706_ENU_POS_QTY_STATUS;
        assertEquals( "706", fixData.toEnumIDString());
        assertEquals( "POS_QTY_STATUS", fixData.toEnumNameString());
        assertEquals( "PosQtyStatus", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0706Test() {
        Tag706EnuPosQtyStatus tagData;
        Enum706PosQtyStatus oneElement;

        oneElement = Enum706PosQtyStatus.SUBMITTED;
        tagData = new Tag706EnuPosQtyStatus( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "706", tagData.toEnumIDString());
        assertEquals( "POS_QTY_STATUS", tagData.toEnumNameString());
        assertEquals( "PosQtyStatus", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag706EnuPosQtyStatus(Enum706PosQtyStatus.ACCEPTED);
        assertEquals( Enum706PosQtyStatus.ACCEPTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag706EnuPosQtyStatus(Enum706PosQtyStatus.REJECTED);
        assertEquals( Enum706PosQtyStatus.REJECTED.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag706EnuPosQtyStatus tagData;

        // loop around the ENUM and process
        for ( Enum706PosQtyStatus oneEnum : Enum706PosQtyStatus.values()) {
            tagData = new Tag706EnuPosQtyStatus(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag706EnuPosQtyStatus tagData;

        // loop around the ENUM and process
        for (Enum706PosQtyStatus oneEnum : Enum706PosQtyStatus.values()) {
            tagData = new Tag706EnuPosQtyStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag706EnuPosQtyStatus tagData;

        // loop around the ENUM and process
        for (Enum706PosQtyStatus oneEnum : Enum706PosQtyStatus.values()) {
            tagData = new Tag706EnuPosQtyStatus(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag706EnuPosQtyStatus tagData;

        // loop around the ENUM and process
        for (Enum706PosQtyStatus oneEnum : Enum706PosQtyStatus.values()) {
            tagData = new Tag706EnuPosQtyStatus(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag706EnuPosQtyStatus tagData;

        // loop around the ENUM and process
        for (Enum706PosQtyStatus oneEnum : Enum706PosQtyStatus.values()) {
            tagData = new Tag706EnuPosQtyStatus(oneEnum);
            assertEquals( "Tag706EnuPosQtyStatus\n" +
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