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
import com.hwtsllc.fixengine2022.datatypes.MyDataType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  96
 *  RawData
 *  data
 *  <p>
 *  Unformatted raw data, can include bitmaps, word processor documents, etc.
 */
class Tag96DatRawDataTest {
    @Test
    void FIX0096Test() {
        FIX27 fixData = FIX27.FIX96_DAT_RAW_DATA;
        assertEquals( "RAW_DATA", fixData.toEnumNameString());
        assertEquals( "96", fixData.toEnumIDString());
        assertEquals( "RawData", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0096Test() {
        Tag96DatRawData tagData;

        tagData = new Tag96DatRawData(new MyDataType("FrodoBaggins-96StRawData") );
        assertEquals( "FrodoBaggins-96StRawData", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag96DatRawData tagData;

        tagData = new Tag96DatRawData(new MyDataType(Tag96DatRawData.TESTB_DAT_RAW_DATA));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag96DatRawData tagData;

        tagData = new Tag96DatRawData(new MyDataType(Tag96DatRawData.TESTB_DAT_RAW_DATA));
        assertEquals( Tag96DatRawData.TESTB_DAT_RAW_DATA, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag96DatRawData tagData;

        tagData = new Tag96DatRawData(new MyDataType(Tag96DatRawData.TESTB_DAT_RAW_DATA));
        assertEquals( tagData.toEnumIDString() + "=" + Tag96DatRawData.TESTB_DAT_RAW_DATA,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag96DatRawData tagData;

        tagData = new Tag96DatRawData(new MyDataType(Tag96DatRawData.TESTB_DAT_RAW_DATA));
        assertEquals( Tag96DatRawData.TESTB_DAT_RAW_DATA,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag96DatRawData tagData;

        tagData = new Tag96DatRawData(new MyDataType(Tag96DatRawData.TESTA_DAT_RAW_DATA));
        assertEquals( "Tag96DatRawData\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag96DatRawData.TESTA_DAT_RAW_DATA + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag96DatRawData.TESTA_DAT_RAW_DATA + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}