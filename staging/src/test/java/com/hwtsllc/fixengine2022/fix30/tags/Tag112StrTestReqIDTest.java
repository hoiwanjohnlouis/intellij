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

package com.hwtsllc.fixengine2022.fix30.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX30;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  112
 *  TestReqID
 *  String
 *  <p>
 *  Identifier included in Test Request message to be returned in resulting Heartbeat
 */
class Tag112StrTestReqIDTest {

    @Test
    void FIX0112Test() {
        FIX30 fixData = FIX30.FIX112_STR_TEST_REQ_ID;
        assertEquals( "TEST_REQ_ID", fixData.toFIXNameString());
        assertEquals( "112", fixData.toFIXIDString());
        assertEquals( "TestReqID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0112Test() {
        Tag112StrTestReqID tagData;

        tagData = new Tag112StrTestReqID(new MyStringType("30"));
        assertEquals( "30", tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag112StrTestReqID tagData;

        tagData = new Tag112StrTestReqID(new MyStringType(Tag112StrTestReqID.TESTB_STR_TEST_REQ_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag112StrTestReqID tagData;

        tagData = new Tag112StrTestReqID(new MyStringType(Tag112StrTestReqID.TESTB_STR_TEST_REQ_ID));
        assertEquals( Tag112StrTestReqID.TESTB_STR_TEST_REQ_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag112StrTestReqID tagData;

        tagData = new Tag112StrTestReqID(new MyStringType(Tag112StrTestReqID.TESTB_STR_TEST_REQ_ID));
        assertEquals( tagData.toFIXIDString() + "=" + Tag112StrTestReqID.TESTB_STR_TEST_REQ_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag112StrTestReqID tagData;

        tagData = new Tag112StrTestReqID(new MyStringType(Tag112StrTestReqID.TESTB_STR_TEST_REQ_ID));
        assertEquals( Tag112StrTestReqID.TESTB_STR_TEST_REQ_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag112StrTestReqID tagData;

        tagData = new Tag112StrTestReqID(new MyStringType(Tag112StrTestReqID.TESTA_STR_TEST_REQ_ID));
        assertEquals( "Tag112StrTestReqID\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag112StrTestReqID.TESTA_STR_TEST_REQ_ID + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + Tag112StrTestReqID.TESTA_STR_TEST_REQ_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}