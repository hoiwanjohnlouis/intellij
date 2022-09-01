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
 *  787
 *  DlvyInstType
 *  char
 *  <p></p>
 *  Used to indicate whether a delivery instruction is used for securities
 *  or cash settlement.
 *  <p></p>
 *  Valid values:
 *  <p>    C - Cash
 *  <p>    S - Securities
 */
class Enum787DlvyInstTypeTest {
    @Test
    void EnumTest() {
        Enum787DlvyInstType enumType;

        enumType = Enum787DlvyInstType.CASH;
        assertEquals("C", enumType.toFIXIDString());
        assertEquals("CASH", enumType.toFIXNameString());
        assertEquals("C - Cash", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());

        enumType = Enum787DlvyInstType.SECURITIES;
        assertEquals("S", enumType.toFIXIDString());
        assertEquals("SECURITIES", enumType.toFIXNameString());
        assertEquals("S - Securities", enumType.toEnumDescriptionString());
        assertNotEquals( MyTestValues.JUNK_ID, enumType.toFIXIDString());
        assertNotEquals( MyTestValues.JUNK_NAME, enumType.toFIXNameString());
        assertNotEquals( MyTestValues.JUNK_DESCRIPTION, enumType.toEnumDescriptionString());
    }
}