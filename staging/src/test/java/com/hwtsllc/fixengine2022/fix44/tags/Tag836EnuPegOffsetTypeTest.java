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
class Tag836EnuPegOffsetTypeTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX836_ENU_PEG_OFFSET_TYPE;
        assertEquals( "836", fixData.toEnumIDString());
        assertEquals( "PEG_OFFSET_TYPE", fixData.toEnumNameString());
        assertEquals( "PegOffsetType", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0836Test() {
        Tag836EnuPegOffsetType tagData;
        MyEnumOffsetType oneElement;

        oneElement = MyEnumOffsetType.PRICE;
        tagData = new Tag836EnuPegOffsetType( oneElement );
        assertEquals( "0", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "836", tagData.toEnumIDString());
        assertEquals( "PEG_OFFSET_TYPE", tagData.toEnumNameString());
        assertEquals( "PegOffsetType", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag836EnuPegOffsetType(MyEnumOffsetType.BASIS);
        assertEquals( "1", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag836EnuPegOffsetType(MyEnumOffsetType.TICKS);
        assertEquals( "2", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag836EnuPegOffsetType(MyEnumOffsetType.TIER_OR_LEVEL);
        assertEquals( "3", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag836EnuPegOffsetType tagData;

        // loop around the ENUM and process
        for ( MyEnumOffsetType oneEnum : MyEnumOffsetType.values()) {
            tagData = new Tag836EnuPegOffsetType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag836EnuPegOffsetType tagData;

        // loop around the ENUM and process
        for (MyEnumOffsetType oneEnum : MyEnumOffsetType.values()) {
            tagData = new Tag836EnuPegOffsetType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag836EnuPegOffsetType tagData;

        // loop around the ENUM and process
        for (MyEnumOffsetType oneEnum : MyEnumOffsetType.values()) {
            tagData = new Tag836EnuPegOffsetType(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag836EnuPegOffsetType tagData;

        // loop around the ENUM and process
        for (MyEnumOffsetType oneEnum : MyEnumOffsetType.values()) {
            tagData = new Tag836EnuPegOffsetType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag836EnuPegOffsetType tagData;

        // loop around the ENUM and process
        for (MyEnumOffsetType oneEnum : MyEnumOffsetType.values()) {
            tagData = new Tag836EnuPegOffsetType(oneEnum);
            assertEquals( "Tag836EnuPegOffsetType\n" +
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