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
 *  446
 *  EncodedListStatusText
 *  data
 *  <p>
 *  Encoded (non-ASCII characters) representation of the ListStatusText (444) field
 *  in the encoded format specified via the MessageEncoding (347) field.
 *  <p></p>
 *  If used, the ASCII (English) representation should also be specified in the ListStatusText field.
 */
class Tag446DatEncodedListStatusTextTest {
    @Test
    void FIX0446Test() {
        FIX42 fixData = FIX42.FIX446_DAT_LIST_STATUS_ENCODED_TEXT;
        assertEquals( "446", fixData.toEnumIDString());
        assertEquals( "LIST_STATUS_ENCODED_TEXT", fixData.toEnumNameString());
        assertEquals( "ListStatusEncodedText", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0446Test() {
        Tag446DatEncodedListStatusText tagData;
        String oneElement;

        oneElement = Tag446DatEncodedListStatusText.TESTA_DAT_LIST_STATUS_ENCODED_TEXT;
        tagData = new Tag446DatEncodedListStatusText( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_DAT_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag446DatEncodedListStatusText.TESTB_DAT_LIST_STATUS_ENCODED_TEXT;
        tagData = new Tag446DatEncodedListStatusText( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_DAT_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag446DatEncodedListStatusText tagData;
        String oneElement;

        oneElement = Tag446DatEncodedListStatusText.TESTB_DAT_LIST_STATUS_ENCODED_TEXT;
        tagData = new Tag446DatEncodedListStatusText( new MyDataType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag446DatEncodedListStatusText tagData;
        String oneElement;

        oneElement = Tag446DatEncodedListStatusText.TESTB_DAT_LIST_STATUS_ENCODED_TEXT;
        tagData = new Tag446DatEncodedListStatusText( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag446DatEncodedListStatusText tagData;
        String oneElement;

        oneElement = Tag446DatEncodedListStatusText.TESTB_DAT_LIST_STATUS_ENCODED_TEXT;
        tagData = new Tag446DatEncodedListStatusText( new MyDataType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag446DatEncodedListStatusText tagData;
        String oneElement;

        oneElement = Tag446DatEncodedListStatusText.TESTB_DAT_LIST_STATUS_ENCODED_TEXT;
        tagData = new Tag446DatEncodedListStatusText( new MyDataType( oneElement ) );
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag446DatEncodedListStatusText tagData;
        String oneElement;

        oneElement = Tag446DatEncodedListStatusText.TESTA_DAT_LIST_STATUS_ENCODED_TEXT;
        tagData = new Tag446DatEncodedListStatusText( new MyDataType( oneElement ) );
        assertEquals( "Tag446DatEncodedListStatusText\n" +
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
