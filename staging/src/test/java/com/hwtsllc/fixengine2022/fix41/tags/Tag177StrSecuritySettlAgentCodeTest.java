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

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  177
 *  SecuritySettlAgentCode
 *  String
 *  <p></p>
 *  Deprecated in FIX.4.3 BIC
 *  <p></p>
 *  (Bank Identification Code--Swift managed) code of the SettlInstSource's local agent bank
 *  if SettlLocation is not a depository
 */
// @Deprecated
class Tag177StrSecuritySettlAgentCodeTest {
    @Test
    void PrintFIXTagTest() {
        Tag177StrSecuritySettlAgentCode tagData;
        String oneElement;

        oneElement = Tag177StrSecuritySettlAgentCode.TESTA_STR_SECURITY_SETTL_AGENT_CODE;
        tagData = new Tag177StrSecuritySettlAgentCode( new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag177StrSecuritySettlAgentCode.TESTB_STR_SECURITY_SETTL_AGENT_CODE;
        tagData = new Tag177StrSecuritySettlAgentCode( new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag177StrSecuritySettlAgentCode tagData;
        String oneElement;

        oneElement = Tag177StrSecuritySettlAgentCode.TESTA_STR_SECURITY_SETTL_AGENT_CODE;
        tagData = new Tag177StrSecuritySettlAgentCode( new MyStringType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag177StrSecuritySettlAgentCode.TESTB_STR_SECURITY_SETTL_AGENT_CODE;
        tagData = new Tag177StrSecuritySettlAgentCode( new MyStringType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag177StrSecuritySettlAgentCode tagData ) {
        assertEquals( "FIX177_STR_SECURITY_SETTL_AGENT_CODE", tagData.toEnumLabelString());
        assertEquals( "177", tagData.toEnumIDString());
        assertEquals( "SECURITY_SETTL_AGENT_CODE", tagData.toEnumNameString());
        assertEquals( "SecuritySettlAgentCode (replaced)", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag177StrSecuritySettlAgentCode tagData;
        String oneElement;

        oneElement = Tag177StrSecuritySettlAgentCode.TESTA_STR_SECURITY_SETTL_AGENT_CODE;
        tagData = new Tag177StrSecuritySettlAgentCode( new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag177StrSecuritySettlAgentCode.TESTB_STR_SECURITY_SETTL_AGENT_CODE;
        tagData = new Tag177StrSecuritySettlAgentCode( new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag177StrSecuritySettlAgentCode tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag177StrSecuritySettlAgentCode tagData;
        String oneElement;

        oneElement = Tag177StrSecuritySettlAgentCode.TESTA_STR_SECURITY_SETTL_AGENT_CODE;
        tagData = new Tag177StrSecuritySettlAgentCode( new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag177StrSecuritySettlAgentCode.TESTB_STR_SECURITY_SETTL_AGENT_CODE;
        tagData = new Tag177StrSecuritySettlAgentCode( new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag177StrSecuritySettlAgentCode tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag177StrSecuritySettlAgentCode tagData;
        String oneElement;

        oneElement = Tag177StrSecuritySettlAgentCode.TESTA_STR_SECURITY_SETTL_AGENT_CODE;
        tagData = new Tag177StrSecuritySettlAgentCode( new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag177StrSecuritySettlAgentCode.TESTB_STR_SECURITY_SETTL_AGENT_CODE;
        tagData = new Tag177StrSecuritySettlAgentCode( new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag177StrSecuritySettlAgentCode tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag177StrSecuritySettlAgentCode tagData;
        String oneElement;

        oneElement = Tag177StrSecuritySettlAgentCode.TESTA_STR_SECURITY_SETTL_AGENT_CODE;
        tagData = new Tag177StrSecuritySettlAgentCode( new MyStringType( oneElement ));
        VerifyVerboseString( tagData );

        oneElement = Tag177StrSecuritySettlAgentCode.TESTB_STR_SECURITY_SETTL_AGENT_CODE;
        tagData = new Tag177StrSecuritySettlAgentCode( new MyStringType( oneElement ));
        VerifyVerboseString( tagData );
    }

    private void VerifyVerboseString( final Tag177StrSecuritySettlAgentCode tagData ) {
        assertEquals( "Tag177StrSecuritySettlAgentCode\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + tagData.getDataValue() + "]\n" +
                        "\tValuePair[" + tagData.toValuePairString() + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}