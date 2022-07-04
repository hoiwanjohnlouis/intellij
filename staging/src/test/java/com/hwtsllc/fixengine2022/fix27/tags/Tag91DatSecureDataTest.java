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
 *  91
 *  SecureData
 *  data
 *  <p>
 *  Actual encrypted data stream
 */
class Tag91DatSecureDataTest {
    @Test
    void FIX0091Test() {
        FIX27 fixData = FIX27.FIX91_DAT_SECURE_DATA;
        assertEquals( "SECURE_DATA", fixData.toEnumNameString());
        assertEquals( "91", fixData.toEnumIDString());
        assertEquals( "SecureData", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0091Test() {
        Tag91DatSecureData tagData;

        tagData = new Tag91DatSecureData(new MyDataType("Gollum-91StSecureData") );
        assertEquals( "Gollum-91StSecureData", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag91DatSecureData tagData;

        tagData = new Tag91DatSecureData(new MyDataType(Tag91DatSecureData.TESTB_DAT_SECURE_DATA));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag91DatSecureData tagData;

        tagData = new Tag91DatSecureData(new MyDataType(Tag91DatSecureData.TESTB_DAT_SECURE_DATA));
        assertEquals( Tag91DatSecureData.TESTB_DAT_SECURE_DATA, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag91DatSecureData tagData;

        tagData = new Tag91DatSecureData(new MyDataType(Tag91DatSecureData.TESTB_DAT_SECURE_DATA));
        assertEquals( tagData.toEnumIDString() + "=" + Tag91DatSecureData.TESTB_DAT_SECURE_DATA,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag91DatSecureData tagData;

        tagData = new Tag91DatSecureData(new MyDataType(Tag91DatSecureData.TESTB_DAT_SECURE_DATA));
        assertEquals( Tag91DatSecureData.TESTB_DAT_SECURE_DATA,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag91DatSecureData tagData;

        tagData = new Tag91DatSecureData(new MyDataType(Tag91DatSecureData.TESTA_DAT_SECURE_DATA));
        assertEquals( "Tag91DatSecureData\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag91DatSecureData.TESTA_DAT_SECURE_DATA + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag91DatSecureData.TESTA_DAT_SECURE_DATA + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}