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
 *  28
 *  IOITransType
 *  char
 *  <p></p>
 *  Identifies IOI message transaction type
 *  <p></p>
 *  Valid values:
 *  <p>    N - New
 *  <p>    C - Cancel
 *  <p>    R - Replace
 */
class Enum28IOITransTypeTest {
    @Test
    void Enum0028Test() {
        Enum28IOITransType enumType;

        /*
         * N, C, and R types
         */
        enumType = Enum28IOITransType.NEW;
        assertEquals("N", enumType.toFIXIDString());
        assertEquals("NEW", enumType.toEnumNameString());
        assertEquals("N - New", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum28IOITransType.CANCEL;
        assertEquals("C", enumType.toFIXIDString());
        assertEquals("CANCEL", enumType.toEnumNameString());
        assertEquals("C - Cancel", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum28IOITransType.REPLACE;
        assertEquals("R", enumType.toFIXIDString());
        assertEquals("REPLACE", enumType.toEnumNameString());
        assertEquals("R - Replace", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toEnumNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}