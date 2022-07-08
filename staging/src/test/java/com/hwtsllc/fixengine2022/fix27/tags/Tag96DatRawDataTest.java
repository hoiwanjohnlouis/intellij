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
 *  96
 *  RawData
 *  data
 *  <p></p>
 *  Unformatted raw data, can include bitmaps, word processor documents, etc.
 */
class Tag96DatRawDataTest {
    @Test
    void PrintFIXTagTest() {
        Tag96DatRawData tagData;
        String oneElement;

        oneElement = Tag96DatRawData.TESTA_DAT_RAW_DATA;
        tagData = new Tag96DatRawData(new MyDataType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag96DatRawData.TESTB_DAT_RAW_DATA;
        tagData = new Tag96DatRawData(new MyDataType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag96DatRawData tagData;
        String oneElement;

        oneElement = Tag96DatRawData.TESTA_DAT_RAW_DATA;
        tagData = new Tag96DatRawData(new MyDataType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag96DatRawData.TESTB_DAT_RAW_DATA;
        tagData = new Tag96DatRawData(new MyDataType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag96DatRawData tagData ) {
        assertEquals( "FIX96_DAT_RAW_DATA", tagData.toEnumLabelString());
        assertEquals( "RAW_DATA", tagData.toEnumNameString());
        assertEquals( "96", tagData.toEnumIDString());
        assertEquals( "RawData", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag96DatRawData tagData;
        String oneElement;

        oneElement = Tag96DatRawData.TESTA_DAT_RAW_DATA;
        tagData = new Tag96DatRawData(new MyDataType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag96DatRawData.TESTB_DAT_RAW_DATA;
        tagData = new Tag96DatRawData(new MyDataType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = "SonYeJin-Tag96DatRawData";
        tagData = new Tag96DatRawData(new MyDataType( oneElement ) );
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag96DatRawData tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag96DatRawData tagData;
        String oneElement;

        oneElement = Tag96DatRawData.TESTA_DAT_RAW_DATA;
        tagData = new Tag96DatRawData(new MyDataType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag96DatRawData.TESTB_DAT_RAW_DATA;
        tagData = new Tag96DatRawData(new MyDataType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag96DatRawData tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag96DatRawData tagData;
        String oneElement;

        oneElement = Tag96DatRawData.TESTA_DAT_RAW_DATA;
        tagData = new Tag96DatRawData(new MyDataType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag96DatRawData.TESTB_DAT_RAW_DATA;
        tagData = new Tag96DatRawData(new MyDataType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag96DatRawData tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag96DatRawData tagData;
        String oneElement;

        oneElement = Tag96DatRawData.TESTA_DAT_RAW_DATA;
        tagData = new Tag96DatRawData(new MyDataType( oneElement ));
        verifyVerboseString( tagData, oneElement );

        oneElement = Tag96DatRawData.TESTB_DAT_RAW_DATA;
        tagData = new Tag96DatRawData(new MyDataType( oneElement ));
        verifyVerboseString( tagData, oneElement );
    }

    private void verifyVerboseString( final Tag96DatRawData tagData, final String oneElement ) {
        assertEquals( "Tag96DatRawData\n" +
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