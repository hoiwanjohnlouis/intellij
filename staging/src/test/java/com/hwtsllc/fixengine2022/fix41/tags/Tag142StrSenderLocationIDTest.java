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

package com.hwtsllc.fixengine2022.fix41.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  142
 *  SenderLocationID
 *  String
 *  <p>
 *  Assigned value used to identify specific message originator’s location (i.e. geographic location and/or desk, trader)
 */
class Tag142StrSenderLocationIDTest {
    @Test
    void FIX0142Test() {
        FIX41 fixData = FIX41.FIX142_STR_SENDER_LOCATION_ID;
        assertEquals( "142", fixData.toEnumIDString());
        assertEquals( "SENDER_LOCATION_ID", fixData.toEnumNameString());
        assertEquals( "SenderLocationID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0142Test() {
        Tag142StrSenderLocationID tagData;

        tagData = new Tag142StrSenderLocationID(
                        new MyStringType(Tag142StrSenderLocationID.TESTA_STR_SENDER_LOCATION_ID));
        assertEquals( Tag142StrSenderLocationID.TESTA_STR_SENDER_LOCATION_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag142StrSenderLocationID(
                        new MyStringType(Tag142StrSenderLocationID.TESTB_STR_SENDER_LOCATION_ID));
        assertEquals( Tag142StrSenderLocationID.TESTB_STR_SENDER_LOCATION_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag142StrSenderLocationID tagData;

        tagData = new Tag142StrSenderLocationID(new MyStringType(Tag142StrSenderLocationID.TESTB_STR_SENDER_LOCATION_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag142StrSenderLocationID tagData;

        tagData = new Tag142StrSenderLocationID(new MyStringType(Tag142StrSenderLocationID.TESTB_STR_SENDER_LOCATION_ID));
        assertEquals( Tag142StrSenderLocationID.TESTB_STR_SENDER_LOCATION_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag142StrSenderLocationID tagData;

        tagData = new Tag142StrSenderLocationID(new MyStringType(Tag142StrSenderLocationID.TESTB_STR_SENDER_LOCATION_ID));
        assertEquals( tagData.toEnumIDString() + "=" + Tag142StrSenderLocationID.TESTB_STR_SENDER_LOCATION_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag142StrSenderLocationID tagData;

        tagData = new Tag142StrSenderLocationID(new MyStringType(Tag142StrSenderLocationID.TESTB_STR_SENDER_LOCATION_ID));
        assertEquals( Tag142StrSenderLocationID.TESTB_STR_SENDER_LOCATION_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag142StrSenderLocationID tagData;

        tagData = new Tag142StrSenderLocationID(new MyStringType(Tag142StrSenderLocationID.TESTA_STR_SENDER_LOCATION_ID));
        assertEquals( "Tag142StrSenderLocationID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag142StrSenderLocationID.TESTA_STR_SENDER_LOCATION_ID + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + Tag142StrSenderLocationID.TESTA_STR_SENDER_LOCATION_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}