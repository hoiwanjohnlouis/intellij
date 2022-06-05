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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.fix42.tags.Tag502StrCashDistribAgentAcctName;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  502
 *  CashDistribAgentAcctName
 *  String
 *  <p>
 *  Name of account at agent bank for distributions.
 */
class Tag502StrCashDistribAgentAcctNameTest {
    @Test
    void FIX0502Test() {
        FIX43 fixData = FIX43.FIX502_STR_CASH_DISTRIB_AGENT_ACCT_NAME;
        assertEquals( "502", fixData.toFIXIDString());
        assertEquals( "CASH_DISTRIB_AGENT_ACCT_NAME", fixData.toFIXNameString());
        assertEquals( "CashDistribAgentAcctName", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0502Test() {
        Tag502StrCashDistribAgentAcctName tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag502StrCashDistribAgentAcctName tagData;
        String oneElement;

        oneElement = Tag502StrCashDistribAgentAcctName.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag502StrCashDistribAgentAcctName( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag502StrCashDistribAgentAcctName tagData;
        String oneElement;

        oneElement = Tag502StrCashDistribAgentAcctName.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag502StrCashDistribAgentAcctName( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag502StrCashDistribAgentAcctName tagData;
        String oneElement;

        oneElement = Tag502StrCashDistribAgentAcctName.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag502StrCashDistribAgentAcctName( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag502StrCashDistribAgentAcctName tagData;
        String oneElement;

        oneElement = Tag502StrCashDistribAgentAcctName.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag502StrCashDistribAgentAcctName(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag502StrCashDistribAgentAcctName tagData;
        String oneElement;

        oneElement = Tag502StrCashDistribAgentAcctName.TESTA_STR_SETTL_INST_REF_ID;
        tagData = new Tag502StrCashDistribAgentAcctName( new MyStringType( oneElement ) );
        assertEquals( "Tag502StrCashDistribAgentAcctName\n" +
                        "\tEnumName[" + tagData.toEnumNameString() + "]\n" +
                        "\tFIXID[" + tagData.toFIXIDString() + "]\n" +
                        "\tFIXName[" + tagData.toFIXNameString() + "]\n" +
                        "\tFIXDescription[" + tagData.toFIXDescriptionString() + "]\n" +
                        "\tDataValue[" + oneElement + "]\n" +
                        "\tValuePair[" + tagData.toFIXIDString() + "=" + oneElement + "]",
                tagData.toVerboseString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
    }
}