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
 *  50
 *  SenderSubID
 *  String
 *  Assigned value used to identify specific message originator (desk, trader, etc.)
 */
class Tag50StrSenderSubIDTest {
    @Test
    void FIX0050Test() {
        FIX27 fixData = FIX27.FIX50_STR_SENDER_SUB_ID;
        assertEquals( "SENDER_SUB_ID", fixData.toFIXNameString());
        assertEquals( "50", fixData.toFIXIDString());
        assertEquals( "SenderSubID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0050Test() {
        Tag50StrSenderSubID tagData;

        tagData = new Tag50StrSenderSubID(new MyStringType("BEST") );
        assertEquals( "BEST", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag50StrSenderSubID tagData;

        tagData = new Tag50StrSenderSubID(new MyStringType(Tag50StrSenderSubID.TESTB_STR_SENDER_SUB_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag50StrSenderSubID tagData;

        tagData = new Tag50StrSenderSubID(new MyStringType(Tag50StrSenderSubID.TESTB_STR_SENDER_SUB_ID));
        assertEquals( Tag50StrSenderSubID.TESTB_STR_SENDER_SUB_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag50StrSenderSubID tagData;

        tagData = new Tag50StrSenderSubID(new MyStringType(Tag50StrSenderSubID.TESTB_STR_SENDER_SUB_ID));
        assertEquals( tagData.toFIXIDString() + "=" + Tag50StrSenderSubID.TESTB_STR_SENDER_SUB_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag50StrSenderSubID tagData;

        tagData = new Tag50StrSenderSubID(new MyStringType(Tag50StrSenderSubID.TESTB_STR_SENDER_SUB_ID));
        assertEquals( Tag50StrSenderSubID.TESTB_STR_SENDER_SUB_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag50StrSenderSubID tagData;

        tagData = new Tag50StrSenderSubID(new MyStringType(Tag50StrSenderSubID.TESTA_STR_SENDER_SUB_ID));
        assertEquals( "Tag50StrSenderSubID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag50StrSenderSubID.TESTA_STR_SENDER_SUB_ID + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag50StrSenderSubID.TESTA_STR_SENDER_SUB_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}