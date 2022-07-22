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

import com.hwtsllc.fixengine2022.datatypes.MyLengthType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  356
 *  EncodedSubjectLen
 *  Length
 *  <p></p>
 *  Byte length of encoded (non-ASCII characters) EncodedSubject (357) field.
 */
class Tag356LenEncodedSubjectLenTest {
    @Test
    void PrintTest() {
        Tag356LenEncodedSubjectLen tagData;
        int oneElement;

        oneElement = Tag356LenEncodedSubjectLen.TESTA_LEN_ENCODED_SUBJECT_LEN;
        tagData = new Tag356LenEncodedSubjectLen( new MyLengthType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag356LenEncodedSubjectLen.TESTB_LEN_ENCODED_SUBJECT_LEN;
        tagData = new Tag356LenEncodedSubjectLen( new MyLengthType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTagTest() {
        Tag356LenEncodedSubjectLen tagData;
        int oneElement;

        oneElement = Tag356LenEncodedSubjectLen.TESTA_LEN_ENCODED_SUBJECT_LEN;
        tagData = new Tag356LenEncodedSubjectLen( new MyLengthType( oneElement ) );
        verifyAll( tagData, oneElement );

        oneElement = Tag356LenEncodedSubjectLen.TESTB_LEN_ENCODED_SUBJECT_LEN;
        tagData = new Tag356LenEncodedSubjectLen( new MyLengthType( oneElement ) );
        verifyAll( tagData, oneElement );
    }

    private void verifyAll( final Tag356LenEncodedSubjectLen tagData, final int oneElement ) {
        verifyFIXData( tagData );
        verifyDataValue( tagData, oneElement );
        verifyValuePairString( tagData, oneElement );
        verifyToString( tagData, oneElement );
        verifyVerboseString( tagData );
    }

    private void verifyFIXData( final Tag356LenEncodedSubjectLen tagData ) {
        assertEquals( "FIX356_LEN_ENCODED_SUBJECT_LEN", tagData.toEnumLabelString());
        assertEquals( "356", tagData.toEnumIDString());
        assertEquals( "ENCODED_SUBJECT_LEN", tagData.toEnumNameString());
        assertEquals( "EncodedSubjectLen", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    private void verifyDataValue( final Tag356LenEncodedSubjectLen tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }

    private void verifyValuePairString( final Tag356LenEncodedSubjectLen tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    private void verifyToString( final Tag356LenEncodedSubjectLen tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }

    private void verifyVerboseString( final Tag356LenEncodedSubjectLen tagData ) {
        assertEquals( "Tag356LenEncodedSubjectLen\n" +
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