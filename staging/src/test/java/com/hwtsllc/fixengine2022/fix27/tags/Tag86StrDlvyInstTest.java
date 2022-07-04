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
 *  <p></p>
 *  Deprecated in FIX.4.2 Free format text field to indicate delivery instructions
 */
// @Deprecated
class Tag86StrDlvyInstTest {
    @Test
    void FIXTest() {
        FIX27 fixData = FIX27.FIX86_STR_DLVY_INST;
        assertEquals( "DLVY_INST", fixData.toEnumNameString());
        assertEquals( "86", fixData.toEnumIDString());
        assertEquals( "DlvyInst (no longer used)", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0086Test() {
        Tag86StrDlvyInst tagData;
        String oneElement;

        oneElement = "Galadriel-Tag86StrDlvyInst";
        tagData = new Tag86StrDlvyInst(new MyStringType( oneElement ));
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag86StrDlvyInst.TESTA_STR_DLVY_INST;
        tagData = new Tag86StrDlvyInst(new MyStringType( oneElement ));
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag86StrDlvyInst.TESTB_STR_DLVY_INST;
        tagData = new Tag86StrDlvyInst(new MyStringType( oneElement ));
        verifyTagInformation( tagData, oneElement );
    }

    private void verifyTagInformation( Tag86StrDlvyInst tagData, String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "FIX86_STR_DLVY_INST", tagData.toEnumLabelString());
        assertEquals( "DLVY_INST", tagData.toEnumNameString());
        assertEquals( "86", tagData.toEnumIDString());
        assertEquals( "DlvyInst (no longer used)", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag86StrDlvyInst tagData;
        String oneElement;

        oneElement = Tag86StrDlvyInst.TESTA_STR_DLVY_INST;
        tagData = new Tag86StrDlvyInst(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag86StrDlvyInst.TESTB_STR_DLVY_INST;
        tagData = new Tag86StrDlvyInst(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag86StrDlvyInst tagData;
        String oneElement;

        oneElement = Tag86StrDlvyInst.TESTB_STR_DLVY_INST;
        tagData = new Tag86StrDlvyInst(new MyStringType( oneElement ));
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag86StrDlvyInst tagData;
        String oneElement;

        oneElement = Tag86StrDlvyInst.TESTB_STR_DLVY_INST;
        tagData = new Tag86StrDlvyInst(new MyStringType( oneElement ));
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag86StrDlvyInst tagData;
        String oneElement;

        oneElement = Tag86StrDlvyInst.TESTB_STR_DLVY_INST;
        tagData = new Tag86StrDlvyInst(new MyStringType( oneElement ));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag86StrDlvyInst tagData;
        String oneElement;

        oneElement = Tag86StrDlvyInst.TESTA_STR_DLVY_INST;
        tagData = new Tag86StrDlvyInst(new MyStringType( oneElement ));
        assertEquals( "Tag86StrDlvyInst\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}