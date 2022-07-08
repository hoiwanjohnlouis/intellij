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

import com.hwtsllc.fixengine2022.datatypes.MyLengthType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  93
 *  SignatureLength
 *  Length
 *  <p></p>
 *  Number of bytes in signature field.
 */
class Tag93LenSignatureLengthTest {
    @Test
    void PrintFIXTagTest() {
        Tag93LenSignatureLength tagData;
        int oneElement;

        oneElement = Tag93LenSignatureLength.TESTA_LEN_SIGNATURE_LENGTH;
        tagData = new Tag93LenSignatureLength(new MyLengthType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag93LenSignatureLength.TESTB_LEN_SIGNATURE_LENGTH;
        tagData = new Tag93LenSignatureLength(new MyLengthType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag93LenSignatureLength tagData;
        int oneElement;

        oneElement = Tag93LenSignatureLength.TESTA_LEN_SIGNATURE_LENGTH;
        tagData = new Tag93LenSignatureLength(new MyLengthType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag93LenSignatureLength.TESTB_LEN_SIGNATURE_LENGTH;
        tagData = new Tag93LenSignatureLength(new MyLengthType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag93LenSignatureLength tagData ) {
        assertEquals( "FIX93_LEN_SIGNATURE_LENGTH", tagData.toEnumLabelString());
        assertEquals( "SIGNATURE_LENGTH", tagData.toEnumNameString());
        assertEquals( "93", tagData.toEnumIDString());
        assertEquals( "SignatureLength", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag93LenSignatureLength tagData;
        int oneElement;

        oneElement = Tag93LenSignatureLength.TESTA_LEN_SIGNATURE_LENGTH;
        tagData = new Tag93LenSignatureLength(new MyLengthType( oneElement ));
        VerifyDataValue( tagData, oneElement );

        oneElement = Tag93LenSignatureLength.TESTB_LEN_SIGNATURE_LENGTH;
        tagData = new Tag93LenSignatureLength(new MyLengthType( oneElement ));
        VerifyDataValue( tagData, oneElement );

        oneElement = "BarleymanButterBurr-Tag93LenSignatureLength".length();
        tagData = new Tag93LenSignatureLength(new MyLengthType(oneElement) );
        VerifyDataValue( tagData, oneElement );
    }

    private void VerifyDataValue( final Tag93LenSignatureLength tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag93LenSignatureLength tagData;
        int oneElement;

        oneElement = Tag93LenSignatureLength.TESTA_LEN_SIGNATURE_LENGTH;
        tagData = new Tag93LenSignatureLength(new MyLengthType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag93LenSignatureLength.TESTB_LEN_SIGNATURE_LENGTH;
        tagData = new Tag93LenSignatureLength(new MyLengthType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag93LenSignatureLength tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag93LenSignatureLength tagData;
        int oneElement;

        oneElement = Tag93LenSignatureLength.TESTA_LEN_SIGNATURE_LENGTH;
        tagData = new Tag93LenSignatureLength(new MyLengthType( oneElement ));
        VerifyToString( tagData, oneElement );

        oneElement = Tag93LenSignatureLength.TESTB_LEN_SIGNATURE_LENGTH;
        tagData = new Tag93LenSignatureLength(new MyLengthType( oneElement ));
        VerifyToString( tagData, oneElement );
    }

    private void VerifyToString( final Tag93LenSignatureLength tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag93LenSignatureLength tagData;
        int oneElement;

        oneElement = Tag93LenSignatureLength.TESTA_LEN_SIGNATURE_LENGTH;
        tagData = new Tag93LenSignatureLength(new MyLengthType( oneElement ));
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag93LenSignatureLength.TESTB_LEN_SIGNATURE_LENGTH;
        tagData = new Tag93LenSignatureLength(new MyLengthType( oneElement ));
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag93LenSignatureLength tagData, final int oneElement ) {
        assertEquals( "Tag93LenSignatureLength\n" +
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