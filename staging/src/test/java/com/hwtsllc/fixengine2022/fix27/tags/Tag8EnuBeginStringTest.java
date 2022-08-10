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

import com.hwtsllc.fixengine2022.fix27.enums.Enum8BeginString;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  8
 *  BeginString
 *  String
 *  <p></p>
 *  Identifies beginning of new message and protocol version.
 *  <p></p>
 *  <p> ALWAYS FIRST FIELD IN MESSAGE.
 *  <p> ALWAYS UNENCRYPTED.
 *  <p> Valid values:
 *  <p></p>
 *  <p>    FIX.2.7
 *  <p>    FIX.3.0
 *  <p>    FIX.4.0
 *  <p>    FIX.4.1
 *  <p>    FIX.4.2
 *  <p></p>
 *  <p>    FIX.4.3
 *  <p>    FIX.4.4
 *  <p>    FIXT.1.1
 */
class Tag8EnuBeginStringTest {
    Tag8EnuBeginString tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for (Enum8BeginString oneEnum : Enum8BeginString.values()) {
            tagData = new Tag8EnuBeginString(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for (Enum8BeginString oneEnum : Enum8BeginString.values()) {
            tagData = new Tag8EnuBeginString(oneEnum);
            assertEquals( "FIX8_ENU_BEGIN_STRING", tagData.toEnumLabelString());
            assertEquals( "BEGIN_STRING", tagData.toEnumNameString());
            assertEquals( "8", tagData.toEnumIDString());
            assertEquals( "BeginString", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagGetDataValueTest() {
        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_2_7);
        assertEquals( "FIX.2.7", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_3_0);
        assertEquals( "FIX.3.0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_4_0);
        assertEquals( "FIX.4.0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_4_1);
        assertEquals( "FIX.4.1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_4_2);
        assertEquals( "FIX.4.2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_4_3);
        assertEquals( "FIX.4.3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_4_4);
        assertEquals( "FIX.4.4", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag8EnuBeginString(Enum8BeginString.BEGIN_STRING_5_0);
        assertEquals( "FIXT.1.1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());


        // loop around the ENUM and process
        for (Enum8BeginString oneEnum : Enum8BeginString.values()) {
            tagData = new Tag8EnuBeginString(oneEnum);
            assertEquals( tagData.toString(), tagData.getDataValue());
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for (Enum8BeginString oneEnum : Enum8BeginString.values()) {
            tagData = new Tag8EnuBeginString(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + oneEnum.toEnumIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        // loop around the ENUM and process
        for (Enum8BeginString oneEnum : Enum8BeginString.values()) {
            tagData = new Tag8EnuBeginString(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for (Enum8BeginString oneEnum : Enum8BeginString.values()) {
            tagData = new Tag8EnuBeginString(oneEnum);
            assertEquals( "Tag8EnuBeginString\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.getDataValue() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}