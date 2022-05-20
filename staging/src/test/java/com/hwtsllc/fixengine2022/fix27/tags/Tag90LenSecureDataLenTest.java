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
import com.hwtsllc.fixengine2022.datatypes.MyLengthType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  90
 *  SecureDataLen
 *  Length
 *  <p>
 *  Length of encrypted message
 */
class Tag90LenSecureDataLenTest {
    @Test
    void FIX0090Test() {
        FIX27 fixData = FIX27.FIX90_LEN_SECURE_DATA_LEN;
        assertEquals( "SECURE_DATA_LEN", fixData.toFIXNameString());
        assertEquals( "90", fixData.toFIXIDString());
        assertEquals( "SecureDataLen", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0090Test() {
        int dataLength;
        Tag90LenSecureDataLen tagData;

        dataLength = "MeriadocBrandybuck-90LtSecureData".length();
        tagData = new Tag90LenSecureDataLen(new MyLengthType(dataLength) );
        assertEquals( dataLength, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag90LenSecureDataLen tagData;

        tagData = new Tag90LenSecureDataLen(new MyLengthType(Tag90LenSecureDataLen.TESTB_LEN_SECURE_DATA_LEN));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag90LenSecureDataLen tagData;

        tagData = new Tag90LenSecureDataLen(new MyLengthType(Tag90LenSecureDataLen.TESTB_LEN_SECURE_DATA_LEN));
        assertEquals( Tag90LenSecureDataLen.TESTB_LEN_SECURE_DATA_LEN, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag90LenSecureDataLen tagData;

        tagData = new Tag90LenSecureDataLen(new MyLengthType(Tag90LenSecureDataLen.TESTB_LEN_SECURE_DATA_LEN));
        assertEquals( tagData.toFIXIDString() + "=" + Tag90LenSecureDataLen.TESTB_LEN_SECURE_DATA_LEN,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag90LenSecureDataLen tagData;

        tagData = new Tag90LenSecureDataLen(new MyLengthType(Tag90LenSecureDataLen.TESTB_LEN_SECURE_DATA_LEN));
        assertEquals( String.valueOf(Tag90LenSecureDataLen.TESTB_LEN_SECURE_DATA_LEN),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag90LenSecureDataLen tagData;

        tagData = new Tag90LenSecureDataLen(new MyLengthType(Tag90LenSecureDataLen.TESTA_LEN_SECURE_DATA_LEN));
        assertEquals( "Tag90LenSecureDataLen\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag90LenSecureDataLen.TESTA_LEN_SECURE_DATA_LEN + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag90LenSecureDataLen.TESTA_LEN_SECURE_DATA_LEN + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}