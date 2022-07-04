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
 *  177
 *  SecuritySettlAgentCode
 *  String
 *  <p>
 *  Deprecated in FIX.4.3 BIC
 *  <p>
 *  (Bank Identification Code--Swift managed) code of the SettlInstSource's local agent bank
 *  if SettlLocation is not a depository
 */
// @Deprecated
class Tag177StrSecuritySettlAgentCodeTest {
    @Test
    void FIX0177Test() {
        FIX41 fixData = FIX41.FIX177_STR_SECURITY_SETTL_AGENT_CODE;
        assertEquals( "177", fixData.toEnumIDString());
        assertEquals( "SECURITY_SETTL_AGENT_CODE", fixData.toEnumNameString());
        assertEquals( "SecuritySettlAgentCode (replaced)", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0177Test() {
        Tag177StrSecuritySettlAgentCode tagData;

        tagData = new Tag177StrSecuritySettlAgentCode(
                new MyStringType(Tag177StrSecuritySettlAgentCode.TESTA_STR_SECURITY_SETTL_AGENT_CODE));
        assertEquals( Tag177StrSecuritySettlAgentCode.TESTA_STR_SECURITY_SETTL_AGENT_CODE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag177StrSecuritySettlAgentCode(
                new MyStringType(Tag177StrSecuritySettlAgentCode.TESTB_STR_SECURITY_SETTL_AGENT_CODE));
        assertEquals( Tag177StrSecuritySettlAgentCode.TESTB_STR_SECURITY_SETTL_AGENT_CODE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag177StrSecuritySettlAgentCode tagData;

        tagData = new Tag177StrSecuritySettlAgentCode(
                new MyStringType(Tag177StrSecuritySettlAgentCode.TESTB_STR_SECURITY_SETTL_AGENT_CODE));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag177StrSecuritySettlAgentCode tagData;

        tagData = new Tag177StrSecuritySettlAgentCode(
                new MyStringType(Tag177StrSecuritySettlAgentCode.TESTB_STR_SECURITY_SETTL_AGENT_CODE));
        assertEquals( Tag177StrSecuritySettlAgentCode.TESTB_STR_SECURITY_SETTL_AGENT_CODE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag177StrSecuritySettlAgentCode tagData;

        tagData = new Tag177StrSecuritySettlAgentCode(
                new MyStringType(Tag177StrSecuritySettlAgentCode.TESTB_STR_SECURITY_SETTL_AGENT_CODE));
        assertEquals( tagData.toEnumIDString() + "=" +
                                Tag177StrSecuritySettlAgentCode.TESTB_STR_SECURITY_SETTL_AGENT_CODE,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag177StrSecuritySettlAgentCode tagData;

        tagData = new Tag177StrSecuritySettlAgentCode(
                new MyStringType(Tag177StrSecuritySettlAgentCode.TESTB_STR_SECURITY_SETTL_AGENT_CODE));
        assertEquals( Tag177StrSecuritySettlAgentCode.TESTB_STR_SECURITY_SETTL_AGENT_CODE,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag177StrSecuritySettlAgentCode tagData;

        tagData = new Tag177StrSecuritySettlAgentCode(
                new MyStringType(Tag177StrSecuritySettlAgentCode.TESTA_STR_SECURITY_SETTL_AGENT_CODE));
        assertEquals( "Tag177StrSecuritySettlAgentCode\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag177StrSecuritySettlAgentCode.TESTA_STR_SECURITY_SETTL_AGENT_CODE + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" +
                                            Tag177StrSecuritySettlAgentCode.TESTA_STR_SECURITY_SETTL_AGENT_CODE + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}