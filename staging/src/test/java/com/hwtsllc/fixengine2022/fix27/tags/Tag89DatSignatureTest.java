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
 *  89
 *  Signature
 *  data
 *  <p>
 *  Electronic signature
 */
class Tag89DatSignatureTest {
    @Test
    void FIX0089Test() {
        FIX27 fixData = FIX27.FIX89_DAT_SIGNATURE;
        assertEquals( "SIGNATURE", fixData.toEnumNameString());
        assertEquals( "89", fixData.toEnumIDString());
        assertEquals( "Signature", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0089Test() {
        Tag89DatSignature tagData;

        tagData = new Tag89DatSignature(new MyDataType("BarleymanButterBurr-89StSignature") );
        assertEquals( "BarleymanButterBurr-89StSignature", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag89DatSignature tagData;

        tagData = new Tag89DatSignature(new MyDataType(Tag89DatSignature.TESTB_DAT_SIGNATURE));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag89DatSignature tagData;

        tagData = new Tag89DatSignature(new MyDataType(Tag89DatSignature.TESTB_DAT_SIGNATURE));
        assertEquals( Tag89DatSignature.TESTB_DAT_SIGNATURE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag89DatSignature tagData;

        tagData = new Tag89DatSignature(new MyDataType(Tag89DatSignature.TESTB_DAT_SIGNATURE));
        assertEquals( tagData.toEnumIDString() + "=" + Tag89DatSignature.TESTB_DAT_SIGNATURE,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag89DatSignature tagData;

        tagData = new Tag89DatSignature(new MyDataType(Tag89DatSignature.TESTB_DAT_SIGNATURE));
        assertEquals( Tag89DatSignature.TESTB_DAT_SIGNATURE,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag89DatSignature tagData;

        tagData = new Tag89DatSignature(new MyDataType(Tag89DatSignature.TESTA_DAT_SIGNATURE));
        assertEquals( "Tag89DatSignature\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag89DatSignature.TESTA_DAT_SIGNATURE + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag89DatSignature.TESTA_DAT_SIGNATURE + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}