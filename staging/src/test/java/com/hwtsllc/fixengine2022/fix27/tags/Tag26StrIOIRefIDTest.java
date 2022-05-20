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
 *  26
 *  IOIRefID
 *  String
 *  Reference identifier used with CANCEL and REPLACE, transaction types.
 *  (Prior to FIX 4.1 this field was of type int)
 */
class Tag26StrIOIRefIDTest {
    @Test
    void FIX0026Test() {
        FIX27 fixData = FIX27.FIX26_STR_IOI_REF_ID;
        assertEquals( "IOI_REF_ID", fixData.toFIXNameString());
        assertEquals( "26", fixData.toFIXIDString());
        assertEquals( "IOIRefID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0026Test() {
        Tag26StrIOIRefID tagData;

        tagData = new Tag26StrIOIRefID(new MyStringType("A") );
        assertEquals( "A", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag26StrIOIRefID tagData;

        tagData = new Tag26StrIOIRefID(new MyStringType(Tag26StrIOIRefID.TESTB_STR_IOI_REF_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag26StrIOIRefID tagData;

        tagData = new Tag26StrIOIRefID(new MyStringType(Tag26StrIOIRefID.TESTB_STR_IOI_REF_ID));
        assertEquals( Tag26StrIOIRefID.TESTB_STR_IOI_REF_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag26StrIOIRefID tagData;

        tagData = new Tag26StrIOIRefID(new MyStringType(Tag26StrIOIRefID.TESTB_STR_IOI_REF_ID));
        assertEquals( tagData.toFIXIDString() + "=" + Tag26StrIOIRefID.TESTB_STR_IOI_REF_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag26StrIOIRefID tagData;

        tagData = new Tag26StrIOIRefID(new MyStringType(Tag26StrIOIRefID.TESTB_STR_IOI_REF_ID));
        assertEquals( Tag26StrIOIRefID.TESTB_STR_IOI_REF_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag26StrIOIRefID tagData;

        tagData = new Tag26StrIOIRefID(new MyStringType(Tag26StrIOIRefID.TESTA_STR_IOI_REF_ID));
        assertEquals( "Tag26StrIOIRefID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag26StrIOIRefID.TESTA_STR_IOI_REF_ID + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag26StrIOIRefID.TESTA_STR_IOI_REF_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}