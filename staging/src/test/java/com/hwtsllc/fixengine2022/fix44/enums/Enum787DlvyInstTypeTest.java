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

package com.hwtsllc.fixengine2022.fix44.enums;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Enum787DlvyInstTypeTest {
    /**
     *  787
     *  DlvyInstType
     *  Used to indicate whether a delivery instruction is used for securities or cash settlement.
     *  Valid values:
     *      C - Cash
     *      S - Securities
     */
    @Test
    void EnumTest() {
        Enum787DlvyInstType enumType;

        enumType = Enum787DlvyInstType.CASH;
        assertEquals("C", enumType.getID());
        assertEquals("CASH", enumType.getName());
        assertEquals("C - Cash", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum787DlvyInstType.SECURITIES;
        assertEquals("S", enumType.getID());
        assertEquals("SECURITIES", enumType.getName());
        assertEquals("S - Securities", enumType.getDescription());
        assertNotEquals( FIX44.JUNK_ID, enumType.getID());
        assertNotEquals( FIX44.JUNK_NAME, enumType.getName());
        assertNotEquals( FIX44.JUNK_DESCRIPTION, enumType.getDescription());
    }
}