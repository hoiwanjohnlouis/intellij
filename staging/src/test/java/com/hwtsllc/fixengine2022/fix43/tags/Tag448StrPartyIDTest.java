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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  448
 *  PartyID
 *  String
 *  <p>
 *  Party identifier/code.  See PartyIDSource (447) and PartyRole (452).
 *  <p>
 *  See "Appendix 6-G – Use of <Parties> Component Block"
 */
class Tag448StrPartyIDTest {
    @Test
    void FIX0448Test() {
        FIX43 fixData = FIX43.FIX448_STR_PARTY_ID;
        assertEquals( "448", fixData.toFIXIDString());
        assertEquals( "PARTY_ID", fixData.toFIXNameString());
        assertEquals( "PartyID", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0448Test() {
        Tag448StrPartyID tagData;

    }
}