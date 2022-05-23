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
 *  183
 *  CashSettlAgentCode
 *  String
 *  <p>
 *  Deprecated in FIX.4.3
 *  <p>
 *  BIC (Bank Identification Code--Swift managed) code of the SettlInstSource's local agent bank if SettlDeliveryType=Free
 */
// @Deprecated
class Tag183StrCashSettlAgentCodeTest {
    @Test
    void FIX0183Test() {
        FIX41 fixData = FIX41.FIX183_STR_CASH_SETTL_AGENT_CODE;
        assertEquals( "183", fixData.toFIXIDString());
        assertEquals( "CASH_SETTL_AGENT_CODE", fixData.toFIXNameString());
        assertEquals( "CashSettlAgentCode (replaced)", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0183Test() {
        Tag183StrCashSettlAgentCode tagData;

        tagData = new Tag183StrCashSettlAgentCode(
                new MyStringType(Tag183StrCashSettlAgentCode.TESTA_STR_CASH_SETTL_AGENT_CODE));
        assertEquals( Tag183StrCashSettlAgentCode.TESTA_STR_CASH_SETTL_AGENT_CODE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag183StrCashSettlAgentCode(
                new MyStringType(Tag183StrCashSettlAgentCode.TESTB_STR_CASH_SETTL_AGENT_CODE));
        assertEquals( Tag183StrCashSettlAgentCode.TESTB_STR_CASH_SETTL_AGENT_CODE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag183StrCashSettlAgentCode tagData;

        tagData = new Tag183StrCashSettlAgentCode(
                new MyStringType(Tag183StrCashSettlAgentCode.TESTB_STR_CASH_SETTL_AGENT_CODE));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag183StrCashSettlAgentCode tagData;

        tagData = new Tag183StrCashSettlAgentCode(
                new MyStringType(Tag183StrCashSettlAgentCode.TESTB_STR_CASH_SETTL_AGENT_CODE));
        assertEquals( Tag183StrCashSettlAgentCode.TESTB_STR_CASH_SETTL_AGENT_CODE, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag183StrCashSettlAgentCode tagData;

        tagData = new Tag183StrCashSettlAgentCode(
                new MyStringType(Tag183StrCashSettlAgentCode.TESTB_STR_CASH_SETTL_AGENT_CODE));
        assertEquals( tagData.toFIXIDString() + "=" + Tag183StrCashSettlAgentCode.TESTB_STR_CASH_SETTL_AGENT_CODE,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag183StrCashSettlAgentCode tagData;

        tagData = new Tag183StrCashSettlAgentCode(
                new MyStringType(Tag183StrCashSettlAgentCode.TESTB_STR_CASH_SETTL_AGENT_CODE));
        assertEquals( Tag183StrCashSettlAgentCode.TESTB_STR_CASH_SETTL_AGENT_CODE,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag183StrCashSettlAgentCode tagData;

        tagData = new Tag183StrCashSettlAgentCode(
                new MyStringType(Tag183StrCashSettlAgentCode.TESTA_STR_CASH_SETTL_AGENT_CODE));
        assertEquals( "Tag183StrCashSettlAgentCode\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag183StrCashSettlAgentCode.TESTA_STR_CASH_SETTL_AGENT_CODE + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" +
                                            Tag183StrCashSettlAgentCode.TESTA_STR_CASH_SETTL_AGENT_CODE + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}