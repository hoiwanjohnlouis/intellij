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
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  3
 *  AdvRefID
 *  String
 *  Reference identifier used with CANCEL and REPLACE transaction types.
 *  (Prior to FIX 4.1 this field was of type int)
 */
class Tag3StrAdvRefIDTest {
    @Test
    void FIX0003Test() {
        FIX27 fixData = FIX27.FIX3_STR_ADV_REF_ID;
        assertEquals( "ADV_REF_ID", fixData.toFIXNameString());
        assertEquals( "3", fixData.toFIXIDString());
        assertEquals( "AdvRefID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void PrintFIXTagTest() {
        Tag3StrAdvRefID tagData;

        tagData = new Tag3StrAdvRefID(new MyStringType(Tag3StrAdvRefID.TESTB_STR_ADV_REF_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag3StrAdvRefID tagData;

        tagData = new Tag3StrAdvRefID(new MyStringType(Tag3StrAdvRefID.TESTB_STR_ADV_REF_ID));
        assertEquals( Tag3StrAdvRefID.TESTB_STR_ADV_REF_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag3StrAdvRefID tagData;

        tagData = new Tag3StrAdvRefID(new MyStringType(Tag3StrAdvRefID.TESTB_STR_ADV_REF_ID));
        assertEquals( tagData.toFIXIDString() + "=" + Tag3StrAdvRefID.TESTB_STR_ADV_REF_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag3StrAdvRefID tagData;

        tagData = new Tag3StrAdvRefID(new MyStringType(Tag3StrAdvRefID.TESTB_STR_ADV_REF_ID));
        assertEquals( Tag3StrAdvRefID.TESTB_STR_ADV_REF_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag3StrAdvRefID tagData;

        tagData = new Tag3StrAdvRefID(new MyStringType(Tag3StrAdvRefID.TESTA_STR_ADV_REF_ID));
        assertEquals( "Tag3StrAdvRefID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag3StrAdvRefID.TESTA_STR_ADV_REF_ID + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag3StrAdvRefID.TESTA_STR_ADV_REF_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}