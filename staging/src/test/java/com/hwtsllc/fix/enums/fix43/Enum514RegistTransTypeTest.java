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

package com.hwtsllc.fix.enums.fix43;

import com.hwtsllc.fix.interfaces.MyTestValues;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 *  514
 *  RegistTransType
 *  char
 *  <p></p>
 *  Identifies Registration Instructions transaction type
 *  <p></p>
 *  Valid values:
 *  <p>    0 - New
 *  <p>    2 - Cancel
 *  <p>    1 - Replace
 */
class Enum514RegistTransTypeTest {
    /*
     *  Information is the same for TAGS 514
     */
    @Test
    void Enum0514Test() {
        Enum514RegistTransType enumType;

        /*
         * 0-2 types
         */
        enumType = Enum514RegistTransType.NEW;
        assertEquals("0", enumType.toFIXIDString());
        assertEquals("NEW", enumType.toFIXNameString());
        assertEquals("0 - New", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum514RegistTransType.REPLACE;
        assertEquals("1", enumType.toFIXIDString());
        assertEquals("REPLACE", enumType.toFIXNameString());
        assertEquals("1 - Replace", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum514RegistTransType.CANCEL;
        assertEquals("2", enumType.toFIXIDString());
        assertEquals("CANCEL", enumType.toFIXNameString());
        assertEquals("2 - Cancel", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ENUM_NAME, enumType.toFIXLabelString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}