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
        assertEquals("0", enumType.toEnumIDString());
        assertEquals("USE_DEFAULTS", enumType.toEnumNameString());
        assertEquals("0 - Use default instructions", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum780AllocSettlInstType.DERIVE_FROM_PARAMETERS;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("DERIVE_FROM_PARAMETERS", enumType.toEnumNameString());
        assertEquals("1 - Derive from parameters provided", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum780AllocSettlInstType.FULL_DETAILS;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("FULL_DETAILS", enumType.toEnumNameString());
        assertEquals("2 - Full details provided", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum780AllocSettlInstType.SSI_DB_ID_PROVIDED;
        assertEquals("3", enumType.toEnumIDString());
        assertEquals("SSI_DB_ID_PROVIDED", enumType.toEnumNameString());
        assertEquals("3 - SSI DB IDs provided", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum780AllocSettlInstType.PHONE_FOR_INSTRUCTIONS;
        assertEquals("4", enumType.toEnumIDString());
        assertEquals("PHONE_FOR_INSTRUCTIONS", enumType.toEnumNameString());
        assertEquals("4 - Phone for instructions", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}