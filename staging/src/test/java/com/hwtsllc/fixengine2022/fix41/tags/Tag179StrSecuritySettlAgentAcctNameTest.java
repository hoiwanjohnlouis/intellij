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
 *  179
 *  SecuritySettlAgentAcctName
 *  String
 *  <p></p>
 *  Deprecated in FIX.4.3 Name of SettlInstSource's account at local agent bank if  SettlLocation is not a depository
 */
// @Deprecated
class Tag179StrSecuritySettlAgentAcctNameTest {
    @Test
    void PrintFIXTagTest() {
        Tag179StrSecuritySettlAgentAcctName tagData;
        String oneElement;

        oneElement = Tag179StrSecuritySettlAgentAcctName.TESTA_STR_SECURITY_SETTL_AGENT_ACCT_NAME;
        tagData = new Tag179StrSecuritySettlAgentAcctName( new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag179StrSecuritySettlAgentAcctName.TESTB_STR_SECURITY_SETTL_AGENT_ACCT_NAME;
        tagData = new Tag179StrSecuritySettlAgentAcctName( new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIX0179Test() {
        Tag179StrSecuritySettlAgentAcctName tagData;
        String oneElement;

        oneElement = Tag179StrSecuritySettlAgentAcctName.TESTA_STR_SECURITY_SETTL_AGENT_ACCT_NAME;
        tagData = new Tag179StrSecuritySettlAgentAcctName( new MyStringType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag179StrSecuritySettlAgentAcctName.TESTB_STR_SECURITY_SETTL_AGENT_ACCT_NAME;
        tagData = new Tag179StrSecuritySettlAgentAcctName( new MyStringType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag179StrSecuritySettlAgentAcctName tagData ) {
        assertEquals( "FIX179_STR_SECURITY_SETTL_AGENT_ACCT_NAME", tagData.toEnumLabelString());
        assertEquals( "179", tagData.toEnumIDString());
        assertEquals( "SECURITY_SETTL_AGENT_ACCT_NAME", tagData.toEnumNameString());
        assertEquals( "SecuritySettlAgentAcctName (replaced)", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag179StrSecuritySettlAgentAcctName tagData;
        String oneElement;

        oneElement = Tag179StrSecuritySettlAgentAcctName.TESTA_STR_SECURITY_SETTL_AGENT_ACCT_NAME;
        tagData = new Tag179StrSecuritySettlAgentAcctName( new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag179StrSecuritySettlAgentAcctName.TESTB_STR_SECURITY_SETTL_AGENT_ACCT_NAME;
        tagData = new Tag179StrSecuritySettlAgentAcctName( new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag179StrSecuritySettlAgentAcctName tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag179StrSecuritySettlAgentAcctName tagData;
        String oneElement;

        oneElement = Tag179StrSecuritySettlAgentAcctName.TESTA_STR_SECURITY_SETTL_AGENT_ACCT_NAME;
        tagData = new Tag179StrSecuritySettlAgentAcctName( new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag179StrSecuritySettlAgentAcctName.TESTB_STR_SECURITY_SETTL_AGENT_ACCT_NAME;
        tagData = new Tag179StrSecuritySettlAgentAcctName( new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag179StrSecuritySettlAgentAcctName tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag179StrSecuritySettlAgentAcctName tagData;
        String oneElement;

        oneElement = Tag179StrSecuritySettlAgentAcctName.TESTA_STR_SECURITY_SETTL_AGENT_ACCT_NAME;
        tagData = new Tag179StrSecuritySettlAgentAcctName( new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag179StrSecuritySettlAgentAcctName.TESTB_STR_SECURITY_SETTL_AGENT_ACCT_NAME;
        tagData = new Tag179StrSecuritySettlAgentAcctName( new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag179StrSecuritySettlAgentAcctName tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag179StrSecuritySettlAgentAcctName tagData;
        String oneElement;

        oneElement = Tag179StrSecuritySettlAgentAcctName.TESTA_STR_SECURITY_SETTL_AGENT_ACCT_NAME;
        tagData = new Tag179StrSecuritySettlAgentAcctName( new MyStringType( oneElement ));
        verifyVerboseString( tagData );

        oneElement = Tag179StrSecuritySettlAgentAcctName.TESTB_STR_SECURITY_SETTL_AGENT_ACCT_NAME;
        tagData = new Tag179StrSecuritySettlAgentAcctName( new MyStringType( oneElement ));
        verifyVerboseString( tagData );
    }

    private void verifyVerboseString( final Tag179StrSecuritySettlAgentAcctName tagData ) {
        assertEquals( "Tag179StrSecuritySettlAgentAcctName\n" +
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