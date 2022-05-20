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
 *  41
 *  OrigClOrdID
 *  String
 *  ClOrdID (11) of the previous order (NOT the initial order of the day)
 *  as assigned by the institution, used to identify the previous order in
 *  cancel and cancel/replace requests.
 */
class Tag41StrOrigClOrdIDTest {
    @Test
    void FIX0041Test() {
        FIX27 fixData = FIX27.FIX41_STR_ORIG_CL_ORD_ID;
        assertEquals( "ORIG_CL_ORD_ID", fixData.toFIXNameString());
        assertEquals( "41", fixData.toFIXIDString());
        assertEquals( "OrigClOrdID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0041Test() {
        Tag41StrOrigClOrdID tagData;

        tagData = new Tag41StrOrigClOrdID(new MyStringType("ORD-12345") );
        assertEquals( "ORD-12345", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag41StrOrigClOrdID tagData;

        tagData = new Tag41StrOrigClOrdID(new MyStringType(Tag41StrOrigClOrdID.TESTB_STR_ORIG_CL_ORD_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag41StrOrigClOrdID tagData;

        tagData = new Tag41StrOrigClOrdID(new MyStringType(Tag41StrOrigClOrdID.TESTB_STR_ORIG_CL_ORD_ID));
        assertEquals( Tag41StrOrigClOrdID.TESTB_STR_ORIG_CL_ORD_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag41StrOrigClOrdID tagData;

        tagData = new Tag41StrOrigClOrdID(new MyStringType(Tag41StrOrigClOrdID.TESTB_STR_ORIG_CL_ORD_ID));
        assertEquals( tagData.toFIXIDString() + "=" + Tag41StrOrigClOrdID.TESTB_STR_ORIG_CL_ORD_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag41StrOrigClOrdID tagData;

        tagData = new Tag41StrOrigClOrdID(new MyStringType(Tag41StrOrigClOrdID.TESTB_STR_ORIG_CL_ORD_ID));
        assertEquals( Tag41StrOrigClOrdID.TESTB_STR_ORIG_CL_ORD_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag41StrOrigClOrdID tagData;

        tagData = new Tag41StrOrigClOrdID(new MyStringType(Tag41StrOrigClOrdID.TESTA_STR_ORIG_CL_ORD_ID));
        assertEquals( "Tag41StrOrigClOrdID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag41StrOrigClOrdID.TESTA_STR_ORIG_CL_ORD_ID + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag41StrOrigClOrdID.TESTA_STR_ORIG_CL_ORD_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}