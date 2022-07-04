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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  125
 *  CxlType
 *  char
 *  Deprecated in FIX.4.2
 */
// @Deprecated
class Tag125StrCxlTypeTest {
    @Test
    void FIX0125Test() {
        FIX40 fixData = FIX40.FIX125_STR_CXL_TYPE;
        assertEquals( "CXL_TYPE", fixData.toEnumNameString());
        assertEquals( "125", fixData.toEnumIDString());
        assertEquals( "CxlType (no longer used)", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0125Test() {
        Tag125StrCxlType tagData;

        tagData = new Tag125StrCxlType(new MyStringType("KimHaNeul-125CxlType") );
        assertEquals( "KimHaNeul-125CxlType", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag125StrCxlType tagData;

        tagData = new Tag125StrCxlType(new MyStringType(Tag125StrCxlType.TESTB_STR_CXL_TYPE));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag125StrCxlType tagData;

        tagData = new Tag125StrCxlType(new MyStringType(Tag125StrCxlType.TESTB_STR_CXL_TYPE));
        assertEquals( Tag125StrCxlType.TESTB_STR_CXL_TYPE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag125StrCxlType tagData;

        tagData = new Tag125StrCxlType(new MyStringType(Tag125StrCxlType.TESTB_STR_CXL_TYPE));
        assertEquals( tagData.toEnumIDString() + "=" + Tag125StrCxlType.TESTB_STR_CXL_TYPE,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag125StrCxlType tagData;

        tagData = new Tag125StrCxlType(new MyStringType(Tag125StrCxlType.TESTB_STR_CXL_TYPE));
        assertEquals( Tag125StrCxlType.TESTB_STR_CXL_TYPE,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag125StrCxlType tagData;

        tagData = new Tag125StrCxlType(new MyStringType(Tag125StrCxlType.TESTA_STR_CXL_TYPE));
        assertEquals( "Tag125StrCxlType\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag125StrCxlType.TESTA_STR_CXL_TYPE + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag125StrCxlType.TESTA_STR_CXL_TYPE + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}