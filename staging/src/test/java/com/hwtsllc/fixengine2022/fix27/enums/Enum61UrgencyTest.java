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

package com.hwtsllc.fixengine2022.fix27.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  61
 *  Urgency
 *  char
 *  <p></p>
 *  Urgency flag
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Normal
 *  <p>    1 - Flash
 *  <p>    2 - Background
 */
class Enum61UrgencyTest {
    @Test
    void Enum0061Test() {
        Enum61Urgency enumType;

        /*
         * 0-2 msg types
         */
        enumType = Enum61Urgency.NORMAL;
        assertEquals("0", enumType.toEnumIDString());
        assertEquals("NORMAL", enumType.toEnumNameString());
        assertEquals("0 - Normal", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum61Urgency.FLASH;
        assertEquals("1", enumType.toEnumIDString());
        assertEquals("FLASH", enumType.toEnumNameString());
        assertEquals("1 - Flash", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum61Urgency.BACKGROUND;
        assertEquals("2", enumType.toEnumIDString());
        assertEquals("BACKGROUND", enumType.toEnumNameString());
        assertEquals("2 - Background", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}