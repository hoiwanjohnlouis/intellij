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

package com.hwtsllc.fixengine.enums.fix43;

import com.hwtsllc.fixengine.interfaces.MyTestValues;
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
        assertEquals("A", enumType.toFIXIDString());
        assertEquals("ACCEPTED", enumType.toFIXNameString());
        assertEquals("A - Accepted", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum506RegistStatus.REJECTED;
        assertEquals("R", enumType.toFIXIDString());
        assertEquals("REJECTED", enumType.toFIXNameString());
        assertEquals("R - Rejected", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum506RegistStatus.HELD;
        assertEquals("H", enumType.toFIXIDString());
        assertEquals("HELD", enumType.toFIXNameString());
        assertEquals("H - Held", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum506RegistStatus.REMINDER;
        assertEquals("N", enumType.toFIXIDString());
        assertEquals("REMINDER", enumType.toFIXNameString());
        assertEquals("N - Reminder - i.e. Registration Instructions are still outstanding",
                enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}