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
 *  782
 *  SettlPartyID
 *  String
 *  PartyID value within a settlement parties component. Nested repeating group.
 *          Same values as  PartyID (448)
 */
class Tag782StrSettlPartyIDTest {
    @Test
    void FIX0782Test() {
        FIX44 fixData = FIX44.FIX782_STR_SETTL_PARTY_ID;
        assertEquals( "782", fixData.toFIXIDString());
        assertEquals( "SETTL_PARTY_ID", fixData.toFIXNameString());
        assertEquals( "SettlPartyID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0782Test() {
        Tag782StrSettlPartyID tagData;

        tagData = new Tag782StrSettlPartyID(new MyStringType(Tag782StrSettlPartyID.TESTA_STR_SETTL_PARTY_ID));
        assertEquals( Tag782StrSettlPartyID.TESTA_STR_SETTL_PARTY_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Tag782StrSettlPartyID(new MyStringType(Tag782StrSettlPartyID.TESTB_STR_SETTL_PARTY_ID));
        assertEquals( Tag782StrSettlPartyID.TESTB_STR_SETTL_PARTY_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}