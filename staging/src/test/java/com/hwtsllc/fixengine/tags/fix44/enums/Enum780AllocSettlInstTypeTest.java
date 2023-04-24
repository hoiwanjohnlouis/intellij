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

package com.hwtsllc.fixengine.tags.fix44.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  780
 *  AllocSettlInstType
 *  int
 *  <p></p>
 *  Used to indicate whether settlement instructions are provided on an
 *  allocation instruction message, and if not, how they are to be derived.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Use default instructions
 *  <p>    1 - Derive from parameters provided
 *  <p>    2 - Full details provided
 *  <p>    3 - SSI DB IDs provided
 *  <p>    4 - Phone for instructions
 */
class Enum780AllocSettlInstTypeTest {
    @Test
    void EnumTest() {
        Enum780AllocSettlInstType enumType;

        enumType = Enum780AllocSettlInstType.USE_DEFAULTS;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("USE_DEFAULTS", enumType.toFIXNameString());
        assertEquals("0 - Use default instructions", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum780AllocSettlInstType.DERIVE_FROM_PARAMETERS;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("DERIVE_FROM_PARAMETERS", enumType.toFIXNameString());
        assertEquals("1 - Derive from parameters provided", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum780AllocSettlInstType.FULL_DETAILS;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("FULL_DETAILS", enumType.toFIXNameString());
        assertEquals("2 - Full details provided", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum780AllocSettlInstType.SSI_DB_ID_PROVIDED;
        assertEquals("3", enumType.toFIXIDString());
        assertEquals("SSI_DB_ID_PROVIDED", enumType.toFIXNameString());
        assertEquals("3 - SSI DB IDs provided", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum780AllocSettlInstType.PHONE_FOR_INSTRUCTIONS;
        assertEquals("4", enumType.toFIXIDString());
        assertEquals("PHONE_FOR_INSTRUCTIONS", enumType.toFIXNameString());
        assertEquals("4 - Phone for instructions", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}