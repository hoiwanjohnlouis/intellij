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
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Tag782StrSettlPartyIDTest {
    @Test
    void FIX0782Test() {
        FIX44 fixData = FIX44.FIX782_STR_SETTL_PARTY_ID;
        assertEquals( "782", fixData.getID());
        assertEquals( "SETTL_PARTY_ID", fixData.getName());
        assertEquals( "SettlPartyId", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0782Test() {
        Tag782StrSettlPartyID tagData;

        tagData = new Tag782StrSettlPartyID(new MyStringType(Tag782StrSettlPartyID.TESTA_STR_SETTL_PARTY_ID));
        assertEquals( Tag782StrSettlPartyID.TESTA_STR_SETTL_PARTY_ID, tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag782StrSettlPartyID(new MyStringType(Tag782StrSettlPartyID.TESTB_STR_SETTL_PARTY_ID));
        assertEquals( Tag782StrSettlPartyID.TESTB_STR_SETTL_PARTY_ID, tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}