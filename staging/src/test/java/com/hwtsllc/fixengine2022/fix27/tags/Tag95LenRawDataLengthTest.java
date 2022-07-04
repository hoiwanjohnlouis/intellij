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
 *  95
 *  RawDataLength
 *  Length
 *  <p>
 *  Number of bytes in raw data field.
 */
class Tag95LenRawDataLengthTest {
    @Test
    void FIX0095Test() {
        FIX27 fixData = FIX27.FIX95_LEN_RAW_DATA_LENGTH;
        assertEquals( "RAW_DATA_LENGTH", fixData.toEnumNameString());
        assertEquals( "95", fixData.toEnumIDString());
        assertEquals( "RawDataLength", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0095Test() {
        int dataLength;
        Tag95LenRawDataLength tagData;

        dataLength = "FrodoBaggins-95RawData".length();
        tagData = new Tag95LenRawDataLength(new MyLengthType(dataLength) );
        assertEquals( dataLength, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag95LenRawDataLength tagData;

        tagData = new Tag95LenRawDataLength(new MyLengthType(Tag95LenRawDataLength.TESTB_LEN_RAW_DATA_LENGTH));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag95LenRawDataLength tagData;

        tagData = new Tag95LenRawDataLength(new MyLengthType(Tag95LenRawDataLength.TESTB_LEN_RAW_DATA_LENGTH));
        assertEquals( Tag95LenRawDataLength.TESTB_LEN_RAW_DATA_LENGTH, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag95LenRawDataLength tagData;

        tagData = new Tag95LenRawDataLength(new MyLengthType(Tag95LenRawDataLength.TESTB_LEN_RAW_DATA_LENGTH));
        assertEquals( tagData.toEnumIDString() + "=" + Tag95LenRawDataLength.TESTB_LEN_RAW_DATA_LENGTH,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag95LenRawDataLength tagData;

        tagData = new Tag95LenRawDataLength(new MyLengthType(Tag95LenRawDataLength.TESTB_LEN_RAW_DATA_LENGTH));
        assertEquals( String.valueOf(Tag95LenRawDataLength.TESTB_LEN_RAW_DATA_LENGTH),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag95LenRawDataLength tagData;

        tagData = new Tag95LenRawDataLength(new MyLengthType(Tag95LenRawDataLength.TESTA_LEN_RAW_DATA_LENGTH));
        assertEquals( "Tag95LenRawDataLength\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag95LenRawDataLength.TESTA_LEN_RAW_DATA_LENGTH + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag95LenRawDataLength.TESTA_LEN_RAW_DATA_LENGTH + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}