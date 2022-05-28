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
import com.hwtsllc.fixengine2022.fix41.enums.Enum141ResetSeqNumFlag;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  141
 *  ResetSeqNumFlag
 *  Boolean
 *  <p>
 *  Indicates that the both sides of the FIX session should reset sequence numbers.
 *  <p></p>
 *  Valid values:
 *  <p>    N - No
 *  <p>    Y - Yes, reset sequence numbers
 */
class Tag141EnuResetSeqNumFlagTest {
    @Test
    void FIX0141Test() {
        FIX41 fixData = FIX41.FIX141_ENU_RESET_SEQ_NUM_FLAG;
        assertEquals( "RESET_SEQ_NUM_FLAG", fixData.toFIXNameString());
        assertEquals( "141", fixData.toFIXIDString());
        assertEquals( "ResetSeqNumFlag", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0141Test() {
        Tag141EnuResetSeqNumFlag tagData;

        tagData = new Tag141EnuResetSeqNumFlag(Enum141ResetSeqNumFlag.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag141EnuResetSeqNumFlag(Enum141ResetSeqNumFlag.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag141EnuResetSeqNumFlag tagData;

        // loop around the ENUM and process
        for (Enum141ResetSeqNumFlag oneEnum : Enum141ResetSeqNumFlag.values()) {
            tagData = new Tag141EnuResetSeqNumFlag(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag141EnuResetSeqNumFlag tagData;

        // loop around the ENUM and process
        for (Enum141ResetSeqNumFlag oneEnum : Enum141ResetSeqNumFlag.values()) {
            tagData = new Tag141EnuResetSeqNumFlag(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag141EnuResetSeqNumFlag tagData;

        // loop around the ENUM and process
        for (Enum141ResetSeqNumFlag oneEnum : Enum141ResetSeqNumFlag.values()) {
            tagData = new Tag141EnuResetSeqNumFlag(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag141EnuResetSeqNumFlag tagData;

        // loop around the ENUM and process
        for (Enum141ResetSeqNumFlag oneEnum : Enum141ResetSeqNumFlag.values()) {
            tagData = new Tag141EnuResetSeqNumFlag(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag141EnuResetSeqNumFlag tagData;

        // loop around the ENUM and process
        for (Enum141ResetSeqNumFlag oneEnum : Enum141ResetSeqNumFlag.values()) {
            tagData = new Tag141EnuResetSeqNumFlag(oneEnum);
            assertEquals( "Tag141EnuResetSeqNumFlag\n" +
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