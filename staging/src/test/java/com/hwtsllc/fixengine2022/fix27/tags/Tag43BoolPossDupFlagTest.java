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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.fix27.enums.Enum43PossDupFlag;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  43
 *  PossDupFlag
 *  Boolean
 *  <p>
 *  Indicates possible retransmission of message with this sequence number
 *  <p></p>
 *  Valid values:
 *  <p>    N - Original transmission
 *  <p>    Y - Possible duplicate
 */
class Tag43BoolPossDupFlagTest {
    @Test
    void FIX0043Test() {
        FIX27 fixData = FIX27.FIX43_BOOL_POSS_DUP_FLAG;
        assertEquals( "POSS_DUP_FLAG", fixData.toFIXNameString());
        assertEquals( "43", fixData.toFIXIDString());
        assertEquals( "PossDupFlag", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void PrintFIXTagTest() {
        Tag43BoolPossDupFlag tagData;

        // loop around the ENUM and process
        for (Enum43PossDupFlag oneEnum : Enum43PossDupFlag.values()) {
            tagData = new Tag43BoolPossDupFlag(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag43BoolPossDupFlag tagData;

        // loop around the ENUM and process
        for (Enum43PossDupFlag oneEnum : Enum43PossDupFlag.values()) {
            tagData = new Tag43BoolPossDupFlag(oneEnum);
            assertEquals( oneEnum.toFIXIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag43BoolPossDupFlag tagData;

        // loop around the ENUM and process
        for (Enum43PossDupFlag oneEnum : Enum43PossDupFlag.values()) {
            tagData = new Tag43BoolPossDupFlag(oneEnum);
            assertEquals( "43=" + oneEnum.toFIXIDString(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag43BoolPossDupFlag tagData;

        // loop around the ENUM and process
        for (Enum43PossDupFlag oneEnum : Enum43PossDupFlag.values()) {
            tagData = new Tag43BoolPossDupFlag(oneEnum);
            assertEquals( "Tag43BoolPossDupFlag\n" +
                            "\tEnumName[FIX43_BOOL_POSS_DUP_FLAG]\n" +
                            "\tFIXID[43]\n" +
                            "\tFIXName[POSS_DUP_FLAG]\n" +
                            "\tFIXDescription[PossDupFlag]\n" +
                            "\tDataValue[" + oneEnum.toFIXIDString() + "]\n" +
                            "\tValuePair[43=" + oneEnum.toFIXIDString() + "]\n" +
                            "\tDataID[" + oneEnum.toFIXIDString() + "]\n" +
                            "\tDataName[" + oneEnum.toFIXNameString() + "]\n" +
                            "\tDataDescription[" + oneEnum.toFIXDescriptionString() + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag43BoolPossDupFlag tagData;

        // loop around the ENUM and process
        for (Enum43PossDupFlag oneEnum : Enum43PossDupFlag.values()) {
            tagData = new Tag43BoolPossDupFlag(oneEnum);
            assertEquals( oneEnum.toFIXIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
}