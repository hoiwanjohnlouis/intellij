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

import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  33
 *  NoLinesOfText
 *  NumInGroup
 *  <p></p>
 *  Identifies number of lines of text body
 */
class Tag33NumNoLinesOfTextTest {
    @Test
    void PrintFIXTagTest() {
        Tag33NumNoLinesOfText tagData;
        int oneElement;

        oneElement = Tag33NumNoLinesOfText.TESTA_NUM_NO_LINES_OF_TEXT;
        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag33NumNoLinesOfText.TESTB_NUM_NO_LINES_OF_TEXT;
        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag33NumNoLinesOfText tagData;
        int oneElement;

        oneElement = Tag33NumNoLinesOfText.TESTA_NUM_NO_LINES_OF_TEXT;
        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag33NumNoLinesOfText.TESTB_NUM_NO_LINES_OF_TEXT;
        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag33NumNoLinesOfText tagData ) {
        assertEquals( "FIX33_NUM_NO_LINES_OF_TEXT", tagData.toEnumLabelString());
        assertEquals( "NO_LINES_OF_TEXT", tagData.toEnumNameString());
        assertEquals( "33", tagData.toEnumIDString());
        assertEquals( "NoLinesOfText", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag33NumNoLinesOfText tagData;
        int oneElement;

        oneElement = Tag33NumNoLinesOfText.TESTA_NUM_NO_LINES_OF_TEXT;
        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag33NumNoLinesOfText.TESTB_NUM_NO_LINES_OF_TEXT;
        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag33NumNoLinesOfText tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag33NumNoLinesOfText tagData;
        int oneElement;

        oneElement = Tag33NumNoLinesOfText.TESTA_NUM_NO_LINES_OF_TEXT;
        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag33NumNoLinesOfText.TESTB_NUM_NO_LINES_OF_TEXT;
        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag33NumNoLinesOfText tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertEquals( tagData.toEnumIDString() + "=" + tagData.getDataValue(), tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag33NumNoLinesOfText tagData;
        int oneElement;

        oneElement = Tag33NumNoLinesOfText.TESTA_NUM_NO_LINES_OF_TEXT;
        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag33NumNoLinesOfText.TESTB_NUM_NO_LINES_OF_TEXT;
        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag33NumNoLinesOfText tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag33NumNoLinesOfText tagData;
        int oneElement;

        oneElement = Tag33NumNoLinesOfText.TESTA_NUM_NO_LINES_OF_TEXT;
        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType( oneElement ));
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag33NumNoLinesOfText.TESTB_NUM_NO_LINES_OF_TEXT;
        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType( oneElement ));
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag33NumNoLinesOfText tagData, final int oneElement ) {
        assertEquals( "Tag33NumNoLinesOfText\n" +
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