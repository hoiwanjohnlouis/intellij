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
import com.hwtsllc.fixengine2022.datatypes.MyNumInGroupType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  33
 *  NoLinesOfText
 *  NumInGroup
 *  Identifies number of lines of text body
 */
class Tag33NumNoLinesOfTextTest {
    @Test
    void FIX0033Test() {
        FIX27 fixData = FIX27.FIX33_NUM_NO_LINES_OF_TEXT;
        assertEquals( "NO_LINES_OF_TEXT", fixData.toEnumNameString());
        assertEquals( "33", fixData.toEnumIDString());
        assertEquals( "NoLinesOfText", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0033Test() {
        Tag33NumNoLinesOfText tagData;

        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType(5));
        assertEquals( 5, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_NUM_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag33NumNoLinesOfText tagData;

        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType(Tag33NumNoLinesOfText.TESTB_NUM_NO_LINES_OF_TEXT));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag33NumNoLinesOfText tagData;

        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType(Tag33NumNoLinesOfText.TESTB_NUM_NO_LINES_OF_TEXT));
        assertEquals( Tag33NumNoLinesOfText.TESTB_NUM_NO_LINES_OF_TEXT, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag33NumNoLinesOfText tagData;

        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType(Tag33NumNoLinesOfText.TESTB_NUM_NO_LINES_OF_TEXT));
        assertEquals( tagData.toEnumIDString() + "=" + Tag33NumNoLinesOfText.TESTB_NUM_NO_LINES_OF_TEXT,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag33NumNoLinesOfText tagData;

        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType(Tag33NumNoLinesOfText.TESTB_NUM_NO_LINES_OF_TEXT));
        assertEquals( String.valueOf(Tag33NumNoLinesOfText.TESTB_NUM_NO_LINES_OF_TEXT),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag33NumNoLinesOfText tagData;

        tagData = new Tag33NumNoLinesOfText(new MyNumInGroupType(Tag33NumNoLinesOfText.TESTA_NUM_NO_LINES_OF_TEXT));
        assertEquals( "Tag33NumNoLinesOfText\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag33NumNoLinesOfText.TESTA_NUM_NO_LINES_OF_TEXT + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag33NumNoLinesOfText.TESTA_NUM_NO_LINES_OF_TEXT + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}