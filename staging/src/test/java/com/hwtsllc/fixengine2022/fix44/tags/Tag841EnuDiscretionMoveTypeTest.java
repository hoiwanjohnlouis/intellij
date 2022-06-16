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
import com.hwtsllc.fixengine2022.datatypes.MyEnumMoveType;
import com.hwtsllc.fixengine2022.fix44.enums.Enum665ConfirmStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  835 (same as 835, 841,)
 *  PegMoveType
 *  int
 *  <p>
 *  Describes whether peg is static or floats
 *  <p></p>
 *  841
 *  DiscretionMoveType
 *  int
 *  <p>
 *  Describes whether discretionary price is static or floats
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Floating (default)
 *  <p>    1 - Fixed
 */
class Tag841EnuDiscretionMoveTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX841_ENU_DISCRETION_MOVE_TYPE;
        assertEquals( "841", fixData.toFIXIDString());
        assertEquals( "DISCRETION_MOVE_TYPE", fixData.toFIXNameString());
        assertEquals( "DiscretionMoveType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0841Test() {
        Tag841EnuDiscretionMoveType tagData;
        Enum665ConfirmStatus oneElement;

        tagData = new Tag841EnuDiscretionMoveType(MyEnumMoveType.FLOATING);
        assertEquals( MyEnumMoveType.FLOATING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "841", fixData.toFIXIDString());
        assertEquals( "DISCRETION_MOVE_TYPE", fixData.toFIXNameString());
        assertEquals( "DiscretionMoveType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());

        tagData = new Tag841EnuDiscretionMoveType(MyEnumMoveType.FIXED);
        assertEquals( MyEnumMoveType.FIXED.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag841EnuDiscretionMoveType tagData;

        // loop around the ENUM and process
        for ( MyEnumMoveType oneEnum : MyEnumMoveType.values()) {
            tagData = new Tag841EnuDiscretionMoveType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag841EnuDiscretionMoveType tagData;

        // loop around the ENUM and process
        for (MyEnumMoveType oneEnum : MyEnumMoveType.values()) {
            tagData = new Tag841EnuDiscretionMoveType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag841EnuDiscretionMoveType tagData;

        // loop around the ENUM and process
        for (MyEnumMoveType oneEnum : MyEnumMoveType.values()) {
            tagData = new Tag841EnuDiscretionMoveType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag841EnuDiscretionMoveType tagData;

        // loop around the ENUM and process
        for (MyEnumMoveType oneEnum : MyEnumMoveType.values()) {
            tagData = new Tag841EnuDiscretionMoveType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag841EnuDiscretionMoveType tagData;

        // loop around the ENUM and process
        for (MyEnumMoveType oneEnum : MyEnumMoveType.values()) {
            tagData = new Tag841EnuDiscretionMoveType(oneEnum);
            assertEquals( "Tag841EnuDiscretionMoveType\n" +
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