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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.fix41.enums.Enum197AllocLinkType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  197
 *  AllocLinkType
 *  int
 *  <p>
 *  Identifies the type of Allocation linkage when AllocLinkID (96) is used.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - FX Netting
 *  <p>    1 - FX Swap
 */
class Tag197EnuAllocLinkTypeTest {
    @Test
    void FIX0197Test() {
        FIX41 fixData = FIX41.FIX197_ENU_ALLOC_LINK_TYPE;
        assertEquals( "197", fixData.toFIXIDString());
        assertEquals( "ALLOC_LINK_TYPE", fixData.toFIXNameString());
        assertEquals( "AllocLinkType", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0197Test() {
        Tag197EnuAllocLinkType tagData;

        tagData = new Tag197EnuAllocLinkType(Enum197AllocLinkType.FX_NETTING);
        assertEquals( Enum197AllocLinkType.FX_NETTING.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag197EnuAllocLinkType(Enum197AllocLinkType.FX_SWAP);
        assertEquals( Enum197AllocLinkType.FX_SWAP.toFIXIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag197EnuAllocLinkType tagData;

        // loop around the ENUM and process
        for (Enum197AllocLinkType oneEnum : Enum197AllocLinkType.values()) {
            tagData = new Tag197EnuAllocLinkType(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag197EnuAllocLinkType tagData;

        // loop around the ENUM and process
        for (Enum197AllocLinkType oneEnum : Enum197AllocLinkType.values()) {
            tagData = new Tag197EnuAllocLinkType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag197EnuAllocLinkType tagData;

        // loop around the ENUM and process
        for (Enum197AllocLinkType oneEnum : Enum197AllocLinkType.values()) {
            tagData = new Tag197EnuAllocLinkType(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag197EnuAllocLinkType tagData;

        // loop around the ENUM and process
        for (Enum197AllocLinkType oneEnum : Enum197AllocLinkType.values()) {
            tagData = new Tag197EnuAllocLinkType(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag197EnuAllocLinkType tagData;

        // loop around the ENUM and process
        for (Enum197AllocLinkType oneEnum : Enum197AllocLinkType.values()) {
            tagData = new Tag197EnuAllocLinkType(oneEnum);
            assertEquals( "Tag197EnuAllocLinkType\n" +
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