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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  56
 *  TargetCompID
 *  String
 *  Assigned value used to identify receiving firm.
 */
class Tag56StrTargetCompIDTest {
    @Test
    void FIX0056Test() {
        FIX27 fixData = FIX27.FIX56_STR_TARGET_COMP_ID;
        assertEquals( "TARGET_COMP_ID", fixData.toFIXNameString());
        assertEquals( "56", fixData.toFIXIDString());
        assertEquals( "TargetCompID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0056Test() {
        Tag56StrTargetCompID tagData;

        tagData = new Tag56StrTargetCompID(new MyStringType("JPMC") );
        assertEquals( "JPMC", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag56StrTargetCompID tagData;

        tagData = new Tag56StrTargetCompID(new MyStringType(Tag56StrTargetCompID.TESTB_STR_TARGET_COMP_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag56StrTargetCompID tagData;

        tagData = new Tag56StrTargetCompID(new MyStringType(Tag56StrTargetCompID.TESTB_STR_TARGET_COMP_ID));
        assertEquals( Tag56StrTargetCompID.TESTB_STR_TARGET_COMP_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag56StrTargetCompID tagData;

        tagData = new Tag56StrTargetCompID(new MyStringType(Tag56StrTargetCompID.TESTB_STR_TARGET_COMP_ID));
        assertEquals( tagData.toFIXIDString() + "=" + Tag56StrTargetCompID.TESTB_STR_TARGET_COMP_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag56StrTargetCompID tagData;

        tagData = new Tag56StrTargetCompID(new MyStringType(Tag56StrTargetCompID.TESTB_STR_TARGET_COMP_ID));
        assertEquals( Tag56StrTargetCompID.TESTB_STR_TARGET_COMP_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag56StrTargetCompID tagData;

        tagData = new Tag56StrTargetCompID(new MyStringType(Tag56StrTargetCompID.TESTA_STR_TARGET_COMP_ID));
        assertEquals( "Tag56StrTargetCompID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag56StrTargetCompID.TESTA_STR_TARGET_COMP_ID + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag56StrTargetCompID.TESTA_STR_TARGET_COMP_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}