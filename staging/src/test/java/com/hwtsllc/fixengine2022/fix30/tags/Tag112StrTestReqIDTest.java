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
    void FIXTest() {
        FIX30 fixData = FIX30.FIX112_STR_TEST_REQ_ID;
        assertEquals( "TEST_REQ_ID", fixData.toEnumNameString());
        assertEquals( "112", fixData.toEnumIDString());
        assertEquals( "TestReqID", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0112Test() {
        Tag112StrTestReqID tagData;
        String oneElement;

        oneElement = "30";
        tagData = new Tag112StrTestReqID(new MyStringType( oneElement ));
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
        assertEquals( "TEST_REQ_ID", tagData.toEnumNameString());
        assertEquals( "112", tagData.toEnumIDString());
        assertEquals( "TestReqID", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());

        oneElement = Tag112StrTestReqID.TESTA_STR_TEST_REQ_ID;
        tagData = new Tag112StrTestReqID(new MyStringType( oneElement ));
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        oneElement = Tag112StrTestReqID.TESTB_STR_TEST_REQ_ID;
        tagData = new Tag112StrTestReqID(new MyStringType( oneElement ));
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag112StrTestReqID tagData;
        String oneElement;

        oneElement = Tag112StrTestReqID.TESTA_STR_TEST_REQ_ID;
        tagData = new Tag112StrTestReqID(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag112StrTestReqID.TESTB_STR_TEST_REQ_ID;
        tagData = new Tag112StrTestReqID(new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag112StrTestReqID tagData;
        String oneElement;

        oneElement = Tag112StrTestReqID.TESTB_STR_TEST_REQ_ID;
        tagData = new Tag112StrTestReqID(new MyStringType( oneElement ));
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag112StrTestReqID tagData;
        String oneElement;

        oneElement = Tag112StrTestReqID.TESTB_STR_TEST_REQ_ID;
        tagData = new Tag112StrTestReqID(new MyStringType( oneElement ));
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag112StrTestReqID tagData;
        String oneElement;

        oneElement = Tag112StrTestReqID.TESTB_STR_TEST_REQ_ID;
        tagData = new Tag112StrTestReqID(new MyStringType( oneElement ));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag112StrTestReqID tagData;
        String oneElement;

        oneElement = Tag112StrTestReqID.TESTA_STR_TEST_REQ_ID;
        tagData = new Tag112StrTestReqID(new MyStringType( oneElement ));
        assertEquals( "Tag112StrTestReqID\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}