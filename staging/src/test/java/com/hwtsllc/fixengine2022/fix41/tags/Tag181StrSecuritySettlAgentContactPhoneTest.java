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
class Tag181StrSecuritySettlAgentContactPhoneTest {
    @Test
    void FIX0181Test() {
        FIX41 fixData = FIX41.FIX181_STR_SECURITY_SETTL_AGENT_CONTACT_PHONE;
        assertEquals( "181", fixData.getID());
        assertEquals( "SECURITY_SETTL_AGENT_CONTACT_PHONE", fixData.getName());
        assertEquals( "SecuritySettlAgentContactPhone", fixData.getDescription());
        assertNotEquals( FIX41.JUNK_ID, fixData.getID());
        assertNotEquals( FIX41.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0181Test() {
        Tag181StrSecuritySettlAgentContactPhone tagData;

        tagData = new Tag181StrSecuritySettlAgentContactPhone(
                new MyStringType(Tag181StrSecuritySettlAgentContactPhone.TESTA_STR_SECURITY_SETTL_AGENT_CONTACT_PHONE));
        assertEquals( Tag181StrSecuritySettlAgentContactPhone.TESTA_STR_SECURITY_SETTL_AGENT_CONTACT_PHONE,
                tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag181StrSecuritySettlAgentContactPhone(
                new MyStringType(Tag181StrSecuritySettlAgentContactPhone.TESTB_STR_SECURITY_SETTL_AGENT_CONTACT_PHONE));
        assertEquals( Tag181StrSecuritySettlAgentContactPhone.TESTB_STR_SECURITY_SETTL_AGENT_CONTACT_PHONE,
                tagData.getDataValue());
        assertNotEquals( FIX41.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}