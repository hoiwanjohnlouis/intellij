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
 *  187
 *  CashSettlAgentContactPhone
 *  String
 *  <p></p>
 *  Deprecated in FIX.4.3
 *  <p></p>
 *  Phone number for contact at local agent bank for SettlInstSource's account if SettlDeliveryType=Free
 */
// @Deprecated
class Tag187StrCashSettlAgentContactPhoneTest {
    @Test
    void PrintFIXTagTest() {
        Tag187StrCashSettlAgentContactPhone tagData;
        String oneElement;

        oneElement = Tag187StrCashSettlAgentContactPhone.TESTA_STR_CASH_SETTL_AGENT_CONTACT_PHONE;
        tagData = new Tag187StrCashSettlAgentContactPhone( new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag187StrCashSettlAgentContactPhone.TESTB_STR_CASH_SETTL_AGENT_CONTACT_PHONE;
        tagData = new Tag187StrCashSettlAgentContactPhone( new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag187StrCashSettlAgentContactPhone tagData;
        String oneElement;

        oneElement = Tag187StrCashSettlAgentContactPhone.TESTA_STR_CASH_SETTL_AGENT_CONTACT_PHONE;
        tagData = new Tag187StrCashSettlAgentContactPhone( new MyStringType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag187StrCashSettlAgentContactPhone.TESTB_STR_CASH_SETTL_AGENT_CONTACT_PHONE;
        tagData = new Tag187StrCashSettlAgentContactPhone( new MyStringType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag187StrCashSettlAgentContactPhone tagData ) {
        assertEquals( "FIX187_STR_CASH_SETTL_AGENT_CONTACT_PHONE", tagData.toEnumLabelString());
        assertEquals( "187", tagData.toEnumIDString());
        assertEquals( "CASH_SETTL_AGENT_CONTACT_PHONE", tagData.toEnumNameString());
        assertEquals( "CashSettlAgentContactPhone (replaced)", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag187StrCashSettlAgentContactPhone tagData;
        String oneElement;

        oneElement = Tag187StrCashSettlAgentContactPhone.TESTA_STR_CASH_SETTL_AGENT_CONTACT_PHONE;
        tagData = new Tag187StrCashSettlAgentContactPhone( new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag187StrCashSettlAgentContactPhone.TESTB_STR_CASH_SETTL_AGENT_CONTACT_PHONE;
        tagData = new Tag187StrCashSettlAgentContactPhone( new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag187StrCashSettlAgentContactPhone tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag187StrCashSettlAgentContactPhone tagData;
        String oneElement;

        oneElement = Tag187StrCashSettlAgentContactPhone.TESTA_STR_CASH_SETTL_AGENT_CONTACT_PHONE;
        tagData = new Tag187StrCashSettlAgentContactPhone( new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag187StrCashSettlAgentContactPhone.TESTB_STR_CASH_SETTL_AGENT_CONTACT_PHONE;
        tagData = new Tag187StrCashSettlAgentContactPhone( new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag187StrCashSettlAgentContactPhone tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag187StrCashSettlAgentContactPhone tagData;
        String oneElement;

        oneElement = Tag187StrCashSettlAgentContactPhone.TESTA_STR_CASH_SETTL_AGENT_CONTACT_PHONE;
        tagData = new Tag187StrCashSettlAgentContactPhone( new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag187StrCashSettlAgentContactPhone.TESTB_STR_CASH_SETTL_AGENT_CONTACT_PHONE;
        tagData = new Tag187StrCashSettlAgentContactPhone( new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag187StrCashSettlAgentContactPhone tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag187StrCashSettlAgentContactPhone tagData;
        String oneElement;

        oneElement = Tag187StrCashSettlAgentContactPhone.TESTA_STR_CASH_SETTL_AGENT_CONTACT_PHONE;
        tagData = new Tag187StrCashSettlAgentContactPhone( new MyStringType( oneElement ));
        verifyVerboseString( tagData );

        oneElement = Tag187StrCashSettlAgentContactPhone.TESTB_STR_CASH_SETTL_AGENT_CONTACT_PHONE;
        tagData = new Tag187StrCashSettlAgentContactPhone( new MyStringType( oneElement ));
        verifyVerboseString( tagData );
    }

    private void verifyVerboseString( final Tag187StrCashSettlAgentContactPhone tagData ) {
        assertEquals( "Tag187StrCashSettlAgentContactPhone\n" +
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