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
 *  185
 *  CashSettlAgentAcctName
 *  String
 *  <p>
 *  Deprecated in FIX.4.3
 *  <p>
 *  Name of SettlInstSource's account at local agent bank if SettlDeliveryType=Free
 */
// @Deprecated
class Tag185StrCashSettlAgentAcctNameTest {
    @Test
    void FIX0185Test() {
        FIX41 fixData = FIX41.FIX185_STR_CASH_SETTL_AGENT_ACCT_NAME;
        assertEquals( "185", fixData.toEnumIDString());
        assertEquals( "CASH_SETTL_AGENT_ACCT_NAME", fixData.toEnumNameString());
        assertEquals( "CashSettlAgentAcctName (replaced)", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0185Test() {
        Tag185StrCashSettlAgentAcctName tagData;

        tagData = new Tag185StrCashSettlAgentAcctName(
                new MyStringType(Tag185StrCashSettlAgentAcctName.TESTA_STR_CASH_SETTL_AGENT_ACCT_NAME));
        assertEquals( Tag185StrCashSettlAgentAcctName.TESTA_STR_CASH_SETTL_AGENT_ACCT_NAME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag185StrCashSettlAgentAcctName(
                new MyStringType(Tag185StrCashSettlAgentAcctName.TESTB_STR_CASH_SETTL_AGENT_ACCT_NAME));
        assertEquals( Tag185StrCashSettlAgentAcctName.TESTB_STR_CASH_SETTL_AGENT_ACCT_NAME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag185StrCashSettlAgentAcctName tagData;

        tagData = new Tag185StrCashSettlAgentAcctName(
                new MyStringType(Tag185StrCashSettlAgentAcctName.TESTB_STR_CASH_SETTL_AGENT_ACCT_NAME));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag185StrCashSettlAgentAcctName tagData;

        tagData = new Tag185StrCashSettlAgentAcctName(
                new MyStringType(Tag185StrCashSettlAgentAcctName.TESTB_STR_CASH_SETTL_AGENT_ACCT_NAME));
        assertEquals( Tag185StrCashSettlAgentAcctName.TESTB_STR_CASH_SETTL_AGENT_ACCT_NAME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag185StrCashSettlAgentAcctName tagData;

        tagData = new Tag185StrCashSettlAgentAcctName(
                new MyStringType(Tag185StrCashSettlAgentAcctName.TESTB_STR_CASH_SETTL_AGENT_ACCT_NAME));
        assertEquals( tagData.toEnumIDString() + "=" +
                        Tag185StrCashSettlAgentAcctName.TESTB_STR_CASH_SETTL_AGENT_ACCT_NAME,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag185StrCashSettlAgentAcctName tagData;

        tagData = new Tag185StrCashSettlAgentAcctName(
                new MyStringType(Tag185StrCashSettlAgentAcctName.TESTB_STR_CASH_SETTL_AGENT_ACCT_NAME));
        assertEquals( Tag185StrCashSettlAgentAcctName.TESTB_STR_CASH_SETTL_AGENT_ACCT_NAME,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag185StrCashSettlAgentAcctName tagData;

        tagData = new Tag185StrCashSettlAgentAcctName(
                new MyStringType(Tag185StrCashSettlAgentAcctName.TESTA_STR_CASH_SETTL_AGENT_ACCT_NAME));
        assertEquals( "Tag185StrCashSettlAgentAcctName\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag185StrCashSettlAgentAcctName.TESTA_STR_CASH_SETTL_AGENT_ACCT_NAME + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" +
                                            Tag185StrCashSettlAgentAcctName.TESTA_STR_CASH_SETTL_AGENT_ACCT_NAME + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}