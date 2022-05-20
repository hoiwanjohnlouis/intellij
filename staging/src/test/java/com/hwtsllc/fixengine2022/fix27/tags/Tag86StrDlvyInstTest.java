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
 *  86
 *  DlvyInst
 *  String
 *  Deprecated in FIX.4.2 Free format text field to indicate delivery instructions
 */
// @Deprecated
class Tag86StrDlvyInstTest {
    @Test
    void FIX0086Test() {
        FIX27 fixData = FIX27.FIX86_STR_DLVY_INST;
        assertEquals( "DLVY_INST", fixData.toFIXNameString());
        assertEquals( "86", fixData.toFIXIDString());
        assertEquals( "DlvyInst (no longer used)", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0086Test() {
        Tag86StrDlvyInst tagData;

        tagData = new Tag86StrDlvyInst(new MyStringType("Galadriel-86StDlvyInst"));
        assertEquals( "Galadriel-86StDlvyInst", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag86StrDlvyInst tagData;

        tagData = new Tag86StrDlvyInst(new MyStringType(Tag86StrDlvyInst.TESTB_STR_DLVY_INST));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag86StrDlvyInst tagData;

        tagData = new Tag86StrDlvyInst(new MyStringType(Tag86StrDlvyInst.TESTB_STR_DLVY_INST));
        assertEquals( Tag86StrDlvyInst.TESTB_STR_DLVY_INST, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag86StrDlvyInst tagData;

        tagData = new Tag86StrDlvyInst(new MyStringType(Tag86StrDlvyInst.TESTB_STR_DLVY_INST));
        assertEquals( tagData.toFIXIDString() + "=" + Tag86StrDlvyInst.TESTB_STR_DLVY_INST,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag86StrDlvyInst tagData;

        tagData = new Tag86StrDlvyInst(new MyStringType(Tag86StrDlvyInst.TESTB_STR_DLVY_INST));
        assertEquals( Tag86StrDlvyInst.TESTB_STR_DLVY_INST,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag86StrDlvyInst tagData;

        tagData = new Tag86StrDlvyInst(new MyStringType(Tag86StrDlvyInst.TESTA_STR_DLVY_INST));
        assertEquals( "Tag86StrDlvyInst\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag86StrDlvyInst.TESTA_STR_DLVY_INST + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag86StrDlvyInst.TESTA_STR_DLVY_INST + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}