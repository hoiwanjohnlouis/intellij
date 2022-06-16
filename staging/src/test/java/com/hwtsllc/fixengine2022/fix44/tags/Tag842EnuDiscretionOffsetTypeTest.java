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
import com.hwtsllc.fixengine2022.datatypes.MyEnumOffsetType;
import com.hwtsllc.fixengine2022.fix44.enums.Enum665ConfirmStatus;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  836 (same as 836, 842,)
 *  PegOffsetType
 *  int
 *  <p>
 *  Type of Peg Offset value
 *  <p></p>
 *  842
 *  DiscretionOffsetType
 *  int
 *  <p>
 *  Type of Discretion Offset value
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Price (default)
 *  <p>    1 - Basis Points
 *  <p>    2 - Ticks
 *  <p>    3 - Price Tier or Level
 */
class Tag842EnuDiscretionOffsetTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX842_ENU_DISCRETION_OFFSET_TYPE;
        assertEquals( "842", fixData.toFIXIDString());
        assertEquals( "DISCRETION_OFFSET_TYPE", fixData.toFIXNameString());
        assertEquals( "DiscretionOffsetType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0842Test() {
        Tag842EnuDiscretionOffsetType tagData;
        Enum665ConfirmStatus oneElement;

        tagData = new Tag842EnuDiscretionOffsetType(MyEnumOffsetType.PRICE);
        assertEquals( MyEnumOffsetType.PRICE.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "842", fixData.toFIXIDString());
        assertEquals( "DISCRETION_OFFSET_TYPE", fixData.toFIXNameString());
        assertEquals( "DiscretionOffsetType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());

        tagData = new Tag842EnuDiscretionOffsetType(MyEnumOffsetType.BASIS);
        assertEquals( MyEnumOffsetType.BASIS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag842EnuDiscretionOffsetType(MyEnumOffsetType.TICKS);
        assertEquals( MyEnumOffsetType.TICKS.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag842EnuDiscretionOffsetType(MyEnumOffsetType.TIER_OR_LEVEL);
        assertEquals( MyEnumOffsetType.TIER_OR_LEVEL.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag842EnuDiscretionOffsetType tagData;

        // loop around the ENUM and process
        for ( MyEnumOffsetType oneEnum : MyEnumOffsetType.values()) {
            tagData = new Tag842EnuDiscretionOffsetType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag842EnuDiscretionOffsetType tagData;

        // loop around the ENUM and process
        for (MyEnumOffsetType oneEnum : MyEnumOffsetType.values()) {
            tagData = new Tag842EnuDiscretionOffsetType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag842EnuDiscretionOffsetType tagData;

        // loop around the ENUM and process
        for (MyEnumOffsetType oneEnum : MyEnumOffsetType.values()) {
            tagData = new Tag842EnuDiscretionOffsetType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag842EnuDiscretionOffsetType tagData;

        // loop around the ENUM and process
        for (MyEnumOffsetType oneEnum : MyEnumOffsetType.values()) {
            tagData = new Tag842EnuDiscretionOffsetType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag842EnuDiscretionOffsetType tagData;

        // loop around the ENUM and process
        for (MyEnumOffsetType oneEnum : MyEnumOffsetType.values()) {
            tagData = new Tag842EnuDiscretionOffsetType(oneEnum);
            assertEquals( "Tag842EnuDiscretionOffsetType\n" +
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