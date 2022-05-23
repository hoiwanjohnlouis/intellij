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
import com.hwtsllc.fixengine2022.fix40.tags.Tag178StrSecuritySettlAgentAcctNum;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  178
 *  SecuritySettlAgentAcctNum
 *  String
 *  <p>
 *  Deprecated in FIX.4.3 SettlInstSource's account number at local agent bank if  SettlLocation is not a depository
 */
// @Deprecated
class Tag178StrSecuritySettlAgentAcctNumTest {
    @Test
    void FIX0178Test() {
        FIX41 fixData = FIX41.FIX178_STR_SECURITY_SETTL_AGENT_ACCT_NUM;
        assertEquals( "178", fixData.toFIXIDString());
        assertEquals( "SECURITY_SETTL_AGENT_ACCT_NUM", fixData.toFIXNameString());
        assertEquals( "SecuritySettlAgentAcctNum (replaced)", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0178Test() {
        Tag178StrSecuritySettlAgentAcctNum tagData;

        tagData = new Tag178StrSecuritySettlAgentAcctNum(
                        new MyStringType(Tag178StrSecuritySettlAgentAcctNum.TESTA_STR_SECURITY_SETTL_AGENT_ACCT_NUM));
        assertEquals( Tag178StrSecuritySettlAgentAcctNum.TESTA_STR_SECURITY_SETTL_AGENT_ACCT_NUM,
                        tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag178StrSecuritySettlAgentAcctNum(
                        new MyStringType(Tag178StrSecuritySettlAgentAcctNum.TESTB_STR_SECURITY_SETTL_AGENT_ACCT_NUM));
        assertEquals( Tag178StrSecuritySettlAgentAcctNum.TESTB_STR_SECURITY_SETTL_AGENT_ACCT_NUM,
                        tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag178StrSecuritySettlAgentAcctNum tagData;

        tagData = new Tag178StrSecuritySettlAgentAcctNum(
                new MyStringType(Tag178StrSecuritySettlAgentAcctNum.TESTB_STR_QUOTE_REQ_ID));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag178StrSecuritySettlAgentAcctNum tagData;

        tagData = new Tag178StrSecuritySettlAgentAcctNum(
                new MyStringType(Tag178StrSecuritySettlAgentAcctNum.TESTB_STR_QUOTE_REQ_ID));
        assertEquals( Tag178StrSecuritySettlAgentAcctNum.TESTB_STR_QUOTE_REQ_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag178StrSecuritySettlAgentAcctNum tagData;

        tagData = new Tag178StrSecuritySettlAgentAcctNum(
                new MyStringType(Tag178StrSecuritySettlAgentAcctNum.TESTB_STR_QUOTE_REQ_ID));
        assertEquals( tagData.toFIXIDString() + "=" + Tag178StrSecuritySettlAgentAcctNum.TESTB_STR_QUOTE_REQ_ID,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag178StrSecuritySettlAgentAcctNum tagData;

        tagData = new Tag178StrSecuritySettlAgentAcctNum(
                new MyStringType(Tag178StrSecuritySettlAgentAcctNum.TESTB_STR_QUOTE_REQ_ID));
        assertEquals( Tag178StrSecuritySettlAgentAcctNum.TESTB_STR_QUOTE_REQ_ID,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag178StrSecuritySettlAgentAcctNum tagData;

        tagData = new Tag178StrSecuritySettlAgentAcctNum(
                new MyStringType(Tag178StrSecuritySettlAgentAcctNum.TESTA_STR_QUOTE_REQ_ID));
        assertEquals( "Tag178StrSecuritySettlAgentAcctNum\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag178StrSecuritySettlAgentAcctNum.TESTA_STR_QUOTE_REQ_ID + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" +
                                            Tag178StrSecuritySettlAgentAcctNum.TESTA_STR_QUOTE_REQ_ID + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}