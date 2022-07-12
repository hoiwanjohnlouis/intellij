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

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  125
 *  CxlType
 *  char
 *  <p></p>
 *  Deprecated in FIX.4.2
 */
// @Deprecated
class Tag125StrCxlTypeTest {
    @Test
    void PrintFIXTagTest() {
        Tag125StrCxlType tagData;
        String oneElement;

        oneElement = Tag125StrCxlType.TESTA_STR_CXL_TYPE;
        tagData = new Tag125StrCxlType(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag125StrCxlType.TESTB_STR_CXL_TYPE;
        tagData = new Tag125StrCxlType(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag125StrCxlType tagData;
        String oneElement;

        oneElement = Tag125StrCxlType.TESTA_STR_CXL_TYPE;
        tagData = new Tag125StrCxlType(new MyStringType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag125StrCxlType.TESTB_STR_CXL_TYPE;
        tagData = new Tag125StrCxlType(new MyStringType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag125StrCxlType tagData ) {
        assertEquals( "FIX125_STR_CXL_TYPE", tagData.toEnumLabelString());
        assertEquals( "CXL_TYPE", tagData.toEnumNameString());
        assertEquals( "125", tagData.toEnumIDString());
        assertEquals( "CxlType (no longer used)", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag125StrCxlType tagData;
        String oneElement;

        oneElement = Tag125StrCxlType.TESTA_STR_CXL_TYPE;
        tagData = new Tag125StrCxlType(new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag125StrCxlType.TESTB_STR_CXL_TYPE;
        tagData = new Tag125StrCxlType(new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag125StrCxlType tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag125StrCxlType tagData;
        String oneElement;

        oneElement = Tag125StrCxlType.TESTA_STR_CXL_TYPE;
        tagData = new Tag125StrCxlType(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag125StrCxlType.TESTB_STR_CXL_TYPE;
        tagData = new Tag125StrCxlType(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag125StrCxlType tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag125StrCxlType tagData;
        String oneElement;

        oneElement = Tag125StrCxlType.TESTA_STR_CXL_TYPE;
        tagData = new Tag125StrCxlType(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag125StrCxlType.TESTB_STR_CXL_TYPE;
        tagData = new Tag125StrCxlType(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag125StrCxlType tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag125StrCxlType tagData;
        String oneElement;

        oneElement = Tag125StrCxlType.TESTA_STR_CXL_TYPE;
        tagData = new Tag125StrCxlType(new MyStringType( oneElement ));
        VerifyVerboseString( tagData );

        oneElement = Tag125StrCxlType.TESTB_STR_CXL_TYPE;
        tagData = new Tag125StrCxlType(new MyStringType( oneElement ));
        VerifyVerboseString( tagData );
    }

    private void VerifyVerboseString( final Tag125StrCxlType tagData ) {
        assertEquals( "Tag125StrCxlType\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}