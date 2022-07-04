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
 *  187
 *  CashSettlAgentContactPhone
 *  String
 *  <p>
 *  Deprecated in FIX.4.3
 *  <p>
 *  Phone number for contact at local agent bank for SettlInstSource's account if SettlDeliveryType=Free
 */
// @Deprecated
class Tag187StrCashSettlAgentContactPhoneTest {
    @Test
    void FIX0187Test() {
        FIX41 fixData = FIX41.FIX187_STR_CASH_SETTL_AGENT_CONTACT_PHONE;
        assertEquals( "187", fixData.toEnumIDString());
        assertEquals( "CASH_SETTL_AGENT_CONTACT_PHONE", fixData.toEnumNameString());
        assertEquals( "CashSettlAgentContactPhone (replaced)", fixData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toEnumDescriptionString());
    }
    @Test
    void Tag0187Test() {
        Tag187StrCashSettlAgentContactPhone tagData;

        tagData = new Tag187StrCashSettlAgentContactPhone(
                new MyStringType(Tag187StrCashSettlAgentContactPhone.TESTA_STR_CASH_SETTL_AGENT_CONTACT_PHONE));
        assertEquals( Tag187StrCashSettlAgentContactPhone.TESTA_STR_CASH_SETTL_AGENT_CONTACT_PHONE,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag187StrCashSettlAgentContactPhone(
                new MyStringType(Tag187StrCashSettlAgentContactPhone.TESTB_STR_CASH_SETTL_AGENT_CONTACT_PHONE));
        assertEquals( Tag187StrCashSettlAgentContactPhone.TESTB_STR_CASH_SETTL_AGENT_CONTACT_PHONE,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag187StrCashSettlAgentContactPhone tagData;

        tagData = new Tag187StrCashSettlAgentContactPhone(
                new MyStringType(Tag187StrCashSettlAgentContactPhone.TESTB_STR_CASH_SETTL_AGENT_CONTACT_PHONE));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag187StrCashSettlAgentContactPhone tagData;

        tagData = new Tag187StrCashSettlAgentContactPhone(
                new MyStringType(Tag187StrCashSettlAgentContactPhone.TESTB_STR_CASH_SETTL_AGENT_CONTACT_PHONE));
        assertEquals( Tag187StrCashSettlAgentContactPhone.TESTB_STR_CASH_SETTL_AGENT_CONTACT_PHONE,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag187StrCashSettlAgentContactPhone tagData;

        tagData = new Tag187StrCashSettlAgentContactPhone(
                new MyStringType(Tag187StrCashSettlAgentContactPhone.TESTB_STR_CASH_SETTL_AGENT_CONTACT_PHONE));
        assertEquals( tagData.toEnumIDString() + "=" +
                        Tag187StrCashSettlAgentContactPhone.TESTB_STR_CASH_SETTL_AGENT_CONTACT_PHONE,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag187StrCashSettlAgentContactPhone tagData;

        tagData = new Tag187StrCashSettlAgentContactPhone(
                new MyStringType(Tag187StrCashSettlAgentContactPhone.TESTB_STR_CASH_SETTL_AGENT_CONTACT_PHONE));
        assertEquals( Tag187StrCashSettlAgentContactPhone.TESTB_STR_CASH_SETTL_AGENT_CONTACT_PHONE,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag187StrCashSettlAgentContactPhone tagData;

        tagData = new Tag187StrCashSettlAgentContactPhone(
                new MyStringType(Tag187StrCashSettlAgentContactPhone.TESTA_STR_CASH_SETTL_AGENT_CONTACT_PHONE));
        assertEquals( "Tag187StrCashSettlAgentContactPhone\n" +
                        "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                        "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                        "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag187StrCashSettlAgentContactPhone.TESTA_STR_CASH_SETTL_AGENT_CONTACT_PHONE + "]\n" +
                        "\tValuePair[" + tagData.toEnumIDString() + "=" +
                                            Tag187StrCashSettlAgentContactPhone.TESTA_STR_CASH_SETTL_AGENT_CONTACT_PHONE + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}