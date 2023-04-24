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

package com.hwtsllc.fixengine.tags.fix44.tags;

import com.hwtsllc.fixengine.datatypes.MyEnumOffsetType;
import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag842EnuDiscretionOffsetTypeTest {
    Tag842EnuDiscretionOffsetType tagData;

    @Test
    void PrintTest() {
        // loop around the ENUM and process
        for ( MyEnumOffsetType oneEnum : MyEnumOffsetType.values()) {
            tagData = new Tag842EnuDiscretionOffsetType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // loop around the ENUM and process
        for ( MyEnumOffsetType oneEnum : MyEnumOffsetType.values()) {
            tagData = new Tag842EnuDiscretionOffsetType(oneEnum);
            assertEquals( "FIX842_ENU_DISCRETION_OFFSET_TYPE", tagData.toFIXLabelString());
            assertEquals( "842", tagData.toFIXIDString());
            assertEquals( "DISCRETION_OFFSET_TYPE", tagData.toFIXNameString());
            assertEquals( "DiscretionOffsetType", tagData.toFIXDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toFIXLabelString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toFIXNameString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toFIXIDString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toFIXDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // loop around the ENUM and process
        for ( MyEnumOffsetType oneEnum : MyEnumOffsetType.values()) {
            tagData = new Tag842EnuDiscretionOffsetType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(), tagData.toValuePairString() );
            assertEquals( tagData.toFIXIDString() + "=" + oneEnum.toFIXIDString(), tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  842 (same as 836, 842,)
         *  DiscretionOffsetType
         *  int
         *  <p>    0 - Price (default)
         *  <p>    1 - Basis Points
         *  <p>    2 - Ticks
         *  <p>    3 - Price Tier or Level
         */
        tagData = new Tag842EnuDiscretionOffsetType( MyEnumOffsetType.PRICE );
        assertEquals( "0", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag842EnuDiscretionOffsetType(MyEnumOffsetType.BASIS);
        assertEquals( "1", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag842EnuDiscretionOffsetType(MyEnumOffsetType.TICKS);
        assertEquals( "2", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());

        tagData = new Tag842EnuDiscretionOffsetType(MyEnumOffsetType.TIER_OR_LEVEL);
        assertEquals( "3", tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());


        // loop around the ENUM and process
        for ( MyEnumOffsetType oneEnum : MyEnumOffsetType.values()) {
            tagData = new Tag842EnuDiscretionOffsetType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // loop around the ENUM and process
        for ( MyEnumOffsetType oneEnum : MyEnumOffsetType.values()) {
            tagData = new Tag842EnuDiscretionOffsetType(oneEnum);
            assertEquals( "Tag842EnuDiscretionOffsetType\n" +
                            "\tEnumName[" + tagData.toFIXLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                            "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                            "\tDataValue[" + tagData.toString() + "]\n" +
                            "\tValuePair[" + tagData.toValuePairString() + "]\n" +
                            "\tDataID[" + tagData.toDataIDString() + "]\n" +
                            "\tDataName[" + tagData.toDataNameString() + "]\n" +
                            "\tDataDescription[" + tagData.toDataDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
}