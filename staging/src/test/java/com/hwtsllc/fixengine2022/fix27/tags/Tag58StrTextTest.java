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
 *  58
 *  Text
 *  String
 *  Free format text string
 *  (Note: this field does not have a specified maximum length)
 */
class Tag58StrTextTest {
    @Test
    void FIX0058Test() {
        FIX27 fixData = FIX27.FIX58_STR_TEXT;
        assertEquals( "58", fixData.toFIXIDString());
        assertEquals( "TEXT", fixData.toFIXNameString());
        assertEquals( "Text", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0058Test() {
        Tag58StrText tagData;

        tagData = new Tag58StrText(new MyStringType("hello from main routine"));
        assertEquals( "hello from main routine", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag58StrText tagData;

        tagData = new Tag58StrText(new MyStringType(Tag58StrText.TESTB_STR_TEXT));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag58StrText tagData;

        tagData = new Tag58StrText(new MyStringType(Tag58StrText.TESTB_STR_TEXT));
        assertEquals( Tag58StrText.TESTB_STR_TEXT, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag58StrText tagData;

        tagData = new Tag58StrText(new MyStringType(Tag58StrText.TESTB_STR_TEXT));
        assertEquals( tagData.toFIXIDString() + "=" + Tag58StrText.TESTB_STR_TEXT,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag58StrText tagData;

        tagData = new Tag58StrText(new MyStringType(Tag58StrText.TESTB_STR_TEXT));
        assertEquals( Tag58StrText.TESTB_STR_TEXT,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag58StrText tagData;

        tagData = new Tag58StrText(new MyStringType(Tag58StrText.TESTA_STR_TEXT));
        assertEquals( "Tag58StrText\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag58StrText.TESTA_STR_TEXT + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag58StrText.TESTA_STR_TEXT + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}