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
import com.hwtsllc.fixengine2022.fix27.enums.Enum8BeginString;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  8
 *  BeginString
 *  String
 *  Identifies beginning of new message and protocol version.
 *  ALWAYS FIRST FIELD IN MESSAGE.
 *  ALWAYS UNENCRYPTED.
 *  Valid values:
 *
 *      FIX.2.7
 *      FIX.3.0
 *      FIX.4.0
 *      FIX.4.1
 *      FIX.4.2
 *
 *      FIX.4.3
 *      FIX.4.4
 *      FIXT.1.1
 */
class Tag8EnuBeginStringTest {
    @Test
    void FIX0008Test() {
        FIX27 fixData = FIX27.FIX8_ENU_BEGIN_STRING;
        assertEquals( "BEGIN_STRING", fixData.toFIXNameString());
        assertEquals( "8", fixData.toFIXIDString());
        assertEquals( "BeginString", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0008Test() {
        Tag8EnuBeginString tagData;

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_2_7);
        assertEquals( Enum8BeginString.BEGIN_STRING_2_7.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_3_0);
        assertEquals( Enum8BeginString.BEGIN_STRING_3_0.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_4_0);
        assertEquals( Enum8BeginString.BEGIN_STRING_4_0.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_4_1);
        assertEquals( Enum8BeginString.BEGIN_STRING_4_1.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_4_2);
        assertEquals( Enum8BeginString.BEGIN_STRING_4_2.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_4_3);
        assertEquals( Enum8BeginString.BEGIN_STRING_4_3.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_4_4);
        assertEquals( Enum8BeginString.BEGIN_STRING_4_4.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_5_0);
        assertEquals( Enum8BeginString.BEGIN_STRING_5_0.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag8EnuBeginString tagData;

        // loop around the ENUM and process
        for (Enum8BeginString oneEnum : Enum8BeginString.values()) {
            tagData = new Tag8EnuBeginString(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag8EnuBeginString tagData;

        // loop around the ENUM and process
        for (Enum8BeginString oneEnum : Enum8BeginString.values()) {
            tagData = new Tag8EnuBeginString(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag8EnuBeginString tagData;

        // loop around the ENUM and process
        for (Enum8BeginString oneEnum : Enum8BeginString.values()) {
            tagData = new Tag8EnuBeginString(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag8EnuBeginString tagData;

        // loop around the ENUM and process
        for (Enum8BeginString oneEnum : Enum8BeginString.values()) {
            tagData = new Tag8EnuBeginString(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag8EnuBeginString tagData;

        // loop around the ENUM and process
        for (Enum8BeginString oneEnum : Enum8BeginString.values()) {
            tagData = new Tag8EnuBeginString(oneEnum);
            assertEquals( "Tag8EnuBeginString\n" +
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