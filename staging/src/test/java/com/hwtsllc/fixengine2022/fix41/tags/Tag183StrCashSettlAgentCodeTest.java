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
        assertEquals( "183", fixData.getID());
        assertEquals( "CASH_SETTL_AGENT_CODE", fixData.getName());
        assertEquals( "CashSettlAgentCode (replaced)", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
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
}