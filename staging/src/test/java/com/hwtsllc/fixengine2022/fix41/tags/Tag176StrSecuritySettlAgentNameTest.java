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
 *  176
 *  SecuritySettlAgentName
 *  String
 *  <p>
 *  Deprecated in FIX.4.3 Name of SettlInstSource's local agent bank if SettlLocation is not a depository
 */
// @Deprecated
class Tag176StrSecuritySettlAgentNameTest {
    @Test
    void FIX0176Test() {
        FIX41 fixData = FIX41.FIX176_STR_SECURITY_SETTL_AGENT_NAME;
        assertEquals( "176", fixData.toEnumIDString());
        assertEquals( "SECURITY_SETTL_AGENT_NAME", fixData.toEnumNameString());
        assertEquals( "SecuritySettlAgentName (replaced)", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0176Test() {
        Tag176StrSecuritySettlAgentName tagData;

        tagData = new Tag176StrSecuritySettlAgentName(
                new MyStringType(Tag176StrSecuritySettlAgentName.TESTA_STR_SECURITY_SETTL_AGENT_NAME));
        assertEquals( Tag176StrSecuritySettlAgentName.TESTA_STR_SECURITY_SETTL_AGENT_NAME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag176StrSecuritySettlAgentName(
                new MyStringType(Tag176StrSecuritySettlAgentName.TESTB_STR_SECURITY_SETTL_AGENT_NAME));
        assertEquals( Tag176StrSecuritySettlAgentName.TESTB_STR_SECURITY_SETTL_AGENT_NAME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag176StrSecuritySettlAgentName tagData;

        tagData = new Tag176StrSecuritySettlAgentName(
                new MyStringType(Tag176StrSecuritySettlAgentName.TESTB_STR_SECURITY_SETTL_AGENT_NAME));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag176StrSecuritySettlAgentName tagData;

        tagData = new Tag176StrSecuritySettlAgentName(
                new MyStringType(Tag176StrSecuritySettlAgentName.TESTB_STR_SECURITY_SETTL_AGENT_NAME));
        assertEquals( Tag176StrSecuritySettlAgentName.TESTB_STR_SECURITY_SETTL_AGENT_NAME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag176StrSecuritySettlAgentName tagData;

        tagData = new Tag176StrSecuritySettlAgentName(
                new MyStringType(Tag176StrSecuritySettlAgentName.TESTB_STR_SECURITY_SETTL_AGENT_NAME));
        assertEquals( tagData.toEnumIDString() + "=" +
                                Tag176StrSecuritySettlAgentName.TESTB_STR_SECURITY_SETTL_AGENT_NAME,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag176StrSecuritySettlAgentName tagData;

        tagData = new Tag176StrSecuritySettlAgentName(
                new MyStringType(Tag176StrSecuritySettlAgentName.TESTB_STR_SECURITY_SETTL_AGENT_NAME));
        assertEquals( Tag176StrSecuritySettlAgentName.TESTB_STR_SECURITY_SETTL_AGENT_NAME,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag176StrSecuritySettlAgentName tagData;

        tagData = new Tag176StrSecuritySettlAgentName(
                new MyStringType(Tag176StrSecuritySettlAgentName.TESTA_STR_SECURITY_SETTL_AGENT_NAME));
        assertEquals( "Tag176StrSecuritySettlAgentName\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag176StrSecuritySettlAgentName.TESTA_STR_SECURITY_SETTL_AGENT_NAME + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" +
                                            Tag176StrSecuritySettlAgentName.TESTA_STR_SECURITY_SETTL_AGENT_NAME + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}