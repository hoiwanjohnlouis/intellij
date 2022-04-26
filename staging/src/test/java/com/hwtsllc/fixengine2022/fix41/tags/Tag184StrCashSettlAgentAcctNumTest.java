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
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@Deprecated
class Tag184StrCashSettlAgentAcctNumTest {
    @Test
    void FIX0184Test() {
        FIX41 fixData = FIX41.FIX184_STR_CASH_SETTL_AGENT_ACCT_NUM;
        assertEquals( "184", fixData.getID());
        assertEquals( "CASH_SETTL_AGENT_ACCT_NUM", fixData.getName());
        assertEquals( "CashSettlAgentAcctNum", fixData.getDescription());
        assertNotEquals( FIX41.JUNK_ID, fixData.getID());
        assertNotEquals( FIX41.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0184Test() {
        Tag184StrCashSettlAgentAcctNum tagData;

        tagData = new Tag184StrCashSettlAgentAcctNum(
                new MyStringType(Tag184StrCashSettlAgentAcctNum.TESTA_STR_CASH_SETTL_AGENT_ACCT_NUM));
        assertEquals( Tag184StrCashSettlAgentAcctNum.TESTA_STR_CASH_SETTL_AGENT_ACCT_NUM, tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag184StrCashSettlAgentAcctNum(
                new MyStringType(Tag184StrCashSettlAgentAcctNum.TESTB_STR_CASH_SETTL_AGENT_ACCT_NUM));
        assertEquals( Tag184StrCashSettlAgentAcctNum.TESTB_STR_CASH_SETTL_AGENT_ACCT_NUM, tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}