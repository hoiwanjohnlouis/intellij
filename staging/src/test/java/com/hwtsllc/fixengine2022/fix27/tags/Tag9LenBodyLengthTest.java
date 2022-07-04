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
 *  9
 *  BodyLength
 *  Length
 *  Message length, in bytes, forward to the CheckSum field.
 *  ALWAYS SECOND FIELD IN MESSAGE.
 *  (Always unencrypted)
 */
class Tag9LenBodyLengthTest {
    @Test
    void FIX0009Test() {
        FIX27 fixData = FIX27.FIX9_LEN_BODY_LENGTH;
        assertEquals( "BODY_LENGTH", fixData.toEnumNameString());
        assertEquals( "9", fixData.toEnumIDString());
        assertEquals( "BodyLength", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void PrintFIXTagTest() {
        Tag9LenBodyLength tagData;

        tagData = new Tag9LenBodyLength(new MyLengthType(Tag9LenBodyLength.TESTB_LEN_BODY_LENGTH));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag9LenBodyLength tagData;

        tagData = new Tag9LenBodyLength(new MyLengthType(Tag9LenBodyLength.TESTB_LEN_BODY_LENGTH));
        assertEquals( Tag9LenBodyLength.TESTB_LEN_BODY_LENGTH, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_LEN_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag9LenBodyLength tagData;

        tagData = new Tag9LenBodyLength(new MyLengthType(Tag9LenBodyLength.TESTB_LEN_BODY_LENGTH));
        assertEquals( tagData.toEnumIDString() + "=" + Tag9LenBodyLength.TESTB_LEN_BODY_LENGTH,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag9LenBodyLength tagData;

        tagData = new Tag9LenBodyLength(new MyLengthType(Tag9LenBodyLength.TESTB_LEN_BODY_LENGTH));
        assertEquals( String.valueOf(Tag9LenBodyLength.TESTB_LEN_BODY_LENGTH),
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag9LenBodyLength tagData;

        tagData = new Tag9LenBodyLength(new MyLengthType(Tag9LenBodyLength.TESTA_LEN_BODY_LENGTH));
        assertEquals( "Tag9LenBodyLength\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag9LenBodyLength.TESTA_LEN_BODY_LENGTH + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag9LenBodyLength.TESTA_LEN_BODY_LENGTH + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}