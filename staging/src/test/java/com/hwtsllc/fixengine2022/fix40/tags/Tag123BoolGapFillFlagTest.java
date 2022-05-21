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

package com.hwtsllc.fixengine2022.fix40.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX40;
import com.hwtsllc.fixengine2022.fix40.enums.Bool123GapFillFlag;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  123
 *  GapFillFlag
 *  Boolean
 *  <p>
 *  Indicates that the Sequence Reset message is replacing administrative
 *  or application messages which will not be resent.
 *  <p></p>
 *  Valid values:
 *  <p>    N - Sequence Reset, Ignore Msg Seq Num (N/A For FIXML - Not Used)
 *  <p>    Y - Gap Fill Message, Msg Seq Num Field Valid
 */
class Tag123BoolGapFillFlagTest {
    @Test
    void FIX0123Test() {
        FIX40 fixData = FIX40.FIX123_BOOL_GAP_FILL_FLAG;
        assertEquals( "GAP_FILL_FLAG", fixData.toFIXNameString());
        assertEquals( "123", fixData.toFIXIDString());
        assertEquals( "GapFillFlag", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0123Test() {
        Tag123BoolGapFillFlag tagData;

        tagData = new Tag123BoolGapFillFlag(Bool123GapFillFlag.NO);
        assertEquals( "N", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag123BoolGapFillFlag(Bool123GapFillFlag.YES);
        assertEquals( "Y", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag123BoolGapFillFlag tagData;

        // loop around the ENUM and process
        for (Bool123GapFillFlag oneEnum : Bool123GapFillFlag.values()) {
            tagData = new Tag123BoolGapFillFlag(oneEnum);
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void TagGetDataValueTest() {
        Tag123BoolGapFillFlag tagData;

        // loop around the ENUM and process
        for (Bool123GapFillFlag oneEnum : Bool123GapFillFlag.values()) {
            tagData = new Tag123BoolGapFillFlag(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.getDataValue());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        Tag123BoolGapFillFlag tagData;

        // loop around the ENUM and process
        for (Bool123GapFillFlag oneEnum : Bool123GapFillFlag.values()) {
            tagData = new Tag123BoolGapFillFlag(oneEnum);
            assertEquals( tagData.toFIXIDString() + "=" + tagData.toDataIDString(),
                    tagData.toValuePairString() );
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
        }
    }
    @Test
    void TagToStringTest() {
        Tag123BoolGapFillFlag tagData;

        // loop around the ENUM and process
        for (Bool123GapFillFlag oneEnum : Bool123GapFillFlag.values()) {
            tagData = new Tag123BoolGapFillFlag(oneEnum);
            assertEquals( tagData.toDataIDString(), tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        Tag123BoolGapFillFlag tagData;

        // loop around the ENUM and process
        for (Bool123GapFillFlag oneEnum : Bool123GapFillFlag.values()) {
            tagData = new Tag123BoolGapFillFlag(oneEnum);
            assertEquals( "Tag123BoolGapFillFlag\n" +
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