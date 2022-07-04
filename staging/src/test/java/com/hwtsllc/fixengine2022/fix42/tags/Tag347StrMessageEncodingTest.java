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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  347
 *  MessageEncoding
 *  String
 *  <p>
 *  Type of message encoding (non-ASCII (non-English) characters) used in a message’s "Encoded" fields.
 */
class Tag347StrMessageEncodingTest {
    @Test
    void FIX0347Test() {
        FIX42 fixData = FIX42.FIX347_STR_MESSAGE_ENCODING;
        assertEquals( "347", fixData.toEnumIDString());
        assertEquals( "MESSAGE_ENCODING", fixData.toEnumNameString());
        assertEquals( "MessageEncoding", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0347Test() {
        Tag347StrMessageEncoding tagData;
        String oneElement;

        oneElement = Tag347StrMessageEncoding.TESTA_STR_MESSAGE_ENCODING;
        tagData = new Tag347StrMessageEncoding(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag347StrMessageEncoding.TESTB_STR_MESSAGE_ENCODING;
        tagData = new Tag347StrMessageEncoding(new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag347StrMessageEncoding tagData;
        String oneElement;

        oneElement = Tag347StrMessageEncoding.TESTB_STR_MESSAGE_ENCODING;
        tagData = new Tag347StrMessageEncoding( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag347StrMessageEncoding tagData;
        String oneElement;

        oneElement = Tag347StrMessageEncoding.TESTB_STR_MESSAGE_ENCODING;
        tagData = new Tag347StrMessageEncoding( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag347StrMessageEncoding tagData;
        String oneElement;

        oneElement = Tag347StrMessageEncoding.TESTB_STR_MESSAGE_ENCODING;
        tagData = new Tag347StrMessageEncoding( new MyStringType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag347StrMessageEncoding tagData;
        String oneElement;

        oneElement = Tag347StrMessageEncoding.TESTB_STR_MESSAGE_ENCODING;
        tagData = new Tag347StrMessageEncoding( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag347StrMessageEncoding tagData;
        String oneElement;

        oneElement = Tag347StrMessageEncoding.TESTA_STR_MESSAGE_ENCODING;
        tagData = new Tag347StrMessageEncoding( new MyStringType( oneElement ) );
        assertEquals( "Tag347StrMessageEncoding\n" +
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