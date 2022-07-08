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
 *  90
 *  SecureDataLen
 *  Length
 *  <p></p>
 *  Length of encrypted message
 */
class Tag90LenSecureDataLenTest {
    @Test
    void PrintFIXTagTest() {
        Tag90LenSecureDataLen tagData;
        int oneElement;

        oneElement = Tag90LenSecureDataLen.TESTA_LEN_SECURE_DATA_LEN;
        tagData = new Tag90LenSecureDataLen(new MyLengthType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag90LenSecureDataLen.TESTB_LEN_SECURE_DATA_LEN;
        tagData = new Tag90LenSecureDataLen(new MyLengthType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag90LenSecureDataLen tagData;
        int oneElement;

        oneElement = Tag90LenSecureDataLen.TESTA_LEN_SECURE_DATA_LEN;
        tagData = new Tag90LenSecureDataLen(new MyLengthType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag90LenSecureDataLen.TESTB_LEN_SECURE_DATA_LEN;
        tagData = new Tag90LenSecureDataLen(new MyLengthType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag90LenSecureDataLen tagData ) {
        assertEquals( "FIX90_LEN_SECURE_DATA_LEN", tagData.toEnumLabelString());
        assertEquals( "SECURE_DATA_LEN", tagData.toEnumNameString());
        assertEquals( "90", tagData.toEnumIDString());
        assertEquals( "SecureDataLen", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag90LenSecureDataLen tagData;
        int oneElement;

        oneElement = Tag90LenSecureDataLen.TESTA_LEN_SECURE_DATA_LEN;
        tagData = new Tag90LenSecureDataLen(new MyLengthType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag90LenSecureDataLen.TESTB_LEN_SECURE_DATA_LEN;
        tagData = new Tag90LenSecureDataLen(new MyLengthType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = "MeriadocBrandybuck-90LtSecureData".length();
        tagData = new Tag90LenSecureDataLen(new MyLengthType(oneElement) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag90LenSecureDataLen tagData, final int oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag90LenSecureDataLen tagData;
        int oneElement;

        oneElement = Tag90LenSecureDataLen.TESTA_LEN_SECURE_DATA_LEN;
        tagData = new Tag90LenSecureDataLen(new MyLengthType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag90LenSecureDataLen.TESTB_LEN_SECURE_DATA_LEN;
        tagData = new Tag90LenSecureDataLen(new MyLengthType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag90LenSecureDataLen tagData, final int oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag90LenSecureDataLen tagData;
        int oneElement;

        oneElement = Tag90LenSecureDataLen.TESTA_LEN_SECURE_DATA_LEN;
        tagData = new Tag90LenSecureDataLen(new MyLengthType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag90LenSecureDataLen.TESTB_LEN_SECURE_DATA_LEN;
        tagData = new Tag90LenSecureDataLen(new MyLengthType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag90LenSecureDataLen tagData, final int oneElement ) {
        assertEquals( String.valueOf( oneElement ), tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag90LenSecureDataLen tagData;
        int oneElement;

        oneElement = Tag90LenSecureDataLen.TESTA_LEN_SECURE_DATA_LEN;
        tagData = new Tag90LenSecureDataLen(new MyLengthType( oneElement ));
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag90LenSecureDataLen.TESTB_LEN_SECURE_DATA_LEN;
        tagData = new Tag90LenSecureDataLen(new MyLengthType( oneElement ));
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag90LenSecureDataLen tagData, final int oneElement ) {
        assertEquals( "Tag90LenSecureDataLen\n" +
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