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

import com.hwtsllc.fixengine2022.datatypes.MyDataType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  361
 *  EncodedAllocText
 *  data
 *  <p></p>
 *  Encoded (non-ASCII characters) representation of the AllocText (161) field
 *  in the encoded format specified via the MessageEncoding (347) field.
 *  <p></p>
 *  If used, the ASCII (English) representation should also be specified in the AllocText field.
 */
class Tag361DatEncodedAllocTextTest {
    @Test
    void PrintTest() {
        Tag361DatEncodedAllocText tagData;
        String oneElement;

        oneElement = Tag361DatEncodedAllocText.TESTA_DAT_ENCODED_ALLOC_TEXT;
        tagData = new Tag361DatEncodedAllocText( new MyDataType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag361DatEncodedAllocText.TESTB_DAT_ENCODED_ALLOC_TEXT;
        tagData = new Tag361DatEncodedAllocText( new MyDataType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag361DatEncodedAllocText tagData;
        String oneElement;

        oneElement = Tag361DatEncodedAllocText.TESTA_DAT_ENCODED_ALLOC_TEXT;
        tagData = new Tag361DatEncodedAllocText( new MyDataType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag361DatEncodedAllocText.TESTB_DAT_ENCODED_ALLOC_TEXT;
        tagData = new Tag361DatEncodedAllocText( new MyDataType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag361DatEncodedAllocText tagData, final String oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag361DatEncodedAllocText tagData ) {
        assertEquals( "FIX361_DAT_ENCODED_ALLOC_TEXT", tagData.toEnumLabelString());
        assertEquals( "361", tagData.toEnumIDString());
        assertEquals( "ENCODED_ALLOC_TEXT", tagData.toEnumNameString());
        assertEquals( "EncodedAllocText", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag361DatEncodedAllocText tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_DAT_DATA_VALUE, tagData.getDataValue() );
    }

    private void verifyValuePairString( final Tag361DatEncodedAllocText tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag361DatEncodedAllocText tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    private void verifyVerboseString( final Tag361DatEncodedAllocText tagData ) {
        assertEquals( "Tag361DatEncodedAllocText\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}