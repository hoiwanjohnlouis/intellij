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
 *  757
 *  Nested2PartyID
 *  String
 *  PartyID value within a "second instance" Nested repeating group.
 *          Same values as  PartyID (448)
 */
class Tag757StrNested2PartyIDTest {
    @Test
    void FIX0757Test() {
        FIX44 fixData = FIX44.FIX757_STR_NESTED_2_PARTY_ID;
        assertEquals( "757", fixData.getID());
        assertEquals( "NESTED_2_PARTY_ID", fixData.getName());
        assertEquals( "Nested2PartyID", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0757Test() {
        Log757StrNested2PartyID tagData;

        tagData = new Log757StrNested2PartyID(new MyStringType(Log757StrNested2PartyID.TESTA_STR_NESTED_2_PARTY_ID));
        assertEquals( Log757StrNested2PartyID.TESTA_STR_NESTED_2_PARTY_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData = new Log757StrNested2PartyID(new MyStringType(Log757StrNested2PartyID.TESTB_STR_NESTED_2_PARTY_ID));
        assertEquals( Log757StrNested2PartyID.TESTB_STR_NESTED_2_PARTY_ID, tagData.getDataValue());
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}