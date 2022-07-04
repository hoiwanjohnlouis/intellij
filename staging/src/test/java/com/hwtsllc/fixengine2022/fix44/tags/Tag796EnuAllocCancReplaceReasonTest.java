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
import com.hwtsllc.fixengine2022.fix44.enums.Enum796AllocCancReplaceReason;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  796
 *  AllocCancReplaceReason
 *  int
 *  <p></p>
 *  Reason for cancelling or replacing an Allocation Instruction
 *  or Allocation Report message
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Original details incomplete or incorrect
 *  <p>    2 - Change in underlying order details
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
class Tag796EnuAllocCancReplaceReasonTest {
    @Test
    void FIXTest() {
        FIX44 fixData = FIX44.FIX796_ENU_ALLOC_CANC_REPLACE_REASON;
        assertEquals( "796", fixData.toEnumIDString());
        assertEquals( "ALLOC_CANC_REPLACE_REASON", fixData.toEnumNameString());
        assertEquals( "AllocCancReplaceReason", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0796Test() {
        Tag796EnuAllocCancReplaceReason tagData;
        Enum796AllocCancReplaceReason oneElement;

        oneElement = Enum796AllocCancReplaceReason.ORIGINAL_DETAILS_INCOMPLETE;
        tagData = new Tag796EnuAllocCancReplaceReason( oneElement );
        assertEquals( oneElement.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "796", tagData.toEnumIDString());
        assertEquals( "ALLOC_CANC_REPLACE_REASON", tagData.toEnumNameString());
        assertEquals( "AllocCancReplaceReason", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        tagData = new Tag796EnuAllocCancReplaceReason(Enum796AllocCancReplaceReason.CHANGE_IN_UNDERLYING_ORDER);
        assertEquals( Enum796AllocCancReplaceReason.CHANGE_IN_UNDERLYING_ORDER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag796EnuAllocCancReplaceReason(Enum796AllocCancReplaceReason.OTHER);
        assertEquals( Enum796AllocCancReplaceReason.OTHER.toEnumIDString(), tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag796EnuAllocCancReplaceReason tagData;

        // loop around the ENUM and process
        for ( Enum796AllocCancReplaceReason oneEnum : Enum796AllocCancReplaceReason.values()) {
            tagData = new Tag796EnuAllocCancReplaceReason(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag796EnuAllocCancReplaceReason tagData;

        // loop around the ENUM and process
        for (Enum796AllocCancReplaceReason oneEnum : Enum796AllocCancReplaceReason.values()) {
            tagData = new Tag796EnuAllocCancReplaceReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag796EnuAllocCancReplaceReason tagData;

        // loop around the ENUM and process
        for (Enum796AllocCancReplaceReason oneEnum : Enum796AllocCancReplaceReason.values()) {
            tagData = new Tag796EnuAllocCancReplaceReason(oneEnum);
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag796EnuAllocCancReplaceReason tagData;

        // loop around the ENUM and process
        for (Enum796AllocCancReplaceReason oneEnum : Enum796AllocCancReplaceReason.values()) {
            tagData = new Tag796EnuAllocCancReplaceReason(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag796EnuAllocCancReplaceReason tagData;

        // loop around the ENUM and process
        for (Enum796AllocCancReplaceReason oneEnum : Enum796AllocCancReplaceReason.values()) {
            tagData = new Tag796EnuAllocCancReplaceReason(oneEnum);
            assertEquals( "Tag796EnuAllocCancReplaceReason\n" +
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