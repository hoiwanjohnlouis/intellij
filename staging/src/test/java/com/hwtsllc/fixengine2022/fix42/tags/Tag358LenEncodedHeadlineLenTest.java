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
 *  358
 *  EncodedHeadlineLen
 *  Length
 *  <p>
 *  Byte length of encoded (non-ASCII characters) EncodedHeadline (359) field.
 */
class Tag358LenEncodedHeadlineLenTest {
    @Test
    void FIX0358Test() {
        FIX42 fixData = FIX42.FIX358_LEN_ENCODED_HEADLINE_LEN;
        assertEquals( "358", fixData.toFIXIDString());
        assertEquals( "ENCODED_HEADLINE_LEN", fixData.toFIXNameString());
        assertEquals( "EncodedHeadlineLen", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0358Test() {
        Tag358LenEncodedHeadlineLen tagData;
        int oneElement;

        oneElement = Tag358LenEncodedHeadlineLen.TESTA_LEN_ENCODED_HEADLINE_LEN;
        tagData = new Tag358LenEncodedHeadlineLen( new MyLengthType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );

        oneElement = Tag358LenEncodedHeadlineLen.TESTB_LEN_ENCODED_HEADLINE_LEN;
        tagData = new Tag358LenEncodedHeadlineLen( new MyLengthType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void PrintFIXTagTest() {
        Tag358LenEncodedHeadlineLen tagData;
        int oneElement;

        oneElement = Tag358LenEncodedHeadlineLen.TESTA_LEN_ENCODED_HEADLINE_LEN;
        tagData = new Tag358LenEncodedHeadlineLen( new MyLengthType( oneElement ) );
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag358LenEncodedHeadlineLen.TESTB_LEN_ENCODED_HEADLINE_LEN;
        tagData = new Tag358LenEncodedHeadlineLen( new MyLengthType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag358LenEncodedHeadlineLen tagData;
        int oneElement;

        oneElement = Tag358LenEncodedHeadlineLen.TESTB_LEN_ENCODED_HEADLINE_LEN;
        tagData = new Tag358LenEncodedHeadlineLen( new MyLengthType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag358LenEncodedHeadlineLen tagData;
        int oneElement;

        oneElement = Tag358LenEncodedHeadlineLen.TESTB_LEN_ENCODED_HEADLINE_LEN;
        tagData = new Tag358LenEncodedHeadlineLen( new MyLengthType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag358LenEncodedHeadlineLen tagData;
        int oneElement;

        oneElement = Tag358LenEncodedHeadlineLen.TESTB_LEN_ENCODED_HEADLINE_LEN;
        tagData = new Tag358LenEncodedHeadlineLen( new MyLengthType( oneElement ) );
        assertEquals( String.valueOf( oneElement ), tagData.toString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString() );
    }
    @Test
    void TagToVerboseStringTest() {
        Tag358LenEncodedHeadlineLen tagData;
        int oneElement;

        oneElement = Tag358LenEncodedHeadlineLen.TESTA_LEN_ENCODED_HEADLINE_LEN;
        tagData = new Tag358LenEncodedHeadlineLen( new MyLengthType( oneElement ) );
        assertEquals( "Tag358LenEncodedHeadlineLen\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString() );
    }
}