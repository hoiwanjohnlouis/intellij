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
import com.hwtsllc.fixengine2022.fix27.enums.Enum61Urgency;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  61
 *  Urgency
 *  char
 *  Urgency flag
 *  Valid values:
 *      0 - Normal
 *      1 - Flash
 *      2 - Background
 */
class Tag61EnuUrgencyTest {
    @Test
    void FIX0061Test() {
        FIX27 fixData = FIX27.FIX61_ENU_URGENCY;
        assertEquals( "URGENCY", fixData.toFIXNameString());
        assertEquals( "61", fixData.toFIXIDString());
        assertEquals( "Urgency", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
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
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag61EnuUrgency tagData;

        // loop around the ENUM and process
        for (Enum61Urgency oneEnum : Enum61Urgency.values()) {
            tagData = new Tag61EnuUrgency(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
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