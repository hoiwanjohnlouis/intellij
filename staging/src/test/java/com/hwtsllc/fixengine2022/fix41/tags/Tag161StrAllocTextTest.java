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

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  161
 *  AllocText
 *  String
 *  <p></p>
 *  Free format text related to a specific AllocAccount (79).
 */
class Tag161StrAllocTextTest {
    @Test
    void PrintFIXTagTest() {
        Tag161StrAllocText tagData;
        String oneElement;

        oneElement = Tag161StrAllocText.TESTA_STR_ALLOC_TEXT;
        tagData = new Tag161StrAllocText(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag161StrAllocText.TESTB_STR_ALLOC_TEXT;
        tagData = new Tag161StrAllocText(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag161StrAllocText tagData;
        String oneElement;

        oneElement = Tag161StrAllocText.TESTA_STR_ALLOC_TEXT;
        tagData = new Tag161StrAllocText(new MyStringType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag161StrAllocText.TESTB_STR_ALLOC_TEXT;
        tagData = new Tag161StrAllocText(new MyStringType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag161StrAllocText tagData ) {
        assertEquals( "FIX161_STR_ALLOC_TEXT", tagData.toEnumLabelString());
        assertEquals( "161", tagData.toEnumIDString());
        assertEquals( "ALLOC_TEXT", tagData.toEnumNameString());
        assertEquals( "AllocText", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag161StrAllocText tagData;
        String oneElement;

        oneElement = Tag161StrAllocText.TESTA_STR_ALLOC_TEXT;
        tagData = new Tag161StrAllocText(new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag161StrAllocText.TESTB_STR_ALLOC_TEXT;
        tagData = new Tag161StrAllocText(new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag161StrAllocText tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag161StrAllocText tagData;
        String oneElement;

        oneElement = Tag161StrAllocText.TESTA_STR_ALLOC_TEXT;
        tagData = new Tag161StrAllocText(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag161StrAllocText.TESTB_STR_ALLOC_TEXT;
        tagData = new Tag161StrAllocText(new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag161StrAllocText tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag161StrAllocText tagData;
        String oneElement;

        oneElement = Tag161StrAllocText.TESTA_STR_ALLOC_TEXT;
        tagData = new Tag161StrAllocText(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag161StrAllocText.TESTB_STR_ALLOC_TEXT;
        tagData = new Tag161StrAllocText(new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag161StrAllocText tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag161StrAllocText tagData;
        String oneElement;

        oneElement = Tag161StrAllocText.TESTA_STR_ALLOC_TEXT;
        tagData = new Tag161StrAllocText(new MyStringType( oneElement ));
        verifyVerboseString( tagData );

        oneElement = Tag161StrAllocText.TESTB_STR_ALLOC_TEXT;
        tagData = new Tag161StrAllocText(new MyStringType( oneElement ));
        verifyVerboseString( tagData );
    }

    private void verifyVerboseString( final Tag161StrAllocText tagData ) {
        assertEquals( "Tag161StrAllocText\n" +
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