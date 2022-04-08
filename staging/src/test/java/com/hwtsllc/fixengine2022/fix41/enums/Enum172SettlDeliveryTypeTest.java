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

package com.hwtsllc.fixengine2022.fix41.enums;

import com.hwtsllc.fixengine2022.datatypes.FIX41;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum172SettlDeliveryTypeTest {

    @Test
    void Enum0172Test() {
        Enum172SettlDeliveryType enumType;

        /*
         * 0-4 msg types
         */
        enumType = Enum172SettlDeliveryType.VERSUS;
        assertEquals("0", enumType.getID());
        assertEquals("VERSUS", enumType.getName());
        assertEquals("0 - Versus. Payment: Deliver (if Sell) or Receive (if Buy) vs. (Against) Payment",
                enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum172SettlDeliveryType.FREE;
        assertEquals("1", enumType.getID());
        assertEquals("FREE", enumType.getName());
        assertEquals("1 - Free: Deliver (if Sell) or Receive (if Buy) Free", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum172SettlDeliveryType.TRI_PARTY;
        assertEquals("2", enumType.getID());
        assertEquals("TRI_PARTY", enumType.getName());
        assertEquals("2 - Tri-Party", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum172SettlDeliveryType.HOLD_IN_CUSTODY;
        assertEquals("3", enumType.getID());
        assertEquals("HOLD_IN_CUSTODY", enumType.getName());
        assertEquals("3 - Hold In Custody", enumType.getDescription());
        assertNotEquals( FIX41.JUNK_ID, enumType.getID());
        assertNotEquals( FIX41.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX41.JUNK_DESCRIPTION, enumType.getDescription());
    }
}