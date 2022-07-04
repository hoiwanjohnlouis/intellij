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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  175
 *  SettlInstCode
 *  String
 *  <p>
 *  Deprecated in FIX.4.3 BIC
 *  <p>
 *  (Bank Identification Code - Swift managed) code of the institution involved
 *  (i.e. for multi-company institution firms)
 */
// @Deprecated
class Tag175StrSettlInstCodeTest {
    @Test
    void FIX0175Test() {
        FIX41 fixData = FIX41.FIX175_STR_SETTL_INST_CODE;
        assertEquals( "175", fixData.toEnumIDString());
        assertEquals( "SETTL_INST_CODE", fixData.toEnumNameString());
        assertEquals( "SettlInstCode (replaced)", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0175Test() {
        Tag175StrSettlInstCode tagData;

        tagData = new Tag175StrSettlInstCode(new MyStringType(Tag175StrSettlInstCode.TESTA_STR_SETTL_INST_CODE));
        assertEquals( Tag175StrSettlInstCode.TESTA_STR_SETTL_INST_CODE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag175StrSettlInstCode(new MyStringType(Tag175StrSettlInstCode.TESTB_STR_SETTL_INST_CODE));
        assertEquals( Tag175StrSettlInstCode.TESTB_STR_SETTL_INST_CODE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag175StrSettlInstCode tagData;

        tagData = new Tag175StrSettlInstCode(new MyStringType(Tag175StrSettlInstCode.TESTB_STR_SETTL_INST_CODE));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag175StrSettlInstCode tagData;

        tagData = new Tag175StrSettlInstCode(new MyStringType(Tag175StrSettlInstCode.TESTB_STR_SETTL_INST_CODE));
        assertEquals( Tag175StrSettlInstCode.TESTB_STR_SETTL_INST_CODE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag175StrSettlInstCode tagData;

        tagData = new Tag175StrSettlInstCode(new MyStringType(Tag175StrSettlInstCode.TESTB_STR_SETTL_INST_CODE));
        assertEquals( tagData.toEnumIDString() + "=" + Tag175StrSettlInstCode.TESTB_STR_SETTL_INST_CODE,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag175StrSettlInstCode tagData;

        tagData = new Tag175StrSettlInstCode(new MyStringType(Tag175StrSettlInstCode.TESTB_STR_SETTL_INST_CODE));
        assertEquals( Tag175StrSettlInstCode.TESTB_STR_SETTL_INST_CODE,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag175StrSettlInstCode tagData;

        tagData = new Tag175StrSettlInstCode(new MyStringType(Tag175StrSettlInstCode.TESTA_STR_SETTL_INST_CODE));
        assertEquals( "Tag175StrSettlInstCode\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag175StrSettlInstCode.TESTA_STR_SETTL_INST_CODE + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag175StrSettlInstCode.TESTA_STR_SETTL_INST_CODE + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}