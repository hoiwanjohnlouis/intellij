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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.fix43.enums.Enum552NoSides;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  552
 *  NoSides
 *  NumInGroup
 *  <p></p>
 *  Number of Side repeating group instances.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - One Side
 *  <p>    2 - Both Sides
 */
class Tag552EnuNoSidesTest {
    @Test
    void FIX0552Test() {
        FIX43 fixData = FIX43.FIX552_ENU_NO_SIDES;
        assertEquals( "552", fixData.toFIXIDString());
        assertEquals( "NO_SIDES", fixData.toFIXNameString());
        assertEquals( "NoSides", fixData.toFIXDescriptionString());
        assertNotEquals(MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals(MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals(MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0552Test() {
        Tag552EnuNoSides tagData;

        /*
         *  1-2 types
         */
        tagData = new Tag552EnuNoSides( Enum552NoSides.ONE_SIDE );
        assertEquals( Enum552NoSides.ONE_SIDE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag552EnuNoSides( Enum552NoSides.BOTH_SIDES );
        assertEquals( Enum552NoSides.BOTH_SIDES.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag552EnuNoSides tagData;

        // loop around the ENUM and process
        for ( Enum552NoSides oneEnum : Enum552NoSides.values()) {
            tagData = new Tag552EnuNoSides(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag552EnuNoSides tagData;

        // loop around the ENUM and process
        for (Enum552NoSides oneEnum : Enum552NoSides.values()) {
            tagData = new Tag552EnuNoSides(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag552EnuNoSides tagData;

        // loop around the ENUM and process
        for (Enum552NoSides oneEnum : Enum552NoSides.values()) {
            tagData = new Tag552EnuNoSides(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag552EnuNoSides tagData;

        // loop around the ENUM and process
        for (Enum552NoSides oneEnum : Enum552NoSides.values()) {
            tagData = new Tag552EnuNoSides(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag552EnuNoSides tagData;

        // loop around the ENUM and process
        for (Enum552NoSides oneEnum : Enum552NoSides.values()) {
            tagData = new Tag552EnuNoSides(oneEnum);
            assertEquals( "Tag552EnuNoSides\n" +
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