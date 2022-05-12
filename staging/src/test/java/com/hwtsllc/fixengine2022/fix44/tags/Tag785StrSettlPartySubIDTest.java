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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  785
 *  SettlPartySubID
 *  String
 *  PartySubID value within a settlement parties component.
 *          Same values as  PartySubID (523)
 */
class Tag785StrSettlPartySubIDTest {
    @Test
    void FIX0785Test() {
        FIX44 fixData = FIX44.FIX785_STR_SETTL_PARTY_SUB_ID;
        assertEquals( "785", fixData.getID());
        assertEquals( "SETTL_PARTY_SUB_ID", fixData.getName());
        assertEquals( "SettlPartySubId", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0785Test() {
        Log785StrSettlPartySubID tagData;

        tagData = new Log785StrSettlPartySubID(new MyStringType(Log785StrSettlPartySubID.TESTA_STR_SETTL_PARTY_SUB_ID));
        assertEquals( Log785StrSettlPartySubID.TESTA_STR_SETTL_PARTY_SUB_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log785StrSettlPartySubID(new MyStringType(Log785StrSettlPartySubID.TESTB_STR_SETTL_PARTY_SUB_ID));
        assertEquals( Log785StrSettlPartySubID.TESTB_STR_SETTL_PARTY_SUB_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}