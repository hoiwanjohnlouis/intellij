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
 *  93
 *  SignatureLength
 *  Length
 *  <p>
 *  Number of bytes in signature field.
 */
class Tag93LenSignatureLengthTest {
    @Test
    void FIX0093Test() {
        FIX27 fixData = FIX27.FIX93_LEN_SIGNATURE_LENGTH;
        assertEquals( "SIGNATURE_LENGTH", fixData.toEnumNameString());
        assertEquals( "93", fixData.toEnumIDString());
        assertEquals( "SignatureLength", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0093Test() {
        int dataLength;
        Tag93LenSignatureLength tagData;

        dataLength = "BarleymanButterBurr-89Signature".length();
        tagData = new Tag93LenSignatureLength(new MyLengthType(dataLength) );
        assertEquals( dataLength, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag93LenSignatureLength tagData;

        tagData = new Tag93LenSignatureLength(new MyLengthType(Tag93LenSignatureLength.TESTB_LEN_SIGNATURE_LENGTH));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag93LenSignatureLength tagData;

        tagData = new Tag93LenSignatureLength(new MyLengthType(Tag93LenSignatureLength.TESTB_LEN_SIGNATURE_LENGTH));
        assertEquals( Tag93LenSignatureLength.TESTB_LEN_SIGNATURE_LENGTH, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag93LenSignatureLength tagData;

        tagData = new Tag93LenSignatureLength(new MyLengthType(Tag93LenSignatureLength.TESTB_LEN_SIGNATURE_LENGTH));
        assertEquals( tagData.toEnumIDString() + "=" + Tag93LenSignatureLength.TESTB_LEN_SIGNATURE_LENGTH,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag93LenSignatureLength tagData;

        tagData = new Tag93LenSignatureLength(new MyLengthType(Tag93LenSignatureLength.TESTB_LEN_SIGNATURE_LENGTH));
        assertEquals( String.valueOf(Tag93LenSignatureLength.TESTB_LEN_SIGNATURE_LENGTH),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag93LenSignatureLength tagData;

        tagData = new Tag93LenSignatureLength(new MyLengthType(Tag93LenSignatureLength.TESTA_LEN_SIGNATURE_LENGTH));
        assertEquals( "Tag93LenSignatureLength\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag93LenSignatureLength.TESTA_LEN_SIGNATURE_LENGTH + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag93LenSignatureLength.TESTA_LEN_SIGNATURE_LENGTH + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}