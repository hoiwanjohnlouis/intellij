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

package com.hwtsllc.fix.enums.fix27;

import com.hwtsllc.fix.interfaces.MyTestValues;
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
        assertEquals("NEW", enumType.toFIXNameString());
        assertEquals("N - New", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum28IOITransType.CANCEL;
        assertEquals("C", enumType.toFIXIDString());
        assertEquals("CANCEL", enumType.toFIXNameString());
        assertEquals("C - Cancel", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());

        enumType = Enum28IOITransType.REPLACE;
        assertEquals("R", enumType.toFIXIDString());
        assertEquals("REPLACE", enumType.toFIXNameString());
        assertEquals("R - Replace", enumType.toFIXDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toFIXDescriptionString());
    }
}