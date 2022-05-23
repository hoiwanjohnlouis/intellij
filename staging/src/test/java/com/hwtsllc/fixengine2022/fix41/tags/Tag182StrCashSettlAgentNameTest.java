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
 *  182
 *  CashSettlAgentName
 *  String
 *  <p>
 *  Deprecated in FIX.4.3 Name of SettlInstSource's local agent bank if SettlDeliveryType=Free
 */
// @Deprecated
class Tag182StrCashSettlAgentNameTest {
    @Test
    void FIX0182Test() {
        FIX41 fixData = FIX41.FIX182_STR_CASH_SETTL_AGENT_NAME;
        assertEquals( "182", fixData.toFIXIDString());
        assertEquals( "CASH_SETTL_AGENT_NAME", fixData.toFIXNameString());
        assertEquals( "CashSettlAgentName (replaced)", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0182Test() {
        Tag182StrCashSettlAgentName tagData;

        tagData = new Tag182StrCashSettlAgentName(
                new MyStringType(Tag182StrCashSettlAgentName.TESTA_STR_CASH_SETTL_AGENT_NAME));
        assertEquals( Tag182StrCashSettlAgentName.TESTA_STR_CASH_SETTL_AGENT_NAME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag182StrCashSettlAgentName(
                new MyStringType(Tag182StrCashSettlAgentName.TESTB_STR_CASH_SETTL_AGENT_NAME));
        assertEquals( Tag182StrCashSettlAgentName.TESTB_STR_CASH_SETTL_AGENT_NAME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void PrintFIXTagTest() {
        Tag182StrCashSettlAgentName tagData;

        tagData = new Tag182StrCashSettlAgentName(
                new MyStringType(Tag182StrCashSettlAgentName.TESTB_STR_CASH_SETTL_AGENT_NAME));
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag182StrCashSettlAgentName tagData;

        tagData = new Tag182StrCashSettlAgentName(
                new MyStringType(Tag182StrCashSettlAgentName.TESTB_STR_CASH_SETTL_AGENT_NAME));
        assertEquals( Tag182StrCashSettlAgentName.TESTB_STR_CASH_SETTL_AGENT_NAME, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
    @Test
    void TagToValuePairStringTest() {
        Tag182StrCashSettlAgentName tagData;

        tagData = new Tag182StrCashSettlAgentName(
                new MyStringType(Tag182StrCashSettlAgentName.TESTB_STR_CASH_SETTL_AGENT_NAME));
        assertEquals( tagData.toFIXIDString() + "=" + Tag182StrCashSettlAgentName.TESTB_STR_CASH_SETTL_AGENT_NAME,
                tagData.toValuePairString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toValuePairString());
    }
    @Test
    void TagToStringTest() {
        Tag182StrCashSettlAgentName tagData;

        tagData = new Tag182StrCashSettlAgentName(
                new MyStringType(Tag182StrCashSettlAgentName.TESTB_STR_CASH_SETTL_AGENT_NAME));
        assertEquals( Tag182StrCashSettlAgentName.TESTB_STR_CASH_SETTL_AGENT_NAME,
                tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE,
                tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag182StrCashSettlAgentName tagData;

        tagData = new Tag182StrCashSettlAgentName(
                new MyStringType(Tag182StrCashSettlAgentName.TESTA_STR_CASH_SETTL_AGENT_NAME));
        assertEquals( "Tag182StrCashSettlAgentName\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + Tag182StrCashSettlAgentName.TESTA_STR_CASH_SETTL_AGENT_NAME + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" +
                                            Tag182StrCashSettlAgentName.TESTA_STR_CASH_SETTL_AGENT_NAME + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}