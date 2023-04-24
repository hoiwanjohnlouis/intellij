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

package com.hwtsllc.fixengine.tags.fix41.enums;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  172
 *  SettlDeliveryType
 *  int
 *  <p>
 *  Identifies type of settlement
 *  <p></p>
 *  Valid values:
 *  <p>    0 - "Versus. Payment": Deliver (if Sell) or Receive (if Buy) vs. (Against) Payment
 *  <p>    1 - "Free": Deliver (if Sell) or Receive (if Buy) Free
 *  <p>    2 - Tri-Party
 *  <p>    3 - Hold In Custody
 */
class Enum172SettlDeliveryTypeTest {
    @Test
    void Enum0172Test() {
        Enum172SettlDeliveryType enumType;

        /*
         * 0-4 msg types
         */
        enumType = Enum172SettlDeliveryType.VERSUS;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("VERSUS", enumType.toFIXNameString());
        assertEquals("0 - Versus. Payment: Deliver (if Sell) or Receive (if Buy) vs. (Against) Payment",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum172SettlDeliveryType.FREE;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("FREE", enumType.toFIXNameString());
        assertEquals("1 - Free: Deliver (if Sell) or Receive (if Buy) Free", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum172SettlDeliveryType.TRI_PARTY;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("TRI_PARTY", enumType.toFIXNameString());
        assertEquals("2 - Tri-Party", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum172SettlDeliveryType.HOLD_IN_CUSTODY;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("HOLD_IN_CUSTODY", enumType.toFIXNameString());
        assertEquals("3 - Hold In Custody", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}