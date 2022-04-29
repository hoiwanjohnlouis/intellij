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

class Tag760StrNested2PartySubIDTest {
    @Test
    void FIX0760Test() {
        FIX44 fixData = FIX44.FIX760_STR_NESTED_2_PARTY_SUB_ID;
        assertEquals( "760", fixData.getID());
        assertEquals( "NESTED_2_PARTY_SUB_ID", fixData.getName());
        assertEquals( "Nested 2 Party Sub Id", fixData.getDescription());
        assertNotEquals( FIX44.JUNK_ID, fixData.getID());
        assertNotEquals( FIX44.JUNK_NAME, fixData.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0760Test() {
        Tag760StrNested2PartySubID tagData;

        tagData =
                new Tag760StrNested2PartySubID(new MyStringType(Tag760StrNested2PartySubID.TESTA_STR_NESTED_2_PARTY_SUB_ID));
        assertEquals( Tag760StrNested2PartySubID.TESTA_STR_NESTED_2_PARTY_SUB_ID, tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());

        tagData =
                new Tag760StrNested2PartySubID(new MyStringType(Tag760StrNested2PartySubID.TESTB_STR_NESTED_2_PARTY_SUB_ID));
        assertEquals( Tag760StrNested2PartySubID.TESTB_STR_NESTED_2_PARTY_SUB_ID, tagData.getDataValue());
        assertNotEquals( FIX44.JUNK_STR_DATA_VALUE, tagData.getDataValue());
    }
}