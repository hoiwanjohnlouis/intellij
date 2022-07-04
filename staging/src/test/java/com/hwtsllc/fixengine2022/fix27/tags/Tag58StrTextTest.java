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
 *  <p></p>
 *  Free format text string
 *  <p></p>
 *  (Note: this field does not have a specified maximum length)
 */
class Tag58StrTextTest {
    @Test
    void FIX0058Test() {
        FIX27 fixData = FIX27.FIX58_STR_TEXT;
        assertEquals( "58", fixData.toEnumIDString());
        assertEquals( "TEXT", fixData.toEnumNameString());
        assertEquals( "Text", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0058Test() {
        Tag58StrText tagData;
        String oneElement;

        oneElement = "hello from main routine";
        tagData = new Tag58StrText(new MyStringType( oneElement ));
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag58StrText.TESTA_STR_TEXT;
        tagData = new Tag58StrText(new MyStringType( oneElement ));
        verifyTagInformation( tagData, oneElement );

        oneElement = Tag58StrText.TESTB_STR_TEXT;
        tagData = new Tag58StrText(new MyStringType( oneElement ));
        verifyTagInformation( tagData, oneElement );
    }

    private void verifyTagInformation( Tag58StrText tagData, String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "58", tagData.toEnumIDString());
        assertEquals( "TEXT", tagData.toEnumNameString());
        assertEquals( "Text", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void PrintFIXTagTest() {
        Tag58StrText tagData;
        String oneElement;

        oneElement = Tag58StrText.TESTA_STR_TEXT;
        tagData = new Tag58StrText(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag58StrText.TESTB_STR_TEXT;
        tagData = new Tag58StrText(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag58StrText tagData;
        String oneElement;

        oneElement = Tag58StrText.TESTB_STR_TEXT;
        tagData = new Tag58StrText(new MyStringType( oneElement ));
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag58StrText tagData;
        String oneElement;

        oneElement = Tag58StrText.TESTB_STR_TEXT;
        tagData = new Tag58StrText(new MyStringType( oneElement ));
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag58StrText tagData;
        String oneElement;

        oneElement = Tag58StrText.TESTB_STR_TEXT;
        tagData = new Tag58StrText(new MyStringType( oneElement ));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag58StrText tagData;
        String oneElement;

        oneElement = Tag58StrText.TESTA_STR_TEXT;
        tagData = new Tag58StrText(new MyStringType( oneElement ));
        assertEquals( "Tag58StrText\n" +
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