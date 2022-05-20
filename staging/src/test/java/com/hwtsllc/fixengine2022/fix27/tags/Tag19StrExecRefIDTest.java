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
 *  19
 *  ExecRefID
 *  String
 *  Reference identifier used with Trade Cancel and Trade Correct execution types.
 *  (Prior to FIX 4.1 this field was of type int)
 */
class Tag19StrExecRefIDTest {
    @Test
    void FIX0019Test() {
        FIX27 fixData = FIX27.FIX19_STR_EXEC_REF_ID;
        assertEquals( "EXEC_REF_ID", fixData.toFIXNameString());
        assertEquals( "19", fixData.toFIXIDString());
        assertEquals( "ExecRefID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0019Test() {
        Tag19StrExecRefID tagData;

        tagData = new Tag19StrExecRefID(new MyStringType("6789-XYZ") );
        assertEquals( "6789-XYZ", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag19StrExecRefID tagData;

        tagData = new Tag19StrExecRefID(new MyStringType(Tag19StrExecRefID.TESTB_STR_EXEC_REF_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag19StrExecRefID tagData;

        tagData = new Tag19StrExecRefID(new MyStringType(Tag19StrExecRefID.TESTB_STR_EXEC_REF_ID));
        assertEquals( Tag19StrExecRefID.TESTB_STR_EXEC_REF_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag19StrExecRefID tagData;

        tagData = new Tag19StrExecRefID(new MyStringType(Tag19StrExecRefID.TESTB_STR_EXEC_REF_ID));
        assertEquals( tagData.toFIXIDString() + "=" + Tag19StrExecRefID.TESTB_STR_EXEC_REF_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag19StrExecRefID tagData;

        tagData = new Tag19StrExecRefID(new MyStringType(Tag19StrExecRefID.TESTB_STR_EXEC_REF_ID));
        assertEquals( Tag19StrExecRefID.TESTB_STR_EXEC_REF_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag19StrExecRefID tagData;

        tagData = new Tag19StrExecRefID(new MyStringType(Tag19StrExecRefID.TESTA_STR_EXEC_REF_ID));
        assertEquals( "Tag19StrExecRefID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag19StrExecRefID.TESTA_STR_EXEC_REF_ID + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag19StrExecRefID.TESTA_STR_EXEC_REF_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}