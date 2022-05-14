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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  1063
 *  UndlyInstrumentPartySubID
 *  String
 *  <p>
 *  PartySubID value within an underlying instrument party repeating group.
 *  <p>
 *  Same values as  PartySubID (523)
 */
class Tag1063StrUndlyInstrumentPartySubIDTest {
    @Test
    void FIX1063Test() {
        FIX50 fixData = FIX50.FIX1063_STR_UNDLY_INSTRUMENT_PARTY_SUB_ID;
        assertEquals( "1063", fixData.getID());
        assertEquals( "UNDLY_INSTRUMENT_PARTY_SUB_ID", fixData.getName());
        assertEquals( "UndlyInstrumentPartySubID", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag1063Test() {
        Tag1063StrUndlyInstrumentPartySubID tagData;

        tagData = new Tag1063StrUndlyInstrumentPartySubID( new MyStringType("Chloe Kim") );
        assertEquals( "Chloe Kim", tagData.getDataValue() );
        assertNotEquals( MyTestValues.JUNK_STR_DATA_VALUE, tagData.getDataValue() );
    }
}