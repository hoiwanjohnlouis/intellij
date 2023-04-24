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

package com.hwtsllc.fixengine.enums.fix41;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  163
 *  SettlInstTransType
 *  char
 *  <p>
 *  Settlement Instructions message transaction type
 *  <p></p>
 *  Valid values:
 *  <p>    N - New
 *  <p>    C - Cancel
 *  <p>    R - Replace
 *  <p>    T - Restate
 */
class Enum163SettlInstTransTypeTest {
    @Test
    void Enum0163Test() {
        Enum163SettlInstTransType enumType;

        /*
         * N,C,R,T msg types
         */
        enumType = Enum163SettlInstTransType.NEW;
        assertEquals("N", enumType.toFIXIDString());
        assertEquals("NEW", enumType.toFIXNameString());
        assertEquals("N - New", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum163SettlInstTransType.CANCEL;
        assertEquals("C", enumType.toFIXIDString());
        assertEquals("CANCEL", enumType.toFIXNameString());
        assertEquals("C - Cancel", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum163SettlInstTransType.REPLACE;
        assertEquals("R", enumType.toFIXIDString());
        assertEquals("REPLACE", enumType.toFIXNameString());
        assertEquals("R - Replace", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum163SettlInstTransType.RESTATE;
        assertEquals("T", enumType.toFIXIDString());
        assertEquals("RESTATE", enumType.toFIXNameString());
        assertEquals("T - Restate", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}