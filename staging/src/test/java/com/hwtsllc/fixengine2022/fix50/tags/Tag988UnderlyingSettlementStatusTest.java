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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  988
 *  UnderlyingSettlementStatus
 *  String
 *  <p>
 *  Settlement status of the underlying instrument.
 *  <p>
 *  Used for derivatives that deliver into more than one underlying instrument.
 *  <p>
 *  Settlement can be delayed for an underlying instrument.
 */
class Tag988UnderlyingSettlementStatusTest {
    @Test
    void FIX0988Test() {
        FIX50 fixData = FIX50.FIX988_UNDERLYING_SETTLEMENT_STATUS;
        assertEquals( "988", fixData.getID());
        assertEquals( "UNDERLYING_SETTLEMENT_STATUS", fixData.getName());
        assertEquals( "UnderlyingSettlementStatus", fixData.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.getDescription());
    }
    @Test
    void Tag0988Test() {
        Tag988UnderlyingSettlementStatus tagData;

    }
}