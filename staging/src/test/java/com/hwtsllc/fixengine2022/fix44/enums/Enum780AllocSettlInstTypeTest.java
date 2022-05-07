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

class Enum780AllocSettlInstTypeTest {
    /**
     *  780
     *  AllocSettlInstType
     *  Used to indicate whether settlement instructions are provided on an
     *  allocation instruction message, and if not, how they are to be derived.
     *  Valid values:
     *      0 - Use default instructions
     *      1 - Derive from parameters provided
     *      2 - Full details provided
     *      3 - SSI DB IDs provided
     *      4 - Phone for instructions
     */
    @Test
    void EnumTest() {
        Enum780AllocSettlInstType enumType;

        enumType = Enum780AllocSettlInstType.USE_DEFAULTS;
        assertEquals("0", enumType.getID());
        assertEquals("USE_DEFAULTS", enumType.getName());
        assertEquals("0 - Use default instructions", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum780AllocSettlInstType.DERIVE_FROM_PARAMETERS;
        assertEquals("1", enumType.getID());
        assertEquals("DERIVE_FROM_PARAMETERS", enumType.getName());
        assertEquals("1 - Derive from parameters provided", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum780AllocSettlInstType.FULL_DETAILS;
        assertEquals("2", enumType.getID());
        assertEquals("FULL_DETAILS", enumType.getName());
        assertEquals("2 - Full details provided", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum780AllocSettlInstType.SSI_DB_ID_PROVIDED;
        assertEquals("3", enumType.getID());
        assertEquals("SSI_DB_ID_PROVIDED", enumType.getName());
        assertEquals("3 - SSI DB IDs provided", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());

        enumType = Enum780AllocSettlInstType.PHONE_FOR_INSTRUCTIONS;
        assertEquals("4", enumType.getID());
        assertEquals("PHONE_FOR_INSTRUCTIONS", enumType.getName());
        assertEquals("4 - Phone for instructions", enumType.getDescription());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.getID());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.getName());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.getDescription());
    }
}