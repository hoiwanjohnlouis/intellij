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
import com.hwtsllc.fixengine2022.datatypes.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  180
 *  SecuritySettlAgentContactName
 *  String
 *  <p>
 *  Deprecated in FIX.4.3
 *  <p>
 *  Name of contact at local agent bank for SettlInstSource's account if SettlLocation is not a depository
 */
// @Deprecated
class Tag180StrSecuritySettlAgentContactNameTest {
    @Test
    void FIX0180Test() {
        FIX41 fixData = FIX41.FIX180_STR_SECURITY_SETTL_AGENT_CONTACT_NAME;
        assertEquals( "180", fixData.getID());
        assertEquals( "SECURITY_SETTL_AGENT_CONTACT_NAME", fixData.getName());
        assertEquals( "SecuritySettlAgentContactName", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0180Test() {
        Tag180StrSecuritySettlAgentContactName tagData;

        tagData = new Tag180StrSecuritySettlAgentContactName(
                new MyStringType(Tag180StrSecuritySettlAgentContactName.TESTA_STR_SECURITY_SETTL_AGENT_CONTACT_NAME));
        assertEquals( Tag180StrSecuritySettlAgentContactName.TESTA_STR_SECURITY_SETTL_AGENT_CONTACT_NAME,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag180StrSecuritySettlAgentContactName(
                new MyStringType(Tag180StrSecuritySettlAgentContactName.TESTB_STR_SECURITY_SETTL_AGENT_CONTACT_NAME));
        assertEquals( Tag180StrSecuritySettlAgentContactName.TESTB_STR_SECURITY_SETTL_AGENT_CONTACT_NAME,
                tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}