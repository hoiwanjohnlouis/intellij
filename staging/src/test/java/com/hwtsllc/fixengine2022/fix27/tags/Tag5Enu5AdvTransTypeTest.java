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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.fix27.enums.Enum5AdvTransType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  5
 *  AdvTransType
 *  String
 *  Identifies advertisement message transaction type
 *  Valid values:
 *      N - New
 *      C - Cancel
 *      R - Replace
 */
class Tag5Enu5AdvTransTypeTest {
    @Test
    void FIX0005Test() {
        FIX27 fixData = FIX27.FIX5_ENU_ADV_TRANS_TYPE;
        assertEquals( "ADV_TRANS_TYPE", fixData.toFIXNameString());
        assertEquals( "5", fixData.toFIXIDString());
        assertEquals( "Enum5AdvTransType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0005Test() {
        Tag5EnuAdvTransType tagData;

        tagData = new Tag5EnuAdvTransType(Enum5AdvTransType.NEW);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag5EnuAdvTransType(Enum5AdvTransType.CANCEL);
        assertEquals( "C", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag5EnuAdvTransType(Enum5AdvTransType.REPLACE);
        assertEquals( "R", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag5EnuAdvTransType tagData;

        // loop around the ENUM and process
        for (Enum5AdvTransType oneEnum : Enum5AdvTransType.values()) {
            tagData = new Tag5EnuAdvTransType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag5EnuAdvTransType tagData;

        // loop around the ENUM and process
        for (Enum5AdvTransType oneEnum : Enum5AdvTransType.values()) {
            tagData = new Tag5EnuAdvTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag5EnuAdvTransType tagData;

        // loop around the ENUM and process
        for (Enum5AdvTransType oneEnum : Enum5AdvTransType.values()) {
            tagData = new Tag5EnuAdvTransType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag5EnuAdvTransType tagData;

        // loop around the ENUM and process
        for (Enum5AdvTransType oneEnum : Enum5AdvTransType.values()) {
            tagData = new Tag5EnuAdvTransType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag5EnuAdvTransType tagData;

        // loop around the ENUM and process
        for (Enum5AdvTransType oneEnum : Enum5AdvTransType.values()) {
            tagData = new Tag5EnuAdvTransType(oneEnum);
            assertEquals( "Tag5EnuAdvTransType\n" +
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