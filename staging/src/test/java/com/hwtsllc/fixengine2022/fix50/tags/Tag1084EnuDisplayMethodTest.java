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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1084DisplayMethod;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1084
 *  DisplayMethod
 *  char
 *  <p>
 *  Defines what value to use in DisplayQty (1138).
 *  <p>
 *  If not specified the default DisplayMethod is "1"
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Initial (use original DisplayQty)
 *  <p>    2 - New (use RefreshQty)
 *  <p>    3 - Random (randomize value)
 */
class Tag1084EnuDisplayMethodTest {
    @Test
    void FIX1084Test() {
        FIX50 fixData = FIX50.FIX1084_ENU_DISPLAY_METHOD;
        assertEquals( "1084", fixData.toFIXIDString());
        assertEquals( "DISPLAY_METHOD", fixData.toFIXNameString());
        assertEquals( "DisplayMethod", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag1084Test() {
        Tag1084EnuDisplayMethod tagData;

        tagData = new Tag1084EnuDisplayMethod( Enum1084DisplayMethod.INITIAL );
        assertEquals( Enum1084DisplayMethod.INITIAL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1084EnuDisplayMethod( Enum1084DisplayMethod.NEW );
        assertEquals( Enum1084DisplayMethod.NEW.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag1084EnuDisplayMethod( Enum1084DisplayMethod.RANDOM );
        assertEquals( Enum1084DisplayMethod.RANDOM.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag1084EnuDisplayMethod tagData;

        // loop around the ENUM and process
        for ( Enum1084DisplayMethod oneEnum : Enum1084DisplayMethod.values()) {
            tagData = new Tag1084EnuDisplayMethod(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag1084EnuDisplayMethod tagData;

        // loop around the ENUM and process
        for (Enum1084DisplayMethod oneEnum : Enum1084DisplayMethod.values()) {
            tagData = new Tag1084EnuDisplayMethod(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag1084EnuDisplayMethod tagData;

        // loop around the ENUM and process
        for (Enum1084DisplayMethod oneEnum : Enum1084DisplayMethod.values()) {
            tagData = new Tag1084EnuDisplayMethod(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag1084EnuDisplayMethod tagData;

        // loop around the ENUM and process
        for (Enum1084DisplayMethod oneEnum : Enum1084DisplayMethod.values()) {
            tagData = new Tag1084EnuDisplayMethod(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag1084EnuDisplayMethod tagData;

        // loop around the ENUM and process
        for (Enum1084DisplayMethod oneEnum : Enum1084DisplayMethod.values()) {
            tagData = new Tag1084EnuDisplayMethod(oneEnum);
            assertEquals( "Tag1084EnuDisplayMethod\n" +
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