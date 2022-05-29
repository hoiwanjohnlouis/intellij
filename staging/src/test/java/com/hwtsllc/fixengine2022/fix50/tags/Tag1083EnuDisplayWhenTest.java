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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.fix50.enums.Enum1083DisplayWhen;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1083
 *  DisplayWhen
 *  char
 *  <p>
 *  Instructs when to refresh DisplayQty (1138).
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Immediate (after each fill)
 *  <p>    2 - Exhaust (when DisplayQty = 0)
 */
class Tag1083EnuDisplayWhenTest {
    @Test
    void FIX1083Test() {
        FIX50 fixData = FIX50.FIX1083_ENU_DISPLAY_WHEN;
        assertEquals( "1083", fixData.toFIXIDString());
        assertEquals( "DISPLAY_WHEN", fixData.toFIXNameString());
        assertEquals( "DisplayWhen", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1083Test() {
        Tag1083EnuDisplayWhen tagData;

        tagData = new Tag1083EnuDisplayWhen( Enum1083DisplayWhen.IMMEDIATE );
        assertEquals( Enum1083DisplayWhen.IMMEDIATE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1083EnuDisplayWhen( Enum1083DisplayWhen.EXHAUST );
        assertEquals( Enum1083DisplayWhen.EXHAUST.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1083EnuDisplayWhen tagData;

        // loop around the ENUM and process
        for ( Enum1083DisplayWhen oneEnum : Enum1083DisplayWhen.values()) {
            tagData = new Tag1083EnuDisplayWhen(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1083EnuDisplayWhen tagData;

        // loop around the ENUM and process
        for (Enum1083DisplayWhen oneEnum : Enum1083DisplayWhen.values()) {
            tagData = new Tag1083EnuDisplayWhen(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1083EnuDisplayWhen tagData;

        // loop around the ENUM and process
        for (Enum1083DisplayWhen oneEnum : Enum1083DisplayWhen.values()) {
            tagData = new Tag1083EnuDisplayWhen(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1083EnuDisplayWhen tagData;

        // loop around the ENUM and process
        for (Enum1083DisplayWhen oneEnum : Enum1083DisplayWhen.values()) {
            tagData = new Tag1083EnuDisplayWhen(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1083EnuDisplayWhen tagData;

        // loop around the ENUM and process
        for (Enum1083DisplayWhen oneEnum : Enum1083DisplayWhen.values()) {
            tagData = new Tag1083EnuDisplayWhen(oneEnum);
            assertEquals( "Tag1083EnuDisplayWhen\n" +
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