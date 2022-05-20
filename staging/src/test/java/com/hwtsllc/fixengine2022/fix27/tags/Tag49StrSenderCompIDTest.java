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
 *  49
 *  SenderCompID
 *  String
 *  Assigned value used to identify firm sending message.
 */
class Tag49StrSenderCompIDTest {
    @Test
    void FIX0049Test() {
        FIX27 fixData = FIX27.FIX49_STR_SENDER_COMP_ID;
        assertEquals( "SENDER_COMP_ID", fixData.toFIXNameString());
        assertEquals( "49", fixData.toFIXIDString());
        assertEquals( "SenderCompID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0049Test() {
        Tag49StrSenderCompID tagData;

        tagData = new Tag49StrSenderCompID(new MyStringType("JPMC") );
        assertEquals( "JPMC", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag49StrSenderCompID tagData;

        tagData = new Tag49StrSenderCompID(new MyStringType(Tag49StrSenderCompID.TESTB_STR_SENDER_COMP_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag49StrSenderCompID tagData;

        tagData = new Tag49StrSenderCompID(new MyStringType(Tag49StrSenderCompID.TESTB_STR_SENDER_COMP_ID));
        assertEquals( Tag49StrSenderCompID.TESTB_STR_SENDER_COMP_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag49StrSenderCompID tagData;

        tagData = new Tag49StrSenderCompID(new MyStringType(Tag49StrSenderCompID.TESTB_STR_SENDER_COMP_ID));
        assertEquals( tagData.toFIXIDString() + "=" + Tag49StrSenderCompID.TESTB_STR_SENDER_COMP_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag49StrSenderCompID tagData;

        tagData = new Tag49StrSenderCompID(new MyStringType(Tag49StrSenderCompID.TESTB_STR_SENDER_COMP_ID));
        assertEquals( Tag49StrSenderCompID.TESTB_STR_SENDER_COMP_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag49StrSenderCompID tagData;

        tagData = new Tag49StrSenderCompID(new MyStringType(Tag49StrSenderCompID.TESTA_STR_SENDER_COMP_ID));
        assertEquals( "Tag49StrSenderCompID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag49StrSenderCompID.TESTA_STR_SENDER_COMP_ID + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag49StrSenderCompID.TESTA_STR_SENDER_COMP_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}