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
import com.hwtsllc.fixengine2022.datatypes.MyLengthType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  356
 *  EncodedSubjectLen
 *  Length
 *  <p>
 *  Byte length of encoded (non-ASCII characters) EncodedSubject (357) field.
 */
class Tag356LenEncodedSubjectLenTest {
    @Test
    void FIX0356Test() {
        FIX42 fixData = FIX42.FIX356_LEN_ENCODED_SUBJECT_LEN;
        assertEquals( "356", fixData.toEnumIDString());
        assertEquals( "ENCODED_SUBJECT_LEN", fixData.toEnumNameString());
        assertEquals( "EncodedSubjectLen", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0356Test() {
        Tag356LenEncodedSubjectLen tagData;
        int oneElement;

        oneElement = Tag356LenEncodedSubjectLen.TESTA_LEN_ENCODED_SUBJECT_LEN;
        tagData = new Tag356LenEncodedSubjectLen( new MyLengthType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag356LenEncodedSubjectLen.TESTB_LEN_ENCODED_SUBJECT_LEN;
        tagData = new Tag356LenEncodedSubjectLen( new MyLengthType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
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
    void TagGetDataValueTest() {
        Tag356LenEncodedSubjectLen tagData;
        int oneElement;

        oneElement = Tag356LenEncodedSubjectLen.TESTB_LEN_ENCODED_SUBJECT_LEN;
        tagData = new Tag356LenEncodedSubjectLen( new MyLengthType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag356LenEncodedSubjectLen tagData;
        int oneElement;

        oneElement = Tag356LenEncodedSubjectLen.TESTB_LEN_ENCODED_SUBJECT_LEN;
        tagData = new Tag356LenEncodedSubjectLen( new MyLengthType( oneElement ) );
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag356LenEncodedSubjectLen tagData;
        int oneElement;

        oneElement = Tag356LenEncodedSubjectLen.TESTB_LEN_ENCODED_SUBJECT_LEN;
        tagData = new Tag356LenEncodedSubjectLen( new MyLengthType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag356LenEncodedSubjectLen tagData;
        int oneElement;

        oneElement = Tag356LenEncodedSubjectLen.TESTA_LEN_ENCODED_SUBJECT_LEN;
        tagData = new Tag356LenEncodedSubjectLen( new MyLengthType( oneElement ) );
        assertEquals( "Tag356LenEncodedSubjectLen\n" +
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