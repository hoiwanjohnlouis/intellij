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

import com.hwtsllc.fixengine2022.fix27.enums.Enum61Urgency;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  61
 *  Urgency
 *  char
 *  <p></p>
 *  Urgency flag
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Normal
 *  <p>    1 - Flash
 *  <p>    2 - Background
 */
class Tag61EnuUrgencyTest {
    @Test
    void Tag0061Test() {
        Tag61EnuUrgency tagData;

        /*
         * 0-2 Urgency types
         */
        tagData = new Tag61EnuUrgency(Enum61Urgency.NORMAL);
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag61EnuUrgency(Enum61Urgency.FLASH);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag61EnuUrgency(Enum61Urgency.BACKGROUND);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void FIXTest() {
        Tag61EnuUrgency tagData;

        // loop around the ENUM and process
        for (Enum61Urgency oneEnum : Enum61Urgency.values()) {
            tagData = new Tag61EnuUrgency(oneEnum);
            assertEquals( "FIX61_ENU_URGENCY", tagData.toEnumLabelString());
            assertEquals( "URGENCY", tagData.toEnumNameString());
            assertEquals( "61", tagData.toEnumIDString());
            assertEquals( "Urgency", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void PrintFIXTagTest() {
        Tag61EnuUrgency tagData;

        // loop around the ENUM and process
        for (Enum61Urgency oneEnum : Enum61Urgency.values()) {
            tagData = new Tag61EnuUrgency(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag61EnuUrgency tagData;

        // loop around the ENUM and process
        for (Enum61Urgency oneEnum : Enum61Urgency.values()) {
            tagData = new Tag61EnuUrgency(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertEquals( oneEnum.toEnumIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag61EnuUrgency tagData;

        // loop around the ENUM and process
        for (Enum61Urgency oneEnum : Enum61Urgency.values()) {
            tagData = new Tag61EnuUrgency(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag61EnuUrgency tagData;

        // loop around the ENUM and process
        for (Enum61Urgency oneEnum : Enum61Urgency.values()) {
            tagData = new Tag61EnuUrgency(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag61EnuUrgency tagData;

        // loop around the ENUM and process
        for (Enum61Urgency oneEnum : Enum61Urgency.values()) {
            tagData = new Tag61EnuUrgency(oneEnum);
            assertEquals( "Tag61EnuUrgency\n" +
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