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
        assertEquals( "187", fixData.getID());
        assertEquals( "CASH_SETTL_AGENT_CONTACT_PHONE", fixData.getName());
        assertEquals( "CashSettlAgentContactPhone", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
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
}