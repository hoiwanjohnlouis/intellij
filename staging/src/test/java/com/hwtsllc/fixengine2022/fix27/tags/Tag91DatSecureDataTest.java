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

import com.hwtsllc.fixengine2022.datatypes.MyDataType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  91
 *  SecureData
 *  data
 *  <p></p>
 *  Actual encrypted data stream
 */
class Tag91DatSecureDataTest {
    @Test
    void PrintFIXTagTest() {
        Tag91DatSecureData tagData;
        String oneElement;

        oneElement = Tag91DatSecureData.TESTA_DAT_SECURE_DATA;
        tagData = new Tag91DatSecureData(new MyDataType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag91DatSecureData.TESTB_DAT_SECURE_DATA;
        tagData = new Tag91DatSecureData(new MyDataType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag91DatSecureData tagData;
        String oneElement;

        oneElement = Tag91DatSecureData.TESTA_DAT_SECURE_DATA;
        tagData = new Tag91DatSecureData(new MyDataType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag91DatSecureData.TESTB_DAT_SECURE_DATA;
        tagData = new Tag91DatSecureData(new MyDataType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag91DatSecureData tagData ) {
        assertEquals( "FIX91_DAT_SECURE_DATA", tagData.toEnumLabelString());
        assertEquals( "SECURE_DATA", tagData.toEnumNameString());
        assertEquals( "91", tagData.toEnumIDString());
        assertEquals( "SecureData", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag91DatSecureData tagData;
        String oneElement;

        oneElement = Tag91DatSecureData.TESTA_DAT_SECURE_DATA;
        tagData = new Tag91DatSecureData(new MyDataType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag91DatSecureData.TESTB_DAT_SECURE_DATA;
        tagData = new Tag91DatSecureData(new MyDataType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = "Gollum-Tag91DatSecureData";
        tagData = new Tag91DatSecureData(new MyDataType( oneElement ) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag91DatSecureData tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_DAT_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag91DatSecureData tagData;
        String oneElement;

        oneElement = Tag91DatSecureData.TESTA_DAT_SECURE_DATA;
        tagData = new Tag91DatSecureData(new MyDataType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag91DatSecureData.TESTB_DAT_SECURE_DATA;
        tagData = new Tag91DatSecureData(new MyDataType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag91DatSecureData tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag91DatSecureData tagData;
        String oneElement;

        oneElement = Tag91DatSecureData.TESTA_DAT_SECURE_DATA;
        tagData = new Tag91DatSecureData(new MyDataType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag91DatSecureData.TESTB_DAT_SECURE_DATA;
        tagData = new Tag91DatSecureData(new MyDataType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag91DatSecureData tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag91DatSecureData tagData;
        String oneElement;

        oneElement = Tag91DatSecureData.TESTA_DAT_SECURE_DATA;
        tagData = new Tag91DatSecureData(new MyDataType( oneElement ));
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag91DatSecureData.TESTB_DAT_SECURE_DATA;
        tagData = new Tag91DatSecureData(new MyDataType( oneElement ));
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag91DatSecureData tagData, final String oneElement ) {
        assertEquals( "Tag91DatSecureData\n" +
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