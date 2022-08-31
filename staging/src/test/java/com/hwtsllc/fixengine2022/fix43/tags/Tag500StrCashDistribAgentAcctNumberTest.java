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

import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag500StrCashDistribAgentAcctNumberTest {
    Tag500StrCashDistribAgentAcctNumber tagData;
    String [] TestArray = {
            Tag500StrCashDistribAgentAcctNumber.TESTA_STR_CASH_DISTRIB_AGENT_ACCT_NUMBER,
            Tag500StrCashDistribAgentAcctNumber.TESTB_STR_CASH_DISTRIB_AGENT_ACCT_NUMBER
    };

    @Test
    void PrintTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag500StrCashDistribAgentAcctNumber( new MyStringType( oneElement ));
            System.out.println( tagData.toVerboseString() );
        }
    }
    @Test
    void FIXHeaderTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag500StrCashDistribAgentAcctNumber( new MyStringType( oneElement ));
            assertEquals( "FIX500_STR_CASH_DISTRIB_AGENT_ACCT_NUMBER", tagData.toEnumLabelString());
            assertEquals( "500", tagData.toEnumIDString());
            assertEquals( "CASH_DISTRIB_AGENT_ACCT_NUMBER", tagData.toEnumNameString());
            assertEquals( "CashDistribAgentAcctNumber", tagData.toEnumDescriptionString());
            assertNotEquals( MyTestValues.JUNK_ENUM_NAME, tagData.toEnumLabelString());
            assertNotEquals( MyTestValues.JUNK_ID, tagData.toEnumIDString());
            assertNotEquals( MyTestValues.JUNK_NAME, tagData.toEnumNameString());
            assertNotEquals( MyTestValues.JUNK_DESCRIPTION, tagData.toEnumDescriptionString());
        }
    }
    @Test
    void TagToValuePairStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag500StrCashDistribAgentAcctNumber( new MyStringType( oneElement ));
            assertEquals( tagData.toEnumIDString() + "=" + oneElement, tagData.toValuePairString() );
            assertEquals( tagData.toEnumIDString() + "=" + tagData.toString(), tagData.toValuePairString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toValuePairString() );
        }
    }
    @Test
    void TagToStringTest() {
        /*
         *  500
         *  CashDistribAgentAcctNumber
         *  String
         */

        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag500StrCashDistribAgentAcctNumber( new MyStringType( oneElement ));
            assertEquals( oneElement, tagData.toString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toString());
        }
    }
    @Test
    void TagToVerboseStringTest() {
        // process array of tags
        for ( String oneElement : TestArray ) {
            tagData = new Tag500StrCashDistribAgentAcctNumber( new MyStringType( oneElement ));
            assertEquals( "Tag500StrCashDistribAgentAcctNumber\n" +
                            "\tEnumName[" + tagData.toEnumLabelString() + "]\n" +
                            "\tFIXID[" + tagData.toEnumIDString() + "]\n" +
                            "\tFIXName[" + tagData.toEnumNameString() + "]\n" +
                            "\tFIXDescription[" + tagData.toEnumDescriptionString() + "]\n" +
                            "\tDataValue[" + oneElement + "]\n" +
                            "\tValuePair[" + tagData.toEnumIDString() + "=" + oneElement + "]",
                    tagData.toVerboseString());
            assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.toVerboseString());
        }
    }
}