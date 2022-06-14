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
import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  736
 *  AllocSettlCurrency
 *  Currency
 *  <p></p>
 *  Currency code of settlement denomination for a specific AllocAccount (79).
 */
class Tag736CcyAllocSettlCurrencyTest {
    @Test
    void FIX0736Test() {
        FIX44 fixData = FIX44.FIX736_CCY_ALLOC_SETTL_CURRENCY;
        assertEquals( "736", fixData.toFIXIDString());
        assertEquals( "ALLOC_SETTL_CURRENCY", fixData.toFIXNameString());
        assertEquals( "AllocSettlCurrency", fixData.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, fixData.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, fixData.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, fixData.toFIXDescriptionString());
    }
    @Test
    void Tag0736Test() {
        Tag736CcyAllocSettlCurrency tagData;

    }
}