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
import com.hwtsllc.fixengine2022.fix27.enums.Bool43PossDupFlag;
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
        for (Bool43PossDupFlag oneEnum : Bool43PossDupFlag.values()) {
            tagData = new Tag43BoolPossDupFlag(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag43BoolPossDupFlag tagData;

        // loop around the ENUM and process
        for (Bool43PossDupFlag oneEnum : Bool43PossDupFlag.values()) {
            tagData = new Tag43BoolPossDupFlag(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag43BoolPossDupFlag tagData;

        // loop around the ENUM and process
        for (Bool43PossDupFlag oneEnum : Bool43PossDupFlag.values()) {
            tagData = new Tag43BoolPossDupFlag(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag43BoolPossDupFlag tagData;

        // loop around the ENUM and process
        for (Bool43PossDupFlag oneEnum : Bool43PossDupFlag.values()) {
            tagData = new Tag43BoolPossDupFlag(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag43BoolPossDupFlag tagData;

        // loop around the ENUM and process
        for (Bool43PossDupFlag oneEnum : Bool43PossDupFlag.values()) {
            tagData = new Tag43BoolPossDupFlag(oneEnum);
            assertEquals( "Tag43BoolPossDupFlag\n" +
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