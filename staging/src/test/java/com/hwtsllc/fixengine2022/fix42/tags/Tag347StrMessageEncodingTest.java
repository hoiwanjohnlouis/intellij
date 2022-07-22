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

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  347
 *  MessageEncoding
 *  String
 *  <p></p>
 *  Type of message encoding (non-ASCII (non-English) characters) used in a message’s "Encoded" fields.
 */
class Tag347StrMessageEncodingTest {
    @Test
    void PrintTest() {
        Tag347StrMessageEncoding tagData;
        String oneElement;

        oneElement = Tag347StrMessageEncoding.TESTA_STR_MESSAGE_ENCODING;
        tagData = new Tag347StrMessageEncoding( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag347StrMessageEncoding.TESTB_STR_MESSAGE_ENCODING;
        tagData = new Tag347StrMessageEncoding( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag347StrMessageEncoding tagData;
        String oneElement;

        oneElement = Tag347StrMessageEncoding.TESTA_STR_MESSAGE_ENCODING;
        tagData = new Tag347StrMessageEncoding( new MyStringType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag347StrMessageEncoding.TESTB_STR_MESSAGE_ENCODING;
        tagData = new Tag347StrMessageEncoding( new MyStringType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag347StrMessageEncoding tagData, final String oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag347StrMessageEncoding tagData ) {
        assertEquals( "FIX347_STR_MESSAGE_ENCODING", tagData.toEnumLabelString());
        assertEquals( "347", tagData.toEnumIDString());
        assertEquals( "MESSAGE_ENCODING", tagData.toEnumNameString());
        assertEquals( "MessageEncoding", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag347StrMessageEncoding tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    private void verifyValuePairString( final Tag347StrMessageEncoding tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag347StrMessageEncoding tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag347StrMessageEncoding tagData ) {
        assertEquals( "Tag347StrMessageEncoding\n" +
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