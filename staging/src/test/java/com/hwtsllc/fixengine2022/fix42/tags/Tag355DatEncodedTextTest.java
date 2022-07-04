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
import com.hwtsllc.fixengine2022.datatypes.MyDataType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  355
 *  EncodedText
 *  data
 *  <p>
 *  Encoded (non-ASCII characters) representation of the Text (58) field
 *  in the encoded format specified via the MessageEncoding (347) field.
 *  <p></p>
 *  If used, the ASCII (English) representation should also be specified in the Text field.
 */
class Tag355DatEncodedTextTest {
    @Test
    void FIX0355Test() {
        FIX42 fixData = FIX42.FIX355_DAT_ENCODED_TEXT;
        assertEquals( "355", fixData.toEnumIDString());
        assertEquals( "ENCODED_TEXT", fixData.toEnumNameString());
        assertEquals( "EncodedText", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0355Test() {
        Tag355DatEncodedText tagData;
        String oneElement;

        oneElement = Tag355DatEncodedText.TESTA_DAT_ENCODED_TEXT;
        tagData = new Tag355DatEncodedText( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_DAT_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag355DatEncodedText.TESTB_DAT_ENCODED_TEXT;
        tagData = new Tag355DatEncodedText( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_DAT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag355DatEncodedText tagData;
        String oneElement;

        oneElement = Tag355DatEncodedText.TESTA_DAT_ENCODED_TEXT;
        tagData = new Tag355DatEncodedText( new MyDataType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag355DatEncodedText.TESTB_DAT_ENCODED_TEXT;
        tagData = new Tag355DatEncodedText( new MyDataType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag355DatEncodedText tagData;
        String oneElement;

        oneElement = Tag355DatEncodedText.TESTB_DAT_ENCODED_TEXT;
        tagData = new Tag355DatEncodedText( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag355DatEncodedText tagData;
        String oneElement;

        oneElement = Tag355DatEncodedText.TESTB_DAT_ENCODED_TEXT;
        tagData = new Tag355DatEncodedText( new MyDataType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag355DatEncodedText tagData;
        String oneElement;

        oneElement = Tag355DatEncodedText.TESTB_DAT_ENCODED_TEXT;
        tagData = new Tag355DatEncodedText( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag355DatEncodedText tagData;
        String oneElement;

        oneElement = Tag355DatEncodedText.TESTA_DAT_ENCODED_TEXT;
        tagData = new Tag355DatEncodedText( new MyDataType( oneElement ) );
        assertEquals( "Tag355DatEncodedText\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}