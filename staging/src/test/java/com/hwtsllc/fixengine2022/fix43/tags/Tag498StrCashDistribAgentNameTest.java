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
import com.hwtsllc.fixengine2022.fix42.tags.Tag498StrCashDistribAgentName;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  498
 *  CashDistribAgentName
 *  String
 *  <p>
 *  Name of local agent bank if for cash distributions
 */
class Tag498StrCashDistribAgentNameTest {
    @Test
    void FIX0498Test() {
        FIX43 fixData = FIX43.FIX498_STR_CASH_DISTRIB_AGENT_NAME;
        assertEquals( "498", fixData.toFIXIDString());
        assertEquals( "CASH_DISTRIB_AGENT_NAME", fixData.toFIXNameString());
        assertEquals( "CashDistribAgentName", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0498Test() {
        Tag498StrCashDistribAgentName tagData;

    }
    @Test
    void PrintFIXTagTest() {
        Tag498StrCashDistribAgentName tagData;
        String oneElement;

        oneElement = Tag498StrCashDistribAgentName.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag498StrCashDistribAgentName( new MyStringType( oneElement ) );
        System.out.println( tagData.toVerboseString() );
    }
    @Test
    void TagGetDataValueTest() {
        Tag498StrCashDistribAgentName tagData;
        String oneElement;

        oneElement = Tag498StrCashDistribAgentName.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag498StrCashDistribAgentName( new MyStringType( oneElement ) );
        assertEquals( oneElement, tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
    @Test
    void TagToValuePairStringTest() {
        Tag498StrCashDistribAgentName tagData;
        String oneElement;

        oneElement = Tag498StrCashDistribAgentName.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag498StrCashDistribAgentName( new MyStringType( oneElement ) );
        assertEquals( tagData.toFIXIDString() + "=" + oneElement, tagData.toValuePairString() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
    }
    @Test
    void TagToStringTest() {
        Tag498StrCashDistribAgentName tagData;
        String oneElement;

        oneElement = Tag498StrCashDistribAgentName.TESTB_STR_SETTL_INST_REF_ID;
        tagData = new Tag498StrCashDistribAgentName(new MyStringType(oneElement));
        assertEquals( oneElement, tagData.toString());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
    }
    @Test
    void TagToVerboseStringTest() {
        Tag498StrCashDistribAgentName tagData;
        String oneElement;

        oneElement = Tag498StrCashDistribAgentName.TESTA_STR_SETTL_INST_REF_ID;
        tagData = new Tag498StrCashDistribAgentName( new MyStringType( oneElement ) );
        assertEquals( "Tag498StrCashDistribAgentName\n" +
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