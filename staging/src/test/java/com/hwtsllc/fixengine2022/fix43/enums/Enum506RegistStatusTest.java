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

package com.hwtsllc.fixengine2022.fix43.enums;

import com.hwtsllc.fixengine2022.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  506
 *  RegistStatus
 *  char
 *  <p></p>
 *  Registration status as returned by the broker or  (for CIV) the fund manager:
 *  <p></p>
 *  Valid values:
 *  <p>    A - Accepted
 *  <p>    R - Rejected
 *  <p>    H - Held
 *  <p>    N - Reminder - i.e. Registration Instructions are still outstanding
 */
class Enum506RegistStatusTest {
    /*
     *  Information is the same for TAGS 506
     */
    @Test
    void Enum0506Test() {
        Enum506RegistStatus enumType;

        /*
         * A, R, H, and N types
         */
        enumType = Enum506RegistStatus.ACCEPTED;
        assertEquals("A", enumType.toEnumIDString());
        assertEquals("ACCEPTED", enumType.toEnumNameString());
        assertEquals("A - Accepted", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum506RegistStatus.REJECTED;
        assertEquals("R", enumType.toEnumIDString());
        assertEquals("REJECTED", enumType.toEnumNameString());
        assertEquals("R - Rejected", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum506RegistStatus.HELD;
        assertEquals("H", enumType.toEnumIDString());
        assertEquals("HELD", enumType.toEnumNameString());
        assertEquals("H - Held", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum506RegistStatus.REMINDER;
        assertEquals("N", enumType.toEnumIDString());
        assertEquals("REMINDER", enumType.toEnumNameString());
        assertEquals("N - Reminder - i.e. Registration Instructions are still outstanding",
                enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toEnumLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toEnumIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}