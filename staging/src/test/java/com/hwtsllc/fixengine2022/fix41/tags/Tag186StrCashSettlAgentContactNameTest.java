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
 *  186
 *  CashSettlAgentContactName
 *  String
 *  <p></p>
 *  Deprecated in FIX.4.3
 *  <p></p>
 *  Name of contact at local agent bank for SettlInstSource's account  if SettlDeliveryType=Free
 */
// @Deprecated
class Tag186StrCashSettlAgentContactNameTest {
    @Test
    void PrintFIXTagTest() {
        Tag186StrCashSettlAgentContactName tagData;
        String oneElement;

        oneElement = Tag186StrCashSettlAgentContactName.TESTA_STR_CASH_SETTL_AGENT_CONTACT_NAME;
        tagData = new Tag186StrCashSettlAgentContactName( new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );

        oneElement = Tag186StrCashSettlAgentContactName.TESTB_STR_CASH_SETTL_AGENT_CONTACT_NAME;
        tagData = new Tag186StrCashSettlAgentContactName( new MyStringType( oneElement ));
        System.out.println( tagData.toVerboseString() );
    }

    @Test
    void FIXTest() {
        Tag186StrCashSettlAgentContactName tagData;
        String oneElement;

        oneElement = Tag186StrCashSettlAgentContactName.TESTA_STR_CASH_SETTL_AGENT_CONTACT_NAME;
        tagData = new Tag186StrCashSettlAgentContactName( new MyStringType( oneElement ));
        verifyFIXData( tagData );

        oneElement = Tag186StrCashSettlAgentContactName.TESTB_STR_CASH_SETTL_AGENT_CONTACT_NAME;
        tagData = new Tag186StrCashSettlAgentContactName( new MyStringType( oneElement ));
        verifyFIXData( tagData );
    }

    private void verifyFIXData( final Tag186StrCashSettlAgentContactName tagData ) {
        assertEquals( "FIX186_STR_CASH_SETTL_AGENT_CONTACT_NAME", tagData.toEnumLabelString());
        assertEquals( "186", tagData.toEnumIDString());
        assertEquals( "CASH_SETTL_AGENT_CONTACT_NAME", tagData.toEnumNameString());
        assertEquals( "CashSettlAgentContactName (replaced)", tagData.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
    }

    @Test
    void TagGetDataValueTest() {
        Tag186StrCashSettlAgentContactName tagData;
        String oneElement;

        oneElement = Tag186StrCashSettlAgentContactName.TESTA_STR_CASH_SETTL_AGENT_CONTACT_NAME;
        tagData = new Tag186StrCashSettlAgentContactName( new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );

        oneElement = Tag186StrCashSettlAgentContactName.TESTB_STR_CASH_SETTL_AGENT_CONTACT_NAME;
        tagData = new Tag186StrCashSettlAgentContactName( new MyStringType( oneElement ));
        verifyDataValue( tagData, oneElement );
    }

    private void verifyDataValue( final Tag186StrCashSettlAgentContactName tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }

    @Test
    void TagToValuePairStringTest() {
        Tag186StrCashSettlAgentContactName tagData;
        String oneElement;

        oneElement = Tag186StrCashSettlAgentContactName.TESTA_STR_CASH_SETTL_AGENT_CONTACT_NAME;
        tagData = new Tag186StrCashSettlAgentContactName( new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );

        oneElement = Tag186StrCashSettlAgentContactName.TESTB_STR_CASH_SETTL_AGENT_CONTACT_NAME;
        tagData = new Tag186StrCashSettlAgentContactName( new MyStringType( oneElement ));
        verifyValuePairString( tagData, oneElement );
    }

    private void verifyValuePairString( final Tag186StrCashSettlAgentContactName tagData, final String oneElement ) {
        assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString());
    }

    @Test
    void TagToStringTest() {
        Tag186StrCashSettlAgentContactName tagData;
        String oneElement;

        oneElement = Tag186StrCashSettlAgentContactName.TESTA_STR_CASH_SETTL_AGENT_CONTACT_NAME;
        tagData = new Tag186StrCashSettlAgentContactName( new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );

        oneElement = Tag186StrCashSettlAgentContactName.TESTB_STR_CASH_SETTL_AGENT_CONTACT_NAME;
        tagData = new Tag186StrCashSettlAgentContactName( new MyStringType( oneElement ));
        verifyToString( tagData, oneElement );
    }

    private void verifyToString( final Tag186StrCashSettlAgentContactName tagData, final String oneElement ) {
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }

    @Test
    void TagToVerboseStringTest() {
        Tag186StrCashSettlAgentContactName tagData;
        String oneElement;

        oneElement = Tag186StrCashSettlAgentContactName.TESTA_STR_CASH_SETTL_AGENT_CONTACT_NAME;
        tagData = new Tag186StrCashSettlAgentContactName( new MyStringType( oneElement ));
        VerifyVerboseString( tagData );

        oneElement = Tag186StrCashSettlAgentContactName.TESTB_STR_CASH_SETTL_AGENT_CONTACT_NAME;
        tagData = new Tag186StrCashSettlAgentContactName( new MyStringType( oneElement ));
        VerifyVerboseString( tagData );
    }

    private void VerifyVerboseString( final Tag186StrCashSettlAgentContactName tagData ) {
        assertEquals( "Tag186StrCashSettlAgentContactName\n" +
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